package actions;

/**
 * Possible actions:
 * - clear the map
 * - set tile [tile] to sprite [sprite]
 * - move whatever is on tile1 to tile2
 * - add a 'bloodied' tag to a tile
 * - clear a tile
 * @author Joep
 *
 */
public class ActionEncoder {
	
	public static String reset() {
		return "reset";
	}
	
	public static String set(int x, int y, int id) {
		return "set [" + x + "," + y + "] to (" + id + ")";
	}
	
	public static String movement(int x1, int y1, int x2, int y2) {
		return "move [" + x1 + "," + y1 + "] to [" + x2 + "," + y2 + "]";
	}
	
	public static String setTag(int x, int y, String tag) {
		return "bloodied [" + x + "," + y + "]";
	}
	
	public static String clearTile(int x, int y) {
		return "clear [" + x + "," + y + "]";
	}

}