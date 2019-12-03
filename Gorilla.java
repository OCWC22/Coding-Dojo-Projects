package com.project.zookeeper;

public class Gorilla extends Mammal{
	public void throwSomething() {
		System.out.println("Throw a bannana peel");
		energyLevel -= 5;
		System.out.println(energyLevel);
	}
	public void eatBannanas() {
		System.out.println("Ate a bannana");
		energyLevel += 10;
		System.out.println(energyLevel);

	}
	public void climb() {
		System.out.println("Climb a tree");
		energyLevel -= 10;
		System.out.println(energyLevel);

	}
}
