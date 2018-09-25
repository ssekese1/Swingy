package com.wethinkcode.model.artifacts;


//import lombok.Getter;

public class Armor extends Artifacts {
	private int defense = 95;

	public Armor(String type){
		super(type);
	}

	public int getDefense() {
		return this.defense;
	}
}