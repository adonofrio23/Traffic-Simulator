package HWWeek9;

public class Truck extends Vehicle
{
	// loadWeight is an integer in tons
	private int loadWeight;

	// Constructors
	public Truck(int weight)
	{
		loadWeight = weight;
	}
	
	protected void Accelerate(int secondsDelta)
	{
		if (loadWeight <= 5)
			setCurrentSpeed(getCurrentSpeed() + Constants.AccRateEmpty * secondsDelta);
		else
			setCurrentSpeed(getCurrentSpeed() + Constants.AccRateFull * secondsDelta);
	}
	
	protected void Decelerate(int secondsDelta)
	{
		if (loadWeight <= 5)
			setCurrentSpeed(getCurrentSpeed() + Constants.DecRateEmpty * secondsDelta);
		else
			setCurrentSpeed(getCurrentSpeed() + Constants.DecRateFull * secondsDelta);
	}
	
	// Setter methods
	public void SetLoadWeight(int weight)
	{
		loadWeight = weight;
	}

	// Getter methods
	public int getLoadWeight()
	{
		return loadWeight;
	}
}	