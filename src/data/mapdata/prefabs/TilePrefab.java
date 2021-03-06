package data.mapdata.prefabs;

import data.mapdata.Tile;

public class TilePrefab extends Prefab<Tile> {
	
	public TilePrefab(int type) {
		super(type);
	}
	
	@Override
	public Tile getInstance(int x, int y) {
		return new Tile(type);
	}		
}
