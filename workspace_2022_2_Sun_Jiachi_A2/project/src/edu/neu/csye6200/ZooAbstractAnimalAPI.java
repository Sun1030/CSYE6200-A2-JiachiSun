package edu.neu.csye6200;

public class ZooAbstractAnimalAPI {
	
	public static void demo() {
		
		System.out.println("Zoo Abstract Animals:");
		
		AbstractAnimalAPI panda = new AbstractPanda();
		System.out.println(panda);
		
		AbstractAnimalAPI husky = new AbstractHusky();
		System.out.println(husky);
		
		AbstractAnimalAPI bison = new AbstractBison();
		System.out.println(bison);
		
		System.out.println("ZooAbstractAnimals ......done");
		System.out.println();
		
	}
	
}
