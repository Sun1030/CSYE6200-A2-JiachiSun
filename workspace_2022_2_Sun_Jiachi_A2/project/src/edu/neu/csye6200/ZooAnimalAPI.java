package edu.neu.csye6200;

public class ZooAnimalAPI {

	public static void demo() {
		
		System.out.println("Zoo Animals:");
		
		AnimalAPI panda = new Panda();
		System.out.println(panda);
		
		AnimalAPI husky = new Husky();
		System.out.println(husky);
		
		AnimalAPI bison = new Bison();
		System.out.println(bison);
		
		System.out.println("ZooAnimals ......done");
		System.out.println();
		
	}
	
}
