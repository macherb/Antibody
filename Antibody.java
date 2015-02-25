package com.example.antibodyidentification;

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
		String	result =	"";

		if      (solutions > 0)
			result =	", ";
		else if (index2 < max)
			result =	(most - index2) + ": ";

		if (index1 < max)
			result +=	name[index1] + "(" + race[index1][0] + ", " + race[index1][1] + ")";//display the percentages for race
		
		return	result;
	}

	/**
	 * @param index
	 * @return The number of times this antibody is a solution
	 */
	public int GetCount(int index)
	{
		if (index < max)
			return	count[index];
		else
			return	0;
	}
	public void IncrementCount(int index)
	{
		if (index < max)
			count[index]++;
	}
	/**
	 * This antibody will not be considered a solution
	 * 
	 * @param index
	 */
	public void CrossOut(int index)
	{
		if (index < max)
			count[index] =	255;
	}
	public boolean NotCrossedOut(int index)
	{
		if (index < max)
			return	count[index] < 255;
		else
			return	false;
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
		if (index < max)
			if (count[index] > most)
				most =	count[index];
	}

	public String GetName(int index)
	{
		if (index < max)
			return	name[index];
		else
			return	"";
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
