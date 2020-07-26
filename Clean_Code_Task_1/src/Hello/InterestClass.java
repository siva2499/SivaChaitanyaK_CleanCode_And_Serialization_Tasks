package Hello;

public class InterestClass {
	double principle;
	double rate_of_interest;
	double time;
InterestClass(double a,double b, double c)
{
	principle=a;
	 rate_of_interest=b;
	 time=c;
}
void Simple_Interest()
{
	double calculation=(principle*rate_of_interest*time)/100;
	System.out.println("Simple_Intrest is :"+calculation);
}
void Compound_Interest()
{
	double calculation=principle * Math.pow(1.0+rate_of_interest/100.0,time) - principle;
	System.out.println("Compound_Intrest is :"+calculation);
}
}
