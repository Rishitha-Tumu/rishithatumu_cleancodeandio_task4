package com.vogella.maven.quickstart1;

public class Interest 
{
	//Yesu Prabhu and Mary Matha and Joseph
		public double simpleinterest(double p,double t,double r)
		{
			double si;
			si=(p*t*r)/100.0;
			return si;
		}
		public double compoundinterest(double p,double t,double r)
		{
			double ci;
			ci=p*Math.pow(1.0+r/100.0,t)-p;
			return ci;
		}
}
