package com.wethinkcode.model.Villians;

import com.wethinkcode.model.artifacts.Artifacts;

public class Skeleton  extends Villian {

	public Skeleton(int level, int attack, int defense, int hitpoints, int experience, Artifacts artifact){
		super(level, attack, defense, hitpoints, experience, artifact);
		int typeID = 1;
		super.setTypeID(typeID);
	}
}
