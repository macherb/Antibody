package com.example.antibodyidentification;

import java.util.HashMap;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.Context;
import android.content.UriMatcher;
import android.content.ContentProvider.PipeDataWriter;
import android.content.res.Resources;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;

public class PatientProvider extends ContentProvider implements PipeDataWriter<Cursor> {

	private static HashMap<String, String> sReactionssProjectionMap;

    private static final UriMatcher sUriMatcher;

    private DatabaseHelper mOpenHelper;

	static {
		sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
		sUriMatcher.addURI("com.google.provider.Patient", "patients", 1);
        sUriMatcher.addURI("com.google.provider.Patient", "patients/#", 2);
		sReactionssProjectionMap = new HashMap<String, String>();
		sReactionssProjectionMap.put("_id", "_id");
		sReactionssProjectionMap.put("title", "title");
		sReactionssProjectionMap.put("reactions", "reactions");
		sReactionssProjectionMap.put("created",
				"created");
		sReactionssProjectionMap.put(
				"modified",
				"modified");
	}

	static class DatabaseHelper extends SQLiteOpenHelper {

		DatabaseHelper(Context context) {
			super(context, "patients.db", null, 2);
		}

		@Override
	    public void onCreate(SQLiteDatabase db) {
			db.execSQL("CREATE TABLE " + "patients" + " ("
	                   + "_id" + " INTEGER PRIMARY KEY,"
	                   + "title" + " TEXT,"
	                   + "reactions" + " TEXT,"
	                   + "created" + " INTEGER,"
	                   + "modified" + " INTEGER"
	                   + ");");
		}

		@Override
	    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			;
		}
	}

	@Override
	public void writeDataToPipe(ParcelFileDescriptor output, Uri uri, String mimeType,
            Bundle opts, Cursor c) {
	}

	@Override
	public int delete(Uri uri, String where, String[] whereArgs) {
		SQLiteDatabase db = mOpenHelper.getWritableDatabase();
        String finalWhere;

		int count;

		switch (sUriMatcher.match(uri)) {
			case 1:
				count = db.delete(
									"patients",
									where,
									whereArgs
								);
				break;
			case 2:
				finalWhere =
                        "_id" +
                        " = " +
                        uri.getPathSegments().get(1)
                ;

                if (where != null) {
                    finalWhere = finalWhere + " AND " + where;
                }

                count = db.delete(
                					"patients",
                					finalWhere,
                					whereArgs
                				);
				break;
			default:
				throw new IllegalArgumentException("Unknown URI " + uri);
		}
		getContext().getContentResolver().notifyChange(uri, null);
        return count;
	}

	@Override
	public String getType(Uri uri) {
		switch (sUriMatcher.match(uri)) {
		case 1:
			return "vnd.android.cursor.dir/vnd.google.patient";
		case 2:
			return "vnd.android.cursor.item/vnd.google.patient";
		default:
			throw new IllegalArgumentException("Unknown URI " + uri);
		}
	}

	@Override
	public Uri insert(Uri uri, ContentValues initialValues) {
		ContentValues values;
		if (initialValues != null) {
            values = new ContentValues(initialValues);

        } else {
            values = new ContentValues();
        }
		Long now = Long.valueOf(System.currentTimeMillis());

		if (values.containsKey("created") == false) {
            values.put("created", now);
        }

		if (values.containsKey("modified") == false) {
            values.put("modified", now);
        }

		if (values.containsKey("title") == false) {
            Resources r = Resources.getSystem();
            values.put("title", r.getString(android.R.string.untitled));
        }
		if (values.containsKey("reactions") == false) {
            values.put("reactions", "0000000000");
        }
		SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		long rowId = db.insert(
	            "patients",
	            "reactions",
	            values
	        );
		Uri patientUri = ContentUris.withAppendedId(Uri.parse("content://com.google.provider.Patient/patients/"), rowId);
		getContext().getContentResolver().notifyChange(patientUri, null);
		return patientUri;
	}

	@Override
	public boolean onCreate() {
		mOpenHelper = new DatabaseHelper(getContext());
		return true;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
	           String sortOrder) {

		SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
		qb.setTables("patients");

		switch (sUriMatcher.match(uri)) {
			case 1:
				qb.setProjectionMap(sReactionssProjectionMap);
				break;
			case 2:
				qb.setProjectionMap(sReactionssProjectionMap);
	               qb.appendWhere(
	            		   			"_id" +
	            		   			"=" +
	            		   			uri.getPathSegments().get(1)
	            		   		);
				break;
			default:
				throw new IllegalArgumentException("Unknown URI " + uri);
		}

		String orderBy;
		if (TextUtils.isEmpty(sortOrder)) {
	        orderBy = "modified ASC";
	    } else {
	    	orderBy = sortOrder;
	    }

		SQLiteDatabase db = mOpenHelper.getReadableDatabase();
		Cursor c =	qb.query(
					db,
					projection,
					selection,
					selectionArgs,
					null,
					null,
					orderBy
				);
		c.setNotificationUri(getContext().getContentResolver(), uri);
		return c;
	}

	@Override
	public int update(Uri uri, ContentValues values, String where, String[] whereArgs) {
		SQLiteDatabase db = mOpenHelper.getWritableDatabase();
		int count;
        String finalWhere;

        switch (sUriMatcher.match(uri)) {
			case 1:
				count = db.update(
									"patients",
									values,
									where,
									whereArgs
								);
				break;
			case 2:
				finalWhere =
							"_id" +
                        	" = " +
                        	uri.getPathSegments().get(1);
				if (where != null) {
                    finalWhere = finalWhere + " AND " + where;
                }
				count = db.update(
	                    			"patients",
	                    			values,
	                    			finalWhere,
	                    			whereArgs
								);
				break;
            default:
            	throw new IllegalArgumentException("Unknown URI " + uri);
		}
		getContext().getContentResolver().notifyChange(uri, null);
		return count;
	}
}
