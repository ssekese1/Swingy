package com.wethinkcode.model.artifacts;

//import lombok.Getter;

public class Weapon extends Artifacts{
	private int attack = 75;

	public Weapon(String type){
		super(type);
	}

	public int getAttack(){
		return this.attack;
	}
}