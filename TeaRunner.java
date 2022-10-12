package com.xworkz.learningConstructor;
import com.xworkz.learningConstructor.*;
public class TeaRunner {
public static void main(String[] vikram) {
	Tea tea=new  Tea();
	
	tea.compName="lipton";
	tea.estDate="1996";
	tea.compOwner="ekaterra";
	tea.compCEO="thomas edward";
	tea.compLocation="britan";
	tea.compDomain="private";
	tea.compGrowth="8%";
	tea.compCountry="england";
	tea.noCompEmploys="600000";
	
	System.out.println("tea company details ");
	
	System.out.println("comp name  :"+tea.compName);
	System.out.println("comp established in  :"+tea.estDate);
	System.out.println("comp owner  :"+tea.compOwner);
	System.out.println("comp CEO  :"+tea.compCEO);
	System.out.println("comp location :"+tea.compLocation);
	System.out.println("comp domain  :"+tea.compDomain);
	System.out.println("comp growth  :"+tea.compGrowth);
	System.out.println("comp country  :"+tea.compCountry);
	System.out.println("np of employees   :"+tea.noCompEmploys);
	
	
	System.out.println("**********************");
	
	System.out.println("product details");
	
	System.out.println("name :"+tea.nameOfTea);
	System.out.println("price :"+tea.price);
	System.out.println("chemical used :"+tea.chemicalUsed);
	System.out.println("quantity :"+tea.quantity);
	System.out.println("colour  :"+tea.colour);
	System.out.println("it has agmark :"+tea.agMark);
	System.out.println("it is availbale in india :"+tea.availableInIndia);
	System.out.println("it is good for health  :"+tea.goodForHealth);
	System.out.println("it is natural :"+tea.natural);
}

}

