package HWWeek9;

import java.io.IOException;

public class Program {
	public static void main(String[ ] args) throws IOException {
		GUI simInput;
        Map map = Map.JsonMapLoad("/Users/Anthony/Documents/Fordham/Fordham_2021-2022/Spring_2022/Object_Software_Design/TrafficSim/src/main/java/HWWeek9/map.json");
        IPrintDriver cp = new ConsolePrint();

        simInput = new MetricGUI();
/*
        Road Uptown = simInput.CreateRoad("Uptown", 0.0, -0.09, .180, Road.Heading.North);
        map.AddRoad(Uptown);
        Road Crosstown = simInput.CreateRoad("Crosstown", -0.09, 0.0, .180, Road.Heading.East);
        map.AddRoad(Crosstown); */

        CharMatrix cm = new CharMatrix();
        map.Print(cp, cm);
        map.JsonMapSave("/Users/Anthony/Documents/Fordham/Fordham_2021-2022/Spring_2022/Object_Software_Design/TrafficSim/src/main/java/HWWeek9/mapOutput.json");
        for (int i = 0; i < Constants.CharMapSize; i++) {
            String s = new String(cm.map[i]);
                System.out.println(s);
        }

	/*
		HWWeek9.GUI gui;
		gui = null;
		char speedUnit = ' ';
		double speedLimit = 0;
		String units = "";
		Scanner input = new Scanner(System.in);

		while (speedUnit != 'M' && speedUnit != 'm' && speedUnit != 'I' && speedUnit != 'i')
		{
        	System.out.print("Enter 'M' for metric or 'I' for Imperial: ");
        	speedUnit = input.next().charAt(0);
        	if(speedUnit == 'M' || speedUnit == 'm') 
			{
				gui = new MetricGUI();
				units = "kph";
        	} else if(speedUnit =='I' || speedUnit == 'i') 
        	{
        		gui = new HWWeek9.ImperialGUI();
        		units = "mph";	
        	} else 
            	System.out.println("Invalid input! Must enter 'I' or 'M'");  	
		}

		boolean validSpeedLimit = false;
		while (validSpeedLimit == false)
		{
			System.out.print("Enter speed limit: ");
        	speedLimit = input.nextDouble();
        	if (speedLimit < 0)
        		System.out.println("Invalid speed limit! Must be > 0.");
        	else
        		validSpeedLimit = true;
        }

        HWWeek9.Car car = new HWWeek9.Car();
		gui.setSpeedLimit(car, speedLimit);

		HWWeek9.Truck truck1 = new HWWeek9.Truck(4);
		gui.setSpeedLimit(truck1, speedLimit);
		
		HWWeek9.Truck truck2 = new HWWeek9.Truck(8);
		gui.setSpeedLimit(truck2, speedLimit);

		List<HWWeek9.Vehicle> vehicles = new ArrayList<HWWeek9.Vehicle>();
		vehicles.add(car);
		vehicles.add(truck1);
		vehicles.add(truck2); 

		for (int i = 0; i < 11; i++) 
		{
			for (HWWeek9.Vehicle v : vehicles)
			{
				v.updateSpeed(1);
				String s = v.getClass().toString();
				System.out.println(s + " speed:" + String.format(" %.2f", gui.getSpeed(v)) + " " + units);
			}
        } */
    }

    public double GetSpeed(Vehicle v)
    {
        return v.getCurrentSpeed() * Constants.MpsToMph;
    }

    public void SetSpeedLimit(Vehicle v, double speed)
    {
        v.setDesiredSpeed(speed/Constants.MpsToMph);
    }
}
