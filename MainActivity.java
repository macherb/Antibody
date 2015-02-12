package com.example.antibody;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

	private CheckBox	check1,
						check2;
	
	private Button mCalculate;
	
	private TextView mSolution;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		check1 = (CheckBox)findViewById(R.id.check1);
		check2 = (CheckBox)findViewById(R.id.check2);
        mCalculate = (Button)findViewById(R.id.buttonCalculate);
        mCalculate.setOnClickListener(this);
        
        mSolution = (TextView)findViewById(R.id.textSolution);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void onClick(View v) {
		if      ( check1.isChecked() &&  check2.isChecked())
			mSolution.setText("Inconclusive");
		else if (!check1.isChecked() && !check2.isChecked())
			mSolution.setText("Too weak");
		else if ( check1.isChecked() && !check2.isChecked())
			mSolution.setText("D");
		else if (!check1.isChecked() &&  check2.isChecked())
			mSolution.setText("f");
	}
}
