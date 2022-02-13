package edu.neu.csye6200;

public class ZooAnimalisticAPI {
	
	public static void demo() {
		
		System.out.println("Zoo Anamalistic Animals:");
		
		AnimalisticAPI panda = new Panda();
		System.out.println(panda);
		
		AnimalisticAPI husky = new Husky();
		System.out.println(husky);
		
		AnimalisticAPI bison = new Bison();
		System.out.println(bison);
		
		AnimalisticAPI godzilla = new AnimalisticAPIGodzilla();
		System.out.println(godzilla);
		
		AnimalisticAPI pikachu = new AnimalisticAPIPikachu();
		System.out.println(pikachu);
		
		AnimalisticAPI sonic = new AnimalisticAPISonic();
		System.out.println(sonic);
		
		System.out.println("ZooAnimalisticAPI ......done");
		System.out.println();
		
		
	}
	
}
