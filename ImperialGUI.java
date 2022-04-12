package HWWeek9;

public class ImperialGUI extends GUI
{
	public double getSpeed(Vehicle v) 
	{ 
		return ((v.getCurrentSpeed()) * (Constants.MpsToMph)); 
	}

	public void setSpeedLimit(Vehicle v, double s) 
	{ 
		v.setDesiredSpeed(s/(Constants.MpsToMph)); 
	}

	public Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg)
	{
		return new Road(name, locX/Constants.MetersToMiles, locY/Constants.MetersToMiles, len/Constants.MetersToMiles, hdg);
	}
}