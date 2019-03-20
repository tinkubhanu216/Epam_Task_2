package epamtask2;

public class HouseConstructionCost_Test {
	HouseConstructionCost_Test(){
		HouseConstructionCost hcc=new HouseConstructionCost();
		assert hcc.cost("standard", 100,null) ==120000.0:"Wrong Results for Standard materials";
		assert hcc.cost("above standard", 100,null) ==150000.0:"Wrong Results for Above Standard materials";
		assert hcc.cost("high standard", 100,null) ==180000.0:"Wrong Results for High Standard materials";
		assert hcc.cost("high standard", 100,"fully automated home") ==250000.0:"Wrong Results for High Standard materials and fully automated home";
	}
}
