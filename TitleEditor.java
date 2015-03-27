package com.example.antibodyidentification;

import org.eclipse.jdt.annotation.Nullable;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TitleEditor extends Activity {

	private static final String TAG = "TitleEditor";

	private static final String[] PROJECTION = new String[] {
        "_id", // 0
        "title", // 1
	};

	@Nullable private Cursor mCursor;

	private EditText mText;

    private Uri mUri;

    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.title_editor);

		mUri = getIntent().getData();

		mCursor = managedQuery(
	            mUri,
	            PROJECTION,
	            null,
	            null,
	            null
	        );

		mText = (EditText) this.findViewById(R.id.title);
	}

    @Override
    protected void onResume() {
    	super.onResume();

    	if (mCursor != null) {
    		mCursor.moveToFirst();

    		mText.setText(mCursor.getString(1));
    	}
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (mCursor != null) {
        	ContentValues values = new ContentValues();

        	values.put("title", mText.getText().toString());

        	getContentResolver().update(
                    					mUri,
                    					values,
                    					null,
                    					null
        							);
        }
    }

    public void onClickOk(View v) {
    	finish();
	}
}
