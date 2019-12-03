package com.project.zookeeper;

public class Mammal {
	
	Integer energyLevel = 100;
	
	public Integer displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}

}
