package com.xworkz.learningConstructor;
import com.xworkz.learningConstructor.*;
public class TractorRunner {

	public static void main(String[] args) {
		Tractor tractor;
		tractor=new Tractor();
		
		System.out.println("tractor name  :"+tractor.name);
		System.out.println("tractor name  :"+tractor.hp);
		System.out.println("tractor brand :"+tractor.brand);
		System.out.println("tractor colour  :"+tractor.colour);
		System.out.println("tractor model  :"+tractor.model);
		System.out.println("tractor model  :"+tractor.price);
		
		
		System.out.println("********************************");
		
		tractor=new Tractor("mahendra");
		System.out.println("tractor name  :"+tractor.name);
		System.out.println("tractor name  :"+tractor.hp);
		System.out.println("tractor brand :"+tractor.brand);
		System.out.println("tractor colour  :"+tractor.colour);
		System.out.println("tractor model:"+tractor.model);
		System.out.println("tractor model  :"+tractor.price);
		
		System.out.println("********************************");
		
		tractor=new Tractor("FR","200");
		System.out.println("tractor name  :"+tractor.name);
		System.out.println("tractor brand :"+tractor.brand);
		System.out.println("tractor colour  :"+tractor.colour);
		System.out.println("tractor name  :"+tractor.hp);
		System.out.println("tractor colour  :"+tractor.model);
		System.out.println("tractor model  :"+tractor.price);
		
		System.out.println("********************************");
		
		tractor=new Tractor(700000,"200");
		System.out.println("tractor name  :"+tractor.name);
		System.out.println("tractor brand :"+tractor.brand);
		System.out.println("tractor colour  :"+tractor.colour);
		System.out.println("tractor name  :"+tractor.hp);
		System.out.println("tractor colour  :"+tractor.model);
		System.out.println("tractor model  :"+tractor.price);
		
System.out.println("********************************");
		
		tractor=new Tractor(400000,"red","2019");
		System.out.println("tractor name  :"+tractor.name);
		System.out.println("tractor brand :"+tractor.brand);
		System.out.println("tractor colour  :"+tractor.colour);
		System.out.println("tractor name  :"+tractor.hp);
		System.out.println("tractor colour  :"+tractor.model);
		System.out.println("tractor model  :"+tractor.price);
		
System.out.println("********************************");
		
		tractor=new Tractor(500000);
		System.out.println("tractor name  :"+tractor.name);
		System.out.println("tractor brand :"+tractor.brand);
		System.out.println("tractor colour  :"+tractor.colour);
		System.out.println("tractor name  :"+tractor.hp);
		System.out.println("tractor colour  :"+tractor.model);
		System.out.println("tractor model  :"+tractor.price);
	}

}
