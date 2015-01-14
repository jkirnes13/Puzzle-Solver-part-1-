import java.util.ArrayList;

/**
 * Puzzle.java
 *
 * File:
 *	$Id: Puzzle.java,v 1.1 2014/11/05 22:58:09 jmk4806 Exp $
 *
 * Revisions:
 *	$Log: Puzzle.java,v $
 *	Revision 1.1  2014/11/05 22:58:09  jmk4806
 *	Modified: begins program
 *
 */

/**
 * @author Julien Kirnes
 *
 */
public interface Puzzle {
	/**
	 *  getStart gets the starting config for this puzzle.
	 * @return
	 */
	int getStart();
	/**
	 * getGoal gets gets the goal config for this puzzle.
	 * @return
	 */
	int getGoal();
	/**
	 * getNeighbors takes an incoming config, generate and return all direct neighbors to this config.
	 * @param config
	 * @return all direct neighbors to this config.
	 */
	ArrayList<Integer> getNeighbors(int config);
}
