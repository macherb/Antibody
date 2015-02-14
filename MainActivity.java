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
						mLittleE1,

						mD2,
						mBigC2,
						mLittleC2,
						mBigE2,
						mLittleE2,

						mD3,
						mBigC3,
						mLittleC3,
						mBigE3,
						mLittleE3,

						mD4,
						mBigC4,
						mLittleC4,
						mBigE4,
						mLittleE4,

						mSolution;

	private CheckBox	mCheck1,
						mCheck2,
						mCheck3,
						mCheck4;
	
	private Button		mCalculate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mD1 =			(TextView	)findViewById(R.id.textD1			);
		mBigC1 =		(TextView	)findViewById(R.id.textBigC1		);
		mLittleC1 =		(TextView	)findViewById(R.id.textLittleC1		);
		mBigE1 =		(TextView	)findViewById(R.id.textBigE1		);
		mLittleE1 =		(TextView	)findViewById(R.id.textLittleE1		);

		mD2 =			(TextView	)findViewById(R.id.textD2			);
		mBigC2 =		(TextView	)findViewById(R.id.textBigC2		);
		mLittleC2 =		(TextView	)findViewById(R.id.textLittleC2		);
		mBigE2 =		(TextView	)findViewById(R.id.textBigE2		);
		mLittleE2 =		(TextView	)findViewById(R.id.textLittleE2		);

		mD3 =			(TextView	)findViewById(R.id.textD3			);
		mBigC3 =		(TextView	)findViewById(R.id.textBigC3		);
		mLittleC3 =		(TextView	)findViewById(R.id.textLittleC3		);
		mBigE3 =		(TextView	)findViewById(R.id.textBigE3		);
		mLittleE3 =		(TextView	)findViewById(R.id.textLittleE3		);

		mD4 =			(TextView	)findViewById(R.id.textD4			);
		mBigC4 =		(TextView	)findViewById(R.id.textBigC4		);
		mLittleC4 =		(TextView	)findViewById(R.id.textLittleC4		);
		mBigE4 =		(TextView	)findViewById(R.id.textBigE4		);
		mLittleE4 =		(TextView	)findViewById(R.id.textLittleE4		);

		mSolution =		(TextView	)findViewById(R.id.textSolution		);
		
		mCheck1 =		(CheckBox	)findViewById(R.id.check1			);
		mCheck2 =		(CheckBox	)findViewById(R.id.check2			);
		mCheck3 =		(CheckBox	)findViewById(R.id.check3			);
		mCheck4 =		(CheckBox	)findViewById(R.id.check4			);

		mCalculate =	(Button		)findViewById(R.id.buttonCalculate	);
        mCalculate.setOnClickListener(this);

        antibodies =	new char[5];
        
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

		for (i = 0; i < 5; i++)
			antibodies[i] =	0;

		if      ( mCheck1.isChecked() &&  mCheck2.isChecked() &&  mCheck3.isChecked() &&  mCheck4.isChecked())
			mSolution.setText("Inconclusive");
		else if (!mCheck1.isChecked() && !mCheck2.isChecked() && !mCheck3.isChecked() && !mCheck4.isChecked())
			mSolution.setText("Too weak");
		else
		{
			mSolution.setText("");
			if (!mCheck1.isChecked())//Can use this row to cross out
			{
				CrossOut1(1, mBigC1, mLittleC1, 1, "C");
				CrossOut2(3, mBigC1, mLittleC1, 1, "c");
				CrossOut1(2, mBigE1, mLittleE1, 1, "E");
				CrossOut2(4, mBigE1, mLittleE1, 1, "e");
			}
			if (!mCheck2.isChecked())//Can use this row to cross out
			{
				CrossOut1(1, mBigC2, mLittleC2, 2, "C");
				CrossOut2(3, mBigC2, mLittleC2, 2, "c");
				CrossOut1(2, mBigE2, mLittleE2, 2, "E");
				CrossOut2(4, mBigE2, mLittleE2, 2, "e");
			}
			if (!mCheck3.isChecked())//Can use this row to cross out
			{
				CrossOut1(1, mBigC3, mLittleC3, 3, "C");
				CrossOut2(3, mBigC3, mLittleC3, 3, "c");
				CrossOut1(2, mBigE3, mLittleE3, 3, "E");
				CrossOut2(4, mBigE3, mLittleE3, 3, "e");
			}
			if (!mCheck4.isChecked())//Can use this row to cross out
			{
				CrossOut1(1, mBigC4, mLittleC4, 4, "C");
				CrossOut2(3, mBigC4, mLittleC4, 4, "c");
				CrossOut1(2, mBigE4, mLittleE4, 4, "E");
				CrossOut2(4, mBigE4, mLittleE4, 4, "e");
			}
			Use1ToGetSolutions();
			Use2ToGetSolutions();
			Use3ToGetSolutions();
			Use4ToGetSolutions();
		}
	}

	void CrossOut1(int index, TextView Big, TextView Little, int cell, String letter)
	{
		if (
			(antibodies[index] < 255)
			&&
			(Big.getText().equals("+") && Little.getText().equals("0"))
		   )
		{
			Log.d("Antibody", "Using " + cell + " to cross out " + letter);
			antibodies[index] =	255;
		}
	}

	void CrossOut2(int index, TextView Big, TextView Little, int cell, String letter)
	{
		if (
			(antibodies[index] < 255)
			&&
			(Big.getText().equals("0") && Little.getText().equals("+"))
		   )
		{
			Log.d("Antibody", "Using " + cell + " to cross out " + letter);
			antibodies[index] =	255;
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
			GetSolution(1, mBigC1, "C");
			GetSolution(2, mBigE1, "E");
			GetSolution(3, mLittleC1, "c");
			GetSolution(4, mLittleE1, "e");
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
			GetSolution(1, mBigC2, "C");
			GetSolution(2, mBigE2, "E");
			GetSolution(3, mLittleC2, "c");
			GetSolution(4, mLittleE2, "e");
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
			GetSolution(1, mBigC3, "C");
			GetSolution(2, mBigE3, "E");
			GetSolution(3, mLittleC3, "c");
			GetSolution(4, mLittleE3, "e");
		}
	}

	void Use4ToGetSolutions()
	{
		if (mCheck4.isChecked())
		{
			Log.d("Antibody", "Using 4 to get solutions");
			if (mD4.getText().equals("+"))
			{
				mSolution.setText(	mSolution.getText() + 
									(solutions > 0 ? ", D" : "D")
								 );
				solutions++;
			}
			GetSolution(1, mBigC4, "C");
			GetSolution(2, mBigE4, "E");
			GetSolution(3, mLittleC4, "c");
			GetSolution(4, mLittleE4, "e");
		}
	}

	void GetSolution(int index, TextView antibody, String letter)
	{
		if (
			(antibodies[index] != 255)
			&&
			antibody.getText().equals("+")
		   )
		{
			mSolution.setText(	mSolution.getText() + 
								(solutions > 0 ? ", " + letter : letter)
							 );
			solutions++;
		}
	}
}
