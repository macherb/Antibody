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

public class MainActivity extends Activity implements View.OnClickListener {

	private class Antibody {
		public int		count[];
		public int		race[][];//percentages for race
		public int		most;
		public String	name[];
		Antibody()
		{
	        count =	new int[28];
	        race =	new int[28][2];

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

	        name =	new String[28];

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
	};

	private Antibody	antibody;

	private	int			solutions;

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

		mSolution =		(TextView	)findViewById(R.id.textSolution		);

		mCheck1 =		(CheckBox	)findViewById(R.id.check1			);
		mCheck2 =		(CheckBox	)findViewById(R.id.check2			);
		mCheck3 =		(CheckBox	)findViewById(R.id.check3			);
		mCheck4 =		(CheckBox	)findViewById(R.id.check4			);
		mCheck5 =		(CheckBox	)findViewById(R.id.check5			);
		mCheck6 =		(CheckBox	)findViewById(R.id.check6			);

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

		solutions =				0;
		antibody.most =			0;
		for (i = 0; i < 28; i++)
			antibody.count[i] =	0;

		if      ( mCheck1.isChecked() &&  mCheck2.isChecked() &&  mCheck3.isChecked() &&  mCheck4.isChecked() &&  mCheck5.isChecked() &&  mCheck6.isChecked())
		{
			mSolution.setText("Inconclusive");
			SetAllBlack();
		}
		else if (!mCheck1.isChecked() && !mCheck2.isChecked() && !mCheck3.isChecked() && !mCheck4.isChecked() && !mCheck5.isChecked() && !mCheck6.isChecked())
		{
			mSolution.setText("Too weak");
			SetAllBlack();
		}
		else
		{
			mSolution.setText("");
			if (!mCheck1.isChecked())//Can use this row to cross out
			{
				CrossOutSingle(	0, mD1		, 				1, antibody.name[ 0]);
				CrossOutCouple(	1, mBigC1	, mLittleC1	,	1, antibody.name[ 1]);
				CrossOutCouple(	2, mBigE1	, mLittleE1	,	1, antibody.name[ 2]);
				CrossOutCouple(	3, mLittleC1, mBigC1	,	1, antibody.name[ 3]);
				CrossOutCouple(	4, mLittleE1, mBigE1	,	1, antibody.name[ 4]);
				CrossOutSingle(	5, mF1		,				1, antibody.name[ 5]);
				CrossOutSingle(	6, mCW1		,				1, antibody.name[ 6]);
				CrossOutSingle(	7, mV1		,				1, antibody.name[ 7]);
				CrossOutCouple(	8, mBigK1	, mLittleK1	,	1, antibody.name[ 8]);
				CrossOutCouple(	9, mLittleK1, mBigK1	,	1, antibody.name[ 9]);
				CrossOutCouple(10, mKPA1	, mKPB1		,	1, antibody.name[10]);
				CrossOutCouple(11, mKPB1	, mKPA1		,	1, antibody.name[11]);
				CrossOutCouple(12, mJSA1	, mJSB1		,	1, antibody.name[12]);
				CrossOutCouple(13, mJSB1	, mJSA1		,	1, antibody.name[13]);
				CrossOutCouple(14, mFYA1	, mFYB1		,	1, antibody.name[14]);
				CrossOutCouple(15, mFYB1	, mFYA1		,	1, antibody.name[15]);
				CrossOutCouple(16, mJKA1	, mJKB1		,	1, antibody.name[16]);
				CrossOutCouple(17, mJKB1	, mJKA1		,	1, antibody.name[17]);
				CrossOutSingle(18, mXGA1	,				1, antibody.name[18]);
				CrossOutCouple(19, mLEA1	, mLEB1		,	1, antibody.name[19]);
				CrossOutCouple(20, mLEB1	, mLEA1		,	1, antibody.name[20]);
				CrossOutCouple(21, mBigS1	, mLittleS1	,	1, antibody.name[21]);
				CrossOutCouple(22, mLittleS1, mBigS1	,	1, antibody.name[22]);
				CrossOutCouple(23, mM1		, mN1		,	1, antibody.name[23]);
				CrossOutCouple(24, mN1		, mM1		,	1, antibody.name[24]);
				CrossOutSingle(25, mP1_1	,				1, antibody.name[25]);
				CrossOutCouple(26, mLUA1	, mLUB1		,	1, antibody.name[26]);
				CrossOutCouple(27, mLUB1	, mLUA1		,	1, antibody.name[27]);
			}
			if (!mCheck2.isChecked())//Can use this row to cross out
			{
				CrossOutSingle(	0, mD2		, 				2, antibody.name[ 0]);
				CrossOutCouple(	1, mBigC2	, mLittleC2	,	2, antibody.name[ 1]);
				CrossOutCouple(	2, mBigE2	, mLittleE2	,	2, antibody.name[ 2]);
				CrossOutCouple(	3, mLittleC2, mBigC2	,	2, antibody.name[ 3]);
				CrossOutCouple(	4, mLittleE2, mBigE2	,	2, antibody.name[ 4]);
				CrossOutSingle(	5, mF2		,				2, antibody.name[ 5]);
				CrossOutSingle(	6, mCW2		,				2, antibody.name[ 6]);
				CrossOutSingle(	7, mV2		,				2, antibody.name[ 7]);
				CrossOutCouple(	8, mBigK2	, mLittleK2	,	2, antibody.name[ 8]);
				CrossOutCouple(	9, mLittleK2, mBigK2	,	2, antibody.name[ 9]);
				CrossOutCouple(10, mKPA2	, mKPB2		,	2, antibody.name[10]);
				CrossOutCouple(11, mKPB2	, mKPA2		,	2, antibody.name[11]);
				CrossOutCouple(12, mJSA2	, mJSB2		,	2, antibody.name[12]);
				CrossOutCouple(13, mJSB2	, mJSA2		,	2, antibody.name[13]);
				CrossOutCouple(14, mFYA2	, mFYB2		,	2, antibody.name[14]);
				CrossOutCouple(15, mFYB2	, mFYA2		,	2, antibody.name[15]);
				CrossOutCouple(16, mJKA2	, mJKB2		,	2, antibody.name[16]);
				CrossOutCouple(17, mJKB2	, mJKA2		,	2, antibody.name[17]);
				CrossOutSingle(18, mXGA2	,				2, antibody.name[18]);
				CrossOutCouple(19, mLEA2	, mLEB2		,	2, antibody.name[19]);
				CrossOutCouple(20, mLEB2	, mLEA2		,	2, antibody.name[20]);
				CrossOutCouple(21, mBigS2	, mLittleS2	,	2, antibody.name[21]);
				CrossOutCouple(22, mLittleS2, mBigS2	,	2, antibody.name[22]);
				CrossOutCouple(23, mM2		, mN2		,	2, antibody.name[23]);
				CrossOutCouple(24, mN2		, mM2		,	2, antibody.name[24]);
				CrossOutSingle(25, mP1_2	,				2, antibody.name[25]);
				CrossOutCouple(26, mLUA2	, mLUB2		,	2, antibody.name[26]);
				CrossOutCouple(27, mLUB2	, mLUA2		,	2, antibody.name[27]);
			}
			if (!mCheck3.isChecked())//Can use this row to cross out
			{
				CrossOutSingle(	0, mD3		,				3, antibody.name[ 0]);
				CrossOutCouple(	1, mBigC3	, mLittleC3	,	3, antibody.name[ 1]);
				CrossOutCouple(	2, mBigE3	, mLittleE3	,	3, antibody.name[ 2]);
				CrossOutCouple(	3, mLittleC3, mBigC3	,	3, antibody.name[ 3]);
				CrossOutCouple(	4, mLittleE3, mBigE3	,	3, antibody.name[ 4]);
				CrossOutSingle(	5, mF3		,				3, antibody.name[ 5]);
				CrossOutSingle(	6, mCW3		,				3, antibody.name[ 6]);
				CrossOutSingle(	7, mV3		,				3, antibody.name[ 7]);
				CrossOutCouple(	8, mBigK3	, mLittleK3	,	3, antibody.name[ 8]);
				CrossOutCouple(	9, mLittleK3, mBigK3	,	3, antibody.name[ 9]);
				CrossOutCouple(10, mKPA3	, mKPB3		,	3, antibody.name[10]);
				CrossOutCouple(11, mKPB3	, mKPA3		,	3, antibody.name[11]);
				CrossOutCouple(12, mJSA3	, mJSB3		,	3, antibody.name[12]);
				CrossOutCouple(13, mJSB3	, mJSA3		,	3, antibody.name[13]);
				CrossOutCouple(14, mFYA3	, mFYB3		,	3, antibody.name[14]);
				CrossOutCouple(15, mFYB3	, mFYA3		,	3, antibody.name[15]);
				CrossOutCouple(16, mJKA3	, mJKB3		,	3, antibody.name[16]);
				CrossOutCouple(17, mJKB3	, mJKA3		,	3, antibody.name[17]);
				CrossOutSingle(18, mXGA3	,				3, antibody.name[18]);
				CrossOutCouple(19, mLEA3	, mLEB3		,	3, antibody.name[19]);
				CrossOutCouple(20, mLEB3	, mLEA3		,	3, antibody.name[20]);
				CrossOutCouple(21, mBigS3	, mLittleS3	,	3, antibody.name[21]);
				CrossOutCouple(22, mLittleS3, mBigS3	,	3, antibody.name[22]);
				CrossOutCouple(23, mM3		, mN3		,	3, antibody.name[23]);
				CrossOutCouple(24, mN3		, mM3		,	3, antibody.name[24]);
				CrossOutSingle(25, mP1_3	,				3, antibody.name[25]);
				CrossOutCouple(26, mLUA3	, mLUB3		,	3, antibody.name[26]);
				CrossOutCouple(27, mLUB3	, mLUA3		,	3, antibody.name[27]);
			}
			if (!mCheck4.isChecked())//Can use this row to cross out
			{
				CrossOutSingle(	0, mD4		,				4, antibody.name[ 0]);
				CrossOutCouple(	1, mBigC4	, mLittleC4	,	4, antibody.name[ 1]);
				CrossOutCouple(	2, mBigE4	, mLittleE4	,	4, antibody.name[ 2]);
				CrossOutCouple(	3, mLittleC4, mBigC4	,	4, antibody.name[ 3]);
				CrossOutCouple(	4, mLittleE4, mBigE4	,	4, antibody.name[ 4]);
				CrossOutSingle(	5, mF4		,				4, antibody.name[ 5]);
				CrossOutSingle(	6, mCW4		,				4, antibody.name[ 6]);
				CrossOutSingle(	7, mV4		,				4, antibody.name[ 7]);
				CrossOutCouple(	8, mBigK4	, mLittleK4	,	4, antibody.name[ 8]);
				CrossOutCouple(	9, mLittleK4, mBigK4	,	4, antibody.name[ 9]);
				CrossOutCouple(10, mKPA4	, mKPB4		,	4, antibody.name[10]);
				CrossOutCouple(11, mKPB4	, mKPA4		,	4, antibody.name[11]);
				CrossOutCouple(12, mJSA4	, mJSB4		,	4, antibody.name[12]);
				CrossOutCouple(13, mJSB4	, mJSA4		,	4, antibody.name[13]);
				CrossOutCouple(14, mFYA4	, mFYB4		,	4, antibody.name[14]);
				CrossOutCouple(15, mFYB4	, mFYA4		,	4, antibody.name[15]);
				CrossOutCouple(16, mJKA4	, mJKB4		,	4, antibody.name[16]);
				CrossOutCouple(17, mJKB4	, mJKA4		,	4, antibody.name[17]);
				CrossOutSingle(18, mXGA4	,				4, antibody.name[18]);
				CrossOutCouple(19, mLEA4	, mLEB4		,	4, antibody.name[19]);
				CrossOutCouple(20, mLEB4	, mLEA4		,	4, antibody.name[20]);
				CrossOutCouple(21, mBigS4	, mLittleS4	,	4, antibody.name[21]);
				CrossOutCouple(22, mLittleS4, mBigS4	,	4, antibody.name[22]);
				CrossOutCouple(23, mM4		, mN4		,	4, antibody.name[23]);
				CrossOutCouple(24, mN4		, mM4		,	4, antibody.name[24]);
				CrossOutSingle(25, mP1_4	,				4, antibody.name[25]);
				CrossOutCouple(26, mLUA4	, mLUB4		,	4, antibody.name[26]);
				CrossOutCouple(27, mLUB4	, mLUA4		,	4, antibody.name[27]);
			}
			if (!mCheck5.isChecked())//Can use this row to cross out
			{
				CrossOutSingle(	0, mD5		,				5, antibody.name[ 0]);
				CrossOutCouple(	1, mBigC5	, mLittleC5	,	5, antibody.name[ 1]);
				CrossOutCouple(	2, mBigE5	, mLittleE5	,	5, antibody.name[ 2]);
				CrossOutCouple(	3, mLittleC5, mBigC5	,	5, antibody.name[ 3]);
				CrossOutCouple(	4, mLittleE5, mBigE5	,	5, antibody.name[ 4]);
				CrossOutSingle(	5, mF5		,				5, antibody.name[ 5]);
				CrossOutSingle(	6, mCW5		,				5, antibody.name[ 6]);
				CrossOutSingle(	7, mV5		,				5, antibody.name[ 7]);
				CrossOutCouple(	8, mBigK5	, mLittleK5	,	5, antibody.name[ 8]);
				CrossOutCouple(	9, mLittleK5, mBigK5	,	5, antibody.name[ 9]);
				CrossOutCouple(10, mKPA5	, mKPB5		,	5, antibody.name[10]);
				CrossOutCouple(11, mKPB5	, mKPA5		,	5, antibody.name[11]);
				CrossOutCouple(12, mJSA5	, mJSB5		,	5, antibody.name[12]);
				CrossOutCouple(13, mJSB5	, mJSA5		,	5, antibody.name[13]);
				CrossOutCouple(14, mFYA5	, mFYB5		,	5, antibody.name[14]);
				CrossOutCouple(15, mFYB5	, mFYA5		,	5, antibody.name[15]);
				CrossOutCouple(16, mJKA5	, mJKB5		,	5, antibody.name[16]);
				CrossOutCouple(17, mJKB5	, mJKA5		,	5, antibody.name[17]);
				CrossOutSingle(18, mXGA5	,				5, antibody.name[18]);
				CrossOutCouple(19, mLEA5	, mLEB5		,	5, antibody.name[19]);
				CrossOutCouple(20, mLEB5	, mLEA5		,	5, antibody.name[20]);
				CrossOutCouple(21, mBigS5	, mLittleS5	,	5, antibody.name[21]);
				CrossOutCouple(22, mLittleS5, mBigS5	,	5, antibody.name[22]);
				CrossOutCouple(23, mM5		, mN5		,	5, antibody.name[23]);
				CrossOutCouple(24, mN5		, mM5		,	5, antibody.name[24]);
				CrossOutSingle(25, mP1_5	,				5, antibody.name[25]);
				CrossOutCouple(26, mLUA5	, mLUB5		,	5, antibody.name[26]);
				CrossOutCouple(27, mLUB5	, mLUA5		,	5, antibody.name[27]);
			}
			if (!mCheck6.isChecked())//Can use this row to cross out
			{
				CrossOutSingle(	0, mD6		,				6, antibody.name[ 0]);
				CrossOutCouple(	1, mBigC6	, mLittleC6	,	6, antibody.name[ 1]);
				CrossOutCouple(	2, mBigE6	, mLittleE6	,	6, antibody.name[ 2]);
				CrossOutCouple(	3, mLittleC6, mBigC6	,	6, antibody.name[ 3]);
				CrossOutCouple(	4, mLittleE6, mBigE6	,	6, antibody.name[ 4]);
				CrossOutSingle(	5, mF6		,				6, antibody.name[ 5]);
				CrossOutSingle(	6, mCW6		,				6, antibody.name[ 6]);
				CrossOutSingle(	7, mV6		,				6, antibody.name[ 7]);
				CrossOutCouple(	8, mBigK6	, mLittleK6	,	6, antibody.name[ 8]);
				CrossOutCouple(	9, mLittleK6, mBigK6	,	6, antibody.name[ 9]);
				CrossOutCouple(10, mKPA6	, mKPB6		,	6, antibody.name[10]);
				CrossOutCouple(11, mKPB6	, mKPA6		,	6, antibody.name[11]);
				CrossOutCouple(12, mJSA6	, mJSB6		,	6, antibody.name[12]);
				CrossOutCouple(13, mJSB6	, mJSA6		,	6, antibody.name[13]);
				CrossOutCouple(14, mFYA6	, mFYB6		,	6, antibody.name[14]);
				CrossOutCouple(15, mFYB6	, mFYA6		,	6, antibody.name[15]);
				CrossOutCouple(16, mJKA6	, mJKB6		,	6, antibody.name[16]);
				CrossOutCouple(17, mJKB6	, mJKA6		,	6, antibody.name[17]);
				CrossOutSingle(18, mXGA6	,				6, antibody.name[18]);
				CrossOutCouple(19, mLEA6	, mLEB6		,	6, antibody.name[19]);
				CrossOutCouple(20, mLEB6	, mLEA6		,	6, antibody.name[20]);
				CrossOutCouple(21, mBigS6	, mLittleS6	,	6, antibody.name[21]);
				CrossOutCouple(22, mLittleS6, mBigS6	,	6, antibody.name[22]);
				CrossOutCouple(23, mM6		, mN6		,	6, antibody.name[23]);
				CrossOutCouple(24, mN6		, mM6		,	6, antibody.name[24]);
				CrossOutSingle(25, mP1_6	,				6, antibody.name[25]);
				CrossOutCouple(26, mLUA6	, mLUB6		,	6, antibody.name[26]);
				CrossOutCouple(27, mLUB6	, mLUA6		,	6, antibody.name[27]);
			}
			Use1ToGetSolutions();
			Use2ToGetSolutions();
			Use3ToGetSolutions();
			Use4ToGetSolutions();
			Use5ToGetSolutions();
			Use6ToGetSolutions();
			for (i = 0; i < 28; i++)
			{
				if (
					(antibody.count[i] >   0)
					&&
					(antibody.count[i] < 255)
				   )
				{
					Log.d("Antibody", "At " + i + "(" + antibody.name[i] + ") there is " + antibody.count[i] + "");
					if (antibody.count[i] > antibody.most)
						antibody.most =	antibody.count[i];
				}
			}
			for (j = 0; j < antibody.most; j++)
			{
				solutions =	0;
				for (i = 0; i < 28; i++)
				{
					if (
						(antibody.count[i] == antibody.most - j)
//						&&
//						(antibody.count[i] <   255)
					   )
					{
						mSolution.setText(	mSolution.getText() + 
											(solutions > 0 ? ", " : (antibody.most - j) + ": ") + 
											antibody.name[i] + "(" + antibody.race[i][0] + ", " + antibody.race[i][1] + ")"//display the percentages for race
										 );
						solutions++;
					}
				}
				mSolution.setText(	mSolution.getText() + "\n");
			}
		}
	}

	void SetAllBlack() {
		mD1.setTextColor(0xFF000000);
		mBigC1.setTextColor(0xFF000000);
		mBigE1.setTextColor(0xFF000000);
		mLittleC1.setTextColor(0xFF000000);
		mLittleE1.setTextColor(0xFF000000);
		mF1.setTextColor(0xFF000000);
		mCW1.setTextColor(0xFF000000);
		mV1.setTextColor(0xFF000000);
		mBigK1.setTextColor(0xFF000000);
		mLittleK1.setTextColor(0xFF000000);
		mKPA1.setTextColor(0xFF000000);
		mKPB1.setTextColor(0xFF000000);
		mJSA1.setTextColor(0xFF000000);
		mJSB1.setTextColor(0xFF000000);
		mFYA1.setTextColor(0xFF000000);
		mFYB1.setTextColor(0xFF000000);
		mJKA1.setTextColor(0xFF000000);
		mJKB1.setTextColor(0xFF000000);
		mXGA1.setTextColor(0xFF000000);
		mLEA1.setTextColor(0xFF000000);
		mLEB1.setTextColor(0xFF000000);
		mBigS1.setTextColor(0xFF000000);
		mLittleS1.setTextColor(0xFF000000);
		mM1.setTextColor(0xFF000000);
		mN1.setTextColor(0xFF000000);
		mP1_1.setTextColor(0xFF000000);
		mLUA1.setTextColor(0xFF000000);
		mLUB1.setTextColor(0xFF000000);

		mD2.setTextColor(0xFF000000);
		mBigC2.setTextColor(0xFF000000);
		mBigE2.setTextColor(0xFF000000);
		mLittleC2.setTextColor(0xFF000000);
		mLittleE2.setTextColor(0xFF000000);
		mF2.setTextColor(0xFF000000);
		mCW2.setTextColor(0xFF000000);
		mV2.setTextColor(0xFF000000);
		mBigK2.setTextColor(0xFF000000);
		mLittleK2.setTextColor(0xFF000000);
		mKPA2.setTextColor(0xFF000000);
		mKPB2.setTextColor(0xFF000000);
		mJSA2.setTextColor(0xFF000000);
		mJSB2.setTextColor(0xFF000000);
		mFYA2.setTextColor(0xFF000000);
		mFYB2.setTextColor(0xFF000000);
		mJKA2.setTextColor(0xFF000000);
		mJKB2.setTextColor(0xFF000000);
		mXGA2.setTextColor(0xFF000000);
		mLEA2.setTextColor(0xFF000000);
		mLEB2.setTextColor(0xFF000000);
		mBigS2.setTextColor(0xFF000000);
		mLittleS2.setTextColor(0xFF000000);
		mM2.setTextColor(0xFF000000);
		mN2.setTextColor(0xFF000000);
		mP1_2.setTextColor(0xFF000000);
		mLUA2.setTextColor(0xFF000000);
		mLUB2.setTextColor(0xFF000000);

		mD3.setTextColor(0xFF000000);
		mBigC3.setTextColor(0xFF000000);
		mBigE3.setTextColor(0xFF000000);
		mLittleC3.setTextColor(0xFF000000);
		mLittleE3.setTextColor(0xFF000000);
		mF3.setTextColor(0xFF000000);
		mCW3.setTextColor(0xFF000000);
		mV3.setTextColor(0xFF000000);
		mBigK3.setTextColor(0xFF000000);
		mLittleK3.setTextColor(0xFF000000);
		mKPA3.setTextColor(0xFF000000);
		mKPB3.setTextColor(0xFF000000);
		mJSA3.setTextColor(0xFF000000);
		mJSB3.setTextColor(0xFF000000);
		mFYA3.setTextColor(0xFF000000);
		mFYB3.setTextColor(0xFF000000);
		mJKA3.setTextColor(0xFF000000);
		mJKB3.setTextColor(0xFF000000);
		mXGA3.setTextColor(0xFF000000);
		mLEA3.setTextColor(0xFF000000);
		mLEB3.setTextColor(0xFF000000);
		mBigS3.setTextColor(0xFF000000);
		mLittleS3.setTextColor(0xFF000000);
		mM3.setTextColor(0xFF000000);
		mN3.setTextColor(0xFF000000);
		mP1_3.setTextColor(0xFF000000);
		mLUA3.setTextColor(0xFF000000);
		mLUB3.setTextColor(0xFF000000);

		mD4.setTextColor(0xFF000000);
		mBigC4.setTextColor(0xFF000000);
		mBigE4.setTextColor(0xFF000000);
		mLittleC4.setTextColor(0xFF000000);
		mLittleE4.setTextColor(0xFF000000);
		mF4.setTextColor(0xFF000000);
		mCW4.setTextColor(0xFF000000);
		mV4.setTextColor(0xFF000000);
		mBigK4.setTextColor(0xFF000000);
		mLittleK4.setTextColor(0xFF000000);
		mKPA4.setTextColor(0xFF000000);
		mKPB4.setTextColor(0xFF000000);
		mJSA4.setTextColor(0xFF000000);
		mJSB4.setTextColor(0xFF000000);
		mFYA4.setTextColor(0xFF000000);
		mFYB4.setTextColor(0xFF000000);
		mJKA4.setTextColor(0xFF000000);
		mJKB4.setTextColor(0xFF000000);
		mXGA4.setTextColor(0xFF000000);
		mLEA4.setTextColor(0xFF000000);
		mLEB4.setTextColor(0xFF000000);
		mBigS4.setTextColor(0xFF000000);
		mLittleS4.setTextColor(0xFF000000);
		mM4.setTextColor(0xFF000000);
		mN4.setTextColor(0xFF000000);
		mP1_4.setTextColor(0xFF000000);
		mLUA4.setTextColor(0xFF000000);
		mLUB4.setTextColor(0xFF000000);

		mD5.setTextColor(0xFF000000);
		mBigC5.setTextColor(0xFF000000);
		mBigE5.setTextColor(0xFF000000);
		mLittleC5.setTextColor(0xFF000000);
		mLittleE5.setTextColor(0xFF000000);
		mF5.setTextColor(0xFF000000);
		mCW5.setTextColor(0xFF000000);
		mV5.setTextColor(0xFF000000);
		mBigK5.setTextColor(0xFF000000);
		mLittleK5.setTextColor(0xFF000000);
		mKPA5.setTextColor(0xFF000000);
		mKPB5.setTextColor(0xFF000000);
		mJSA5.setTextColor(0xFF000000);
		mJSB5.setTextColor(0xFF000000);
		mFYA5.setTextColor(0xFF000000);
		mFYB5.setTextColor(0xFF000000);
		mJKA5.setTextColor(0xFF000000);
		mJKB5.setTextColor(0xFF000000);
		mXGA5.setTextColor(0xFF000000);
		mLEA5.setTextColor(0xFF000000);
		mLEB5.setTextColor(0xFF000000);
		mBigS5.setTextColor(0xFF000000);
		mLittleS5.setTextColor(0xFF000000);
		mM5.setTextColor(0xFF000000);
		mN5.setTextColor(0xFF000000);
		mP1_5.setTextColor(0xFF000000);
		mLUA5.setTextColor(0xFF000000);
		mLUB5.setTextColor(0xFF000000);

		mD6.setTextColor(0xFF000000);
		mBigC6.setTextColor(0xFF000000);
		mBigE6.setTextColor(0xFF000000);
		mLittleC6.setTextColor(0xFF000000);
		mLittleE6.setTextColor(0xFF000000);
		mF6.setTextColor(0xFF000000);
		mCW6.setTextColor(0xFF000000);
		mV6.setTextColor(0xFF000000);
		mBigK6.setTextColor(0xFF000000);
		mLittleK6.setTextColor(0xFF000000);
		mKPA6.setTextColor(0xFF000000);
		mKPB6.setTextColor(0xFF000000);
		mJSA6.setTextColor(0xFF000000);
		mJSB6.setTextColor(0xFF000000);
		mFYA6.setTextColor(0xFF000000);
		mFYB6.setTextColor(0xFF000000);
		mJKA6.setTextColor(0xFF000000);
		mJKB6.setTextColor(0xFF000000);
		mXGA6.setTextColor(0xFF000000);
		mLEA6.setTextColor(0xFF000000);
		mLEB6.setTextColor(0xFF000000);
		mBigS6.setTextColor(0xFF000000);
		mLittleS6.setTextColor(0xFF000000);
		mM6.setTextColor(0xFF000000);
		mN6.setTextColor(0xFF000000);
		mP1_6.setTextColor(0xFF000000);
		mLUA6.setTextColor(0xFF000000);
		mLUB6.setTextColor(0xFF000000);
	}

	void CrossOutSingle(int index, TextView Antibody1, int cell, String letter)
	{
		if (Antibody1.getText().equals("+"))
		{
			Antibody1.setTextColor(0xFFFF0000);
			if (antibody.count[index] < 255)
			{
				Log.d("Antibody", "Using " + cell + " to cross out " + letter);
				antibody.count[index] =	255;
			}
		}
	}

	void CrossOutCouple(int index, TextView Big, TextView Little, int cell, String letter)
	{
		if (Big.getText().equals("+"))
		{
			if (Little.getText().equals("0"))
			{
				Big.setTextColor(0xFFFF0000);
				if (antibody.count[index] < 255)
				{
					Log.d("Antibody", "Using " + cell + " to cross out " + letter);
					antibody.count[index] =	255;
				}
			}
			else
				Big.setTextColor(0xFF000000);
		}
	}

	void Use1ToGetSolutions()
	{
		if (mCheck1.isChecked())
		{
			Log.d("Antibody", "Using 1 to get solutions");
			GetSolution( 0, mD1			, antibody.name[ 0]);
			GetSolution( 1, mBigC1		, antibody.name[ 1]);
			GetSolution( 2, mBigE1		, antibody.name[ 2]);
			GetSolution( 3, mLittleC1	, antibody.name[ 3]);
			GetSolution( 4, mLittleE1	, antibody.name[ 4]);
			GetSolution( 5, mF1			, antibody.name[ 5]);
			GetSolution( 6, mCW1		, antibody.name[ 6]);
			GetSolution( 7, mV1			, antibody.name[ 7]);
			GetSolution( 8, mBigK1		, antibody.name[ 8]);
			GetSolution( 9, mLittleK1	, antibody.name[ 9]);
			GetSolution(10, mKPA1		, antibody.name[10]);
			GetSolution(11, mKPB1		, antibody.name[11]);
			GetSolution(12, mJSA1		, antibody.name[12]);
			GetSolution(13, mJSB1		, antibody.name[13]);
			GetSolution(14, mFYA1		, antibody.name[14]);
			GetSolution(15, mFYB1		, antibody.name[15]);
			GetSolution(16, mJKA1		, antibody.name[16]);
			GetSolution(17, mJKB1		, antibody.name[17]);
			GetSolution(18, mXGA1		, antibody.name[18]);
			GetSolution(19, mLEA1		, antibody.name[19]);
			GetSolution(20, mLEB1		, antibody.name[20]);
			GetSolution(21, mBigS1		, antibody.name[21]);
			GetSolution(22, mLittleS1	, antibody.name[22]);
			GetSolution(23, mM1			, antibody.name[23]);
			GetSolution(24, mN1			, antibody.name[24]);
			GetSolution(25, mP1_1		, antibody.name[25]);
			GetSolution(26, mLUA1		, antibody.name[26]);
			GetSolution(27, mLUB1		, antibody.name[27]);
		}
	}

	void Use2ToGetSolutions()
	{
		if (mCheck2.isChecked())
		{
			Log.d("Antibody", "Using 2 to get solutions");
			GetSolution( 0, mD2			, antibody.name[ 0]);
			GetSolution( 1, mBigC2		, antibody.name[ 1]);
			GetSolution( 2, mBigE2		, antibody.name[ 2]);
			GetSolution( 3, mLittleC2	, antibody.name[ 3]);
			GetSolution( 4, mLittleE2	, antibody.name[ 4]);
			GetSolution( 5, mF2			, antibody.name[ 5]);
			GetSolution( 6, mCW2		, antibody.name[ 6]);
			GetSolution( 7, mV2			, antibody.name[ 7]);
			GetSolution( 8, mBigK2		, antibody.name[ 8]);
			GetSolution( 9, mLittleK2	, antibody.name[ 9]);
			GetSolution(10, mKPA2		, antibody.name[10]);
			GetSolution(11, mKPB2		, antibody.name[11]);
			GetSolution(12, mJSA2		, antibody.name[12]);
			GetSolution(13, mJSB2		, antibody.name[13]);
			GetSolution(14, mFYA2		, antibody.name[14]);
			GetSolution(15, mFYB2		, antibody.name[15]);
			GetSolution(16, mJKA2		, antibody.name[16]);
			GetSolution(17, mJKB2		, antibody.name[17]);
			GetSolution(18, mXGA2		, antibody.name[18]);
			GetSolution(19, mLEA2		, antibody.name[19]);
			GetSolution(20, mLEB2		, antibody.name[20]);
			GetSolution(21, mBigS2		, antibody.name[21]);
			GetSolution(22, mLittleS2	, antibody.name[22]);
			GetSolution(23, mM2			, antibody.name[23]);
			GetSolution(24, mN2			, antibody.name[24]);
			GetSolution(25, mP1_2		, antibody.name[25]);
			GetSolution(26, mLUA2		, antibody.name[26]);
			GetSolution(27, mLUB2		, antibody.name[27]);
		}
	}

	void Use3ToGetSolutions()
	{
		if (mCheck3.isChecked())
		{
			Log.d("Antibody", "Using 3 to get solutions");
			GetSolution( 0, mD3			, antibody.name[ 0]);
			GetSolution( 1, mBigC3		, antibody.name[ 1]);
			GetSolution( 2, mBigE3		, antibody.name[ 2]);
			GetSolution( 3, mLittleC3	, antibody.name[ 3]);
			GetSolution( 4, mLittleE3	, antibody.name[ 4]);
			GetSolution( 5, mF3			, antibody.name[ 5]);
			GetSolution( 6, mCW3		, antibody.name[ 6]);
			GetSolution( 7, mV3			, antibody.name[ 7]);
			GetSolution( 8, mBigK3		, antibody.name[ 8]);
			GetSolution( 9, mLittleK3	, antibody.name[ 9]);
			GetSolution(10, mKPA3		, antibody.name[10]);
			GetSolution(11, mKPB3		, antibody.name[11]);
			GetSolution(12, mJSA3		, antibody.name[12]);
			GetSolution(13, mJSB3		, antibody.name[13]);
			GetSolution(14, mFYA3		, antibody.name[14]);
			GetSolution(15, mFYB3		, antibody.name[15]);
			GetSolution(16, mJKA3		, antibody.name[16]);
			GetSolution(17, mJKB3		, antibody.name[17]);
			GetSolution(18, mXGA3		, antibody.name[18]);
			GetSolution(19, mLEA3		, antibody.name[19]);
			GetSolution(20, mLEB3		, antibody.name[20]);
			GetSolution(21, mBigS3		, antibody.name[21]);
			GetSolution(22, mLittleS3	, antibody.name[22]);
			GetSolution(23, mM3			, antibody.name[23]);
			GetSolution(24, mN3			, antibody.name[24]);
			GetSolution(25, mP1_3		, antibody.name[25]);
			GetSolution(26, mLUA3		, antibody.name[26]);
			GetSolution(27, mLUB3		, antibody.name[27]);
		}
	}

	void Use4ToGetSolutions()
	{
		if (mCheck4.isChecked())
		{
			Log.d("Antibody", "Using 4 to get solutions");
			GetSolution( 0, mD4			, antibody.name[ 0]);
			GetSolution( 1, mBigC4		, antibody.name[ 1]);
			GetSolution( 2, mBigE4		, antibody.name[ 2]);
			GetSolution( 3, mLittleC4	, antibody.name[ 3]);
			GetSolution( 4, mLittleE4	, antibody.name[ 4]);
			GetSolution( 5, mF4			, antibody.name[ 5]);
			GetSolution( 6, mCW4		, antibody.name[ 6]);
			GetSolution( 7, mV4			, antibody.name[ 7]);
			GetSolution( 8, mBigK4		, antibody.name[ 8]);
			GetSolution( 9, mLittleK4	, antibody.name[ 9]);
			GetSolution(10, mKPA4		, antibody.name[10]);
			GetSolution(11, mKPB4		, antibody.name[11]);
			GetSolution(12, mJSA4		, antibody.name[12]);
			GetSolution(13, mJSB4		, antibody.name[13]);
			GetSolution(14, mFYA4		, antibody.name[14]);
			GetSolution(15, mFYB4		, antibody.name[15]);
			GetSolution(16, mJKA4		, antibody.name[16]);
			GetSolution(17, mJKB4		, antibody.name[17]);
			GetSolution(18, mXGA4		, antibody.name[18]);
			GetSolution(19, mLEA4		, antibody.name[19]);
			GetSolution(20, mLEB4		, antibody.name[20]);
			GetSolution(21, mBigS4		, antibody.name[21]);
			GetSolution(22, mLittleS4	, antibody.name[22]);
			GetSolution(23, mM4			, antibody.name[23]);
			GetSolution(24, mN4			, antibody.name[24]);
			GetSolution(25, mP1_4		, antibody.name[25]);
			GetSolution(26, mLUA4		, antibody.name[26]);
			GetSolution(27, mLUB4		, antibody.name[27]);
		}
	}

	void Use5ToGetSolutions()
	{
		if (mCheck5.isChecked())
		{
			Log.d("Antibody", "Using 5 to get solutions");
			GetSolution( 0, mD5			, antibody.name[ 0]);
			GetSolution( 1, mBigC5		, antibody.name[ 1]);
			GetSolution( 2, mBigE5		, antibody.name[ 2]);
			GetSolution( 3, mLittleC5	, antibody.name[ 3]);
			GetSolution( 4, mLittleE5	, antibody.name[ 4]);
			GetSolution( 5, mF5			, antibody.name[ 5]);
			GetSolution( 6, mCW5		, antibody.name[ 6]);
			GetSolution( 7, mV5			, antibody.name[ 7]);
			GetSolution( 8, mBigK5		, antibody.name[ 8]);
			GetSolution( 9, mLittleK5	, antibody.name[ 9]);
			GetSolution(10, mKPA5		, antibody.name[10]);
			GetSolution(11, mKPB5		, antibody.name[11]);
			GetSolution(12, mJSA5		, antibody.name[12]);
			GetSolution(13, mJSB5		, antibody.name[13]);
			GetSolution(14, mFYA5		, antibody.name[14]);
			GetSolution(15, mFYB5		, antibody.name[15]);
			GetSolution(16, mJKA5		, antibody.name[16]);
			GetSolution(17, mJKB5		, antibody.name[17]);
			GetSolution(18, mXGA5		, antibody.name[18]);
			GetSolution(19, mLEA5		, antibody.name[19]);
			GetSolution(20, mLEB5		, antibody.name[20]);
			GetSolution(21, mBigS5		, antibody.name[21]);
			GetSolution(22, mLittleS5	, antibody.name[22]);
			GetSolution(23, mM5			, antibody.name[23]);
			GetSolution(24, mN5			, antibody.name[24]);
			GetSolution(25, mP1_5		, antibody.name[25]);
			GetSolution(26, mLUA5		, antibody.name[26]);
			GetSolution(27, mLUB5		, antibody.name[27]);
		}
	}

	void Use6ToGetSolutions()
	{
		if (mCheck6.isChecked())
		{
			Log.d("Antibody", "Using 6 to get solutions");
			GetSolution( 0, mD6			, antibody.name[ 0]);
			GetSolution( 1, mBigC6		, antibody.name[ 1]);
			GetSolution( 2, mBigE6		, antibody.name[ 2]);
			GetSolution( 3, mLittleC6	, antibody.name[ 3]);
			GetSolution( 4, mLittleE6	, antibody.name[ 4]);
			GetSolution( 5, mF6			, antibody.name[ 5]);
			GetSolution( 6, mCW6		, antibody.name[ 6]);
			GetSolution( 7, mV6			, antibody.name[ 7]);
			GetSolution( 8, mBigK6		, antibody.name[ 8]);
			GetSolution( 9, mLittleK6	, antibody.name[ 9]);
			GetSolution(10, mKPA6		, antibody.name[10]);
			GetSolution(11, mKPB6		, antibody.name[11]);
			GetSolution(12, mJSA6		, antibody.name[12]);
			GetSolution(13, mJSB6		, antibody.name[13]);
			GetSolution(14, mFYA6		, antibody.name[14]);
			GetSolution(15, mFYB6		, antibody.name[15]);
			GetSolution(16, mJKA6		, antibody.name[16]);
			GetSolution(17, mJKB6		, antibody.name[17]);
			GetSolution(18, mXGA6		, antibody.name[18]);
			GetSolution(19, mLEA6		, antibody.name[19]);
			GetSolution(20, mLEB6		, antibody.name[20]);
			GetSolution(21, mBigS6		, antibody.name[21]);
			GetSolution(22, mLittleS6	, antibody.name[22]);
			GetSolution(23, mM6			, antibody.name[23]);
			GetSolution(24, mN6			, antibody.name[24]);
			GetSolution(25, mP1_6		, antibody.name[25]);
			GetSolution(26, mLUA6		, antibody.name[26]);
			GetSolution(27, mLUB6		, antibody.name[27]);
		}
	}

	void GetSolution(int index, TextView antibody1, String letter)
	{
		if (antibody1.getText().equals("+"))
		{
			if (antibody.count[index] != 255)
			{
/*				mSolution.setText(	mSolution.getText() + 
									(solutions > 0 ? ", " + letter : letter)
							 	 );
*/				antibody1.setTextColor(0xFF00FF00);
				antibody.count[index]++;//solutions++;
			}
			else
				antibody1.setTextColor(0xFF000000);
		}
	}
}
