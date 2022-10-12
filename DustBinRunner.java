package com.xworkz.constructor121;

public class DustBinRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DustBin dustBin=new DustBin();
		
		
		dustBin.size="small, medium ,large";
		dustBin.shape="round";
		dustBin.use="store the waste";
		dustBin.material="plastic or cement";
		dustBin.usedInHouse=true;
		dustBin.capcity="100L";
		dustBin.style="british";
		dustBin.function="all substance storage";
		dustBin.usedInParks=true;
		
		
    	System.out.println("dust bin  size  :"+dustBin.size);
		System.out.println("dust bin  shape :"+dustBin.shape);
		System.out.println("dust bin  use  :"+dustBin.use);
		System.out.println("dust bin  material :"+dustBin.material);
		System.out.println("dust bin  capacity :"+dustBin.capcity);
		System.out.println("dust bin  style :"+dustBin.style);
	System.out.println("dust bin  ued in house  :"+dustBin.usedInHouse);
	System.out.println("dust bin  function :"+dustBin.function);
	System.out.println("dust bin  used in parks :"+dustBin.usedInParks);
	

	
	System.out.println("we indians dont use dust bin  :"+dustBin.everyIndianDontUSeDB);
	System.out.println("we indians dont use dust bin but we need DB  :"+dustBin.weNeedDustBins);
	System.out.println("DB stores water  :"+dustBin.itStoresRawWaste);
	System.out.println(" DB stores raw waste :"+dustBin.itStoresRawWaste);

	System.out.println("it is available on online  :"+dustBin.availableInOnline);
	System.out.println("DB stores juice  :"+dustBin.itStoresJuice);
	System.out.println("home need dust bin :"+dustBin.homeNeedDustBin);
	System.out.println("its very difficult to find property  :"+dustBin.fact);
	}

}
