package com.wethinkcode.model.artifacts;


//import lombok.Getter;

public class Helm extends Artifacts {
	private int hitpoints = 85;

	public Helm(String type){
		super(type);
	}

	public int getHitPoints(){
		return this.hitpoints;
	}
}