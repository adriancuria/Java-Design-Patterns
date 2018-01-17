package com.dbbyte.abstract_factory;

// 1

public abstract class AbstractFactory {

    /*
	 * Abstract class for Villain and Hero
	 */

	abstract Villain getVillain(String s);
    abstract Hero getHero(String s);

}