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

	private Antibody_Super	antibody;

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

						mD[],
						mBigC[],
						mBigE[],
						mLittleC[],
						mLittleE[],
						mF[],
						mCW[],
						mV[],
						mBigK[],
						mLittleK[],
						mKPA[],
						mKPB[],
						mJSA[],
						mJSB[],
						mFYA[],
						mFYB[],
						mJKA[],
						mJKB[],
						mXGA[],
						mLEA[],
						mLEB[],
						mBigS[],
						mLittleS[],
						mM[],
						mN[],
						mP1[],
						mLUA[],
						mLUB[],

						mSolution;

	private CheckBox	mCheck1,
						mCheck2,
						mCheck3,
						mCheck4,
						mCheck5,
						mCheck6,
						mCheck7,
						mCheck8,

						mCheck[];

	private Button		mCalculate;

	private final int	max =	8;

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

        antibody =		new Antibody_Super();

        mD = 			new TextView[max];
        mD[0] =			mD1;
        mD[1] =			mD2;
        mD[2] =			mD3;
        mD[3] =			mD4;
        mD[4] =			mD5;
        mD[5] =			mD6;
        mD[6] =			mD7;
        mD[7] =			mD8;

        mBigC = 		new TextView[max];
        mBigC[0] =		mBigC1;
        mBigC[1] =		mBigC2;
        mBigC[2] =		mBigC3;
        mBigC[3] =		mBigC4;
        mBigC[4] =		mBigC5;
        mBigC[5] =		mBigC6;
        mBigC[6] =		mBigC7;
        mBigC[7] =		mBigC8;

        mBigE = 		new TextView[max];
        mBigE[0] =		mBigE1;
        mBigE[1] =		mBigE2;
        mBigE[2] =		mBigE3;
        mBigE[3] =		mBigE4;
        mBigE[4] =		mBigE5;
        mBigE[5] =		mBigE6;
        mBigE[6] =		mBigE7;
        mBigE[7] =		mBigE8;

        mLittleC = 		new TextView[max];
        mLittleC[0] =	mLittleC1;
        mLittleC[1] =	mLittleC2;
        mLittleC[2] =	mLittleC3;
        mLittleC[3] =	mLittleC4;
        mLittleC[4] =	mLittleC5;
        mLittleC[5] =	mLittleC6;
        mLittleC[6] =	mLittleC7;
        mLittleC[7] =	mLittleC8;

        mLittleE = 		new TextView[max];
        mLittleE[0] =	mLittleE1;
        mLittleE[1] =	mLittleE2;
        mLittleE[2] =	mLittleE3;
        mLittleE[3] =	mLittleE4;
        mLittleE[4] =	mLittleE5;
        mLittleE[5] =	mLittleE6;
        mLittleE[6] =	mLittleE7;
        mLittleE[7] =	mLittleE8;

        mF =			new TextView[max];
        mF[0] =			mF1;
        mF[1] =			mF2;
        mF[2] =			mF3;
        mF[3] =			mF4;
        mF[4] =			mF5;
        mF[5] =			mF6;
        mF[6] =			mF7;
        mF[7] =			mF8;

        mCW =			new TextView[max];
        mCW[0] =		mCW1;
        mCW[1] =		mCW2;
        mCW[2] =		mCW3;
        mCW[3] =		mCW4;
        mCW[4] =		mCW5;
        mCW[5] =		mCW6;
        mCW[6] =		mCW7;
        mCW[7] =		mCW8;

        mV =			new TextView[max];
        mV[0] =			mV1;
        mV[1] =			mV2;
        mV[2] =			mV3;
        mV[3] =			mV4;
        mV[4] =			mV5;
        mV[5] =			mV6;
        mV[6] =			mV7;
        mV[7] =			mV8;

        mBigK =			new TextView[max];
        mBigK[0] =		mBigK1;
        mBigK[1] =		mBigK2;
        mBigK[2] =		mBigK3;
        mBigK[3] =		mBigK4;
        mBigK[4] =		mBigK5;
        mBigK[5] =		mBigK6;
        mBigK[6] =		mBigK7;
        mBigK[7] =		mBigK8;

        mLittleK =		new TextView[max];
        mLittleK[0] =	mLittleK1;
        mLittleK[1] =	mLittleK2;
        mLittleK[2] =	mLittleK3;
        mLittleK[3] =	mLittleK4;
        mLittleK[4] =	mLittleK5;
        mLittleK[5] =	mLittleK6;
        mLittleK[6] =	mLittleK7;
        mLittleK[7] =	mLittleK8;

        mKPA =			new TextView[max];
        mKPA[0] =		mKPA1;
        mKPA[1] =		mKPA2;
        mKPA[2] =		mKPA3;
        mKPA[3] =		mKPA4;
        mKPA[4] =		mKPA5;
        mKPA[5] =		mKPA6;
        mKPA[6] =		mKPA7;
        mKPA[7] =		mKPA8;

        mKPB =			new TextView[max];
        mKPB[0] =		mKPB1;
        mKPB[1] =		mKPB2;
        mKPB[2] =		mKPB3;
        mKPB[3] =		mKPB4;
        mKPB[4] =		mKPB5;
        mKPB[5] =		mKPB6;
        mKPB[6] =		mKPB7;
        mKPB[7] =		mKPB8;

        mJSA =			new TextView[max];
        mJSA[0] =		mJSA1;
        mJSA[1] =		mJSA2;
        mJSA[2] =		mJSA3;
        mJSA[3] =		mJSA4;
        mJSA[4] =		mJSA5;
        mJSA[5] =		mJSA6;
        mJSA[6] =		mJSA7;
        mJSA[7] =		mJSA8;

        mJSB =			new TextView[max];
        mJSB[0] =		mJSB1;
        mJSB[1] =		mJSB2;
        mJSB[2] =		mJSB3;
        mJSB[3] =		mJSB4;
        mJSB[4] =		mJSB5;
        mJSB[5] =		mJSB6;
        mJSB[6] =		mJSB7;
        mJSB[7] =		mJSB8;

        mFYA =			new TextView[max];
        mFYA[0] =		mFYA1;
        mFYA[1] =		mFYA2;
        mFYA[2] =		mFYA3;
        mFYA[3] =		mFYA4;
        mFYA[4] =		mFYA5;
        mFYA[5] =		mFYA6;
        mFYA[6] =		mFYA7;
        mFYA[7] =		mFYA8;

        mFYB =			new TextView[max];
        mFYB[0] =		mFYB1;
        mFYB[1] =		mFYB2;
        mFYB[2] =		mFYB3;
        mFYB[3] =		mFYB4;
        mFYB[4] =		mFYB5;
        mFYB[5] =		mFYB6;
        mFYB[6] =		mFYB7;
        mFYB[7] =		mFYB8;

        mJKA =			new TextView[max];
        mJKA[0] =		mJKA1;
        mJKA[1] =		mJKA2;
        mJKA[2] =		mJKA3;
        mJKA[3] =		mJKA4;
        mJKA[4] =		mJKA5;
        mJKA[5] =		mJKA6;
        mJKA[6] =		mJKA7;
        mJKA[7] =		mJKA8;

        mJKB =			new TextView[max];
        mJKB[0] =		mJKB1;
        mJKB[1] =		mJKB2;
        mJKB[2] =		mJKB3;
        mJKB[3] =		mJKB4;
        mJKB[4] =		mJKB5;
        mJKB[5] =		mJKB6;
        mJKB[6] =		mJKB7;
        mJKB[7] =		mJKB8;

        mXGA =			new TextView[max];
        mXGA[0] =		mXGA1;
        mXGA[1] =		mXGA2;
        mXGA[2] =		mXGA3;
        mXGA[3] =		mXGA4;
        mXGA[4] =		mXGA5;
        mXGA[5] =		mXGA6;
        mXGA[6] =		mXGA7;
        mXGA[7] =		mXGA8;

        mLEA =			new TextView[max];
        mLEA[0] =		mLEA1;
        mLEA[1] =		mLEA2;
        mLEA[2] =		mLEA3;
        mLEA[3] =		mLEA4;
        mLEA[4] =		mLEA5;
        mLEA[5] =		mLEA6;
        mLEA[6] =		mLEA7;
        mLEA[7] =		mLEA8;

        mLEB =			new TextView[max];
        mLEB[0] =		mLEB1;
        mLEB[1] =		mLEB2;
        mLEB[2] =		mLEB3;
        mLEB[3] =		mLEB4;
        mLEB[4] =		mLEB5;
        mLEB[5] =		mLEB6;
        mLEB[6] =		mLEB7;
        mLEB[7] =		mLEB8;

        mBigS =			new TextView[max];
        mBigS[0] =		mBigS1;
        mBigS[1] =		mBigS2;
        mBigS[2] =		mBigS3;
        mBigS[3] =		mBigS4;
        mBigS[4] =		mBigS5;
        mBigS[5] =		mBigS6;
        mBigS[6] =		mBigS7;
        mBigS[7] =		mBigS8;

        mLittleS =		new TextView[max];
        mLittleS[0] =	mLittleS1;
        mLittleS[1] =	mLittleS2;
        mLittleS[2] =	mLittleS3;
        mLittleS[3] =	mLittleS4;
        mLittleS[4] =	mLittleS5;
        mLittleS[5] =	mLittleS6;
        mLittleS[6] =	mLittleS7;
        mLittleS[7] =	mLittleS8;
        
        mM =			new TextView[max];
        mM[0] =			mM1;
        mM[1] =			mM2;
        mM[2] =			mM3;
        mM[3] =			mM4;
        mM[4] =			mM5;
        mM[5] =			mM6;
        mM[6] =			mM7;
        mM[7] =			mM8;
        
        mN =			new TextView[max];
        mN[0] =			mN1;
        mN[1] =			mN2;
        mN[2] =			mN3;
        mN[3] =			mN4;
        mN[4] =			mN5;
        mN[5] =			mN6;
        mN[6] =			mN7;
        mN[7] =			mN8;
        
        mP1 =			new TextView[max];
        mP1[0] =		mP1_1;
        mP1[1] =		mP1_2;
        mP1[2] =		mP1_3;
        mP1[3] =		mP1_4;
        mP1[4] =		mP1_5;
        mP1[5] =		mP1_6;
        mP1[6] =		mP1_7;
        mP1[7] =		mP1_8;

        mLUA =			new TextView[max];
        mLUA[0] =		mLUA1;
        mLUA[1] =		mLUA2;
        mLUA[2] =		mLUA3;
        mLUA[3] =		mLUA4;
        mLUA[4] =		mLUA5;
        mLUA[5] =		mLUA6;
        mLUA[6] =		mLUA7;
        mLUA[7] =		mLUA8;

        mLUB =			new TextView[max];
        mLUB[0] =		mLUB1;
        mLUB[1] =		mLUB2;
        mLUB[2] =		mLUB3;
        mLUB[3] =		mLUB4;
        mLUB[4] =		mLUB5;
        mLUB[5] =		mLUB6;
        mLUB[6] =		mLUB7;
        mLUB[7] =		mLUB8;

        mCheck =		new CheckBox[max];
        mCheck[0] =		mCheck1;
        mCheck[1] =		mCheck2;
        mCheck[2] =		mCheck3;
        mCheck[3] =		mCheck4;
        mCheck[4] =		mCheck5;
        mCheck[5] =		mCheck6;
        mCheck[6] =		mCheck7;
        mCheck[7] =		mCheck8;
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
			mSolution.setText("");											//clear the solution text

			for (i = 0; i < max; i++) {
				antibody.SetValue( 0, mD		[i].getText());				//The values need to be set for every cell
				antibody.SetValue( 1, mBigC		[i].getText());
				antibody.SetValue( 2, mBigE		[i].getText());
				antibody.SetValue( 3, mLittleC	[i].getText());
				antibody.SetValue( 4, mLittleE	[i].getText());
				antibody.SetValue( 5, mF		[i].getText());
				antibody.SetValue( 6, mCW		[i].getText());
				antibody.SetValue( 7, mV		[i].getText());
				antibody.SetValue( 8, mBigK		[i].getText());
				antibody.SetValue( 9, mLittleK	[i].getText());
				antibody.SetValue(10, mKPA		[i].getText());
				antibody.SetValue(11, mKPB		[i].getText());
				antibody.SetValue(12, mJSA		[i].getText());
				antibody.SetValue(13, mJSB		[i].getText());
				antibody.SetValue(14, mFYA		[i].getText());
				antibody.SetValue(15, mFYB		[i].getText());
				antibody.SetValue(16, mJKA		[i].getText());
				antibody.SetValue(17, mJKB		[i].getText());
				antibody.SetValue(18, mXGA		[i].getText());
				antibody.SetValue(19, mLEA		[i].getText());
				antibody.SetValue(20, mLEB		[i].getText());
				antibody.SetValue(21, mBigS		[i].getText());
				antibody.SetValue(22, mLittleS	[i].getText());
				antibody.SetValue(23, mM		[i].getText());
				antibody.SetValue(24, mN		[i].getText());
				antibody.SetValue(25, mP1		[i].getText());
				antibody.SetValue(26, mLUA		[i].getText());
				antibody.SetValue(27, mLUB		[i].getText());

				if (!mCheck[i].isChecked()) {								//Can use this row to cross out
					CrossOut( 0, mD			[i], i);
					CrossOut( 1, mBigC		[i], i);
					CrossOut( 2, mBigE		[i], i);
					CrossOut( 3, mLittleC	[i], i);
					CrossOut( 4, mLittleE	[i], i);
					CrossOut( 5, mF			[i], i);
					CrossOut( 6, mCW		[i], i);
					CrossOut( 7, mV			[i], i);
					CrossOut( 8, mBigK		[i], i);
					CrossOut( 9, mLittleK	[i], i);
					CrossOut(10, mKPA		[i], i);
					CrossOut(11, mKPB		[i], i);
					CrossOut(12, mJSA		[i], i);
					CrossOut(13, mJSB		[i], i);
					CrossOut(14, mFYA		[i], i);
					CrossOut(15, mFYB		[i], i);
					CrossOut(16, mJKA		[i], i);
					CrossOut(17, mJKB		[i], i);
					CrossOut(18, mXGA		[i], i);
					CrossOut(19, mLEA		[i], i);
					CrossOut(20, mLEB		[i], i);
					CrossOut(21, mBigS		[i], i);
					CrossOut(22, mLittleS	[i], i);
					CrossOut(23, mM			[i], i);
					CrossOut(24, mN			[i], i);
					CrossOut(25, mP1		[i], i);
					CrossOut(26, mLUA		[i], i);
					CrossOut(27, mLUB		[i], i);
				}
			}
			for (i = 0; i < max; i++)
				UseToGetSolutions(i);
			for (i = 0; i < Antibody_Super.max; i++)
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
				for (i = 0; i < Antibody_Super.max; i++)
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
		int	i;

		for (i = 0; i < max; i++)
		{
			mD[i].setTextColor(getResources().getColor(R.color.black));
			mBigC[i].setTextColor(getResources().getColor(R.color.black));
			mBigE[i].setTextColor(getResources().getColor(R.color.black));
			mLittleC[i].setTextColor(getResources().getColor(R.color.black));
			mLittleE[i].setTextColor(getResources().getColor(R.color.black));
			mF[i].setTextColor(getResources().getColor(R.color.black));
			mCW[i].setTextColor(getResources().getColor(R.color.black));
			mV[i].setTextColor(getResources().getColor(R.color.black));
			mBigK[i].setTextColor(getResources().getColor(R.color.black));
			mLittleK[i].setTextColor(getResources().getColor(R.color.black));
			mKPA[i].setTextColor(getResources().getColor(R.color.black));
			mKPB[i].setTextColor(getResources().getColor(R.color.black));
			mJSA[i].setTextColor(getResources().getColor(R.color.black));
			mJSB[i].setTextColor(getResources().getColor(R.color.black));
			mFYA[i].setTextColor(getResources().getColor(R.color.black));
			mFYB[i].setTextColor(getResources().getColor(R.color.black));
			mJKA[i].setTextColor(getResources().getColor(R.color.black));
			mJKB[i].setTextColor(getResources().getColor(R.color.black));
			mXGA[i].setTextColor(getResources().getColor(R.color.black));
			mLEA[i].setTextColor(getResources().getColor(R.color.black));
			mLEB[i].setTextColor(getResources().getColor(R.color.black));
			mBigS[i].setTextColor(getResources().getColor(R.color.black));
			mLittleS[i].setTextColor(getResources().getColor(R.color.black));
			mM[i].setTextColor(getResources().getColor(R.color.black));
			mN[i].setTextColor(getResources().getColor(R.color.black));
			mP1[i].setTextColor(getResources().getColor(R.color.black));
			mLUA[i].setTextColor(getResources().getColor(R.color.black));
			mLUB[i].setTextColor(getResources().getColor(R.color.black));
		}
	}

	/**
	 * Cross out Antibody1 if it's positive
	 * 
	 * @param index the antibody index
	 * @param Antibody1 the antibody that may be crossed out
	 * @param cell the row used
	 * @param letter the name of the antibody
	 */
	void CrossOut(int index, TextView Antibody1, int cell)
	{
		if (antibody.IsPositive(index)) {
			Antibody1.setTextColor(getResources().getColor(R.color.red));
			if (antibody.CrossOut(index)) {
				Log.d("Antibody", "Using " + (cell + 1) + " to cross out " + antibody.GetName(index));
			}
		}
	}

	/**
	 * If the Reaction of the cell is positive, get solutions
	 * 
	 * @param index
	 */
	void UseToGetSolutions(int index)
	{
		if (mCheck[index].isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using " + (index + 1) + " to get solutions");
			GetSolution( 0, mD		[index]);//, antibody.GetName( 0));
			GetSolution( 1, mBigC	[index]);//, antibody.GetName( 1));
			GetSolution( 2, mBigE	[index]);//, antibody.GetName( 2));
			GetSolution( 3, mLittleC[index]);//, antibody.GetName( 3));
			GetSolution( 4, mLittleE[index]);//, antibody.GetName( 4));
			GetSolution( 5, mF		[index]);//, antibody.GetName( 5));
			GetSolution( 6, mCW		[index]);//, antibody.GetName( 6));
			GetSolution( 7, mV		[index]);//, antibody.GetName( 7));
			GetSolution( 8, mBigK	[index]);//, antibody.GetName( 8));
			GetSolution( 9, mLittleK[index]);//, antibody.GetName( 9));
			GetSolution(10, mKPA	[index]);//, antibody.GetName(10));
			GetSolution(11, mKPB	[index]);//, antibody.GetName(11));
			GetSolution(12, mJSA	[index]);//, antibody.GetName(12));
			GetSolution(13, mJSB	[index]);//, antibody.GetName(13));
			GetSolution(14, mFYA	[index]);//, antibody.GetName(14));
			GetSolution(15, mFYB	[index]);//, antibody.GetName(15));
			GetSolution(16, mJKA	[index]);//, antibody.GetName(16));
			GetSolution(17, mJKB	[index]);//, antibody.GetName(17));
			GetSolution(18, mXGA	[index]);//, antibody.GetName(18));
			GetSolution(19, mLEA	[index]);//, antibody.GetName(19));
			GetSolution(20, mLEB	[index]);//, antibody.GetName(20));
			GetSolution(21, mBigS	[index]);//, antibody.GetName(21));
			GetSolution(22, mLittleS[index]);//, antibody.GetName(22));
			GetSolution(23, mM		[index]);//, antibody.GetName(23));
			GetSolution(24, mN		[index]);//, antibody.GetName(24));
			GetSolution(25, mP1		[index]);//, antibody.GetName(25));
			GetSolution(26, mLUA	[index]);//, antibody.GetName(26));
			GetSolution(27, mLUB	[index]);//, antibody.GetName(27));
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
