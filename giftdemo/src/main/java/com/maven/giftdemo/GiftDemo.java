package com.maven.giftdemo;
import java.util.*;

public class GiftDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner p= new Scanner(System.in);
  Waffy w1=new Waffy("munch",12,4,6);
  Creamy c1=new Creamy("dairymilk",14,6,8);
  Sweet1 s1=new Sweet1("kajubarfi",300,5);
  int tweg=w1.weight()+c1.weight();
  System.out.println("the total weight of chocolate is"+tweg);
  System.out.println("the weight of kajubarfi is"+s1.weight());
  System.out.println("enter candy code on your gift");
  String s= p.next();
  String candies[] = {"a","b","c"};
  int c=0;
  for(int i=0;i<3;i++)
  {
	  if(s.compareTo(candies[i])==0)
		  c++;
	  else
		  c=c+0;
	  
	  
	  
  }
  if(c>0) {
	  System.out.println("happy new year");
     System.out.println("my candie count is"+c);
  }
  else
	  System.out.println("no candies received");
  
  
  
  
  

	}

}
