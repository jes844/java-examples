package edu.nyu.cs.fb1258;

/**
 * A virtual representation of a Dog, which is, of course, a type of Mammal
 * @author Foo Barstein
 * @version 2.9
 *
 */
public class Dog extends Mammal {
	/**
	 * the name of this Dog object
	 */
	private String name;

	/**
	 * Setter for the name property
	 * @param n the new name of this Dog 
	 */
	public void setName(String n) {
		if (n.length() > 0) {
			this.name = n;			
		}
	}
	
	/**
	 * no-args constructor simply calls the Mammal class's no-args constructor
	 */
	public Dog() {
		super(); //the Mammal class's constructor assigns a random gender to this Dog
	}
	
	/**
	 * overloaded constructor assigns a random gender and sets the Dog object's name
	 * @param n String name of the new Dog object
	 */
	public Dog(String n) {
		super(); //the Mammal class's constructor assigns a random gender to this Dog

		//set this dog's name using the setter designed for this purpose
		this.setName(n);
	}
	
	/**
	 * override the default Mammal sleep method with a Dog-specific sleep style.
	 */
	public void sleep() {
		System.out.println(this.name + " is sleeping ...woof whimper whoof.");
	}
	
	public boolean equals(Dog dog) {
        return (this.name.equals(dog.name));
    }

	@Override
	public void eat() {
		System.out.println(this.name + " is eating dog style");
	}

	@Override
	public void lactate() {
		System.out.println(this.name + " is lactating dog style");
	}

	@Override
	public void lactate(boolean aLot) {
		if (aLot) {
			System.out.println(this.name + " is lactating a lot dog style");
		}
		else {
			this.lactate();
		}
	}
	
}