package com.vogella.maven.quickstart1;

public class Cost 
{
	//Yesu Prabhu and Mary Matha and Joseph
		public double cost(double standard,double area)
		{
			double a=area;
			if(standard==1)
			{
				a=a*1200;
			}
			else if(standard==2)
			{
				a=a*1500;
			}
			else if(standard==3)
			{
				a=a*1800;
			}
			else if(standard==4)
			{
				a=a*2500;
			}
			return a;
		}
}
