package com.vogella.maven.quickstart1;

public class StringClass
{
	public String method(String str)
    {
		//Yesu Prabhu and Mary Matha and Joseph
        StringBuilder builder = new StringBuilder(str);
        if(str=="")
        {
        	return "";
        }
        else if(str.length()==1)
        {
        	if(builder.charAt(0)=='A')
        	{
        		builder.deleteCharAt(0);
        		return "";
        	}
        	else
        	{
        		return builder.toString();
        	}
        }
        if(builder.charAt(0)=='A')
        {
            builder.deleteCharAt(0);
            if(builder.charAt(0)=='A')
            {
            	builder.deleteCharAt(0);
            }
        }
        else if(builder.charAt(1)=='A')
        {
        	builder.deleteCharAt(1);
        }
        return builder.toString();
    }
}
