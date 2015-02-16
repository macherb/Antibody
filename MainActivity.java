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
						mBigE1,
						mLittleC1,
						mLittleE1,
						mF1,
						mCW1,
						mV1,
						mBigK1,
						mLittleK1,

						mD2,
						mBigC2,
						mBigE2,
						mLittleC2,
						mLittleE2,
						mF2,
						mCW2,
						mV2,
						mBigK2,
						mLittleK2,

						mD3,
						mBigC3,
						mBigE3,
						mLittleC3,
						mLittleE3,
						mF3,
						mCW3,
						mV3,
						mBigK3,
						mLittleK3,

						mD4,
						mBigC4,
						mBigE4,
						mLittleC4,
						mLittleE4,
						mF4,
						mCW4,
						mV4,
						mBigK4,
						mLittleK4,

						mD5,
						mBigC5,
						mBigE5,
						mLittleC5,
						mLittleE5,
						mF5,
						mCW5,
						mV5,
						mBigK5,
						mLittleK5,

						mD6,
						mBigC6,
						mBigE6,
						mLittleC6,
						mLittleE6,
						mF6,
						mCW6,
						mV6,
						mBigK6,
						mLittleK6,

						mSolution;

	private CheckBox	mCheck1,
						mCheck2,
						mCheck3,
						mCheck4,
						mCheck5,
						mCheck6;

	private Button		mCalculate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mD1 =			(TextView	)findViewById(R.id.textD1			);
		mBigC1 =		(TextView	)findViewById(R.id.textBigC1		);
		mBigE1 =		(TextView	)findViewById(R.id.textBigE1		);
		mLittleC1 =		(TextView	)findViewById(R.id.textLittleC1		);
		mLittleE1 =		(TextView	)findViewById(R.id.textLittleE1		);
		mF1 =			(TextView	)findViewById(R.id.textF1			);
		mCW1 =			(TextView	)findViewById(R.id.textCW1			);
		mV1 =			(TextView	)findViewById(R.id.textV1			);
		mBigK1 =		(TextView	)findViewById(R.id.textBigK1		);
		mLittleK1 =		(TextView	)findViewById(R.id.textLittleK1		);

		mD2 =			(TextView	)findViewById(R.id.textD2			);
		mBigC2 =		(TextView	)findViewById(R.id.textBigC2		);
		mBigE2 =		(TextView	)findViewById(R.id.textBigE2		);
		mLittleC2 =		(TextView	)findViewById(R.id.textLittleC2		);
		mLittleE2 =		(TextView	)findViewById(R.id.textLittleE2		);
		mF2 =			(TextView	)findViewById(R.id.textF2			);
		mCW2 =			(TextView	)findViewById(R.id.textCW2			);
		mV2 =			(TextView	)findViewById(R.id.textV2			);
		mBigK2 =		(TextView	)findViewById(R.id.textBigK2		);
		mLittleK2 =		(TextView	)findViewById(R.id.textLittleK2		);

		mD3 =			(TextView	)findViewById(R.id.textD3			);
		mBigC3 =		(TextView	)findViewById(R.id.textBigC3		);
		mBigE3 =		(TextView	)findViewById(R.id.textBigE3		);
		mLittleC3 =		(TextView	)findViewById(R.id.textLittleC3		);
		mLittleE3 =		(TextView	)findViewById(R.id.textLittleE3		);
		mF3 =			(TextView	)findViewById(R.id.textF3			);
		mCW3 =			(TextView	)findViewById(R.id.textCW3			);
		mV3 =			(TextView	)findViewById(R.id.textV3			);
		mBigK3 =		(TextView	)findViewById(R.id.textBigK3		);
		mLittleK3 =		(TextView	)findViewById(R.id.textLittleK3		);

		mD4 =			(TextView	)findViewById(R.id.textD4			);
		mBigC4 =		(TextView	)findViewById(R.id.textBigC4		);
		mBigE4 =		(TextView	)findViewById(R.id.textBigE4		);
		mLittleC4 =		(TextView	)findViewById(R.id.textLittleC4		);
		mLittleE4 =		(TextView	)findViewById(R.id.textLittleE4		);
		mF4 =			(TextView	)findViewById(R.id.textF4			);
		mCW4 =			(TextView	)findViewById(R.id.textCW4			);
		mV4 =			(TextView	)findViewById(R.id.textV4			);
		mBigK4 =		(TextView	)findViewById(R.id.textBigK4		);
		mLittleK4 =		(TextView	)findViewById(R.id.textLittleK4		);

		mD5 =			(TextView	)findViewById(R.id.textD5			);
		mBigC5 =		(TextView	)findViewById(R.id.textBigC5		);
		mBigE5 =		(TextView	)findViewById(R.id.textBigE5		);
		mLittleC5 =		(TextView	)findViewById(R.id.textLittleC5		);
		mLittleE5 =		(TextView	)findViewById(R.id.textLittleE5		);
		mF5 =			(TextView	)findViewById(R.id.textF5			);
		mCW5 =			(TextView	)findViewById(R.id.textCW5			);
		mV5 =			(TextView	)findViewById(R.id.textV5			);
		mBigK5 =		(TextView	)findViewById(R.id.textBigK5		);
		mLittleK5 =		(TextView	)findViewById(R.id.textLittleK5		);

		mD6 =			(TextView	)findViewById(R.id.textD6			);
		mBigC6 =		(TextView	)findViewById(R.id.textBigC6		);
		mBigE6 =		(TextView	)findViewById(R.id.textBigE6		);
		mLittleC6 =		(TextView	)findViewById(R.id.textLittleC6		);
		mLittleE6 =		(TextView	)findViewById(R.id.textLittleE6		);
		mF6 =			(TextView	)findViewById(R.id.textF6			);
		mCW6 =			(TextView	)findViewById(R.id.textCW6			);
		mV6 =			(TextView	)findViewById(R.id.textV6			);
		mBigK6 =		(TextView	)findViewById(R.id.textBigK6		);
		mLittleK6 =		(TextView	)findViewById(R.id.textLittleK6		);

		mSolution =		(TextView	)findViewById(R.id.textSolution		);
		
		mCheck1 =		(CheckBox	)findViewById(R.id.check1			);
		mCheck2 =		(CheckBox	)findViewById(R.id.check2			);
		mCheck3 =		(CheckBox	)findViewById(R.id.check3			);
		mCheck4 =		(CheckBox	)findViewById(R.id.check4			);
		mCheck5 =		(CheckBox	)findViewById(R.id.check5			);
		mCheck6 =		(CheckBox	)findViewById(R.id.check6			);

		mCalculate =	(Button		)findViewById(R.id.buttonCalculate	);
        mCalculate.setOnClickListener(this);

        antibodies =	new char[10];
        
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

		for (i = 0; i < 10; i++)
			antibodies[i] =	0;

		if      ( mCheck1.isChecked() &&  mCheck2.isChecked() &&  mCheck3.isChecked() &&  mCheck4.isChecked() &&  mCheck5.isChecked() &&  mCheck6.isChecked())
			mSolution.setText("Inconclusive");
		else if (!mCheck1.isChecked() && !mCheck2.isChecked() && !mCheck3.isChecked() && !mCheck4.isChecked() && !mCheck5.isChecked() && !mCheck6.isChecked())
			mSolution.setText("Too weak");
		else
		{
			mSolution.setText("");
			if (!mCheck1.isChecked())//Can use this row to cross out
			{
				CrossOut(	0, mD1		, 				1, "D");
				CrossOut1(	1, mBigC1	, mLittleC1	,	1, "C");
				CrossOut1(	2, mBigE1	, mLittleE1	,	1, "E");
				CrossOut1(	3, mLittleC1, mBigC1	,	1, "c");
				CrossOut1(	4, mLittleE1, mBigE1	,	1, "e");
				CrossOut(	5, mF1		,				1, "f");
				CrossOut(	6, mCW1		,				1, "Cw");
				CrossOut(	7, mV1		,				1, "V");
				CrossOut1(	8, mBigK1	, mLittleK1	,	1, "K");
				CrossOut1(	9, mLittleK1, mBigK1	,	1, "k");
			}
			if (!mCheck2.isChecked())//Can use this row to cross out
			{
				CrossOut(	0, mD2		, 				2, "D");
				CrossOut1(	1, mBigC2	, mLittleC2	,	2, "C");
				CrossOut1(	2, mBigE2	, mLittleE2	,	2, "E");
				CrossOut1(	3, mLittleC2, mBigC2	,	2, "c");
				CrossOut1(	4, mLittleE2, mBigE2	,	2, "e");
				CrossOut(	5, mF2		,				2, "f");
				CrossOut(	6, mCW2		,				2, "Cw");
				CrossOut(	7, mV2		,				2, "V");
				CrossOut1(	8, mBigK2	, mLittleK2	,	2, "K");
				CrossOut1(	9, mLittleK2, mBigK2	,	2, "k");
			}
			if (!mCheck3.isChecked())//Can use this row to cross out
			{
				CrossOut(	0, mD3		,				3, "D");
				CrossOut1(	1, mBigC3	, mLittleC3	,	3, "C");
				CrossOut1(	2, mBigE3	, mLittleE3	,	3, "E");
				CrossOut1(	3, mLittleC3, mBigC3	,	3, "c");
				CrossOut1(	4, mLittleE3, mBigE3	,	3, "e");
				CrossOut(	5, mF3		,				3, "f");
				CrossOut(	6, mCW3		,				3, "Cw");
				CrossOut(	7, mV3		,				3, "V");
				CrossOut1(	8, mBigK3	, mLittleK3	,	3, "K");
				CrossOut1(	9, mLittleK3, mBigK3	,	3, "k");
			}
			if (!mCheck4.isChecked())//Can use this row to cross out
			{
				CrossOut(	0, mD4		,				4, "D");
				CrossOut1(	1, mBigC4	, mLittleC4	,	4, "C");
				CrossOut1(	2, mBigE4	, mLittleE4	,	4, "E");
				CrossOut1(	3, mLittleC4, mBigC4	,	4, "c");
				CrossOut1(	4, mLittleE4, mBigE4	,	4, "e");
				CrossOut(	5, mF4		,				4, "f");
				CrossOut(	6, mCW4		,				4, "Cw");
				CrossOut(	7, mV4		,				4, "V");
				CrossOut1(	8, mBigK4	, mLittleK4	,	4, "K");
				CrossOut1(	9, mLittleK4, mBigK4	,	4, "k");
			}
			if (!mCheck5.isChecked())//Can use this row to cross out
			{
				CrossOut(	0, mD5		,				5, "D");
				CrossOut1(	1, mBigC5	, mLittleC5	,	5, "C");
				CrossOut1(	2, mBigE5	, mLittleE5	,	5, "E");
				CrossOut1(	3, mLittleC5, mBigC5	,	4, "c");
				CrossOut1(	4, mLittleE5, mBigE5	,	5, "e");
				CrossOut(	5, mF5		,				5, "f");
				CrossOut(	6, mCW5		,				5, "Cw");
				CrossOut(	7, mV5		,				5, "V");
				CrossOut1(	8, mBigK5	, mLittleK5	,	5, "K");
				CrossOut1(	9, mLittleK5, mBigK5	,	5, "k");
			}
			if (!mCheck6.isChecked())//Can use this row to cross out
			{
				CrossOut(	0, mD6		,				6, "D");
				CrossOut1(	1, mBigC6	, mLittleC6	,	6, "C");
				CrossOut1(	2, mBigE6	, mLittleE6	,	6, "E");
				CrossOut1(	3, mLittleC6, mBigC6	,	6, "c");
				CrossOut1(	4, mLittleE6, mBigE6	,	6, "e");
				CrossOut(	5, mF6		,				6, "f");
				CrossOut(	6, mCW6		,				6, "Cw");
				CrossOut(	7, mV6		,				6, "V");
				CrossOut1(	8, mBigK6	, mLittleK6	,	6, "K");
				CrossOut1(	9, mLittleK6, mBigK6	,	6, "k");
			}
			Use1ToGetSolutions();
			Use2ToGetSolutions();
			Use3ToGetSolutions();
			Use4ToGetSolutions();
			Use5ToGetSolutions();
			Use6ToGetSolutions();
		}
	}

	void CrossOut(int index, TextView Antibody, int cell, String letter)
	{
		if (
			(antibodies[index] < 255)
			&&
			Antibody.getText().equals("+")
		   )
		{
			Log.d("Antibody", "Using " + cell + " to cross out " + letter);
			antibodies[index] =	255;
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

	void Use1ToGetSolutions()
	{
		if (mCheck1.isChecked())
		{
			Log.d("Antibody", "Using 1 to get solutions");
			GetSolution(0, mD1		, "D");
			GetSolution(1, mBigC1	, "C");
			GetSolution(2, mBigE1	, "E");
			GetSolution(3, mLittleC1, "c");
			GetSolution(4, mLittleE1, "e");
			GetSolution(5, mF1		, "f");
			GetSolution(6, mCW1		, "Cw");
			GetSolution(7, mV1		, "V");
			GetSolution(8, mBigK1	, "K");
			GetSolution(9, mLittleK1, "k");
		}
	}

	void Use2ToGetSolutions()
	{
		if (mCheck2.isChecked())
		{
			Log.d("Antibody", "Using 2 to get solutions");
			GetSolution(0, mD2		, "D");
			GetSolution(1, mBigC2	, "C");
			GetSolution(2, mBigE2	, "E");
			GetSolution(3, mLittleC2, "c");
			GetSolution(4, mLittleE2, "e");
			GetSolution(5, mF2		, "f");
			GetSolution(6, mCW2		, "Cw");
			GetSolution(7, mV2		, "V");
			GetSolution(8, mBigK2	, "K");
			GetSolution(9, mLittleK2, "k");
		}
	}

	void Use3ToGetSolutions()
	{
		if (mCheck3.isChecked())
		{
			Log.d("Antibody", "Using 3 to get solutions");
			GetSolution(0, mD3		, "D");
			GetSolution(1, mBigC3	, "C");
			GetSolution(2, mBigE3	, "E");
			GetSolution(3, mLittleC3, "c");
			GetSolution(4, mLittleE3, "e");
			GetSolution(5, mF3		, "f");
			GetSolution(6, mCW3		, "Cw");
			GetSolution(7, mV3		, "V");
			GetSolution(8, mBigK3	, "K");
			GetSolution(9, mLittleK3, "k");
		}
	}

	void Use4ToGetSolutions()
	{
		if (mCheck4.isChecked())
		{
			Log.d("Antibody", "Using 4 to get solutions");
			GetSolution(0, mD4		, "D");
			GetSolution(1, mBigC4	, "C");
			GetSolution(2, mBigE4	, "E");
			GetSolution(3, mLittleC4, "c");
			GetSolution(4, mLittleE4, "e");
			GetSolution(5, mF4		, "f");
			GetSolution(6, mCW4		, "Cw");
			GetSolution(7, mV4		, "V");
			GetSolution(8, mBigK4	, "K");
			GetSolution(9, mLittleK4, "k");
		}
	}

	void Use5ToGetSolutions()
	{
		if (mCheck5.isChecked())
		{
			Log.d("Antibody", "Using 5 to get solutions");
			GetSolution(0, mD5		, "D");
			GetSolution(1, mBigC5	, "C");
			GetSolution(2, mBigE5	, "E");
			GetSolution(3, mLittleC5, "c");
			GetSolution(4, mLittleE5, "e");
			GetSolution(5, mF5		, "f");
			GetSolution(6, mCW5		, "Cw");
			GetSolution(7, mV5		, "V");
			GetSolution(8, mBigK5	, "K");
			GetSolution(9, mLittleK5, "k");
		}
	}

	void Use6ToGetSolutions()
	{
		if (mCheck6.isChecked())
		{
			Log.d("Antibody", "Using 6 to get solutions");
			GetSolution(0, mD6		, "D");
			GetSolution(1, mBigC6	, "C");
			GetSolution(2, mBigE6	, "E");
			GetSolution(3, mLittleC6, "c");
			GetSolution(4, mLittleE6, "e");
			GetSolution(5, mF6		, "f");
			GetSolution(6, mCW6		, "Cw");
			GetSolution(7, mV6		, "V");
			GetSolution(8, mBigK6	, "K");
			GetSolution(9, mLittleK6, "k");
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
