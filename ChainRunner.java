package com.xworkz.learningConstructor;
import com.xworkz.learningConstructor.*;
public class ChainRunner {

	public static void main(String[] args) {
		Chain chain;
		chain=new Chain();
		System.out.println("length  :"+chain.length);
		System.out.println("material :"+chain.material);
		System.out.println("price  :"+chain.price);
		System.out.println("type  :"+chain.type);
		System.out.println("used for  :"+chain.usedFor);
		System.out.println("weight in gram :"+chain.weight);
		
		 System.out.println("****************************************");
		chain=new Chain("rold gold");
		System.out.println("length  :"+chain.length);
		System.out.println("material :"+chain.material);
		System.out.println("price  :"+chain.price);
		System.out.println("type  :"+chain.type);
		System.out.println("used for  :"+chain.usedFor);
		System.out.println("weight in gram :"+chain.weight);
		
         System.out.println("****************************************");
         
         chain=new Chain("coper","make up");
 		System.out.println("length  :"+chain.length);
 		System.out.println("material :"+chain.material);
 		System.out.println("price  :"+chain.price);
 		System.out.println("type  :"+chain.type);
 		System.out.println("used for  :"+chain.usedFor);
 		System.out.println("weight in gram :"+chain.weight);
 		
          System.out.println("****************************************");
          
          chain=new Chain(54);
  		System.out.println("length  :"+chain.length);
  		System.out.println("material :"+chain.material);
  		System.out.println("price  :"+chain.price);
  		System.out.println("type  :"+chain.type);
  		System.out.println("used for  :"+chain.usedFor);
  		System.out.println("weight in gram :"+chain.weight);
  		
           System.out.println("****************************************");
           
           chain=new Chain(34f);
     		System.out.println("length  :"+chain.length);
     		System.out.println("material :"+chain.material);
     		System.out.println("price  :"+chain.price);
     		System.out.println("type  :"+chain.type);
     		System.out.println("used for  :"+chain.usedFor);
     		System.out.println("weightin grm :"+chain.weight);
     		
              System.out.println("*****************************************");
              
              chain=new Chain(34);
       		System.out.println("length  :"+chain.length);
       		System.out.println("material :"+chain.material);
       		System.out.println("price  :"+chain.price);
       		System.out.println("type  :"+chain.type);
       		System.out.println("used for  :"+chain.usedFor);
       		System.out.println("weightin gram :"+chain.weight);
       		
                System.out.println("*****************************************");
                
                chain=new Chain(true);
           		System.out.println("length  :"+chain.length);
           		System.out.println("material :"+chain.material);
           		System.out.println("price  :"+chain.price);
           		System.out.println("type  :"+chain.type);
           		System.out.println("used for  :"+chain.usedFor);
           		System.out.println("weightin gram :"+chain.weight);
           		
                  
	}

}
