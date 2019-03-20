package epamtask2;

public class HouseConstructionCost {
	double cost(String material_standard,double total_area,String fah) {
		if(material_standard.equalsIgnoreCase("standard")) {
			return 1200*total_area;
		}
		else if(material_standard.equalsIgnoreCase("above standard")) {
			return 1500*total_area;
		}
		else if(material_standard.equalsIgnoreCase("high standard")) {
			return 1800*total_area;
		}
		else if(material_standard.equalsIgnoreCase("high standard") && fah.equalsIgnoreCase("fully automated home")) {
			return 2500*total_area;
		}
		return 0;
	}
}
