package com.app3.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.expression.common.TemplateAwareExpressionParser;

public class TestClass {
	public int getCombi(String s)
	{
		
		List resList=new ArrayList();
		for(int i=0;i<s.length();i++)
		{
			
			if(resList.size()==0)
			{
				
				
				if(s.charAt(i)=='0')
				{
					return 0;
				}
				else
				{
					resList.add(s.charAt(i));
				}
			}
			else {
			int loop=resList.size();
			List tempList=new ArrayList();
			for(int j=0;j<loop;j++)
			{
			
				
				if(Integer.valueOf(String.valueOf(s.charAt(i)))>0 && Integer.valueOf(String.valueOf(s.charAt(i)))<=9)
				{
					
					String x=String.valueOf(resList.get(j));
					String toAdd=x+","+s.charAt(i);
					
					tempList.add(toAdd);
					if(s.charAt(i-1)!=0)
					{
						
				
					
						if(x.substring(0,x.length()-1).endsWith(",")||x.length()==1)
						{
							String temp=""+x.charAt(x.length()-1)+s.charAt(i)+"";
							
							temp=temp.trim();
							if(Integer.valueOf(temp)<=26)
							{
								String toAdd1=""+x+s.charAt(i)+"";
								tempList.add(toAdd1);
								
							}
						}
					}
					
				}
				else if(s.charAt(i)=='0')
				{
					String x=String.valueOf(resList.get(j));
					if(Integer.valueOf(String.valueOf(s.charAt(i-1)))>0 && Integer.valueOf(String.valueOf(s.charAt(i-1)))<=2)
					{
						if(x.substring(0,x.length()-1).endsWith(",")||x.length()==1)
						{
							String toAdd1=""+x+s.charAt(i)+"";
							tempList.add(toAdd1);
							
						}
						
					}
					else {
						return 0;
					}
				}
				
				
			}
			resList=tempList;
		}
		}
		System.out.println(resList);
		return resList.size();
	}
	
	public static void main(String[] args) {
		TestClass testClass=new TestClass();
		
		System.out.println(testClass.getCombi("1154")+"res");
		
	}

}
