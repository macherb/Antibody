package com.example.antibody;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

	private	char		solutions,
						antibodies[];

	private TextView	mD1,
						mBigC1,
						mLittleC1,
						mBigE1,

						mD2,
						mBigC2,
						mLittleC2,
						mBigE2,

						mD3,
						mBigC3,
						mLittleC3,
						mBigE3,

						mSolution;

	private CheckBox	mCheck1,
						mCheck2,
						mCheck3;
	
	private Button		mCalculate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mD1 =			(TextView	)findViewById(R.id.textD1			);
		mBigC1 =		(TextView	)findViewById(R.id.textBigC1		);
		mLittleC1 =		(TextView	)findViewById(R.id.textLittleC1		);
		mBigE1 =		(TextView	)findViewById(R.id.textBigE1		);

		mD2 =			(TextView	)findViewById(R.id.textD2			);
		mBigC2 =		(TextView	)findViewById(R.id.textBigC2		);
		mLittleC2 =		(TextView	)findViewById(R.id.textLittleC2		);
		mBigE2 =		(TextView	)findViewById(R.id.textBigE2		);

		mD3 =			(TextView	)findViewById(R.id.textD3			);
		mBigC3 =		(TextView	)findViewById(R.id.textBigC3		);
		mLittleC3 =		(TextView	)findViewById(R.id.textLittleC3		);
		mBigE3 =		(TextView	)findViewById(R.id.textBigE3		);

		mSolution =		(TextView	)findViewById(R.id.textSolution		);
		
		mCheck1 =		(CheckBox	)findViewById(R.id.check1			);
		mCheck2 =		(CheckBox	)findViewById(R.id.check2			);
		mCheck3 =		(CheckBox	)findViewById(R.id.check3			);

		mCalculate =	(Button		)findViewById(R.id.buttonCalculate	);
        mCalculate.setOnClickListener(this);

        antibodies =	new char[3];
        
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
		char	i;

		solutions =	0;

		for (i = 0; i < 3; i++)
			antibodies[i] =	0;

		if      ( mCheck1.isChecked() &&  mCheck2.isChecked() &&  mCheck3.isChecked())
			mSolution.setText("Inconclusive");
		else if (!mCheck1.isChecked() && !mCheck2.isChecked() && !mCheck3.isChecked())
			mSolution.setText("Too weak");
		else
		{
			mSolution.setText("");
			if (!mCheck1.isChecked())//Can use this row to cross out
			{
				if (
					(mBigC1.getText().equals("+") && mLittleC1.getText().equals("0"))//C can be crossed out
					||
					(mBigC1.getText().equals("0") && mLittleC1.getText().equals("+"))
				   )
				{
					Log.d("Antibody", "Using 1 to cross out C");
					antibodies[1] =	255;
					Use2ToGetSolutions();
					Use3ToGetSolutions();
				}
			}
			if (!mCheck2.isChecked())//Can use this row to cross out
			{
				if (
					(antibodies[1] < 255)
					&&
					(
					 (mBigC2.getText().equals("+") && mLittleC2.getText().equals("0"))//C can be crossed out
					 ||
					 (mBigC2.getText().equals("0") && mLittleC2.getText().equals("+"))
					)
				   )
				{
					Log.d("Antibody", "Using 2 to cross out C");
					antibodies[1] =	255;
					Use1ToGetSolutions();
					Use3ToGetSolutions();
				}
			}
			if (!mCheck3.isChecked())//Can use this row to cross out
			{
				if (
					(antibodies[1] < 255)
					&&
					(
					 (mBigC3.getText().equals("+") && mLittleC3.getText().equals("0"))//C can be crossed out
					 ||
					 (mBigC3.getText().equals("0") && mLittleC3.getText().equals("+"))
				    )
				   )
				{
					Log.d("Antibody", "Using 3 to cross out C");
					antibodies[1] =	255;
					Use1ToGetSolutions();
					Use2ToGetSolutions();
				}
			}
		}
	}

	void Use1ToGetSolutions()
	{
		if (mCheck1.isChecked())
		{
			Log.d("Antibody", "Using 1 to get solutions");
			if (mD1.getText().equals("+"))
			{
				mSolution.setText(	mSolution.getText() + 
									(solutions > 0 ? ", D" : "D")
								 );
				solutions++;
			}
			if (mBigE1.getText().equals("+"))
			{
				mSolution.setText(	mSolution.getText() + 
									(solutions > 0 ? ", E" : "E")
								 );
				solutions++;
			}
		}
	}

	void Use2ToGetSolutions()
	{
		if (mCheck2.isChecked())
		{
			Log.d("Antibody", "Using 2 to get solutions");
			if (mD2.getText().equals("+"))
			{
				mSolution.setText(	mSolution.getText() + 
									(solutions > 0 ? ", D" : "D")
								 );
			solutions++;
			}
			if (mBigE2.getText().equals("+"))
			{
				mSolution.setText(	mSolution.getText() + 
									(solutions > 0 ? ", E" : "E")
								 );
				solutions++;
			}
		}
	}

	void Use3ToGetSolutions()
	{
		if (mCheck3.isChecked())
		{
			Log.d("Antibody", "Using 3 to get solutions");
			if (mD3.getText().equals("+"))
			{
				mSolution.setText(	mSolution.getText() + 
									(solutions > 0 ? ", D" : "D")
								 );
				solutions++;
			}
			if (mBigE3.getText().equals("+"))
			{
				mSolution.setText(	mSolution.getText() + 
									(solutions > 0 ? ", E" : "E")
								 );
				solutions++;
			}
		}
	}
}
