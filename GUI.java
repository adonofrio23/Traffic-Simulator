package HWWeek9;

public abstract class GUI implements ISimInput, ISimOutput
{
	public abstract double getSpeed(Vehicle v);
	public abstract void setSpeedLimit(Vehicle v, double speed);
	public abstract Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg);
}