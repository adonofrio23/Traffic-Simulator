package HWWeek9;

public class MetricGUI extends GUI
{
	public double getSpeed(Vehicle v)
	{
		return((v.getCurrentSpeed()) * (Constants.MpsToKph));
	}

	public void setSpeedLimit(Vehicle v, double s) 
	{ 
		v.setDesiredSpeed(s/(Constants.MpsToKph));
	}

	public Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg)
	{
		return new Road (name, locX/Constants.MetersToKm, locY/Constants.MetersToKm, len/Constants.MetersToKm, hdg);
	}
}