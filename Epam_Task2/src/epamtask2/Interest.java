package epamtask2;
import java.lang.Math;

public class Interest {
	double simpleInterest(int pamount,double rate,int time) {
		return pamount*time*rate;
	}
	double compoundInterest(int pamount,double rate,int noofcmp_period,int time) {
		return pamount*(Math.pow((1+(rate/noofcmp_period)),(noofcmp_period*time))-1);
	}
}
