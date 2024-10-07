package teachback;

class Animal {
	void eat(){
		System.out.println("Animals Eat");
	} 
	
	
	@Override
	public String toString() {
		return "Animals love food";
	}
	
	public static void main(String args[]) {
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal goat = new Herbivores(); // upcasting
		Animal bear = new Omnivores();
		Animal tiger = new Carnivores();
		
		
		System.out.println(cat.toString());
		dog.eat();
		goat.eat();
		bear.eat();
		tiger.eat();
	}
}

class Herbivores extends Animal {
	@Override
	void eat(){
		System.out.println("Herbivores Eat Plants");
		super.eat();
	}	
	
}

class Omnivores extends Animal{  
	  void eat(){
	System.out.println("Omnivores Eat Plants and meat");
	
	}
}

class Carnivores extends Animal {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
	
}

