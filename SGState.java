//------------------------------------------------------------------------------------------------
//
//   SG Craft - Stargate state
//
//------------------------------------------------------------------------------------------------

package sgextensions;

public enum SGState
{
	Idle, Dialling, Transient, Connected, Disconnecting, InterDialling;

	static SGState[] VALUES = values();

	public static SGState valueOf(int i)
	{
		try
		{
			return VALUES[i];
		}
		catch (IndexOutOfBoundsException e)
		{
			return Idle;
		}
	}

}
