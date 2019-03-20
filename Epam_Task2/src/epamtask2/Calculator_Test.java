package epamtask2;

public class Calculator_Test {
	Calculator_Test(){
		Calculator cal=new Calculator();
		assert cal.addition(5, 3)==8.0:"Wrong Results for Addition";
		assert cal.multiplication(5, 3)==15.0:"Wrong Results for Multiplication";
		assert cal.division(15, 3)==5.0:"Wrong Results for Division";
	}
}
