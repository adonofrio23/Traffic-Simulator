package HWWeek9;

import HWWeek9.DynamicRoadItem;

public abstract class Vehicle extends DynamicRoadItem
{
	// currentSpeed is a decimal in MPH
	private double currentSpeed = 0.0;
	// desriedSpeed is a decimal in MPH
	private double desiredSpeed;
	// currentDirection is a String. Ex: "N", "S", "SW"
	private String currentDirection;
	// currentLocation is a decimal in degrees
	private double currentLocation;

	// Method used to cause the car to speed up
	protected abstract void Accelerate(int secondsDelta);

	// Method used to cause the car to slow down
	protected abstract void Decelerate(int secondsDelta);

	// Method used to turn the car a certain number of degrees in a certain direction
	public void Turn(String direction, double degrees)
	{

	}

	// Constructors
	public Vehicle()
	{


	}
	public Vehicle(double speed, String direction, double location)
	{
		this.currentSpeed = speed;
		this.currentDirection = direction;
		this.currentLocation = location;
	}

	// Setter methods
	public void setDesiredSpeed(double mps)
	{
		desiredSpeed = mps;
	}
	
	protected void setCurrentSpeed(double speed)
	{
		if(currentSpeed <= speed) // accelerating
		{
			if (speed > desiredSpeed)
				currentSpeed = desiredSpeed;
			else
				currentSpeed = speed;
		}
		else // braking
		{
			if (speed < desiredSpeed)
				currentSpeed = desiredSpeed;
			else
				currentSpeed = speed;
		}
	}
	
	public void updateSpeed(int seconds)
	{
		if (currentSpeed > desiredSpeed)
			Decelerate(seconds);
		else if (currentSpeed < desiredSpeed)
			Accelerate(seconds);
	}
	
	public void setCurrentDirection(String direction)
	{
		currentDirection = direction;
	}

	public void setCurrentLocation(double location)
	{
		currentLocation = location;
	}

	// Getter methods
	public double getCurrentSpeed()
	{
		return currentSpeed;
	}

	public String getCurrentDirection()
	{
		return currentDirection;
	}

	public double getCurrentLocation()
	{
		return currentLocation;
	}
}	