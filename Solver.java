import java.util.ArrayList;
import java.util.Queue;

/**
 * Solver.java
 *
 * File:
 *	$Id: Solver.java,v 1.3 2014/11/06 01:13:03 jmk4806 Exp $
 *
 * Revisions:
 *	$Log: Solver.java,v $
 *	Revision 1.3  2014/11/06 01:13:03  jmk4806
 *	Modified: added comments!
 *
 *	Revision 1.2  2014/11/06 01:00:41  jmk4806
 *	Modified:It works!!!!!!!
 *
 *	Revision 1.1  2014/11/05 22:58:10  jmk4806
 *	Modified: begins program
 *
 */

/**
 * @author Julien Kirnes
 *
 */
public class Solver {
	/**
	 * solve takes your Clock object, as a Puzzle interface, and uses it to solve the puzzle using the BFS algorithm 
	 * @param p
	 * @return the path of puzzle
	 */
	public ArrayList<Integer> solve (Puzzle p){
		ArrayList<ArrayList<Integer>> myQueue = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> current = new ArrayList<Integer>();
		current.add(current.size(), p.getStart());
		myQueue.add(current);
		boolean found;
		if(p.getStart() == p.getGoal()){
			found = true;
		}
		else{
			found = false;
		}
		while(!myQueue.isEmpty() && !found){
			current = myQueue.remove(0);
			for(int neighbor:p.getNeighbors(current.get(current.size()-1))){
				ArrayList<Integer> nextConfig = new ArrayList<Integer>();
				for(Integer q: current){
					nextConfig.add(q);
				}
				nextConfig.add(neighbor);
				if(nextConfig.contains(p.getGoal())){
					current = nextConfig;
					found = true;
					break;
				}
				else{
					myQueue.add(myQueue.size(), nextConfig);
				}
			}
		}
		if(found){
			return current;
		}
		else{
			return null;
		}
	}
}
