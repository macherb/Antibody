package com.example.antibodyidentification;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Decide which antibodies are solutions
 * 
 * @author Bobby Macher
 */
public class MainActivity extends Activity implements View.OnClickListener {

	private Antibody	antibody;

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
						mKPA1,
						mKPB1,
						mJSA1,
						mJSB1,
						mFYA1,
						mFYB1,
						mJKA1,
						mJKB1,
						mXGA1,
						mLEA1,
						mLEB1,
						mBigS1,
						mLittleS1,
						mM1,
						mN1,
						mP1_1,
						mLUA1,
						mLUB1,

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
						mKPA2,
						mKPB2,
						mJSA2,
						mJSB2,
						mFYA2,
						mFYB2,
						mJKA2,
						mJKB2,
						mXGA2,
						mLEA2,
						mLEB2,
						mBigS2,
						mLittleS2,
						mM2,
						mN2,
						mP1_2,
						mLUA2,
						mLUB2,

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
						mKPA3,
						mKPB3,
						mJSA3,
						mJSB3,
						mFYA3,
						mFYB3,
						mJKA3,
						mJKB3,
						mXGA3,
						mLEA3,
						mLEB3,
						mBigS3,
						mLittleS3,
						mM3,
						mN3,
						mP1_3,
						mLUA3,
						mLUB3,

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
						mKPA4,
						mKPB4,
						mJSA4,
						mJSB4,
						mFYA4,
						mFYB4,
						mJKA4,
						mJKB4,
						mXGA4,
						mLEA4,
						mLEB4,
						mBigS4,
						mLittleS4,
						mM4,
						mN4,
						mP1_4,
						mLUA4,
						mLUB4,

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
						mKPA5,
						mKPB5,
						mJSA5,
						mJSB5,
						mFYA5,
						mFYB5,
						mJKA5,
						mJKB5,
						mXGA5,
						mLEA5,
						mLEB5,
						mBigS5,
						mLittleS5,
						mM5,
						mN5,
						mP1_5,
						mLUA5,
						mLUB5,

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
						mKPA6,
						mKPB6,
						mJSA6,
						mJSB6,
						mFYA6,
						mFYB6,
						mJKA6,
						mJKB6,
						mXGA6,
						mLEA6,
						mLEB6,
						mBigS6,
						mLittleS6,
						mM6,
						mN6,
						mP1_6,
						mLUA6,
						mLUB6,

						mD7,
						mBigC7,
						mBigE7,
						mLittleC7,
						mLittleE7,
						mF7,
						mCW7,
						mV7,
						mBigK7,
						mLittleK7,
						mKPA7,
						mKPB7,
						mJSA7,
						mJSB7,
						mFYA7,
						mFYB7,
						mJKA7,
						mJKB7,
						mXGA7,
						mLEA7,
						mLEB7,
						mBigS7,
						mLittleS7,
						mM7,
						mN7,
						mP1_7,
						mLUA7,
						mLUB7,

						mD8,
						mBigC8,
						mBigE8,
						mLittleC8,
						mLittleE8,
						mF8,
						mCW8,
						mV8,
						mBigK8,
						mLittleK8,
						mKPA8,
						mKPB8,
						mJSA8,
						mJSB8,
						mFYA8,
						mFYB8,
						mJKA8,
						mJKB8,
						mXGA8,
						mLEA8,
						mLEB8,
						mBigS8,
						mLittleS8,
						mM8,
						mN8,
						mP1_8,
						mLUA8,
						mLUB8,

						mSolution;

	private CheckBox	mCheck1,
						mCheck2,
						mCheck3,
						mCheck4,
						mCheck5,
						mCheck6,
						mCheck7,
						mCheck8;

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
		mKPA1 =			(TextView	)findViewById(R.id.textKPA1			);
		mKPB1 =			(TextView	)findViewById(R.id.textKPB1			);
		mJSA1 =			(TextView	)findViewById(R.id.textJSA1			);
		mJSB1 =			(TextView	)findViewById(R.id.textJSB1			);
		mFYA1 =			(TextView	)findViewById(R.id.textFYA1			);
		mFYB1 =			(TextView	)findViewById(R.id.textFYB1			);
		mJKA1 =			(TextView	)findViewById(R.id.textJKA1			);
		mJKB1 =			(TextView	)findViewById(R.id.textJKB1			);
		mXGA1 =			(TextView	)findViewById(R.id.textXGA1			);
		mLEA1 =			(TextView	)findViewById(R.id.textLEA1			);
		mLEB1 =			(TextView	)findViewById(R.id.textLEB1			);
		mBigS1 =		(TextView	)findViewById(R.id.textBigS1		);
		mLittleS1 =		(TextView	)findViewById(R.id.textLittleS1		);
		mM1 =			(TextView	)findViewById(R.id.textM1			);
		mN1 =			(TextView	)findViewById(R.id.textN1			);
		mP1_1 =			(TextView	)findViewById(R.id.textP1_1			);
		mLUA1 =			(TextView	)findViewById(R.id.textLUA1			);
		mLUB1 =			(TextView	)findViewById(R.id.textLUB1			);

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
		mKPA2 =			(TextView	)findViewById(R.id.textKPA2			);
		mKPB2 =			(TextView	)findViewById(R.id.textKPB2			);
		mJSA2 =			(TextView	)findViewById(R.id.textJSA2			);
		mJSB2 =			(TextView	)findViewById(R.id.textJSB2			);
		mFYA2 =			(TextView	)findViewById(R.id.textFYA2			);
		mFYB2 =			(TextView	)findViewById(R.id.textFYB2			);
		mJKA2 =			(TextView	)findViewById(R.id.textJKA2			);
		mJKB2 =			(TextView	)findViewById(R.id.textJKB2			);
		mXGA2 =			(TextView	)findViewById(R.id.textXGA2			);
		mLEA2 =			(TextView	)findViewById(R.id.textLEA2			);
		mLEB2 =			(TextView	)findViewById(R.id.textLEB2			);
		mBigS2 =		(TextView	)findViewById(R.id.textBigS2		);
		mLittleS2 =		(TextView	)findViewById(R.id.textLittleS2		);
		mM2 =			(TextView	)findViewById(R.id.textM2			);
		mN2 =			(TextView	)findViewById(R.id.textN2			);
		mP1_2 =			(TextView	)findViewById(R.id.textP1_2			);
		mLUA2 =			(TextView	)findViewById(R.id.textLUA2			);
		mLUB2 =			(TextView	)findViewById(R.id.textLUB2			);

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
		mKPA3 =			(TextView	)findViewById(R.id.textKPA3			);
		mKPB3 =			(TextView	)findViewById(R.id.textKPB3			);
		mJSA3 =			(TextView	)findViewById(R.id.textJSA3			);
		mJSB3 =			(TextView	)findViewById(R.id.textJSB3			);
		mFYA3 =			(TextView	)findViewById(R.id.textFYA3			);
		mFYB3 =			(TextView	)findViewById(R.id.textFYB3			);
		mJKA3 =			(TextView	)findViewById(R.id.textJKA3			);
		mJKB3 =			(TextView	)findViewById(R.id.textJKB3			);
		mXGA3 =			(TextView	)findViewById(R.id.textXGA3			);
		mLEA3 =			(TextView	)findViewById(R.id.textLEA3			);
		mLEB3 =			(TextView	)findViewById(R.id.textLEB3			);
		mBigS3 =		(TextView	)findViewById(R.id.textBigS3		);
		mLittleS3 =		(TextView	)findViewById(R.id.textLittleS3		);
		mM3 =			(TextView	)findViewById(R.id.textM3			);
		mN3 =			(TextView	)findViewById(R.id.textN3			);
		mP1_3 =			(TextView	)findViewById(R.id.textP1_3			);
		mLUA3 =			(TextView	)findViewById(R.id.textLUA3			);
		mLUB3 =			(TextView	)findViewById(R.id.textLUB3			);

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
		mKPA4 =			(TextView	)findViewById(R.id.textKPA4			);
		mKPB4 =			(TextView	)findViewById(R.id.textKPB4			);
		mJSA4 =			(TextView	)findViewById(R.id.textJSA4			);
		mJSB4 =			(TextView	)findViewById(R.id.textJSB4			);
		mFYA4 =			(TextView	)findViewById(R.id.textFYA4			);
		mFYB4 =			(TextView	)findViewById(R.id.textFYB4			);
		mJKA4 =			(TextView	)findViewById(R.id.textJKA4			);
		mJKB4 =			(TextView	)findViewById(R.id.textJKB4			);
		mXGA4 =			(TextView	)findViewById(R.id.textXGA4			);
		mLEA4 =			(TextView	)findViewById(R.id.textLEA4			);
		mLEB4 =			(TextView	)findViewById(R.id.textLEB4			);
		mBigS4 =		(TextView	)findViewById(R.id.textBigS4		);
		mLittleS4 =		(TextView	)findViewById(R.id.textLittleS4		);
		mM4 =			(TextView	)findViewById(R.id.textM4			);
		mN4 =			(TextView	)findViewById(R.id.textN4			);
		mP1_4 =			(TextView	)findViewById(R.id.textP1_4			);
		mLUA4 =			(TextView	)findViewById(R.id.textLUA4			);
		mLUB4 =			(TextView	)findViewById(R.id.textLUB4			);

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
		mKPA5 =			(TextView	)findViewById(R.id.textKPA5			);
		mKPB5 =			(TextView	)findViewById(R.id.textKPB5			);
		mJSA5 =			(TextView	)findViewById(R.id.textJSA5			);
		mJSB5 =			(TextView	)findViewById(R.id.textJSB5			);
		mFYA5 =			(TextView	)findViewById(R.id.textFYA5			);
		mFYB5 =			(TextView	)findViewById(R.id.textFYB5			);
		mJKA5 =			(TextView	)findViewById(R.id.textJKA5			);
		mJKB5 =			(TextView	)findViewById(R.id.textJKB5			);
		mXGA5 =			(TextView	)findViewById(R.id.textXGA5			);
		mLEA5 =			(TextView	)findViewById(R.id.textLEA5			);
		mLEB5 =			(TextView	)findViewById(R.id.textLEB5			);
		mBigS5 =		(TextView	)findViewById(R.id.textBigS5		);
		mLittleS5 =		(TextView	)findViewById(R.id.textLittleS5		);
		mM5 =			(TextView	)findViewById(R.id.textM5			);
		mN5 =			(TextView	)findViewById(R.id.textN5			);
		mP1_5 =			(TextView	)findViewById(R.id.textP1_5			);
		mLUA5 =			(TextView	)findViewById(R.id.textLUA5			);
		mLUB5 =			(TextView	)findViewById(R.id.textLUB5			);

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
		mKPA6 =			(TextView	)findViewById(R.id.textKPA6			);
		mKPB6 =			(TextView	)findViewById(R.id.textKPB6			);
		mJSA6 =			(TextView	)findViewById(R.id.textJSA6			);
		mJSB6 =			(TextView	)findViewById(R.id.textJSB6			);
		mFYA6 =			(TextView	)findViewById(R.id.textFYA6			);
		mFYB6 =			(TextView	)findViewById(R.id.textFYB6			);
		mJKA6 =			(TextView	)findViewById(R.id.textJKA6			);
		mJKB6 =			(TextView	)findViewById(R.id.textJKB6			);
		mXGA6 =			(TextView	)findViewById(R.id.textXGA6			);
		mLEA6 =			(TextView	)findViewById(R.id.textLEA6			);
		mLEB6 =			(TextView	)findViewById(R.id.textLEB6			);
		mBigS6 =		(TextView	)findViewById(R.id.textBigS6		);
		mLittleS6 =		(TextView	)findViewById(R.id.textLittleS6		);
		mM6 =			(TextView	)findViewById(R.id.textM6			);
		mN6 =			(TextView	)findViewById(R.id.textN6			);
		mP1_6 =			(TextView	)findViewById(R.id.textP1_6			);
		mLUA6 =			(TextView	)findViewById(R.id.textLUA6			);
		mLUB6 =			(TextView	)findViewById(R.id.textLUB6			);

		mD7 =			(TextView	)findViewById(R.id.textD7			);
		mBigC7 =		(TextView	)findViewById(R.id.textBigC7		);
		mBigE7 =		(TextView	)findViewById(R.id.textBigE7		);
		mLittleC7 =		(TextView	)findViewById(R.id.textLittleC7		);
		mLittleE7 =		(TextView	)findViewById(R.id.textLittleE7		);
		mF7 =			(TextView	)findViewById(R.id.textF7			);
		mCW7 =			(TextView	)findViewById(R.id.textCW7			);
		mV7 =			(TextView	)findViewById(R.id.textV7			);
		mBigK7 =		(TextView	)findViewById(R.id.textBigK7		);
		mLittleK7 =		(TextView	)findViewById(R.id.textLittleK7		);
		mKPA7 =			(TextView	)findViewById(R.id.textKPA7			);
		mKPB7 =			(TextView	)findViewById(R.id.textKPB7			);
		mJSA7 =			(TextView	)findViewById(R.id.textJSA7			);
		mJSB7 =			(TextView	)findViewById(R.id.textJSB7			);
		mFYA7 =			(TextView	)findViewById(R.id.textFYA7			);
		mFYB7 =			(TextView	)findViewById(R.id.textFYB7			);
		mJKA7 =			(TextView	)findViewById(R.id.textJKA7			);
		mJKB7 =			(TextView	)findViewById(R.id.textJKB7			);
		mXGA7 =			(TextView	)findViewById(R.id.textXGA7			);
		mLEA7 =			(TextView	)findViewById(R.id.textLEA7			);
		mLEB7 =			(TextView	)findViewById(R.id.textLEB7			);
		mBigS7 =		(TextView	)findViewById(R.id.textBigS7		);
		mLittleS7 =		(TextView	)findViewById(R.id.textLittleS7		);
		mM7 =			(TextView	)findViewById(R.id.textM7			);
		mN7 =			(TextView	)findViewById(R.id.textN7			);
		mP1_7 =			(TextView	)findViewById(R.id.textP1_7			);
		mLUA7 =			(TextView	)findViewById(R.id.textLUA7			);
		mLUB7 =			(TextView	)findViewById(R.id.textLUB7			);

		mD8 =			(TextView	)findViewById(R.id.textD8			);
		mBigC8 =		(TextView	)findViewById(R.id.textBigC8		);
		mBigE8 =		(TextView	)findViewById(R.id.textBigE8		);
		mLittleC8 =		(TextView	)findViewById(R.id.textLittleC8		);
		mLittleE8 =		(TextView	)findViewById(R.id.textLittleE8		);
		mF8 =			(TextView	)findViewById(R.id.textF8			);
		mCW8 =			(TextView	)findViewById(R.id.textCW8			);
		mV8 =			(TextView	)findViewById(R.id.textV8			);
		mBigK8 =		(TextView	)findViewById(R.id.textBigK8		);
		mLittleK8 =		(TextView	)findViewById(R.id.textLittleK8		);
		mKPA8 =			(TextView	)findViewById(R.id.textKPA8			);
		mKPB8 =			(TextView	)findViewById(R.id.textKPB8			);
		mJSA8 =			(TextView	)findViewById(R.id.textJSA8			);
		mJSB8 =			(TextView	)findViewById(R.id.textJSB8			);
		mFYA8 =			(TextView	)findViewById(R.id.textFYA8			);
		mFYB8 =			(TextView	)findViewById(R.id.textFYB8			);
		mJKA8 =			(TextView	)findViewById(R.id.textJKA8			);
		mJKB8 =			(TextView	)findViewById(R.id.textJKB8			);
		mXGA8 =			(TextView	)findViewById(R.id.textXGA8			);
		mLEA8 =			(TextView	)findViewById(R.id.textLEA8			);
		mLEB8 =			(TextView	)findViewById(R.id.textLEB8			);
		mBigS8 =		(TextView	)findViewById(R.id.textBigS8		);
		mLittleS8 =		(TextView	)findViewById(R.id.textLittleS8		);
		mM8 =			(TextView	)findViewById(R.id.textM8			);
		mN8 =			(TextView	)findViewById(R.id.textN8			);
		mP1_8 =			(TextView	)findViewById(R.id.textP1_8			);
		mLUA8 =			(TextView	)findViewById(R.id.textLUA8			);
		mLUB8 =			(TextView	)findViewById(R.id.textLUB8			);

		mSolution =		(TextView	)findViewById(R.id.textSolution		);

		mCheck1 =		(CheckBox	)findViewById(R.id.check1			);
		mCheck2 =		(CheckBox	)findViewById(R.id.check2			);
		mCheck3 =		(CheckBox	)findViewById(R.id.check3			);
		mCheck4 =		(CheckBox	)findViewById(R.id.check4			);
		mCheck5 =		(CheckBox	)findViewById(R.id.check5			);
		mCheck6 =		(CheckBox	)findViewById(R.id.check6			);
		mCheck7 =		(CheckBox	)findViewById(R.id.check7			);
		mCheck8 =		(CheckBox	)findViewById(R.id.check8			);

		mCalculate =	(Button		)findViewById(R.id.buttonCalculate	);
        mCalculate.setOnClickListener(this);
        antibody =	new Antibody();
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
		int	i,
			j;

		antibody.Reset();

		if      ( mCheck1.isChecked() &&  mCheck2.isChecked() &&  mCheck3.isChecked() &&  mCheck4.isChecked() &&
				  mCheck5.isChecked() &&  mCheck6.isChecked() &&  mCheck7.isChecked() &&  mCheck8.isChecked()	)
		{
			mSolution.setText("Inconclusive");
			SetAllBlack();
		}
		else if (!mCheck1.isChecked() && !mCheck2.isChecked() && !mCheck3.isChecked() && !mCheck4.isChecked() &&
				 !mCheck5.isChecked() && !mCheck6.isChecked() && !mCheck7.isChecked() && !mCheck8.isChecked()	)
		{
			mSolution.setText("Too weak");
			SetAllBlack();
		}
		else
		{
			mSolution.setText("");														//clear the solution text
			if (!mCheck1.isChecked())													//Can use this row to cross out
			{
				CrossOutSingle(	0, mD1		, 				1, antibody.GetName( 0));
				CrossOutCouple(	1, mBigC1	, mLittleC1	,	1, antibody.GetName( 1));
				CrossOutCouple(	2, mBigE1	, mLittleE1	,	1, antibody.GetName( 2));
				CrossOutCouple(	3, mLittleC1, mBigC1	,	1, antibody.GetName( 3));
				CrossOutCouple(	4, mLittleE1, mBigE1	,	1, antibody.GetName( 4));
				CrossOutSingle(	5, mF1		,				1, antibody.GetName( 5));
				CrossOutSingle(	6, mCW1		,				1, antibody.GetName( 6));
				CrossOutSingle(	7, mV1		,				1, antibody.GetName( 7));
				CrossOutCouple(	8, mBigK1	, mLittleK1	,	1, antibody.GetName( 8));
				CrossOutCouple(	9, mLittleK1, mBigK1	,	1, antibody.GetName( 9));
				CrossOutCouple(10, mKPA1	, mKPB1		,	1, antibody.GetName(10));
				CrossOutCouple(11, mKPB1	, mKPA1		,	1, antibody.GetName(11));
				CrossOutCouple(12, mJSA1	, mJSB1		,	1, antibody.GetName(12));
				CrossOutCouple(13, mJSB1	, mJSA1		,	1, antibody.GetName(13));
				CrossOutCouple(14, mFYA1	, mFYB1		,	1, antibody.GetName(14));
				CrossOutCouple(15, mFYB1	, mFYA1		,	1, antibody.GetName(15));
				CrossOutCouple(16, mJKA1	, mJKB1		,	1, antibody.GetName(16));
				CrossOutCouple(17, mJKB1	, mJKA1		,	1, antibody.GetName(17));
				CrossOutSingle(18, mXGA1	,				1, antibody.GetName(18));
				CrossOutCouple(19, mLEA1	, mLEB1		,	1, antibody.GetName(19));
				CrossOutCouple(20, mLEB1	, mLEA1		,	1, antibody.GetName(20));
				CrossOutCouple(21, mBigS1	, mLittleS1	,	1, antibody.GetName(21));
				CrossOutCouple(22, mLittleS1, mBigS1	,	1, antibody.GetName(22));
				CrossOutCouple(23, mM1		, mN1		,	1, antibody.GetName(23));
				CrossOutCouple(24, mN1		, mM1		,	1, antibody.GetName(24));
				CrossOutSingle(25, mP1_1	,				1, antibody.GetName(25));
				CrossOutCouple(26, mLUA1	, mLUB1		,	1, antibody.GetName(26));
				CrossOutCouple(27, mLUB1	, mLUA1		,	1, antibody.GetName(27));
			}
			if (!mCheck2.isChecked())													//Can use this row to cross out
			{
				CrossOutSingle(	0, mD2		, 				2, antibody.GetName( 0));
				CrossOutCouple(	1, mBigC2	, mLittleC2	,	2, antibody.GetName( 1));
				CrossOutCouple(	2, mBigE2	, mLittleE2	,	2, antibody.GetName( 2));
				CrossOutCouple(	3, mLittleC2, mBigC2	,	2, antibody.GetName( 3));
				CrossOutCouple(	4, mLittleE2, mBigE2	,	2, antibody.GetName( 4));
				CrossOutSingle(	5, mF2		,				2, antibody.GetName( 5));
				CrossOutSingle(	6, mCW2		,				2, antibody.GetName( 6));
				CrossOutSingle(	7, mV2		,				2, antibody.GetName( 7));
				CrossOutCouple(	8, mBigK2	, mLittleK2	,	2, antibody.GetName( 8));
				CrossOutCouple(	9, mLittleK2, mBigK2	,	2, antibody.GetName( 9));
				CrossOutCouple(10, mKPA2	, mKPB2		,	2, antibody.GetName(10));
				CrossOutCouple(11, mKPB2	, mKPA2		,	2, antibody.GetName(11));
				CrossOutCouple(12, mJSA2	, mJSB2		,	2, antibody.GetName(12));
				CrossOutCouple(13, mJSB2	, mJSA2		,	2, antibody.GetName(13));
				CrossOutCouple(14, mFYA2	, mFYB2		,	2, antibody.GetName(14));
				CrossOutCouple(15, mFYB2	, mFYA2		,	2, antibody.GetName(15));
				CrossOutCouple(16, mJKA2	, mJKB2		,	2, antibody.GetName(16));
				CrossOutCouple(17, mJKB2	, mJKA2		,	2, antibody.GetName(17));
				CrossOutSingle(18, mXGA2	,				2, antibody.GetName(18));
				CrossOutCouple(19, mLEA2	, mLEB2		,	2, antibody.GetName(19));
				CrossOutCouple(20, mLEB2	, mLEA2		,	2, antibody.GetName(20));
				CrossOutCouple(21, mBigS2	, mLittleS2	,	2, antibody.GetName(21));
				CrossOutCouple(22, mLittleS2, mBigS2	,	2, antibody.GetName(22));
				CrossOutCouple(23, mM2		, mN2		,	2, antibody.GetName(23));
				CrossOutCouple(24, mN2		, mM2		,	2, antibody.GetName(24));
				CrossOutSingle(25, mP1_2	,				2, antibody.GetName(25));
				CrossOutCouple(26, mLUA2	, mLUB2		,	2, antibody.GetName(26));
				CrossOutCouple(27, mLUB2	, mLUA2		,	2, antibody.GetName(27));
			}
			if (!mCheck3.isChecked())													//Can use this row to cross out
			{
				CrossOutSingle(	0, mD3		,				3, antibody.GetName( 0));
				CrossOutCouple(	1, mBigC3	, mLittleC3	,	3, antibody.GetName( 1));
				CrossOutCouple(	2, mBigE3	, mLittleE3	,	3, antibody.GetName( 2));
				CrossOutCouple(	3, mLittleC3, mBigC3	,	3, antibody.GetName( 3));
				CrossOutCouple(	4, mLittleE3, mBigE3	,	3, antibody.GetName( 4));
				CrossOutSingle(	5, mF3		,				3, antibody.GetName( 5));
				CrossOutSingle(	6, mCW3		,				3, antibody.GetName( 6));
				CrossOutSingle(	7, mV3		,				3, antibody.GetName( 7));
				CrossOutCouple(	8, mBigK3	, mLittleK3	,	3, antibody.GetName( 8));
				CrossOutCouple(	9, mLittleK3, mBigK3	,	3, antibody.GetName( 9));
				CrossOutCouple(10, mKPA3	, mKPB3		,	3, antibody.GetName(10));
				CrossOutCouple(11, mKPB3	, mKPA3		,	3, antibody.GetName(11));
				CrossOutCouple(12, mJSA3	, mJSB3		,	3, antibody.GetName(12));
				CrossOutCouple(13, mJSB3	, mJSA3		,	3, antibody.GetName(13));
				CrossOutCouple(14, mFYA3	, mFYB3		,	3, antibody.GetName(14));
				CrossOutCouple(15, mFYB3	, mFYA3		,	3, antibody.GetName(15));
				CrossOutCouple(16, mJKA3	, mJKB3		,	3, antibody.GetName(16));
				CrossOutCouple(17, mJKB3	, mJKA3		,	3, antibody.GetName(17));
				CrossOutSingle(18, mXGA3	,				3, antibody.GetName(18));
				CrossOutCouple(19, mLEA3	, mLEB3		,	3, antibody.GetName(19));
				CrossOutCouple(20, mLEB3	, mLEA3		,	3, antibody.GetName(20));
				CrossOutCouple(21, mBigS3	, mLittleS3	,	3, antibody.GetName(21));
				CrossOutCouple(22, mLittleS3, mBigS3	,	3, antibody.GetName(22));
				CrossOutCouple(23, mM3		, mN3		,	3, antibody.GetName(23));
				CrossOutCouple(24, mN3		, mM3		,	3, antibody.GetName(24));
				CrossOutSingle(25, mP1_3	,				3, antibody.GetName(25));
				CrossOutCouple(26, mLUA3	, mLUB3		,	3, antibody.GetName(26));
				CrossOutCouple(27, mLUB3	, mLUA3		,	3, antibody.GetName(27));
			}
			if (!mCheck4.isChecked())													//Can use this row to cross out
			{
				CrossOutSingle(	0, mD4		,				4, antibody.GetName( 0));
				CrossOutCouple(	1, mBigC4	, mLittleC4	,	4, antibody.GetName( 1));
				CrossOutCouple(	2, mBigE4	, mLittleE4	,	4, antibody.GetName( 2));
				CrossOutCouple(	3, mLittleC4, mBigC4	,	4, antibody.GetName( 3));
				CrossOutCouple(	4, mLittleE4, mBigE4	,	4, antibody.GetName( 4));
				CrossOutSingle(	5, mF4		,				4, antibody.GetName( 5));
				CrossOutSingle(	6, mCW4		,				4, antibody.GetName( 6));
				CrossOutSingle(	7, mV4		,				4, antibody.GetName( 7));
				CrossOutCouple(	8, mBigK4	, mLittleK4	,	4, antibody.GetName( 8));
				CrossOutCouple(	9, mLittleK4, mBigK4	,	4, antibody.GetName( 9));
				CrossOutCouple(10, mKPA4	, mKPB4		,	4, antibody.GetName(10));
				CrossOutCouple(11, mKPB4	, mKPA4		,	4, antibody.GetName(11));
				CrossOutCouple(12, mJSA4	, mJSB4		,	4, antibody.GetName(12));
				CrossOutCouple(13, mJSB4	, mJSA4		,	4, antibody.GetName(13));
				CrossOutCouple(14, mFYA4	, mFYB4		,	4, antibody.GetName(14));
				CrossOutCouple(15, mFYB4	, mFYA4		,	4, antibody.GetName(15));
				CrossOutCouple(16, mJKA4	, mJKB4		,	4, antibody.GetName(16));
				CrossOutCouple(17, mJKB4	, mJKA4		,	4, antibody.GetName(17));
				CrossOutSingle(18, mXGA4	,				4, antibody.GetName(18));
				CrossOutCouple(19, mLEA4	, mLEB4		,	4, antibody.GetName(19));
				CrossOutCouple(20, mLEB4	, mLEA4		,	4, antibody.GetName(20));
				CrossOutCouple(21, mBigS4	, mLittleS4	,	4, antibody.GetName(21));
				CrossOutCouple(22, mLittleS4, mBigS4	,	4, antibody.GetName(22));
				CrossOutCouple(23, mM4		, mN4		,	4, antibody.GetName(23));
				CrossOutCouple(24, mN4		, mM4		,	4, antibody.GetName(24));
				CrossOutSingle(25, mP1_4	,				4, antibody.GetName(25));
				CrossOutCouple(26, mLUA4	, mLUB4		,	4, antibody.GetName(26));
				CrossOutCouple(27, mLUB4	, mLUA4		,	4, antibody.GetName(27));
			}
			if (!mCheck5.isChecked())													//Can use this row to cross out
			{
				CrossOutSingle(	0, mD5		,				5, antibody.GetName( 0));
				CrossOutCouple(	1, mBigC5	, mLittleC5	,	5, antibody.GetName( 1));
				CrossOutCouple(	2, mBigE5	, mLittleE5	,	5, antibody.GetName( 2));
				CrossOutCouple(	3, mLittleC5, mBigC5	,	5, antibody.GetName( 3));
				CrossOutCouple(	4, mLittleE5, mBigE5	,	5, antibody.GetName( 4));
				CrossOutSingle(	5, mF5		,				5, antibody.GetName( 5));
				CrossOutSingle(	6, mCW5		,				5, antibody.GetName( 6));
				CrossOutSingle(	7, mV5		,				5, antibody.GetName( 7));
				CrossOutCouple(	8, mBigK5	, mLittleK5	,	5, antibody.GetName( 8));
				CrossOutCouple(	9, mLittleK5, mBigK5	,	5, antibody.GetName( 9));
				CrossOutCouple(10, mKPA5	, mKPB5		,	5, antibody.GetName(10));
				CrossOutCouple(11, mKPB5	, mKPA5		,	5, antibody.GetName(11));
				CrossOutCouple(12, mJSA5	, mJSB5		,	5, antibody.GetName(12));
				CrossOutCouple(13, mJSB5	, mJSA5		,	5, antibody.GetName(13));
				CrossOutCouple(14, mFYA5	, mFYB5		,	5, antibody.GetName(14));
				CrossOutCouple(15, mFYB5	, mFYA5		,	5, antibody.GetName(15));
				CrossOutCouple(16, mJKA5	, mJKB5		,	5, antibody.GetName(16));
				CrossOutCouple(17, mJKB5	, mJKA5		,	5, antibody.GetName(17));
				CrossOutSingle(18, mXGA5	,				5, antibody.GetName(18));
				CrossOutCouple(19, mLEA5	, mLEB5		,	5, antibody.GetName(19));
				CrossOutCouple(20, mLEB5	, mLEA5		,	5, antibody.GetName(20));
				CrossOutCouple(21, mBigS5	, mLittleS5	,	5, antibody.GetName(21));
				CrossOutCouple(22, mLittleS5, mBigS5	,	5, antibody.GetName(22));
				CrossOutCouple(23, mM5		, mN5		,	5, antibody.GetName(23));
				CrossOutCouple(24, mN5		, mM5		,	5, antibody.GetName(24));
				CrossOutSingle(25, mP1_5	,				5, antibody.GetName(25));
				CrossOutCouple(26, mLUA5	, mLUB5		,	5, antibody.GetName(26));
				CrossOutCouple(27, mLUB5	, mLUA5		,	5, antibody.GetName(27));
			}
			if (!mCheck6.isChecked())													//Can use this row to cross out
			{
				CrossOutSingle(	0, mD6		,				6, antibody.GetName( 0));
				CrossOutCouple(	1, mBigC6	, mLittleC6	,	6, antibody.GetName( 1));
				CrossOutCouple(	2, mBigE6	, mLittleE6	,	6, antibody.GetName( 2));
				CrossOutCouple(	3, mLittleC6, mBigC6	,	6, antibody.GetName( 3));
				CrossOutCouple(	4, mLittleE6, mBigE6	,	6, antibody.GetName( 4));
				CrossOutSingle(	5, mF6		,				6, antibody.GetName( 5));
				CrossOutSingle(	6, mCW6		,				6, antibody.GetName( 6));
				CrossOutSingle(	7, mV6		,				6, antibody.GetName( 7));
				CrossOutCouple(	8, mBigK6	, mLittleK6	,	6, antibody.GetName( 8));
				CrossOutCouple(	9, mLittleK6, mBigK6	,	6, antibody.GetName( 9));
				CrossOutCouple(10, mKPA6	, mKPB6		,	6, antibody.GetName(10));
				CrossOutCouple(11, mKPB6	, mKPA6		,	6, antibody.GetName(11));
				CrossOutCouple(12, mJSA6	, mJSB6		,	6, antibody.GetName(12));
				CrossOutCouple(13, mJSB6	, mJSA6		,	6, antibody.GetName(13));
				CrossOutCouple(14, mFYA6	, mFYB6		,	6, antibody.GetName(14));
				CrossOutCouple(15, mFYB6	, mFYA6		,	6, antibody.GetName(15));
				CrossOutCouple(16, mJKA6	, mJKB6		,	6, antibody.GetName(16));
				CrossOutCouple(17, mJKB6	, mJKA6		,	6, antibody.GetName(17));
				CrossOutSingle(18, mXGA6	,				6, antibody.GetName(18));
				CrossOutCouple(19, mLEA6	, mLEB6		,	6, antibody.GetName(19));
				CrossOutCouple(20, mLEB6	, mLEA6		,	6, antibody.GetName(20));
				CrossOutCouple(21, mBigS6	, mLittleS6	,	6, antibody.GetName(21));
				CrossOutCouple(22, mLittleS6, mBigS6	,	6, antibody.GetName(22));
				CrossOutCouple(23, mM6		, mN6		,	6, antibody.GetName(23));
				CrossOutCouple(24, mN6		, mM6		,	6, antibody.GetName(24));
				CrossOutSingle(25, mP1_6	,				6, antibody.GetName(25));
				CrossOutCouple(26, mLUA6	, mLUB6		,	6, antibody.GetName(26));
				CrossOutCouple(27, mLUB6	, mLUA6		,	6, antibody.GetName(27));
			}
			if (!mCheck7.isChecked())													//Can use this row to cross out
			{
				CrossOutSingle(	0, mD7		,				7, antibody.GetName( 0));
				CrossOutCouple(	1, mBigC7	, mLittleC7	,	7, antibody.GetName( 1));
				CrossOutCouple(	2, mBigE7	, mLittleE7	,	7, antibody.GetName( 2));
				CrossOutCouple(	3, mLittleC7, mBigC7	,	7, antibody.GetName( 3));
				CrossOutCouple(	4, mLittleE7, mBigE7	,	7, antibody.GetName( 4));
				CrossOutSingle(	5, mF7		,				7, antibody.GetName( 5));
				CrossOutSingle(	6, mCW7		,				7, antibody.GetName( 6));
				CrossOutSingle(	7, mV7		,				7, antibody.GetName( 7));
				CrossOutCouple(	8, mBigK7	, mLittleK7	,	7, antibody.GetName( 8));
				CrossOutCouple(	9, mLittleK7, mBigK7	,	7, antibody.GetName( 9));
				CrossOutCouple(10, mKPA7	, mKPB7		,	7, antibody.GetName(10));
				CrossOutCouple(11, mKPB7	, mKPA7		,	7, antibody.GetName(11));
				CrossOutCouple(12, mJSA7	, mJSB7		,	7, antibody.GetName(12));
				CrossOutCouple(13, mJSB7	, mJSA7		,	7, antibody.GetName(13));
				CrossOutCouple(14, mFYA7	, mFYB7		,	7, antibody.GetName(14));
				CrossOutCouple(15, mFYB7	, mFYA7		,	7, antibody.GetName(15));
				CrossOutCouple(16, mJKA7	, mJKB7		,	7, antibody.GetName(16));
				CrossOutCouple(17, mJKB7	, mJKA7		,	7, antibody.GetName(17));
				CrossOutSingle(18, mXGA7	,				7, antibody.GetName(18));
				CrossOutCouple(19, mLEA7	, mLEB7		,	7, antibody.GetName(19));
				CrossOutCouple(20, mLEB7	, mLEA7		,	7, antibody.GetName(20));
				CrossOutCouple(21, mBigS7	, mLittleS7	,	7, antibody.GetName(21));
				CrossOutCouple(22, mLittleS7, mBigS7	,	7, antibody.GetName(22));
				CrossOutCouple(23, mM7		, mN7		,	7, antibody.GetName(23));
				CrossOutCouple(24, mN7		, mM7		,	7, antibody.GetName(24));
				CrossOutSingle(25, mP1_7	,				7, antibody.GetName(25));
				CrossOutCouple(26, mLUA7	, mLUB7		,	7, antibody.GetName(26));
				CrossOutCouple(27, mLUB7	, mLUA7		,	7, antibody.GetName(27));
			}
			if (!mCheck8.isChecked())													//Can use this row to cross out
			{
				CrossOutSingle(	0, mD8		,				8, antibody.GetName( 0));
				CrossOutCouple(	1, mBigC8	, mLittleC8	,	8, antibody.GetName( 1));
				CrossOutCouple(	2, mBigE8	, mLittleE8	,	8, antibody.GetName( 2));
				CrossOutCouple(	3, mLittleC8, mBigC8	,	8, antibody.GetName( 3));
				CrossOutCouple(	4, mLittleE8, mBigE8	,	8, antibody.GetName( 4));
				CrossOutSingle(	5, mF8		,				8, antibody.GetName( 5));
				CrossOutSingle(	6, mCW8		,				8, antibody.GetName( 6));
				CrossOutSingle(	7, mV8		,				8, antibody.GetName( 7));
				CrossOutCouple(	8, mBigK8	, mLittleK8	,	8, antibody.GetName( 8));
				CrossOutCouple(	9, mLittleK8, mBigK8	,	8, antibody.GetName( 9));
				CrossOutCouple(10, mKPA8	, mKPB8		,	8, antibody.GetName(10));
				CrossOutCouple(11, mKPB8	, mKPA8		,	8, antibody.GetName(11));
				CrossOutCouple(12, mJSA8	, mJSB8		,	8, antibody.GetName(12));
				CrossOutCouple(13, mJSB8	, mJSA8		,	8, antibody.GetName(13));
				CrossOutCouple(14, mFYA8	, mFYB8		,	8, antibody.GetName(14));
				CrossOutCouple(15, mFYB8	, mFYA8		,	8, antibody.GetName(15));
				CrossOutCouple(16, mJKA8	, mJKB8		,	8, antibody.GetName(16));
				CrossOutCouple(17, mJKB8	, mJKA8		,	8, antibody.GetName(17));
				CrossOutSingle(18, mXGA8	,				8, antibody.GetName(18));
				CrossOutCouple(19, mLEA8	, mLEB8		,	8, antibody.GetName(19));
				CrossOutCouple(20, mLEB8	, mLEA8		,	8, antibody.GetName(20));
				CrossOutCouple(21, mBigS8	, mLittleS8	,	8, antibody.GetName(21));
				CrossOutCouple(22, mLittleS8, mBigS8	,	8, antibody.GetName(22));
				CrossOutCouple(23, mM8		, mN8		,	8, antibody.GetName(23));
				CrossOutCouple(24, mN8		, mM8		,	8, antibody.GetName(24));
				CrossOutSingle(25, mP1_8	,				8, antibody.GetName(25));
				CrossOutCouple(26, mLUA8	, mLUB8		,	8, antibody.GetName(26));
				CrossOutCouple(27, mLUB8	, mLUA8		,	8, antibody.GetName(27));
			}
			Use1ToGetSolutions();
			Use2ToGetSolutions();
			Use3ToGetSolutions();
			Use4ToGetSolutions();
			Use5ToGetSolutions();
			Use6ToGetSolutions();
			Use7ToGetSolutions();
			Use8ToGetSolutions();
			for (i = 0; i < Antibody.max; i++)
			{
				if (
					(antibody.GetCount(i) > 0)	//if this is a solution
					&&							//and
					(antibody.NotCrossedOut(i))	//it hasn't been crossed out
				   )
				{
					Log.d("Antibody", "At " + i + "(" + antibody.GetName(i) + ") there is " + antibody.GetCount(i) + "");
					antibody.SetNewMost(i);		//it might be the new most
				}
			}
			for (j = 0; j < antibody.GetMost(); j++)
			{
				antibody.ResetSolutions();
				for (i = 0; i < Antibody.max; i++)
				{
					if (antibody.GetCount(i) == antibody.GetMost() - j)
					{
						mSolution.setText(	mSolution.getText() + 
											antibody.GetNameRace(i, j)
										 );
						antibody.IncrementSolutions();
					}
				}
				if (antibody.GetSolutions() > 0)	//if there is at least one solution for this number of solutions
					mSolution.setText(mSolution.getText() + "\n");
			}
			if (antibody.GetMost() == 0)			//if there are not any solutions
				mSolution.setText("There are no solutions");
		}
	}

	/**
	 * Set the color of every antibody to black
	 */
	void SetAllBlack() {
		mD1.setTextColor(getResources().getColor(R.color.black));
		mBigC1.setTextColor(getResources().getColor(R.color.black));
		mBigE1.setTextColor(getResources().getColor(R.color.black));
		mLittleC1.setTextColor(getResources().getColor(R.color.black));
		mLittleE1.setTextColor(getResources().getColor(R.color.black));
		mF1.setTextColor(getResources().getColor(R.color.black));
		mCW1.setTextColor(getResources().getColor(R.color.black));
		mV1.setTextColor(getResources().getColor(R.color.black));
		mBigK1.setTextColor(getResources().getColor(R.color.black));
		mLittleK1.setTextColor(getResources().getColor(R.color.black));
		mKPA1.setTextColor(getResources().getColor(R.color.black));
		mKPB1.setTextColor(getResources().getColor(R.color.black));
		mJSA1.setTextColor(getResources().getColor(R.color.black));
		mJSB1.setTextColor(getResources().getColor(R.color.black));
		mFYA1.setTextColor(getResources().getColor(R.color.black));
		mFYB1.setTextColor(getResources().getColor(R.color.black));
		mJKA1.setTextColor(getResources().getColor(R.color.black));
		mJKB1.setTextColor(getResources().getColor(R.color.black));
		mXGA1.setTextColor(getResources().getColor(R.color.black));
		mLEA1.setTextColor(getResources().getColor(R.color.black));
		mLEB1.setTextColor(getResources().getColor(R.color.black));
		mBigS1.setTextColor(getResources().getColor(R.color.black));
		mLittleS1.setTextColor(getResources().getColor(R.color.black));
		mM1.setTextColor(getResources().getColor(R.color.black));
		mN1.setTextColor(getResources().getColor(R.color.black));
		mP1_1.setTextColor(getResources().getColor(R.color.black));
		mLUA1.setTextColor(getResources().getColor(R.color.black));
		mLUB1.setTextColor(getResources().getColor(R.color.black));

		mD2.setTextColor(getResources().getColor(R.color.black));
		mBigC2.setTextColor(getResources().getColor(R.color.black));
		mBigE2.setTextColor(getResources().getColor(R.color.black));
		mLittleC2.setTextColor(getResources().getColor(R.color.black));
		mLittleE2.setTextColor(getResources().getColor(R.color.black));
		mF2.setTextColor(getResources().getColor(R.color.black));
		mCW2.setTextColor(getResources().getColor(R.color.black));
		mV2.setTextColor(getResources().getColor(R.color.black));
		mBigK2.setTextColor(getResources().getColor(R.color.black));
		mLittleK2.setTextColor(getResources().getColor(R.color.black));
		mKPA2.setTextColor(getResources().getColor(R.color.black));
		mKPB2.setTextColor(getResources().getColor(R.color.black));
		mJSA2.setTextColor(getResources().getColor(R.color.black));
		mJSB2.setTextColor(getResources().getColor(R.color.black));
		mFYA2.setTextColor(getResources().getColor(R.color.black));
		mFYB2.setTextColor(getResources().getColor(R.color.black));
		mJKA2.setTextColor(getResources().getColor(R.color.black));
		mJKB2.setTextColor(getResources().getColor(R.color.black));
		mXGA2.setTextColor(getResources().getColor(R.color.black));
		mLEA2.setTextColor(getResources().getColor(R.color.black));
		mLEB2.setTextColor(getResources().getColor(R.color.black));
		mBigS2.setTextColor(getResources().getColor(R.color.black));
		mLittleS2.setTextColor(getResources().getColor(R.color.black));
		mM2.setTextColor(getResources().getColor(R.color.black));
		mN2.setTextColor(getResources().getColor(R.color.black));
		mP1_2.setTextColor(getResources().getColor(R.color.black));
		mLUA2.setTextColor(getResources().getColor(R.color.black));
		mLUB2.setTextColor(getResources().getColor(R.color.black));

		mD3.setTextColor(getResources().getColor(R.color.black));
		mBigC3.setTextColor(getResources().getColor(R.color.black));
		mBigE3.setTextColor(getResources().getColor(R.color.black));
		mLittleC3.setTextColor(getResources().getColor(R.color.black));
		mLittleE3.setTextColor(getResources().getColor(R.color.black));
		mF3.setTextColor(getResources().getColor(R.color.black));
		mCW3.setTextColor(getResources().getColor(R.color.black));
		mV3.setTextColor(getResources().getColor(R.color.black));
		mBigK3.setTextColor(getResources().getColor(R.color.black));
		mLittleK3.setTextColor(getResources().getColor(R.color.black));
		mKPA3.setTextColor(getResources().getColor(R.color.black));
		mKPB3.setTextColor(getResources().getColor(R.color.black));
		mJSA3.setTextColor(getResources().getColor(R.color.black));
		mJSB3.setTextColor(getResources().getColor(R.color.black));
		mFYA3.setTextColor(getResources().getColor(R.color.black));
		mFYB3.setTextColor(getResources().getColor(R.color.black));
		mJKA3.setTextColor(getResources().getColor(R.color.black));
		mJKB3.setTextColor(getResources().getColor(R.color.black));
		mXGA3.setTextColor(getResources().getColor(R.color.black));
		mLEA3.setTextColor(getResources().getColor(R.color.black));
		mLEB3.setTextColor(getResources().getColor(R.color.black));
		mBigS3.setTextColor(getResources().getColor(R.color.black));
		mLittleS3.setTextColor(getResources().getColor(R.color.black));
		mM3.setTextColor(getResources().getColor(R.color.black));
		mN3.setTextColor(getResources().getColor(R.color.black));
		mP1_3.setTextColor(getResources().getColor(R.color.black));
		mLUA3.setTextColor(getResources().getColor(R.color.black));
		mLUB3.setTextColor(getResources().getColor(R.color.black));

		mD4.setTextColor(getResources().getColor(R.color.black));
		mBigC4.setTextColor(getResources().getColor(R.color.black));
		mBigE4.setTextColor(getResources().getColor(R.color.black));
		mLittleC4.setTextColor(getResources().getColor(R.color.black));
		mLittleE4.setTextColor(getResources().getColor(R.color.black));
		mF4.setTextColor(getResources().getColor(R.color.black));
		mCW4.setTextColor(getResources().getColor(R.color.black));
		mV4.setTextColor(getResources().getColor(R.color.black));
		mBigK4.setTextColor(getResources().getColor(R.color.black));
		mLittleK4.setTextColor(getResources().getColor(R.color.black));
		mKPA4.setTextColor(getResources().getColor(R.color.black));
		mKPB4.setTextColor(getResources().getColor(R.color.black));
		mJSA4.setTextColor(getResources().getColor(R.color.black));
		mJSB4.setTextColor(getResources().getColor(R.color.black));
		mFYA4.setTextColor(getResources().getColor(R.color.black));
		mFYB4.setTextColor(getResources().getColor(R.color.black));
		mJKA4.setTextColor(getResources().getColor(R.color.black));
		mJKB4.setTextColor(getResources().getColor(R.color.black));
		mXGA4.setTextColor(getResources().getColor(R.color.black));
		mLEA4.setTextColor(getResources().getColor(R.color.black));
		mLEB4.setTextColor(getResources().getColor(R.color.black));
		mBigS4.setTextColor(getResources().getColor(R.color.black));
		mLittleS4.setTextColor(getResources().getColor(R.color.black));
		mM4.setTextColor(getResources().getColor(R.color.black));
		mN4.setTextColor(getResources().getColor(R.color.black));
		mP1_4.setTextColor(getResources().getColor(R.color.black));
		mLUA4.setTextColor(getResources().getColor(R.color.black));
		mLUB4.setTextColor(getResources().getColor(R.color.black));

		mD5.setTextColor(getResources().getColor(R.color.black));
		mBigC5.setTextColor(getResources().getColor(R.color.black));
		mBigE5.setTextColor(getResources().getColor(R.color.black));
		mLittleC5.setTextColor(getResources().getColor(R.color.black));
		mLittleE5.setTextColor(getResources().getColor(R.color.black));
		mF5.setTextColor(getResources().getColor(R.color.black));
		mCW5.setTextColor(getResources().getColor(R.color.black));
		mV5.setTextColor(getResources().getColor(R.color.black));
		mBigK5.setTextColor(getResources().getColor(R.color.black));
		mLittleK5.setTextColor(getResources().getColor(R.color.black));
		mKPA5.setTextColor(getResources().getColor(R.color.black));
		mKPB5.setTextColor(getResources().getColor(R.color.black));
		mJSA5.setTextColor(getResources().getColor(R.color.black));
		mJSB5.setTextColor(getResources().getColor(R.color.black));
		mFYA5.setTextColor(getResources().getColor(R.color.black));
		mFYB5.setTextColor(getResources().getColor(R.color.black));
		mJKA5.setTextColor(getResources().getColor(R.color.black));
		mJKB5.setTextColor(getResources().getColor(R.color.black));
		mXGA5.setTextColor(getResources().getColor(R.color.black));
		mLEA5.setTextColor(getResources().getColor(R.color.black));
		mLEB5.setTextColor(getResources().getColor(R.color.black));
		mBigS5.setTextColor(getResources().getColor(R.color.black));
		mLittleS5.setTextColor(getResources().getColor(R.color.black));
		mM5.setTextColor(getResources().getColor(R.color.black));
		mN5.setTextColor(getResources().getColor(R.color.black));
		mP1_5.setTextColor(getResources().getColor(R.color.black));
		mLUA5.setTextColor(getResources().getColor(R.color.black));
		mLUB5.setTextColor(getResources().getColor(R.color.black));

		mD6.setTextColor(getResources().getColor(R.color.black));
		mBigC6.setTextColor(getResources().getColor(R.color.black));
		mBigE6.setTextColor(getResources().getColor(R.color.black));
		mLittleC6.setTextColor(getResources().getColor(R.color.black));
		mLittleE6.setTextColor(getResources().getColor(R.color.black));
		mF6.setTextColor(getResources().getColor(R.color.black));
		mCW6.setTextColor(getResources().getColor(R.color.black));
		mV6.setTextColor(getResources().getColor(R.color.black));
		mBigK6.setTextColor(getResources().getColor(R.color.black));
		mLittleK6.setTextColor(getResources().getColor(R.color.black));
		mKPA6.setTextColor(getResources().getColor(R.color.black));
		mKPB6.setTextColor(getResources().getColor(R.color.black));
		mJSA6.setTextColor(getResources().getColor(R.color.black));
		mJSB6.setTextColor(getResources().getColor(R.color.black));
		mFYA6.setTextColor(getResources().getColor(R.color.black));
		mFYB6.setTextColor(getResources().getColor(R.color.black));
		mJKA6.setTextColor(getResources().getColor(R.color.black));
		mJKB6.setTextColor(getResources().getColor(R.color.black));
		mXGA6.setTextColor(getResources().getColor(R.color.black));
		mLEA6.setTextColor(getResources().getColor(R.color.black));
		mLEB6.setTextColor(getResources().getColor(R.color.black));
		mBigS6.setTextColor(getResources().getColor(R.color.black));
		mLittleS6.setTextColor(getResources().getColor(R.color.black));
		mM6.setTextColor(getResources().getColor(R.color.black));
		mN6.setTextColor(getResources().getColor(R.color.black));
		mP1_6.setTextColor(getResources().getColor(R.color.black));
		mLUA6.setTextColor(getResources().getColor(R.color.black));
		mLUB6.setTextColor(getResources().getColor(R.color.black));

		mD7.setTextColor(getResources().getColor(R.color.black));
		mBigC7.setTextColor(getResources().getColor(R.color.black));
		mBigE7.setTextColor(getResources().getColor(R.color.black));
		mLittleC7.setTextColor(getResources().getColor(R.color.black));
		mLittleE7.setTextColor(getResources().getColor(R.color.black));
		mF7.setTextColor(getResources().getColor(R.color.black));
		mCW7.setTextColor(getResources().getColor(R.color.black));
		mV7.setTextColor(getResources().getColor(R.color.black));
		mBigK7.setTextColor(getResources().getColor(R.color.black));
		mLittleK7.setTextColor(getResources().getColor(R.color.black));
		mKPA7.setTextColor(getResources().getColor(R.color.black));
		mKPB7.setTextColor(getResources().getColor(R.color.black));
		mJSA7.setTextColor(getResources().getColor(R.color.black));
		mJSB7.setTextColor(getResources().getColor(R.color.black));
		mFYA7.setTextColor(getResources().getColor(R.color.black));
		mFYB7.setTextColor(getResources().getColor(R.color.black));
		mJKA7.setTextColor(getResources().getColor(R.color.black));
		mJKB7.setTextColor(getResources().getColor(R.color.black));
		mXGA7.setTextColor(getResources().getColor(R.color.black));
		mLEA7.setTextColor(getResources().getColor(R.color.black));
		mLEB7.setTextColor(getResources().getColor(R.color.black));
		mBigS7.setTextColor(getResources().getColor(R.color.black));
		mLittleS7.setTextColor(getResources().getColor(R.color.black));
		mM7.setTextColor(getResources().getColor(R.color.black));
		mN7.setTextColor(getResources().getColor(R.color.black));
		mP1_7.setTextColor(getResources().getColor(R.color.black));
		mLUA7.setTextColor(getResources().getColor(R.color.black));
		mLUB7.setTextColor(getResources().getColor(R.color.black));

		mD8.setTextColor(getResources().getColor(R.color.black));
		mBigC8.setTextColor(getResources().getColor(R.color.black));
		mBigE8.setTextColor(getResources().getColor(R.color.black));
		mLittleC8.setTextColor(getResources().getColor(R.color.black));
		mLittleE8.setTextColor(getResources().getColor(R.color.black));
		mF8.setTextColor(getResources().getColor(R.color.black));
		mCW8.setTextColor(getResources().getColor(R.color.black));
		mV8.setTextColor(getResources().getColor(R.color.black));
		mBigK8.setTextColor(getResources().getColor(R.color.black));
		mLittleK8.setTextColor(getResources().getColor(R.color.black));
		mKPA8.setTextColor(getResources().getColor(R.color.black));
		mKPB8.setTextColor(getResources().getColor(R.color.black));
		mJSA8.setTextColor(getResources().getColor(R.color.black));
		mJSB8.setTextColor(getResources().getColor(R.color.black));
		mFYA8.setTextColor(getResources().getColor(R.color.black));
		mFYB8.setTextColor(getResources().getColor(R.color.black));
		mJKA8.setTextColor(getResources().getColor(R.color.black));
		mJKB8.setTextColor(getResources().getColor(R.color.black));
		mXGA8.setTextColor(getResources().getColor(R.color.black));
		mLEA8.setTextColor(getResources().getColor(R.color.black));
		mLEB8.setTextColor(getResources().getColor(R.color.black));
		mBigS8.setTextColor(getResources().getColor(R.color.black));
		mLittleS8.setTextColor(getResources().getColor(R.color.black));
		mM8.setTextColor(getResources().getColor(R.color.black));
		mN8.setTextColor(getResources().getColor(R.color.black));
		mP1_8.setTextColor(getResources().getColor(R.color.black));
		mLUA8.setTextColor(getResources().getColor(R.color.black));
		mLUB8.setTextColor(getResources().getColor(R.color.black));
	}

	/**
	 * Cross out Antibody1 if it's positive
	 * 
	 * @param index the antibody index
	 * @param Antibody1 the antibody that may be crossed out
	 * @param cell the row used
	 * @param letter the name of the antibody
	 */
	void CrossOutSingle(int index, TextView Antibody1, int cell, String letter)
	{
		if (Antibody1.getText().equals("+"))	//if it is positive
		{
			Antibody1.setTextColor(getResources().getColor(R.color.red));
			if (antibody.NotCrossedOut(index))	//make sure it's only crossed out once
			{
				Log.d("Antibody", "Using " + cell + " to cross out " + letter);
				antibody.CrossOut(index);
			}
		}
	}

	/**
     * Cross out Big if it's positive, and Little is negative
     * 
     * @param index the antibody index
     * @param Big the antibody that may be crossed out
     * @param Little the antibody that may be used to cross out Big
     * @param cell the row used
     * @param letter the name of the antibody
     */
	void CrossOutCouple(int index, TextView Big, TextView Little, int cell, String letter)
	{
		if (Big.getText().equals("+"))				//if it is positive
		{
			if (Little.getText().equals("0"))		//and it's pair is negative
			{
				Big.setTextColor(getResources().getColor(R.color.red));
				if (antibody.NotCrossedOut(index))	//make sure it's only crossed out once
				{
					Log.d("Antibody", "Using " + cell + " to cross out " + letter);
					antibody.CrossOut(index);
				}
			}
			else
				Big.setTextColor(getResources().getColor(R.color.black));
		}
	}

	void Use1ToGetSolutions()
	{
		if (mCheck1.isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using 1 to get solutions");
			GetSolution( 0, mD1			);//, antibody.GetName( 0));
			GetSolution( 1, mBigC1		);//, antibody.GetName( 1));
			GetSolution( 2, mBigE1		);//, antibody.GetName( 2));
			GetSolution( 3, mLittleC1	);//, antibody.GetName( 3));
			GetSolution( 4, mLittleE1	);//, antibody.GetName( 4));
			GetSolution( 5, mF1			);//, antibody.GetName( 5));
			GetSolution( 6, mCW1		);//, antibody.GetName( 6));
			GetSolution( 7, mV1			);//, antibody.GetName( 7));
			GetSolution( 8, mBigK1		);//, antibody.GetName( 8));
			GetSolution( 9, mLittleK1	);//, antibody.GetName( 9));
			GetSolution(10, mKPA1		);//, antibody.GetName(10));
			GetSolution(11, mKPB1		);//, antibody.GetName(11));
			GetSolution(12, mJSA1		);//, antibody.GetName(12));
			GetSolution(13, mJSB1		);//, antibody.GetName(13));
			GetSolution(14, mFYA1		);//, antibody.GetName(14));
			GetSolution(15, mFYB1		);//, antibody.GetName(15));
			GetSolution(16, mJKA1		);//, antibody.GetName(16));
			GetSolution(17, mJKB1		);//, antibody.GetName(17));
			GetSolution(18, mXGA1		);//, antibody.GetName(18));
			GetSolution(19, mLEA1		);//, antibody.GetName(19));
			GetSolution(20, mLEB1		);//, antibody.GetName(20));
			GetSolution(21, mBigS1		);//, antibody.GetName(21));
			GetSolution(22, mLittleS1	);//, antibody.GetName(22));
			GetSolution(23, mM1			);//, antibody.GetName(23));
			GetSolution(24, mN1			);//, antibody.GetName(24));
			GetSolution(25, mP1_1		);//, antibody.GetName(25));
			GetSolution(26, mLUA1		);//, antibody.GetName(26));
			GetSolution(27, mLUB1		);//, antibody.GetName(27));
		}
	}

	void Use2ToGetSolutions()
	{
		if (mCheck2.isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using 2 to get solutions");
			GetSolution( 0, mD2			);//, antibody.GetName( 0));
			GetSolution( 1, mBigC2		);//, antibody.GetName( 1));
			GetSolution( 2, mBigE2		);//, antibody.GetName( 2));
			GetSolution( 3, mLittleC2	);//, antibody.GetName( 3));
			GetSolution( 4, mLittleE2	);//, antibody.GetName( 4));
			GetSolution( 5, mF2			);//, antibody.GetName( 5));
			GetSolution( 6, mCW2		);//, antibody.GetName( 6));
			GetSolution( 7, mV2			);//, antibody.GetName( 7));
			GetSolution( 8, mBigK2		);//, antibody.GetName( 8));
			GetSolution( 9, mLittleK2	);//, antibody.GetName( 9));
			GetSolution(10, mKPA2		);//, antibody.GetName(10));
			GetSolution(11, mKPB2		);//, antibody.GetName(11));
			GetSolution(12, mJSA2		);//, antibody.GetName(12));
			GetSolution(13, mJSB2		);//, antibody.GetName(13));
			GetSolution(14, mFYA2		);//, antibody.GetName(14));
			GetSolution(15, mFYB2		);//, antibody.GetName(15));
			GetSolution(16, mJKA2		);//, antibody.GetName(16));
			GetSolution(17, mJKB2		);//, antibody.GetName(17));
			GetSolution(18, mXGA2		);//, antibody.GetName(18));
			GetSolution(19, mLEA2		);//, antibody.GetName(19));
			GetSolution(20, mLEB2		);//, antibody.GetName(20));
			GetSolution(21, mBigS2		);//, antibody.GetName(21));
			GetSolution(22, mLittleS2	);//, antibody.GetName(22));
			GetSolution(23, mM2			);//, antibody.GetName(23));
			GetSolution(24, mN2			);//, antibody.GetName(24));
			GetSolution(25, mP1_2		);//, antibody.GetName(25));
			GetSolution(26, mLUA2		);//, antibody.GetName(26));
			GetSolution(27, mLUB2		);//, antibody.GetName(27));
		}
	}

	void Use3ToGetSolutions()
	{
		if (mCheck3.isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using 3 to get solutions");
			GetSolution( 0, mD3			);//, antibody.GetName( 0));
			GetSolution( 1, mBigC3		);//, antibody.GetName( 1));
			GetSolution( 2, mBigE3		);//, antibody.GetName( 2));
			GetSolution( 3, mLittleC3	);//, antibody.GetName( 3));
			GetSolution( 4, mLittleE3	);//, antibody.GetName( 4));
			GetSolution( 5, mF3			);//, antibody.GetName( 5));
			GetSolution( 6, mCW3		);//, antibody.GetName( 6));
			GetSolution( 7, mV3			);//, antibody.GetName( 7));
			GetSolution( 8, mBigK3		);//, antibody.GetName( 8));
			GetSolution( 9, mLittleK3	);//, antibody.GetName( 9));
			GetSolution(10, mKPA3		);//, antibody.GetName(10));
			GetSolution(11, mKPB3		);//, antibody.GetName(11));
			GetSolution(12, mJSA3		);//, antibody.GetName(12));
			GetSolution(13, mJSB3		);//, antibody.GetName(13));
			GetSolution(14, mFYA3		);//, antibody.GetName(14));
			GetSolution(15, mFYB3		);//, antibody.GetName(15));
			GetSolution(16, mJKA3		);//, antibody.GetName(16));
			GetSolution(17, mJKB3		);//, antibody.GetName(17));
			GetSolution(18, mXGA3		);//, antibody.GetName(18));
			GetSolution(19, mLEA3		);//, antibody.GetName(19));
			GetSolution(20, mLEB3		);//, antibody.GetName(20));
			GetSolution(21, mBigS3		);//, antibody.GetName(21));
			GetSolution(22, mLittleS3	);//, antibody.GetName(22));
			GetSolution(23, mM3			);//, antibody.GetName(23));
			GetSolution(24, mN3			);//, antibody.GetName(24));
			GetSolution(25, mP1_3		);//, antibody.GetName(25));
			GetSolution(26, mLUA3		);//, antibody.GetName(26));
			GetSolution(27, mLUB3		);//, antibody.GetName(27));
		}
	}

	void Use4ToGetSolutions()
	{
		if (mCheck4.isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using 4 to get solutions");
			GetSolution( 0, mD4			);//, antibody.GetName( 0));
			GetSolution( 1, mBigC4		);//, antibody.GetName( 1));
			GetSolution( 2, mBigE4		);//, antibody.GetName( 2));
			GetSolution( 3, mLittleC4	);//, antibody.GetName( 3));
			GetSolution( 4, mLittleE4	);//, antibody.GetName( 4));
			GetSolution( 5, mF4			);//, antibody.GetName( 5));
			GetSolution( 6, mCW4		);//, antibody.GetName( 6));
			GetSolution( 7, mV4			);//, antibody.GetName( 7));
			GetSolution( 8, mBigK4		);//, antibody.GetName( 8));
			GetSolution( 9, mLittleK4	);//, antibody.GetName( 9));
			GetSolution(10, mKPA4		);//, antibody.GetName(10));
			GetSolution(11, mKPB4		);//, antibody.GetName(11));
			GetSolution(12, mJSA4		);//, antibody.GetName(12));
			GetSolution(13, mJSB4		);//, antibody.GetName(13));
			GetSolution(14, mFYA4		);//, antibody.GetName(14));
			GetSolution(15, mFYB4		);//, antibody.GetName(15));
			GetSolution(16, mJKA4		);//, antibody.GetName(16));
			GetSolution(17, mJKB4		);//, antibody.GetName(17));
			GetSolution(18, mXGA4		);//, antibody.GetName(18));
			GetSolution(19, mLEA4		);//, antibody.GetName(19));
			GetSolution(20, mLEB4		);//, antibody.GetName(20));
			GetSolution(21, mBigS4		);//, antibody.GetName(21));
			GetSolution(22, mLittleS4	);//, antibody.GetName(22));
			GetSolution(23, mM4			);//, antibody.GetName(23));
			GetSolution(24, mN4			);//, antibody.GetName(24));
			GetSolution(25, mP1_4		);//, antibody.GetName(25));
			GetSolution(26, mLUA4		);//, antibody.GetName(26));
			GetSolution(27, mLUB4		);//, antibody.GetName(27));
		}
	}

	void Use5ToGetSolutions()
	{
		if (mCheck5.isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using 5 to get solutions");
			GetSolution( 0, mD5			);//, antibody.GetName( 0));
			GetSolution( 1, mBigC5		);//, antibody.GetName( 1));
			GetSolution( 2, mBigE5		);//, antibody.GetName( 2));
			GetSolution( 3, mLittleC5	);//, antibody.GetName( 3));
			GetSolution( 4, mLittleE5	);//, antibody.GetName( 4));
			GetSolution( 5, mF5			);//, antibody.GetName( 5));
			GetSolution( 6, mCW5		);//, antibody.GetName( 6));
			GetSolution( 7, mV5			);//, antibody.GetName( 7));
			GetSolution( 8, mBigK5		);//, antibody.GetName( 8));
			GetSolution( 9, mLittleK5	);//, antibody.GetName( 9));
			GetSolution(10, mKPA5		);//, antibody.GetName(10));
			GetSolution(11, mKPB5		);//, antibody.GetName(11));
			GetSolution(12, mJSA5		);//, antibody.GetName(12));
			GetSolution(13, mJSB5		);//, antibody.GetName(13));
			GetSolution(14, mFYA5		);//, antibody.GetName(14));
			GetSolution(15, mFYB5		);//, antibody.GetName(15));
			GetSolution(16, mJKA5		);//, antibody.GetName(16));
			GetSolution(17, mJKB5		);//, antibody.GetName(17));
			GetSolution(18, mXGA5		);//, antibody.GetName(18));
			GetSolution(19, mLEA5		);//, antibody.GetName(19));
			GetSolution(20, mLEB5		);//, antibody.GetName(20));
			GetSolution(21, mBigS5		);//, antibody.GetName(21));
			GetSolution(22, mLittleS5	);//, antibody.GetName(22));
			GetSolution(23, mM5			);//, antibody.GetName(23));
			GetSolution(24, mN5			);//, antibody.GetName(24));
			GetSolution(25, mP1_5		);//, antibody.GetName(25));
			GetSolution(26, mLUA5		);//, antibody.GetName(26));
			GetSolution(27, mLUB5		);//, antibody.GetName(27));
		}
	}

	void Use6ToGetSolutions()
	{
		if (mCheck6.isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using 6 to get solutions");
			GetSolution( 0, mD6			);//, antibody.GetName( 0));
			GetSolution( 1, mBigC6		);//, antibody.GetName( 1));
			GetSolution( 2, mBigE6		);//, antibody.GetName( 2));
			GetSolution( 3, mLittleC6	);//, antibody.GetName( 3));
			GetSolution( 4, mLittleE6	);//, antibody.GetName( 4));
			GetSolution( 5, mF6			);//, antibody.GetName( 5));
			GetSolution( 6, mCW6		);//, antibody.GetName( 6));
			GetSolution( 7, mV6			);//, antibody.GetName( 7));
			GetSolution( 8, mBigK6		);//, antibody.GetName( 8));
			GetSolution( 9, mLittleK6	);//, antibody.GetName( 9));
			GetSolution(10, mKPA6		);//, antibody.GetName(10));
			GetSolution(11, mKPB6		);//, antibody.GetName(11));
			GetSolution(12, mJSA6		);//, antibody.GetName(12));
			GetSolution(13, mJSB6		);//, antibody.GetName(13));
			GetSolution(14, mFYA6		);//, antibody.GetName(14));
			GetSolution(15, mFYB6		);//, antibody.GetName(15));
			GetSolution(16, mJKA6		);//, antibody.GetName(16));
			GetSolution(17, mJKB6		);//, antibody.GetName(17));
			GetSolution(18, mXGA6		);//, antibody.GetName(18));
			GetSolution(19, mLEA6		);//, antibody.GetName(19));
			GetSolution(20, mLEB6		);//, antibody.GetName(20));
			GetSolution(21, mBigS6		);//, antibody.GetName(21));
			GetSolution(22, mLittleS6	);//, antibody.GetName(22));
			GetSolution(23, mM6			);//, antibody.GetName(23));
			GetSolution(24, mN6			);//, antibody.GetName(24));
			GetSolution(25, mP1_6		);//, antibody.GetName(25));
			GetSolution(26, mLUA6		);//, antibody.GetName(26));
			GetSolution(27, mLUB6		);//, antibody.GetName(27));
		}
	}

	void Use7ToGetSolutions()
	{
		if (mCheck7.isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using 7 to get solutions");
			GetSolution( 0, mD7			);//, antibody.GetName( 0));
			GetSolution( 1, mBigC7		);//, antibody.GetName( 1));
			GetSolution( 2, mBigE7		);//, antibody.GetName( 2));
			GetSolution( 3, mLittleC7	);//, antibody.GetName( 3));
			GetSolution( 4, mLittleE7	);//, antibody.GetName( 4));
			GetSolution( 5, mF7			);//, antibody.GetName( 5));
			GetSolution( 6, mCW7		);//, antibody.GetName( 6));
			GetSolution( 7, mV7			);//, antibody.GetName( 7));
			GetSolution( 8, mBigK7		);//, antibody.GetName( 8));
			GetSolution( 9, mLittleK7	);//, antibody.GetName( 9));
			GetSolution(10, mKPA7		);//, antibody.GetName(10));
			GetSolution(11, mKPB7		);//, antibody.GetName(11));
			GetSolution(12, mJSA7		);//, antibody.GetName(12));
			GetSolution(13, mJSB7		);//, antibody.GetName(13));
			GetSolution(14, mFYA7		);//, antibody.GetName(14));
			GetSolution(15, mFYB7		);//, antibody.GetName(15));
			GetSolution(16, mJKA7		);//, antibody.GetName(16));
			GetSolution(17, mJKB7		);//, antibody.GetName(17));
			GetSolution(18, mXGA7		);//, antibody.GetName(18));
			GetSolution(19, mLEA7		);//, antibody.GetName(19));
			GetSolution(20, mLEB7		);//, antibody.GetName(20));
			GetSolution(21, mBigS7		);//, antibody.GetName(21));
			GetSolution(22, mLittleS7	);//, antibody.GetName(22));
			GetSolution(23, mM7			);//, antibody.GetName(23));
			GetSolution(24, mN7			);//, antibody.GetName(24));
			GetSolution(25, mP1_7		);//, antibody.GetName(25));
			GetSolution(26, mLUA7		);//, antibody.GetName(26));
			GetSolution(27, mLUB7		);//, antibody.GetName(27));
		}
	}

	void Use8ToGetSolutions()
	{
		if (mCheck8.isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using 8 to get solutions");
			GetSolution( 0, mD8			);//, antibody.GetName( 0));
			GetSolution( 1, mBigC8		);//, antibody.GetName( 1));
			GetSolution( 2, mBigE8		);//, antibody.GetName( 2));
			GetSolution( 3, mLittleC8	);//, antibody.GetName( 3));
			GetSolution( 4, mLittleE8	);//, antibody.GetName( 4));
			GetSolution( 5, mF8			);//, antibody.GetName( 5));
			GetSolution( 6, mCW8		);//, antibody.GetName( 6));
			GetSolution( 7, mV8			);//, antibody.GetName( 7));
			GetSolution( 8, mBigK8		);//, antibody.GetName( 8));
			GetSolution( 9, mLittleK8	);//, antibody.GetName( 9));
			GetSolution(10, mKPA8		);//, antibody.GetName(10));
			GetSolution(11, mKPB8		);//, antibody.GetName(11));
			GetSolution(12, mJSA8		);//, antibody.GetName(12));
			GetSolution(13, mJSB8		);//, antibody.GetName(13));
			GetSolution(14, mFYA8		);//, antibody.GetName(14));
			GetSolution(15, mFYB8		);//, antibody.GetName(15));
			GetSolution(16, mJKA8		);//, antibody.GetName(16));
			GetSolution(17, mJKB8		);//, antibody.GetName(17));
			GetSolution(18, mXGA8		);//, antibody.GetName(18));
			GetSolution(19, mLEA8		);//, antibody.GetName(19));
			GetSolution(20, mLEB8		);//, antibody.GetName(20));
			GetSolution(21, mBigS8		);//, antibody.GetName(21));
			GetSolution(22, mLittleS8	);//, antibody.GetName(22));
			GetSolution(23, mM8			);//, antibody.GetName(23));
			GetSolution(24, mN8			);//, antibody.GetName(24));
			GetSolution(25, mP1_8		);//, antibody.GetName(25));
			GetSolution(26, mLUA8		);//, antibody.GetName(26));
			GetSolution(27, mLUB8		);//, antibody.GetName(27));
		}
	}

	/**
	 * Add this antibody to the solution if it's positive
	 * 
	 * @param index
	 * @param antibody1
	 */
	void GetSolution(int index, TextView antibody1)
	{
		if (antibody1.getText().equals("+"))
		{
			if (antibody.NotCrossedOut(index))
			{
				antibody1.setTextColor(getResources().getColor(R.color.green));
				antibody.IncrementCount(index);
			}
			else
				antibody1.setTextColor(getResources().getColor(R.color.black));
		}
	}
}

/**
 * Everything to do with all the antibodies
 * 
 * @author Bobby Macher
 */
class Antibody {
	/**
	 * The number of antibodies that have this many solutions
	 */
	private				int		solutions;
	
	/**
	 * The number of times the antibodies are solutions
	 */
	private				int		count	 [];
	
	/**
	 * percentages for race
	 */
	private				int		race	 [][];
	
	/**
	 * The most occurrences of an antibody as a solution
	 */
	private				int		most;
	private				String	name	 [];
	
	/**
	 * The maximum number of antibodies
	 */
	public static final	int		max =		28;

	Antibody()
	{
        count =	new int[max];
        race =	new int[max][2];

        race[ 0][0] =	 15;
        race[ 0][1] =	  8;
        race[ 1][0] =	 32;
        race[ 1][1] =	 73;
        race[ 2][0] =	 71;
        race[ 2][1] =	 78;
        race[ 3][0] =	 15;
        race[ 3][1] =	  8;
        race[ 4][0] =	 20;
        race[ 4][1] =	  4;
        race[ 5][0] =	  2;
        race[ 5][1] =	  2;
        race[ 6][0] =	 35;
        race[ 6][1] =	  8;
        race[ 7][0] =	 98;
        race[ 7][1] =	 99;
        race[ 8][0] =	 99;
        race[ 8][1] =	 70;
        race[ 9][0] =	 91;
        race[ 9][1] =	 98;
        race[10][0] =	  0;
        race[10][1] =	  0;
        race[11][0] =	 98;
        race[11][1] =	100;
        race[12][0] =	  0;
        race[12][1] =	  0;
        race[13][0] =	100;
        race[13][1] =	 80;
        race[14][0] =	  0;
        race[14][1] =	  1;
        race[15][0] =	 34;
        race[15][1] =	 90;
        race[16][0] =	 17;
        race[16][1] =	 77;
        race[17][0] =	 23;
        race[17][1] =	  8;
        race[18][0] =	 26;
        race[18][1] =	 51;
        race[19][0] =	 28;
        race[19][1] =	 45;
        race[20][0] =	 45;
        race[20][1] =	 69;
        race[21][0] =	 11;
        race[21][1] =	  7;
        race[22][0] =	 22;
        race[22][1] =	 26;
        race[23][0] =	 28;
        race[23][1] =	 25;
        race[24][0] =	  0;
        race[24][1] =	  1;
        race[25][0] =	 21;
        race[25][1] =	  6;
        race[26][0] =	 92;
        race[26][1] =	 95;
        race[27][0] =	  0;
        race[27][1] =	  0;

        name =	new String[max];

        name[ 0] =	"D";
        name[ 1] =	"C";
        name[ 2] =	"E";
        name[ 3] =	"c";
        name[ 4] =	"e";
        name[ 5] =	"f";
        name[ 6] =	"Cw";
        name[ 7] =	"V";
        name[ 8] =	"K";
        name[ 9] =	"k";
        name[10] =	"Kpa";
        name[11] =	"Kpb";
        name[12] =	"Jsa";
        name[13] =	"Jsb";
        name[14] =	"Fya";
        name[15] =	"Fyb";
        name[16] =	"Jka";
        name[17] =	"Jkb";
        name[18] =	"Xga";
        name[19] =	"Lea";
        name[20] =	"Leb";
        name[21] =	"S";
        name[22] =	"s";
        name[23] =	"M";
        name[24] =	"N";
        name[25] =	"P1";
        name[26] =	"Lua";
        name[27] =	"Lub";
	}

	public int GetSolutions()
	{
		return	solutions;
	}
	public void ResetSolutions()
	{
		solutions =	0;
	}
	public void IncrementSolutions()
	{
		solutions++;
	}
	/**
	 * @param index1 the antibody index
	 * @param index2 the solution index
	 * @return the name and race percents
	 */
	public String GetNameRace(int index1, int index2)
	{
		String	result;

		if (solutions > 0)
			result =	", ";
		else
			result =	(most - index2) + ": ";
		result +=	name[index1] + "(" + race[index1][0] + ", " + race[index1][1] + ")";//display the percentages for race
		
		return	result;
	}

	/**
	 * @param index
	 * @return The number of times this antibody is a solution
	 */
	public int GetCount(int index)
	{
		return count[index];
	}
	public void IncrementCount(int index)
	{
		count[index]++;
	}
	/**
	 * This antibody will not be considered a solution
	 * 
	 * @param index
	 */
	public void CrossOut(int index)
	{
		count[index] =	255;
	}
	public boolean NotCrossedOut(int index)
	{
		return	count[index] < 255;
	}

	/**
	 * @return the highest number of times an antibody is a solution
	 */
	public int GetMost()
	{
		return	most;
	}
	/**
	 * Sets this antibody as the most if it's greater than the previous {@link #most}
	 * 
	 * @param index
	 */
	public void SetNewMost(int index)
	{
		if (count[index] > most)
			most =	count[index];
	}

	public String GetName(int index)
	{
		return	name[index];
	}

	/**
	 * Resets the {@link #most}, and the {@link #count}'s
	 */
	public void Reset()
	{
		int	i;

		most =			0;
		for (i = 0; i < max; i++)
			count[i] =	0;
	}
};
