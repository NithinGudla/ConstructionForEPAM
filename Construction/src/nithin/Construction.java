package nithin;

public class Construction {
	
	public double calculateCost(int typeOfStandard, double totalAreaInFeets, boolean isAutomated) {
		
	/*
	 	Possible inputs for typeOfStandard are :
	 		1	- 	standard
	 		2	-	above standard
	 		3	-	high standard
	*/
		int costPerFeet=0;
		if(typeOfStandard==1)
			costPerFeet=1200;
		else
		if(typeOfStandard==2)
			costPerFeet=1500;
		else
		if(typeOfStandard==3)
			if(isAutomated)
				costPerFeet=2500;
			else
				costPerFeet=1800;
		
		return totalAreaInFeets * costPerFeet;
		
		
			
	}

}
