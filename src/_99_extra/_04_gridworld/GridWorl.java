package _99_extra._04_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorl {

	public static void main(String[] args) {
		int x;
		World worl = new World();
		worl.show();
		Location pyramidShips = new Location(5,5);
		Location pyramidShip = new Location(4,5);
		Location pyramidShip3 = new Location(6,5);
		Bug zorp = new Bug();
		Flower vexgateway = new Flower();
		zorp.setColor(Color.DARK_GRAY);
		vexgateway.setColor(Color.yellow);
		worl.add(pyramidShips, vexgateway);
		worl.add(pyramidShips, zorp);
		zorp.setDirection(90);
		worl.add(pyramidShip3, vexgateway);
		worl.add(pyramidShip, vexgateway);
		worl.getRandomEmptyLocation();
		Location pyramidShip4 = worl.getRandomEmptyLocation();
		x = pyramidShip4.getRow();
		while (x!= -1) {
		worl.add(pyramidShip4, vexgateway);
		Location pyramidShip4 = worl.getRandomEmptyLocation();
		

		} 
	}
	
	
	
}
