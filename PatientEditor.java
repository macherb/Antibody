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

	private static final String[]	PROJECTION =
									new String[] {
													"_id", // 0
													"title", // 1
													"reactions", // 2
												};
	// TODO: Add race

	private static final int		STATE_EDIT =		0;
    private static final int		STATE_INSERT =		1;

    private int						mState;
	private Uri						mUri;
	@Nullable private Cursor		mCursor;

	private Antibody_Super			antibody;

	private TextView				mText[][],

									mSolution;

	private CheckBox				mCheck[];

	private Button					mCalculate,
									mReset;

	private final int				max =	10;

	@SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		int	i;

		super.onCreate(savedInstanceState);

		final Intent intent = getIntent();

		final String action = intent.getAction();

		if (Intent.ACTION_EDIT.equals(action)) {
			mState = STATE_EDIT;
			mUri = intent.getData();
		} else if (Intent.ACTION_INSERT.equals(action)) {
			mState = STATE_INSERT;
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

		mSolution =		(TextView	)findViewById(R.id.textSolution		);

		mCalculate =	(Button		)findViewById(R.id.buttonCalculate	);
        mCalculate.setOnClickListener(this);
		mReset =		(Button		)findViewById(R.id.buttonReset		);
        mReset.setOnClickListener(this);

        antibody =		new Antibody_Super();

        mText =			new TextView[Antibody_Super.max][];
        for (i = 0; i < Antibody_Super.max; i++)
        	mText[i] =		new TextView[max];

		mText[0][0] =	(TextView	)findViewById(R.id.textD1			);
		mText[0][1] =	(TextView	)findViewById(R.id.textD2			);
		mText[0][2] =	(TextView	)findViewById(R.id.textD3			);
		mText[0][3] =	(TextView	)findViewById(R.id.textD4			);
		mText[0][4] =	(TextView	)findViewById(R.id.textD5			);
		mText[0][5] =	(TextView	)findViewById(R.id.textD6			);
		mText[0][6] =	(TextView	)findViewById(R.id.textD7			);
		mText[0][7] =	(TextView	)findViewById(R.id.textD8			);
		mText[0][8] =	(TextView	)findViewById(R.id.textD9			);
		mText[0][9] =	(TextView	)findViewById(R.id.textD10			);

		mText[1][0] =	(TextView	)findViewById(R.id.textBigC1		);
        mText[1][1] =	(TextView	)findViewById(R.id.textBigC2		);
        mText[1][2] =	(TextView	)findViewById(R.id.textBigC3		);
        mText[1][3] =	(TextView	)findViewById(R.id.textBigC4		);
        mText[1][4] =	(TextView	)findViewById(R.id.textBigC5		);
        mText[1][5] =	(TextView	)findViewById(R.id.textBigC6		);
        mText[1][6] =	(TextView	)findViewById(R.id.textBigC7		);
        mText[1][7] =	(TextView	)findViewById(R.id.textBigC8		);
        mText[1][8] =	(TextView	)findViewById(R.id.textBigC9		);
        mText[1][9] =	(TextView	)findViewById(R.id.textBigC10		);

        mText[2][0] =	(TextView	)findViewById(R.id.textBigE1		);
		mText[2][1] =	(TextView	)findViewById(R.id.textBigE2		);
		mText[2][2] =	(TextView	)findViewById(R.id.textBigE3		);
		mText[2][3] =	(TextView	)findViewById(R.id.textBigE4		);
		mText[2][4] =	(TextView	)findViewById(R.id.textBigE5		);
		mText[2][5] =	(TextView	)findViewById(R.id.textBigE6		);
		mText[2][6] =	(TextView	)findViewById(R.id.textBigE7		);
		mText[2][7] =	(TextView	)findViewById(R.id.textBigE8		);
		mText[2][8] =	(TextView	)findViewById(R.id.textBigE9		);
		mText[2][9] =	(TextView	)findViewById(R.id.textBigE10		);

		mText[3][0] =	(TextView	)findViewById(R.id.textLittleC1		);
		mText[3][1] =	(TextView	)findViewById(R.id.textLittleC2		);
		mText[3][2] =	(TextView	)findViewById(R.id.textLittleC3		);
		mText[3][3] =	(TextView	)findViewById(R.id.textLittleC4		);
		mText[3][4] =	(TextView	)findViewById(R.id.textLittleC5		);
		mText[3][5] =	(TextView	)findViewById(R.id.textLittleC6		);
		mText[3][6] =	(TextView	)findViewById(R.id.textLittleC7		);
		mText[3][7] =	(TextView	)findViewById(R.id.textLittleC8		);
		mText[3][8] =	(TextView	)findViewById(R.id.textLittleC9		);
		mText[3][9] =	(TextView	)findViewById(R.id.textLittleC10	);

		mText[4][0] =	(TextView	)findViewById(R.id.textLittleE1		);
		mText[4][1] =	(TextView	)findViewById(R.id.textLittleE2		);
		mText[4][2] =	(TextView	)findViewById(R.id.textLittleE3		);
		mText[4][3] =	(TextView	)findViewById(R.id.textLittleE4		);
		mText[4][4] =	(TextView	)findViewById(R.id.textLittleE5		);
		mText[4][5] =	(TextView	)findViewById(R.id.textLittleE6		);
		mText[4][6] =	(TextView	)findViewById(R.id.textLittleE7		);
		mText[4][7] =	(TextView	)findViewById(R.id.textLittleE8		);
		mText[4][8] =	(TextView	)findViewById(R.id.textLittleE9		);
		mText[4][9] =	(TextView	)findViewById(R.id.textLittleE10	);

		mText[5][0] =	(TextView	)findViewById(R.id.textF1			);
        mText[5][1] =	(TextView	)findViewById(R.id.textF2			);
        mText[5][2] =	(TextView	)findViewById(R.id.textF3			);
        mText[5][3] =	(TextView	)findViewById(R.id.textF4			);
        mText[5][4] =	(TextView	)findViewById(R.id.textF5			);
        mText[5][5] =	(TextView	)findViewById(R.id.textF6			);
        mText[5][6] =	(TextView	)findViewById(R.id.textF7			);
        mText[5][7] =	(TextView	)findViewById(R.id.textF8			);
        mText[5][8] =	(TextView	)findViewById(R.id.textF9			);
        mText[5][9] =	(TextView	)findViewById(R.id.textF10			);

        mText[6][0] =	(TextView	)findViewById(R.id.textCW1			);
        mText[6][1] =	(TextView	)findViewById(R.id.textCW2			);
        mText[6][2] =	(TextView	)findViewById(R.id.textCW3			);
        mText[6][3] =	(TextView	)findViewById(R.id.textCW4			);
        mText[6][4] =	(TextView	)findViewById(R.id.textCW5			);
        mText[6][5] =	(TextView	)findViewById(R.id.textCW6			);
        mText[6][6] =	(TextView	)findViewById(R.id.textCW7			);
        mText[6][7] =	(TextView	)findViewById(R.id.textCW8			);
        mText[6][8] =	(TextView	)findViewById(R.id.textCW9			);
        mText[6][9] =	(TextView	)findViewById(R.id.textCW10			);

        mText[7][0] =	(TextView	)findViewById(R.id.textV1			);
        mText[7][1] =	(TextView	)findViewById(R.id.textV2			);
        mText[7][2] =	(TextView	)findViewById(R.id.textV3			);
        mText[7][3] =	(TextView	)findViewById(R.id.textV4			);
        mText[7][4] =	(TextView	)findViewById(R.id.textV5			);
        mText[7][5] =	(TextView	)findViewById(R.id.textV6			);
        mText[7][6] =	(TextView	)findViewById(R.id.textV7			);
        mText[7][7] =	(TextView	)findViewById(R.id.textV8			);
        mText[7][8] =	(TextView	)findViewById(R.id.textV9			);
        mText[7][9] =	(TextView	)findViewById(R.id.textV10			);

        mText[8][0] =	(TextView	)findViewById(R.id.textBigK1		);
        mText[8][1] =	(TextView	)findViewById(R.id.textBigK2		);
        mText[8][2] =	(TextView	)findViewById(R.id.textBigK3		);
        mText[8][3] =	(TextView	)findViewById(R.id.textBigK4		);
        mText[8][4] =	(TextView	)findViewById(R.id.textBigK5		);
        mText[8][5] =	(TextView	)findViewById(R.id.textBigK6		);
        mText[8][6] =	(TextView	)findViewById(R.id.textBigK7		);
        mText[8][7] =	(TextView	)findViewById(R.id.textBigK8		);
        mText[8][8] =	(TextView	)findViewById(R.id.textBigK9		);
        mText[8][9] =	(TextView	)findViewById(R.id.textBigK10		);

        mText[9][0] =	(TextView	)findViewById(R.id.textLittleK1		);
        mText[9][1] =	(TextView	)findViewById(R.id.textLittleK2		);
        mText[9][2] =	(TextView	)findViewById(R.id.textLittleK3		);
        mText[9][3] =	(TextView	)findViewById(R.id.textLittleK4		);
        mText[9][4] =	(TextView	)findViewById(R.id.textLittleK5		);
        mText[9][5] =	(TextView	)findViewById(R.id.textLittleK6		);
        mText[9][6] =	(TextView	)findViewById(R.id.textLittleK7		);
        mText[9][7] =	(TextView	)findViewById(R.id.textLittleK8		);
        mText[9][8] =	(TextView	)findViewById(R.id.textLittleK9		);
        mText[9][9] =	(TextView	)findViewById(R.id.textLittleK10	);

        mText[10][0] =	(TextView	)findViewById(R.id.textKPA1			);
        mText[10][1] =	(TextView	)findViewById(R.id.textKPA2			);
        mText[10][2] =	(TextView	)findViewById(R.id.textKPA3			);
        mText[10][3] =	(TextView	)findViewById(R.id.textKPA4			);
        mText[10][4] =	(TextView	)findViewById(R.id.textKPA5			);
        mText[10][5] =	(TextView	)findViewById(R.id.textKPA6			);
        mText[10][6] =	(TextView	)findViewById(R.id.textKPA7			);
        mText[10][7] =	(TextView	)findViewById(R.id.textKPA8			);
        mText[10][8] =	(TextView	)findViewById(R.id.textKPA9			);
        mText[10][9] =	(TextView	)findViewById(R.id.textKPA10		);

        mText[11][0] =	(TextView	)findViewById(R.id.textKPB1			);
        mText[11][1] =	(TextView	)findViewById(R.id.textKPB2			);
        mText[11][2] =	(TextView	)findViewById(R.id.textKPB3			);
        mText[11][3] =	(TextView	)findViewById(R.id.textKPB4			);
        mText[11][4] =	(TextView	)findViewById(R.id.textKPB5			);
        mText[11][5] =	(TextView	)findViewById(R.id.textKPB6			);
        mText[11][6] =	(TextView	)findViewById(R.id.textKPB7			);
        mText[11][7] =	(TextView	)findViewById(R.id.textKPB8			);
        mText[11][8] =	(TextView	)findViewById(R.id.textKPB9			);
        mText[11][9] =	(TextView	)findViewById(R.id.textKPB10		);

        mText[12][0] =	(TextView	)findViewById(R.id.textJSA1			);
        mText[12][1] =	(TextView	)findViewById(R.id.textJSA2			);
        mText[12][2] =	(TextView	)findViewById(R.id.textJSA3			);
        mText[12][3] =	(TextView	)findViewById(R.id.textJSA4			);
        mText[12][4] =	(TextView	)findViewById(R.id.textJSA5			);
        mText[12][5] =	(TextView	)findViewById(R.id.textJSA6			);
        mText[12][6] =	(TextView	)findViewById(R.id.textJSA7			);
        mText[12][7] =	(TextView	)findViewById(R.id.textJSA8			);
        mText[12][8] =	(TextView	)findViewById(R.id.textJSA9			);
        mText[12][9] =	(TextView	)findViewById(R.id.textJSA10		);

        mText[13][0] =	(TextView	)findViewById(R.id.textJSB1			);
        mText[13][1] =	(TextView	)findViewById(R.id.textJSB2			);
        mText[13][2] =	(TextView	)findViewById(R.id.textJSB3			);
        mText[13][3] =	(TextView	)findViewById(R.id.textJSB4			);
        mText[13][4] =	(TextView	)findViewById(R.id.textJSB5			);
        mText[13][5] =	(TextView	)findViewById(R.id.textJSB6			);
        mText[13][6] =	(TextView	)findViewById(R.id.textJSB7			);
        mText[13][7] =	(TextView	)findViewById(R.id.textJSB8			);
        mText[13][8] =	(TextView	)findViewById(R.id.textJSB8			);
        mText[13][9] =	(TextView	)findViewById(R.id.textJSB10		);

        mText[14][0] =	(TextView	)findViewById(R.id.textFYA1			);
        mText[14][1] =	(TextView	)findViewById(R.id.textFYA2			);
        mText[14][2] =	(TextView	)findViewById(R.id.textFYA3			);
        mText[14][3] =	(TextView	)findViewById(R.id.textFYA4			);
        mText[14][4] =	(TextView	)findViewById(R.id.textFYA5			);
        mText[14][5] =	(TextView	)findViewById(R.id.textFYA6			);
        mText[14][6] =	(TextView	)findViewById(R.id.textFYA7			);
        mText[14][7] =	(TextView	)findViewById(R.id.textFYA8			);
        mText[14][8] =	(TextView	)findViewById(R.id.textFYA9			);
        mText[14][9] =	(TextView	)findViewById(R.id.textFYA10		);

        mText[15][0] =	(TextView	)findViewById(R.id.textFYB1			);
        mText[15][1] =	(TextView	)findViewById(R.id.textFYB2			);
        mText[15][2] =	(TextView	)findViewById(R.id.textFYB3			);
        mText[15][3] =	(TextView	)findViewById(R.id.textFYB4			);
        mText[15][4] =	(TextView	)findViewById(R.id.textFYB5			);
        mText[15][5] =	(TextView	)findViewById(R.id.textFYB6			);
        mText[15][6] =	(TextView	)findViewById(R.id.textFYB7			);
        mText[15][7] =	(TextView	)findViewById(R.id.textFYB8			);
        mText[15][8] =	(TextView	)findViewById(R.id.textFYB9			);
        mText[15][9] =	(TextView	)findViewById(R.id.textFYB10		);

        mText[16][0] =	(TextView	)findViewById(R.id.textJKA1			);
        mText[16][1] =	(TextView	)findViewById(R.id.textJKA2			);
        mText[16][2] =	(TextView	)findViewById(R.id.textJKA3			);
        mText[16][3] =	(TextView	)findViewById(R.id.textJKA4			);
        mText[16][4] =	(TextView	)findViewById(R.id.textJKA5			);
        mText[16][5] =	(TextView	)findViewById(R.id.textJKA6			);
        mText[16][6] =	(TextView	)findViewById(R.id.textJKA7			);
        mText[16][7] =	(TextView	)findViewById(R.id.textJKA8			);
        mText[16][8] =	(TextView	)findViewById(R.id.textJKA9			);
        mText[16][9] =	(TextView	)findViewById(R.id.textJKA10		);

        mText[17][0] =	(TextView	)findViewById(R.id.textJKB1			);
        mText[17][1] =	(TextView	)findViewById(R.id.textJKB2			);
        mText[17][2] =	(TextView	)findViewById(R.id.textJKB3			);
        mText[17][3] =	(TextView	)findViewById(R.id.textJKB4			);
        mText[17][4] =	(TextView	)findViewById(R.id.textJKB5			);
        mText[17][5] =	(TextView	)findViewById(R.id.textJKB6			);
        mText[17][6] =	(TextView	)findViewById(R.id.textJKB7			);
        mText[17][7] =	(TextView	)findViewById(R.id.textJKB8			);
        mText[17][8] =	(TextView	)findViewById(R.id.textJKB9			);
        mText[17][9] =	(TextView	)findViewById(R.id.textJKB10		);

        mText[18][0] =	(TextView	)findViewById(R.id.textXGA1			);
        mText[18][1] =	(TextView	)findViewById(R.id.textXGA2			);
        mText[18][2] =	(TextView	)findViewById(R.id.textXGA3			);
        mText[18][3] =	(TextView	)findViewById(R.id.textXGA4			);
        mText[18][4] =	(TextView	)findViewById(R.id.textXGA5			);
        mText[18][5] =	(TextView	)findViewById(R.id.textXGA6			);
        mText[18][6] =	(TextView	)findViewById(R.id.textXGA7			);
        mText[18][7] =	(TextView	)findViewById(R.id.textXGA8			);
        mText[18][8] =	(TextView	)findViewById(R.id.textXGA9			);
        mText[18][9] =	(TextView	)findViewById(R.id.textXGA10		);

        mText[19][0] =	(TextView	)findViewById(R.id.textLEA1			);
        mText[19][1] =	(TextView	)findViewById(R.id.textLEA2			);
        mText[19][2] =	(TextView	)findViewById(R.id.textLEA3			);
        mText[19][3] =	(TextView	)findViewById(R.id.textLEA4			);
        mText[19][4] =	(TextView	)findViewById(R.id.textLEA5			);
        mText[19][5] =	(TextView	)findViewById(R.id.textLEA6			);
        mText[19][6] =	(TextView	)findViewById(R.id.textLEA7			);
        mText[19][7] =	(TextView	)findViewById(R.id.textLEA8			);
        mText[19][8] =	(TextView	)findViewById(R.id.textLEA9			);
        mText[19][9] =	(TextView	)findViewById(R.id.textLEA10		);

        mText[20][0] =	(TextView	)findViewById(R.id.textLEB1			);
        mText[20][1] =	(TextView	)findViewById(R.id.textLEB2			);
        mText[20][2] =	(TextView	)findViewById(R.id.textLEB3			);
        mText[20][3] =	(TextView	)findViewById(R.id.textLEB4			);
        mText[20][4] =	(TextView	)findViewById(R.id.textLEB5			);
        mText[20][5] =	(TextView	)findViewById(R.id.textLEB6			);
        mText[20][6] =	(TextView	)findViewById(R.id.textLEB7			);
        mText[20][7] =	(TextView	)findViewById(R.id.textLEB8			);
        mText[20][8] =	(TextView	)findViewById(R.id.textLEB9			);
        mText[20][9] =	(TextView	)findViewById(R.id.textLEB10		);

        mText[21][0] =	(TextView	)findViewById(R.id.textBigS1		);
        mText[21][1] =	(TextView	)findViewById(R.id.textBigS2		);
        mText[21][2] =	(TextView	)findViewById(R.id.textBigS3		);
        mText[21][3] =	(TextView	)findViewById(R.id.textBigS4		);
        mText[21][4] =	(TextView	)findViewById(R.id.textBigS5		);
        mText[21][5] =	(TextView	)findViewById(R.id.textBigS6		);
        mText[21][6] =	(TextView	)findViewById(R.id.textBigS7		);
        mText[21][7] =	(TextView	)findViewById(R.id.textBigS8		);
        mText[21][8] =	(TextView	)findViewById(R.id.textBigS9		);
        mText[21][9] =	(TextView	)findViewById(R.id.textBigS10		);

        mText[22][0] =	(TextView	)findViewById(R.id.textLittleS1		);
        mText[22][1] =	(TextView	)findViewById(R.id.textLittleS2		);
        mText[22][2] =	(TextView	)findViewById(R.id.textLittleS3		);
        mText[22][3] =	(TextView	)findViewById(R.id.textLittleS4		);
        mText[22][4] =	(TextView	)findViewById(R.id.textLittleS5		);
        mText[22][5] =	(TextView	)findViewById(R.id.textLittleS6		);
        mText[22][6] =	(TextView	)findViewById(R.id.textLittleS7		);
        mText[22][7] =	(TextView	)findViewById(R.id.textLittleS8		);
        mText[22][8] =	(TextView	)findViewById(R.id.textLittleS9		);
        mText[22][9] =	(TextView	)findViewById(R.id.textLittleS10	);

        mText[23][0] =	(TextView	)findViewById(R.id.textM1			);
        mText[23][1] =	(TextView	)findViewById(R.id.textM2			);
        mText[23][2] =	(TextView	)findViewById(R.id.textM3			);
        mText[23][3] =	(TextView	)findViewById(R.id.textM4			);
        mText[23][4] =	(TextView	)findViewById(R.id.textM5			);
        mText[23][5] =	(TextView	)findViewById(R.id.textM6			);
        mText[23][6] =	(TextView	)findViewById(R.id.textM7			);
        mText[23][7] =	(TextView	)findViewById(R.id.textM8			);
        mText[23][8] =	(TextView	)findViewById(R.id.textM9			);
        mText[23][9] =	(TextView	)findViewById(R.id.textM10			);

        mText[24][0] =	(TextView	)findViewById(R.id.textN1			);
        mText[24][1] =	(TextView	)findViewById(R.id.textN2			);
        mText[24][2] =	(TextView	)findViewById(R.id.textN3			);
        mText[24][3] =	(TextView	)findViewById(R.id.textN4			);
        mText[24][4] =	(TextView	)findViewById(R.id.textN5			);
        mText[24][5] =	(TextView	)findViewById(R.id.textN6			);
        mText[24][6] =	(TextView	)findViewById(R.id.textN7			);
        mText[24][7] =	(TextView	)findViewById(R.id.textN8			);
        mText[24][8] =	(TextView	)findViewById(R.id.textN9			);
        mText[24][9] =	(TextView	)findViewById(R.id.textN10			);

        mText[25][0] =	(TextView	)findViewById(R.id.textP1_1			);
        mText[25][1] =	(TextView	)findViewById(R.id.textP1_2			);
        mText[25][2] =	(TextView	)findViewById(R.id.textP1_3			);
        mText[25][3] =	(TextView	)findViewById(R.id.textP1_4			);
        mText[25][4] =	(TextView	)findViewById(R.id.textP1_5			);
        mText[25][5] =	(TextView	)findViewById(R.id.textP1_6			);
        mText[25][6] =	(TextView	)findViewById(R.id.textP1_7			);
        mText[25][7] =	(TextView	)findViewById(R.id.textP1_8			);
        mText[25][8] =	(TextView	)findViewById(R.id.textP1_9			);
        mText[25][9] =	(TextView	)findViewById(R.id.textP1_10		);

        mText[26][0] =	(TextView	)findViewById(R.id.textLUA1			);
        mText[26][1] =	(TextView	)findViewById(R.id.textLUA2			);
        mText[26][2] =	(TextView	)findViewById(R.id.textLUA3			);
        mText[26][3] =	(TextView	)findViewById(R.id.textLUA4			);
        mText[26][4] =	(TextView	)findViewById(R.id.textLUA5			);
        mText[26][5] =	(TextView	)findViewById(R.id.textLUA6			);
        mText[26][6] =	(TextView	)findViewById(R.id.textLUA7			);
        mText[26][7] =	(TextView	)findViewById(R.id.textLUA8			);
        mText[26][8] =	(TextView	)findViewById(R.id.textLUA9			);
        mText[26][9] =	(TextView	)findViewById(R.id.textLUA10		);

        mText[27][0] =	(TextView	)findViewById(R.id.textLUB1			);
        mText[27][1] =	(TextView	)findViewById(R.id.textLUB2			);
        mText[27][2] =	(TextView	)findViewById(R.id.textLUB3			);
        mText[27][3] =	(TextView	)findViewById(R.id.textLUB4			);
        mText[27][4] =	(TextView	)findViewById(R.id.textLUB5			);
        mText[27][5] =	(TextView	)findViewById(R.id.textLUB6			);
        mText[27][6] =	(TextView	)findViewById(R.id.textLUB7			);
        mText[27][7] =	(TextView	)findViewById(R.id.textLUB8			);
        mText[27][8] =	(TextView	)findViewById(R.id.textLUB9			);
        mText[27][9] =	(TextView	)findViewById(R.id.textLUB10		);

        mCheck =		new CheckBox[max];
        mCheck[0] =		(CheckBox	)findViewById(R.id.check1			);
        mCheck[1] =		(CheckBox	)findViewById(R.id.check2			);
        mCheck[2] =		(CheckBox	)findViewById(R.id.check3			);
        mCheck[3] =		(CheckBox	)findViewById(R.id.check4			);
        mCheck[4] =		(CheckBox	)findViewById(R.id.check5			);
        mCheck[5] =		(CheckBox	)findViewById(R.id.check6			);
        mCheck[6] =		(CheckBox	)findViewById(R.id.check7			);
        mCheck[7] =		(CheckBox	)findViewById(R.id.check8			);
        mCheck[8] =		(CheckBox	)findViewById(R.id.check9			);
        mCheck[9] =		(CheckBox	)findViewById(R.id.check10			);
	}

	@SuppressWarnings("deprecation")
	@Override
    protected void onResume() {
		super.onResume();

		int	i;

		if (mCursor != null) {
			mCursor.requery();
			mCursor.moveToFirst();
			if (mState == STATE_EDIT) {
				int colTitleIndex = mCursor.getColumnIndex("title");
				String title = mCursor.getString(colTitleIndex);
				Resources res = getResources();
                String text = String.format(res.getString(R.string.title_edit), title);
                setTitle(text);
			} else if (mState == STATE_INSERT) {
				setTitle(getText(R.string.title_create));
        	}
			int colReactionsIndex =	mCursor.getColumnIndex("reactions");
			String reactions =		mCursor.getString(colReactionsIndex);
			// TODO: Add race radio buttons
			for (i = 0; i < max; i++)
				mCheck[i].setChecked(reactions.charAt(i) == '1');
		}
	}

	@Override
    protected void onPause() {
		super.onPause();

		if (mCursor != null) {
			if (mState == STATE_EDIT) {
				updatePatient();
			} else if (mState == STATE_INSERT) {
				updatePatient();
				mState = STATE_EDIT;
			}
		}
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
		switch (item.getItemId()) {
        	case R.id.menu_save:
        		updatePatient();
                finish();
                break;
            case R.id.menu_delete:
                if (mCursor != null) {
                    mCursor.close();
                    mCursor = null;
                    getContentResolver().delete(mUri, null, null);
                }
        		finish();
            	break;
		}

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

			if      ( mCheck[0].isChecked() &&  mCheck[1].isChecked() &&  mCheck[2].isChecked() &&  mCheck[3].isChecked() &&  mCheck[4].isChecked() &&
					  mCheck[5].isChecked() &&  mCheck[6].isChecked() &&  mCheck[7].isChecked() &&  mCheck[8].isChecked() &&  mCheck[9].isChecked()	)
			{
				mSolution.setText("Inconclusive");
				SetAllBlack();
			}
			else if (!mCheck[0].isChecked() && !mCheck[1].isChecked() && !mCheck[2].isChecked() && !mCheck[3].isChecked() && !mCheck[4].isChecked() &&
					 !mCheck[5].isChecked() && !mCheck[6].isChecked() && !mCheck[7].isChecked() && !mCheck[8].isChecked() && !mCheck[9].isChecked()	)
			{
				mSolution.setText("Too weak");
				SetAllBlack();
			}
			else
			{
				mSolution.setText("");											//clear the solution text

				for (i = 0; i < max; i++) {
					for (j = 0; j < Antibody_Super.max; j++) {
						antibody.SetValue(j, mText[j][i].getText());			//The values need to be set for every cell
					}

					if (!mCheck[i].isChecked()) {								//Can use this row to cross out
						for (j = 0; j < Antibody_Super.max; j++) {
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

		for (j = 0; j < Antibody_Super.max; j++) {
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
			for (i = 0; i < Antibody_Super.max; i++)
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
