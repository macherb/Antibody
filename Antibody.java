package com.example.antibodyidentification;

enum Value {
	Negative,
	Positive,
	Unknown
}

/**
 * Everything to do with the collection of antibodies
 * 
 * @author Bobby Macher
 */
class Antibody_Super {
	/**
	 * The number of antibodies that have this many solutions
	 */
	private				int		solutions;
	
	/**
	 * The most occurrences of an antibody as a solution
	 */
	private				int		most;

	/**
	 * The maximum number of antibodies
	 */
	public static final	int		max =		28;

	private Antibody_Sub		ab		[];

	Antibody_Super()
	{
		ab =		new Antibody_Sub[max];

		ab[ 0] =	new Antibody_Sub("D"	,  15,   8);
		
		ab[ 1] =	new Antibody_Sub("C"	,  32,  73);
		ab[ 2] =	new Antibody_Sub("E"	,  71,  78);
		ab[ 3] =	new Antibody_Sub("c"	,  15,   8);
		ab[ 1].SetPair(ab[ 3]);
		ab[ 3].SetPair(ab[ 1]);
		ab[ 4] =	new Antibody_Sub("e"	,  20,   4);
		ab[ 2].SetPair(ab[ 4]);
		ab[ 4].SetPair(ab[ 2]);
		
		ab[ 5] =	new Antibody_Sub("f"	,   2,   2);
		
		ab[ 6] =	new Antibody_Sub("Cw"	,  35,   8);
		
		ab[ 7] =	new Antibody_Sub("V"	,  98,  99);
		
		ab[ 8] =	new Antibody_Sub("K"	,  99,  70);
		ab[ 9] =	new Antibody_Sub("k"	,  91,  98);
		ab[ 8].SetPair(ab[ 9]);
		ab[ 9].SetPair(ab[ 8]);
		
		ab[10] =	new Antibody_Sub("Kpa"	,   0,   0);
		ab[11] =	new Antibody_Sub("Kpb"	,  98, 100);
		ab[10].SetPair(ab[11]);
		ab[11].SetPair(ab[10]);
		
		ab[12] =	new Antibody_Sub("Jsa"	,   0,   0);
		ab[13] =	new Antibody_Sub("Jsb"	, 100,  80);
		ab[12].SetPair(ab[13]);
		ab[13].SetPair(ab[12]);

		ab[14] =	new Antibody_Sub("Fya"	,   0,   1);
		ab[15] =	new Antibody_Sub("Fyb"	,  34,  90);
		ab[14].SetPair(ab[15]);
		ab[15].SetPair(ab[14]);
		
		ab[16] =	new Antibody_Sub("Jka"	,  17,  77);
		ab[17] =	new Antibody_Sub("Jkb"	,  23,   8);
		ab[16].SetPair(ab[17]);
		ab[17].SetPair(ab[16]);
		
		ab[18] =	new Antibody_Sub("Xga"	,  26,  51);
		
		ab[19] =	new Antibody_Sub("Lea"	,  28,  45);
		ab[20] =	new Antibody_Sub("Leb"	,  45,  69);
		ab[19].SetPair(ab[20]);
		ab[20].SetPair(ab[19]);
		
		ab[21] =	new Antibody_Sub("S"	,  11,   7);
		ab[22] =	new Antibody_Sub("s"	,  22,  26);
		ab[21].SetPair(ab[22]);
		ab[22].SetPair(ab[21]);
		
		ab[23] =	new Antibody_Sub("M"	,  28,  25);
		ab[24] =	new Antibody_Sub("N"	,   0,   1);
		ab[23].SetPair(ab[24]);
		ab[24].SetPair(ab[23]);

		ab[25] =	new Antibody_Sub("P1"	,  21,   6);
		
		ab[26] =	new Antibody_Sub("Lua"	,  92,  95);
		ab[27] =	new Antibody_Sub("Lub"	,   0,   0);
		ab[26].SetPair(ab[27]);
		ab[27].SetPair(ab[26]);
	}

	/**
	 * @param index
	 * 
	 * @return if the value is positive
	 */
	public boolean GetValue(int index) {
		if (index < max)
			return	ab[index].GetValue() == Value.Positive;
		else
			return	false;
	}
	public void SetValue(int index, CharSequence value) {
		if (index < max) {
			if      (value.equals("+"))
				ab[index].SetValue(Value.Positive	);
			else if (value.equals("0"))
				ab[index].SetValue(Value.Negative	);
			else
				ab[index].SetValue(Value.Unknown	);
		}
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
	 * Display the name and percentages for race
	 * 
	 * @param index1 the antibody index
	 * @param index2 the solution index
	 * 
	 * @return the name and race percents
	 */
	public String GetNameRace(int index1, int index2)
	{
		StringBuilder	result =	new StringBuilder();

		if      (solutions > 0)
			result.append(", ");
		else if (index2 < max)
		{
			result.append(most - index2);
			result.append(": ");
		}

		if (index1 < max)
		{
			result.append(ab[index1].GetName());
			result.append("(");
			result.append(ab[index1].GetRace(0));
			result.append(", ");
			result.append(ab[index1].GetRace(1));
			result.append(")");
		}

		return	result.toString();
	}

	/**
	 * @param index
	 * 
	 * @return The number of times this antibody is a solution
	 */
	public int GetCount(int index)
	{
		if (index < max)
			return	ab[index].GetCount();
		else
			return	0;
	}
	public void IncrementCount(int index)
	{
		if (index < max)
			ab[index].IncrementCount();
	}

	/**
	 * @param index
	 * 
	 * @return If this antibody is positive and should be crossed out
	 */
	public Value IsPositive(int index) {
		if (index < max) {
			if (ab[index].GetValue() == Value.Positive) {
				if (ab[index].GetPair() == null)	//if it doesn't have a pair, nothing else matters
					return	Value.Positive;
				else {
					if (ab[index].GetPair().GetValue() == Value.Negative)
						return	Value.Positive;
					else
						return	Value.Negative;
				}
			}
			else
				return	Value.Unknown;
		}
		else
			return	Value.Unknown;
	}
	/**
	 * This antibody will not be considered a solution
	 * 
	 * @param index
	 */
	public boolean CrossOut(int index) {
		if (index < max) {
			if (ab[index].GetCount() < 255) {//if it's not crossed out already
				ab[index].CrossOut();
				return	true;
			} else
				return	false;
		} else
			return	false;
	}
	public boolean NotCrossedOut(int index) {
		if (index < max)
			return	ab[index].GetCount() < 255;
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
		if (index < max) {
			if (ab[index].GetCount() > most)
				most =	ab[index].GetCount();
		}
	}

	public String GetName(int index)
	{
		if (index < max)
			return	ab[index].GetName();
		else
			return	"";
	}

	/**
	 * Resets the {@link #most}, and the {@link Antibody_Sub#count}'s
	 */
	public void Reset()
	{
		int	i;

		most =	0;
		for (i = 0; i < max; i++)
			ab[i].ResetCount();
	}
}

/**
 * Everything to do with the specific antibodies
 * 
 * @author Bobby Macher
 */
class Antibody_Sub {
	private				Value			value;

	/**
	 * The number of times the antibody is a solution
	 */
	private				int				count;

	/**
	 * Percentages for race
	 */
	private				int				race	 [];

	private final		String			name;

	/**
	 * If this antibody has a pair
	 */
	private				Antibody_Sub	pair;

	Antibody_Sub(String name, int race0, int  race1) {
		race =			new int[2];

		value =			Value.Unknown;
		count =			0;
		this.name =		name;
		this.race[0] =	race0;
		this.race[1] =	race1;
		pair =			null;
	}

	public Antibody_Sub GetPair() {
		return	pair;
	}
	public void SetPair(Antibody_Sub pair) {
		this.pair =	pair;
	}

	public Value GetValue() {
		return	value;
	}
	public void SetValue(Value value) {
		this.value =	value;
	}

	public int GetCount() {
		return	count;
	}
	public void ResetCount() {
		count =	0;
	}
	public void IncrementCount() {
		count++;
	}
	public void CrossOut() {
		count =	255;
	}
	
	public String GetName() {
		return	name;
	}

	public int GetRace(int index) {
		return	race[index];
	}
}
