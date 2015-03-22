package com.example.antibodyidentification;

import android.app.ListActivity;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class PatientsList extends ListActivity {

	private static final String[] PROJECTION = new String[] {
        "_id", // 0
        "title", // 1
        "created", // 2
        "modified", // 3
	};

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = getIntent();

		if (intent.getData() == null) {
        	intent.setData(Uri.parse("content://com.google.provider.Patient/patients"));
    	}

		getListView().setOnCreateContextMenuListener(this);

		Cursor cursor = managedQuery(getIntent().getData(),
			PROJECTION,
			null,
			null,
			"modified ASC");

		int[] viewIDs = { R.id.cellEntryID, R.id.cellEntryNote, R.id.cellEntryCreated, R.id.cellEntryModified };

		SimpleCursorAdapter adapter
		= new SimpleCursorAdapter(this,
    		R.layout.patientslist_item,
    		cursor,
    		PROJECTION,
            viewIDs);

		setListAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.list_options_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.menu_add:
				startActivity(new Intent(Intent.ACTION_INSERT, getIntent().getData()));
				return true;
			default:
				return super.onOptionsItemSelected(item);
        }
	}

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenuInfo menuInfo) {
    	AdapterView.AdapterContextMenuInfo info;

    	info = (AdapterView.AdapterContextMenuInfo) menuInfo;

    	Cursor cursor = (Cursor) getListAdapter().getItem(info.position);

    	MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.list_context_menu, menu);

        menu.setHeaderTitle(cursor.getString(1));

        Intent intent = new Intent(null, Uri.withAppendedPath(getIntent().getData(), 
                Integer.toString((int) info.id) ));
        intent.addCategory(Intent.CATEGORY_ALTERNATIVE);
        menu.addIntentOptions(Menu.CATEGORY_ALTERNATIVE, 0, 0,
        		new ComponentName(this, PatientsList.class), null, intent, 0, null);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
    	AdapterView.AdapterContextMenuInfo info;
    	info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
    	Uri patientUri = ContentUris.withAppendedId(getIntent().getData(), info.id);
    	switch (item.getItemId()) {
        	case R.id.context_open:
        		startActivity(new Intent(Intent.ACTION_EDIT, patientUri));
                return true;
        	case R.id.context_delete:
        		getContentResolver().delete(
                        					patientUri,
                        					null,
                        					null
        								);
        		return true;
            default:
                return super.onContextItemSelected(item);
    	}
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
		Uri uri = ContentUris.withAppendedId(getIntent().getData(), id);
		startActivity(new Intent(Intent.ACTION_EDIT, uri));
	}
}
