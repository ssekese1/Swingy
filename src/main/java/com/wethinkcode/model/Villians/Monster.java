package com.wethinkcode.model.Villians;

import com.wethinkcode.model.artifacts.Artifacts;
public class Monster  extends Villian {

	public Monster(int level, int attack, int defense, int hitpoints, int experience, Artifacts artifact){
		super(level, attack, defense, hitpoints, experience, artifact);
		int typeID = 2;
		super.setTypeID(typeID);
	}
}
