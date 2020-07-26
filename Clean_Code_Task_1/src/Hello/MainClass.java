package Hello;

import java.util.*;
public class MainClass extends InterestClass{
MainClass(double d, double e, double f) {
	super(d, e, f);
}

public static void main(String args[]) 
{
	Scanner v=new Scanner(System.in);
	System.out.println("Enter Your Choice:\n1.Simple_interest\n2.Compound_interest");
	int choice=v.nextInt();
	MainClass obj;
	switch(choice)
	{
	case 1:
		System.out.println("Enter principle , rate_of_interset , time_in_years");
		obj=new MainClass(v.nextDouble(),v.nextDouble(),v.nextDouble());
		obj.Simple_Interest();
		break;
	case 2:
		System.out.println("Enter principle , rate_of_interset , time_in_years");
		 obj=new MainClass(v.nextDouble(),v.nextDouble(),v.nextDouble());
		obj.Compound_Interest();
		break;
	}
	v.close();
	}
}
