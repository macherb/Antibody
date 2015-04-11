package com.example.antibodyidentification;

import org.eclipse.jdt.annotation.Nullable;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Decide which antibodies are solutions
 * 
 * @since 1.0
 * 
 * @author Bobby Macher
 */
public class PatientEditor extends Activity implements View.OnClickListener {

	private static final String		TAG =			"PatientEditor";

	private static final String[]	PROJECTION =
									new String[] {
													"_id", // 0
													"title", // 1
													"reactions", // 2
												};
	// TODO: Add race

	private static final int	STATE_EDIT =		0;
    private static final int	STATE_INSERT =		1;

    private int					mState;
	private Uri					mUri;
	@Nullable private Cursor	mCursor;

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

						mD9,
						mBigC9,
						mBigE9,
						mLittleC9,
						mLittleE9,
						mF9,
						mCW9,
						mV9,
						mBigK9,
						mLittleK9,
						mKPA9,
						mKPB9,
						mJSA9,
						mJSB9,
						mFYA9,
						mFYB9,
						mJKA9,
						mJKB9,
						mXGA9,
						mLEA9,
						mLEB9,
						mBigS9,
						mLittleS9,
						mM9,
						mN9,
						mP1_9,
						mLUA9,
						mLUB9,

						mD10,
						mBigC10,
						mBigE10,
						mLittleC10,
						mLittleE10,
						mF10,
						mCW10,
						mV10,
						mBigK10,
						mLittleK10,
						mKPA10,
						mKPB10,
						mJSA10,
						mJSB10,
						mFYA10,
						mFYB10,
						mJKA10,
						mJKB10,
						mXGA10,
						mLEA10,
						mLEB10,
						mBigS10,
						mLittleS10,
						mM10,
						mN10,
						mP1_10,
						mLUA10,
						mLUB10,

						mText[][],

						mSolution;

	private CheckBox	mCheck1,
						mCheck2,
						mCheck3,
						mCheck4,
						mCheck5,
						mCheck6,
						mCheck7,
						mCheck8,
						mCheck9,
						mCheck10,

						mCheck[];

	private Button		mCalculate,
						mReset;

	private final int	max =	10;

	@SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		int	i;

		super.onCreate(savedInstanceState);

		Log.d(TAG, "onCreate beginning");

		final Intent intent = getIntent();

		final String action = intent.getAction();

		if (Intent.ACTION_EDIT.equals(action)) {
			mState = STATE_EDIT;
			mUri = intent.getData();
		} else if (Intent.ACTION_INSERT.equals(action)) {
			mState = STATE_INSERT;
			Log.d(TAG, "Before insert");
			mUri = getContentResolver().insert(intent.getData(), null);
		}
		mCursor = managedQuery(
	            mUri,
	            PROJECTION,
	            null,
	            null,
	            null
	        );

		setContentView(R.layout.patient_editor);

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

		mD9 =			(TextView	)findViewById(R.id.textD9			);
		mBigC9 =		(TextView	)findViewById(R.id.textBigC9		);
		mBigE9 =		(TextView	)findViewById(R.id.textBigE9		);
		mLittleC9 =		(TextView	)findViewById(R.id.textLittleC9		);
		mLittleE9 =		(TextView	)findViewById(R.id.textLittleE9		);
		mF9 =			(TextView	)findViewById(R.id.textF9			);
		mCW9 =			(TextView	)findViewById(R.id.textCW9			);
		mV9 =			(TextView	)findViewById(R.id.textV9			);
		mBigK9 =		(TextView	)findViewById(R.id.textBigK9		);
		mLittleK9 =		(TextView	)findViewById(R.id.textLittleK9		);
		mKPA9 =			(TextView	)findViewById(R.id.textKPA9			);
		mKPB9 =			(TextView	)findViewById(R.id.textKPB9			);
		mJSA9 =			(TextView	)findViewById(R.id.textJSA9			);
		mJSB9 =			(TextView	)findViewById(R.id.textJSB9			);
		mFYA9 =			(TextView	)findViewById(R.id.textFYA9			);
		mFYB9 =			(TextView	)findViewById(R.id.textFYB9			);
		mJKA9 =			(TextView	)findViewById(R.id.textJKA9			);
		mJKB9 =			(TextView	)findViewById(R.id.textJKB9			);
		mXGA9 =			(TextView	)findViewById(R.id.textXGA9			);
		mLEA9 =			(TextView	)findViewById(R.id.textLEA9			);
		mLEB9 =			(TextView	)findViewById(R.id.textLEB9			);
		mBigS9 =		(TextView	)findViewById(R.id.textBigS9		);
		mLittleS9 =		(TextView	)findViewById(R.id.textLittleS9		);
		mM9 =			(TextView	)findViewById(R.id.textM9			);
		mN9 =			(TextView	)findViewById(R.id.textN9			);
		mP1_9 =			(TextView	)findViewById(R.id.textP1_9			);
		mLUA9 =			(TextView	)findViewById(R.id.textLUA9			);
		mLUB9 =			(TextView	)findViewById(R.id.textLUB9			);

		mD10 =			(TextView	)findViewById(R.id.textD10			);
		mBigC10 =		(TextView	)findViewById(R.id.textBigC10		);
		mBigE10 =		(TextView	)findViewById(R.id.textBigE10		);
		mLittleC10 =	(TextView	)findViewById(R.id.textLittleC10	);
		mLittleE10 =	(TextView	)findViewById(R.id.textLittleE10	);
		mF10 =			(TextView	)findViewById(R.id.textF10			);
		mCW10 =			(TextView	)findViewById(R.id.textCW10			);
		mV10 =			(TextView	)findViewById(R.id.textV10			);
		mBigK10 =		(TextView	)findViewById(R.id.textBigK10		);
		mLittleK10 =	(TextView	)findViewById(R.id.textLittleK10	);
		mKPA10 =		(TextView	)findViewById(R.id.textKPA10		);
		mKPB10 =		(TextView	)findViewById(R.id.textKPB10		);
		mJSA10 =		(TextView	)findViewById(R.id.textJSA10		);
		mJSB10 =		(TextView	)findViewById(R.id.textJSB10		);
		mFYA10 =		(TextView	)findViewById(R.id.textFYA10		);
		mFYB10 =		(TextView	)findViewById(R.id.textFYB10		);
		mJKA10 =		(TextView	)findViewById(R.id.textJKA10		);
		mJKB10 =		(TextView	)findViewById(R.id.textJKB10		);
		mXGA10 =		(TextView	)findViewById(R.id.textXGA10		);
		mLEA10 =		(TextView	)findViewById(R.id.textLEA10		);
		mLEB10 =		(TextView	)findViewById(R.id.textLEB10		);
		mBigS10 =		(TextView	)findViewById(R.id.textBigS10		);
		mLittleS10 =	(TextView	)findViewById(R.id.textLittleS10	);
		mM10 =			(TextView	)findViewById(R.id.textM10			);
		mN10 =			(TextView	)findViewById(R.id.textN10			);
		mP1_10 =		(TextView	)findViewById(R.id.textP1_10		);
		mLUA10 =		(TextView	)findViewById(R.id.textLUA10		);
		mLUB10 =		(TextView	)findViewById(R.id.textLUB10		);

		mSolution =		(TextView	)findViewById(R.id.textSolution		);

		mCheck1 =		(CheckBox	)findViewById(R.id.check1			);
		mCheck2 =		(CheckBox	)findViewById(R.id.check2			);
		mCheck3 =		(CheckBox	)findViewById(R.id.check3			);
		mCheck4 =		(CheckBox	)findViewById(R.id.check4			);
		mCheck5 =		(CheckBox	)findViewById(R.id.check5			);
		mCheck6 =		(CheckBox	)findViewById(R.id.check6			);
		mCheck7 =		(CheckBox	)findViewById(R.id.check7			);
		mCheck8 =		(CheckBox	)findViewById(R.id.check8			);
		mCheck9 =		(CheckBox	)findViewById(R.id.check9			);
		mCheck10 =		(CheckBox	)findViewById(R.id.check10			);

		mCalculate =	(Button		)findViewById(R.id.buttonCalculate	);
        mCalculate.setOnClickListener(this);
		mReset =		(Button		)findViewById(R.id.buttonReset		);
        mReset.setOnClickListener(this);

        antibody =		new Antibody_Super();

        mText =			new TextView[28][];
        for (i = 0; i < 28; i++)
        	mText[i] =		new TextView[max];

		mText[0][0] =	mD1;
		mText[0][1] =	mD2;
		mText[0][2] =	mD3;
		mText[0][3] =	mD4;
		mText[0][4] =	mD5;
		mText[0][5] =	mD6;
		mText[0][6] =	mD7;
		mText[0][7] =	mD8;
		mText[0][8] =	mD9;
		mText[0][9] =	mD10;

		mText[1][0] =	mBigC1;
        mText[1][1] =	mBigC2;
        mText[1][2] =	mBigC3;
        mText[1][3] =	mBigC4;
        mText[1][4] =	mBigC5;
        mText[1][5] =	mBigC6;
        mText[1][6] =	mBigC7;
        mText[1][7] =	mBigC8;
        mText[1][8] =	mBigC9;
        mText[1][9] =	mBigC10;

        mText[2][0] =	mBigE1;
		mText[2][1] =	mBigE2;
		mText[2][2] =	mBigE3;
		mText[2][3] =	mBigE4;
		mText[2][4] =	mBigE5;
		mText[2][5] =	mBigE6;
		mText[2][6] =	mBigE7;
		mText[2][7] =	mBigE8;
		mText[2][8] =	mBigE9;
		mText[2][9] =	mBigE10;

		mText[3][0] =	mLittleC1;
		mText[3][1] =	mLittleC2;
		mText[3][2] =	mLittleC3;
		mText[3][3] =	mLittleC4;
		mText[3][4] =	mLittleC5;
		mText[3][5] =	mLittleC6;
		mText[3][6] =	mLittleC7;
		mText[3][7] =	mLittleC8;
		mText[3][8] =	mLittleC9;
		mText[3][9] =	mLittleC10;

		mText[4][0] =	mLittleE1;
		mText[4][1] =	mLittleE2;
		mText[4][2] =	mLittleE3;
		mText[4][3] =	mLittleE4;
		mText[4][4] =	mLittleE5;
		mText[4][5] =	mLittleE6;
		mText[4][6] =	mLittleE7;
		mText[4][7] =	mLittleE8;
		mText[4][8] =	mLittleE9;
		mText[4][9] =	mLittleE10;

		mText[5][0] =	mF1;
        mText[5][1] =	mF2;
        mText[5][2] =	mF3;
        mText[5][3] =	mF4;
        mText[5][4] =	mF5;
        mText[5][5] =	mF6;
        mText[5][6] =	mF7;
        mText[5][7] =	mF8;
        mText[5][8] =	mF9;
        mText[5][9] =	mF10;

        mText[6][0] =	mCW1;
        mText[6][1] =	mCW2;
        mText[6][2] =	mCW3;
        mText[6][3] =	mCW4;
        mText[6][4] =	mCW5;
        mText[6][5] =	mCW6;
        mText[6][6] =	mCW7;
        mText[6][7] =	mCW8;
        mText[6][8] =	mCW9;
        mText[6][9] =	mCW10;

        mText[7][0] =	mV1;
        mText[7][1] =	mV2;
        mText[7][2] =	mV3;
        mText[7][3] =	mV4;
        mText[7][4] =	mV5;
        mText[7][5] =	mV6;
        mText[7][6] =	mV7;
        mText[7][7] =	mV8;
        mText[7][8] =	mV9;
        mText[7][9] =	mV10;

        mText[8][0] =	mBigK1;
        mText[8][1] =	mBigK2;
        mText[8][2] =	mBigK3;
        mText[8][3] =	mBigK4;
        mText[8][4] =	mBigK5;
        mText[8][5] =	mBigK6;
        mText[8][6] =	mBigK7;
        mText[8][7] =	mBigK8;
        mText[8][8] =	mBigK9;
        mText[8][9] =	mBigK10;

        mText[9][0] =	mLittleK1;
        mText[9][1] =	mLittleK2;
        mText[9][2] =	mLittleK3;
        mText[9][3] =	mLittleK4;
        mText[9][4] =	mLittleK5;
        mText[9][5] =	mLittleK6;
        mText[9][6] =	mLittleK7;
        mText[9][7] =	mLittleK8;
        mText[9][8] =	mLittleK9;
        mText[9][9] =	mLittleK10;

        mText[10][0] =	mKPA1;
        mText[10][1] =	mKPA2;
        mText[10][2] =	mKPA3;
        mText[10][3] =	mKPA4;
        mText[10][4] =	mKPA5;
        mText[10][5] =	mKPA6;
        mText[10][6] =	mKPA7;
        mText[10][7] =	mKPA8;
        mText[10][8] =	mKPA9;
        mText[10][9] =	mKPA10;

        mText[11][0] =	mKPB1;
        mText[11][1] =	mKPB2;
        mText[11][2] =	mKPB3;
        mText[11][3] =	mKPB4;
        mText[11][4] =	mKPB5;
        mText[11][5] =	mKPB6;
        mText[11][6] =	mKPB7;
        mText[11][7] =	mKPB8;
        mText[11][8] =	mKPB9;
        mText[11][9] =	mKPB10;

        mText[12][0] =	mJSA1;
        mText[12][1] =	mJSA2;
        mText[12][2] =	mJSA3;
        mText[12][3] =	mJSA4;
        mText[12][4] =	mJSA5;
        mText[12][5] =	mJSA6;
        mText[12][6] =	mJSA7;
        mText[12][7] =	mJSA8;
        mText[12][8] =	mJSA9;
        mText[12][9] =	mJSA10;

        mText[13][0] =	mJSB1;
        mText[13][1] =	mJSB2;
        mText[13][2] =	mJSB3;
        mText[13][3] =	mJSB4;
        mText[13][4] =	mJSB5;
        mText[13][5] =	mJSB6;
        mText[13][6] =	mJSB7;
        mText[13][7] =	mJSB8;
        mText[13][8] =	mJSB9;
        mText[13][9] =	mJSB10;

        mText[14][0] =	mFYA1;
        mText[14][1] =	mFYA2;
        mText[14][2] =	mFYA3;
        mText[14][3] =	mFYA4;
        mText[14][4] =	mFYA5;
        mText[14][5] =	mFYA6;
        mText[14][6] =	mFYA7;
        mText[14][7] =	mFYA8;
        mText[14][8] =	mFYA9;
        mText[14][9] =	mFYA10;

        mText[15][0] =	mFYB1;
        mText[15][1] =	mFYB2;
        mText[15][2] =	mFYB3;
        mText[15][3] =	mFYB4;
        mText[15][4] =	mFYB5;
        mText[15][5] =	mFYB6;
        mText[15][6] =	mFYB7;
        mText[15][7] =	mFYB8;
        mText[15][8] =	mFYB9;
        mText[15][9] =	mFYB10;

        mText[16][0] =	mJKA1;
        mText[16][1] =	mJKA2;
        mText[16][2] =	mJKA3;
        mText[16][3] =	mJKA4;
        mText[16][4] =	mJKA5;
        mText[16][5] =	mJKA6;
        mText[16][6] =	mJKA7;
        mText[16][7] =	mJKA8;
        mText[16][8] =	mJKA9;
        mText[16][9] =	mJKA10;

        mText[17][0] =	mJKB1;
        mText[17][1] =	mJKB2;
        mText[17][2] =	mJKB3;
        mText[17][3] =	mJKB4;
        mText[17][4] =	mJKB5;
        mText[17][5] =	mJKB6;
        mText[17][6] =	mJKB7;
        mText[17][7] =	mJKB8;
        mText[17][8] =	mJKB9;
        mText[17][9] =	mJKB10;

        mText[18][0] =	mXGA1;
        mText[18][1] =	mXGA2;
        mText[18][2] =	mXGA3;
        mText[18][3] =	mXGA4;
        mText[18][4] =	mXGA5;
        mText[18][5] =	mXGA6;
        mText[18][6] =	mXGA7;
        mText[18][7] =	mXGA8;
        mText[18][8] =	mXGA9;
        mText[18][9] =	mXGA10;

        mText[19][0] =	mLEA1;
        mText[19][1] =	mLEA2;
        mText[19][2] =	mLEA3;
        mText[19][3] =	mLEA4;
        mText[19][4] =	mLEA5;
        mText[19][5] =	mLEA6;
        mText[19][6] =	mLEA7;
        mText[19][7] =	mLEA8;
        mText[19][8] =	mLEA9;
        mText[19][9] =	mLEA10;

        mText[20][0] =	mLEB1;
        mText[20][1] =	mLEB2;
        mText[20][2] =	mLEB3;
        mText[20][3] =	mLEB4;
        mText[20][4] =	mLEB5;
        mText[20][5] =	mLEB6;
        mText[20][6] =	mLEB7;
        mText[20][7] =	mLEB8;
        mText[20][8] =	mLEB9;
        mText[20][9] =	mLEB10;

        mText[21][0] =	mBigS1;
        mText[21][1] =	mBigS2;
        mText[21][2] =	mBigS3;
        mText[21][3] =	mBigS4;
        mText[21][4] =	mBigS5;
        mText[21][5] =	mBigS6;
        mText[21][6] =	mBigS7;
        mText[21][7] =	mBigS8;
        mText[21][8] =	mBigS9;
        mText[21][9] =	mBigS10;

        mText[22][0] =	mLittleS1;
        mText[22][1] =	mLittleS2;
        mText[22][2] =	mLittleS3;
        mText[22][3] =	mLittleS4;
        mText[22][4] =	mLittleS5;
        mText[22][5] =	mLittleS6;
        mText[22][6] =	mLittleS7;
        mText[22][7] =	mLittleS8;
        mText[22][8] =	mLittleS9;
        mText[22][9] =	mLittleS10;

        mText[23][0] =	mM1;
        mText[23][1] =	mM2;
        mText[23][2] =	mM3;
        mText[23][3] =	mM4;
        mText[23][4] =	mM5;
        mText[23][5] =	mM6;
        mText[23][6] =	mM7;
        mText[23][7] =	mM8;
        mText[23][8] =	mM9;
        mText[23][9] =	mM10;

        mText[24][0] =	mN1;
        mText[24][1] =	mN2;
        mText[24][2] =	mN3;
        mText[24][3] =	mN4;
        mText[24][4] =	mN5;
        mText[24][5] =	mN6;
        mText[24][6] =	mN7;
        mText[24][7] =	mN8;
        mText[24][8] =	mN9;
        mText[24][9] =	mN10;

        mText[25][0] =	mP1_1;
        mText[25][1] =	mP1_2;
        mText[25][2] =	mP1_3;
        mText[25][3] =	mP1_4;
        mText[25][4] =	mP1_5;
        mText[25][5] =	mP1_6;
        mText[25][6] =	mP1_7;
        mText[25][7] =	mP1_8;
        mText[25][8] =	mP1_9;
        mText[25][9] =	mP1_10;

        mText[26][0] =	mLUA1;
        mText[26][1] =	mLUA2;
        mText[26][2] =	mLUA3;
        mText[26][3] =	mLUA4;
        mText[26][4] =	mLUA5;
        mText[26][5] =	mLUA6;
        mText[26][6] =	mLUA7;
        mText[26][7] =	mLUA8;
        mText[26][8] =	mLUA9;
        mText[26][9] =	mLUA10;

        mText[27][0] =	mLUB1;
        mText[27][1] =	mLUB2;
        mText[27][2] =	mLUB3;
        mText[27][3] =	mLUB4;
        mText[27][4] =	mLUB5;
        mText[27][5] =	mLUB6;
        mText[27][6] =	mLUB7;
        mText[27][7] =	mLUB8;
        mText[27][8] =	mLUB9;
        mText[27][9] =	mLUB10;

        mCheck =		new CheckBox[max];
        mCheck[0] =		mCheck1;
        mCheck[1] =		mCheck2;
        mCheck[2] =		mCheck3;
        mCheck[3] =		mCheck4;
        mCheck[4] =		mCheck5;
        mCheck[5] =		mCheck6;
        mCheck[6] =		mCheck7;
        mCheck[7] =		mCheck8;
        mCheck[8] =		mCheck9;
        mCheck[9] =		mCheck10;

        Log.d(TAG, "onCreate end");
	}

	@SuppressWarnings("deprecation")
	@Override
    protected void onResume() {
		super.onResume();

		int	i;

		Log.d(TAG, "onResume beginning");
		if (mCursor != null) {
			Log.d(TAG, "onResume not null beginning");
			mCursor.requery();
			mCursor.moveToFirst();
			if (mState == STATE_EDIT) {
				Log.d(TAG, "onResume not null edit");
				int colTitleIndex = mCursor.getColumnIndex("title");
				String title = mCursor.getString(colTitleIndex);
				Resources res = getResources();
                String text = String.format(res.getString(R.string.title_edit), title);
                setTitle(text);
			} else if (mState == STATE_INSERT) {
				Log.d(TAG, "onResume not null insert");
				setTitle(getText(R.string.title_create));
        	}
			Log.d(TAG, "onResume not null end");
			int colReactionsIndex =	mCursor.getColumnIndex("reactions");
			String reactions =		mCursor.getString(colReactionsIndex);
			// TODO: Add race radio buttons
			for (i = 0; i < max; i++)
				mCheck[i].setChecked(reactions.charAt(i) == '1');
		} else {
			Log.d(TAG, "onResume null");
		}
	}

	@Override
    protected void onPause() {
		super.onPause();

		Log.d(TAG, "onPause");
		if (mCursor != null) {
			if (mState == STATE_EDIT) {
				Log.d(TAG, "onPause edit");
				updatePatient();
			} else if (mState == STATE_INSERT) {
				Log.d(TAG, "onPause insert");
				updatePatient();
				mState = STATE_EDIT;
			}
		}
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
		Log.d(TAG, "onCreateOptionsMenu");
		MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.editor_options_menu, menu);

        Intent intent = new Intent(null, mUri);
        intent.addCategory(Intent.CATEGORY_ALTERNATIVE);
        menu.addIntentOptions(Menu.CATEGORY_ALTERNATIVE, 0, 0,
                new ComponentName(this, PatientEditor.class), null, intent, 0, null);

        return super.onCreateOptionsMenu(menu);
	}

	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
		Log.d(TAG, "onOptionsItemSelected beginning");
		switch (item.getItemId()) {
        	case R.id.menu_save:
        		Log.d(TAG, "onOptionsItemSelected save");
        		updatePatient();
                finish();
                break;
            case R.id.menu_delete:
            	Log.d(TAG, "onOptionsItemSelected delete");
                if (mCursor != null) {
                    mCursor.close();
                    mCursor = null;
                    getContentResolver().delete(mUri, null, null);
                }
        		finish();
            	break;
		}
		Log.d(TAG, "onOptionsItemSelected end");
		return super.onOptionsItemSelected(item);
	}

	/**
	 * @since 1.2
	 */
	private final void updatePatient() {
		int				i;
		StringBuilder	reactions =	new StringBuilder();
		ContentValues	values =	new ContentValues();

		values.put("modified", System.currentTimeMillis());
		for (i = 0; i < max; i++)
			reactions.append(mCheck[i].isChecked() ? '1' : '0');
		values.put("reactions", reactions.toString());
		// TODO: Add race radio buttons
		getContentResolver().update(
									mUri,
									values,
									null,
									null
								);
	}

	public void onClick(View v) {
		int	i,
			j;

		if (mCalculate.equals(v)) {
			antibody.Reset();

			if      ( mCheck1.isChecked() &&  mCheck2.isChecked() &&  mCheck3.isChecked() &&  mCheck4.isChecked() &&  mCheck5.isChecked() &&
					  mCheck6.isChecked() &&  mCheck7.isChecked() &&  mCheck8.isChecked() &&  mCheck9.isChecked() &&  mCheck10.isChecked()	)
			{
				mSolution.setText("Inconclusive");
				SetAllBlack();
			}
			else if (!mCheck1.isChecked() && !mCheck2.isChecked() && !mCheck3.isChecked() && !mCheck4.isChecked() && !mCheck5.isChecked() &&
					 !mCheck6.isChecked() && !mCheck7.isChecked() && !mCheck8.isChecked() && !mCheck9.isChecked() && !mCheck10.isChecked()	)
			{
				mSolution.setText("Too weak");
				SetAllBlack();
			}
			else
			{
				mSolution.setText("");											//clear the solution text

				for (i = 0; i < max; i++) {
					for (j = 0; j < 28; j++) {
						antibody.SetValue(j, mText[j][i].getText());			//The values need to be set for every cell
					}

					if (!mCheck[i].isChecked()) {								//Can use this row to cross out
						for (j = 0; j < 28; j++) {
							CrossOut(j, mText[j][i], i);
						}
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
							// TODO: Send race radio button
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
		else if (mReset.equals(v)) {
			SetAllBlack();
			for (i = 0; i < max; i++)
				mCheck[i].setChecked(false);
			mSolution.setText("");
		}
	}

	/**
	 * Set the color of every antibody to black
	 */
	private final void SetAllBlack() {
		int	i,
			j;

		for (j = 0; j < 28; j++) {
			for (i = 0; i < max; i++) {
				mText[j][i].setTextColor(getResources().getColor(R.color.black));
			}
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
	private final void CrossOut(int index, TextView Antibody1, int cell)
	{
		Value	result;
		
		result =	antibody.IsPositive(index);
		if (result == Value.Positive) {
			Antibody1.setTextColor(getResources().getColor(R.color.red));
			if (antibody.CrossOut(index)) {
				Log.d("Antibody", "Using " + (cell + 1) + " to cross out " + antibody.GetName(index));
			}
		} else if (result == Value.Negative) {
			Antibody1.setTextColor(getResources().getColor(R.color.black));
		}
	}

	/**
	 * If the Reaction of the cell is positive, get solutions
	 * 
	 * @param index
	 */
	private final void UseToGetSolutions(int index)
	{
		int	i;

		if (mCheck[index].isChecked())	//if the result is positive
		{
			Log.d("Antibody", "Using " + (index + 1) + " to get solutions");
			for (i = 0; i < 28; i++)
				GetSolution(i, mText[i][index]);
		}
	}

	/**
	 * Add this antibody to the solution if it's positive
	 * 
	 * @param index
	 * @param antibody1
	 */
	private final void GetSolution(int index, TextView antibody1)
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
