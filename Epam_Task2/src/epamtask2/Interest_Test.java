package epamtask2;

public class Interest_Test {
	Interest_Test(){
		Interest i=new Interest();
		assert i.simpleInterest(10000, 0.05,3)==1500.0:"Wrong Results for Simple Interest";
		assert i.compoundInterest(10000, 0.1, 2, 10) ==16532.97705144422:"Wrong Results for Compound Interest";	
	}
}