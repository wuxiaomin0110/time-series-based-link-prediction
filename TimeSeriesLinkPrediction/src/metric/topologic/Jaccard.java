package metric.topologic;

import java.util.HashSet;

public class Jaccard extends CommonNeighbors{

	private final static String NAME = "JC";
	private final static String FULL_NAME = "Jaccard's Coefficient (JC)";

	public double getScore(Integer v1, Integer v2){
		double score = 0;
		if(super.isNodesInGraph(v1, v2)){
			//Uniao de vizinhos de v1 e v2
			HashSet<Integer> neighbors = new HashSet<Integer>(this.graph.getNeighbors(v1));
			neighbors.addAll(new HashSet<Integer>(this.graph.getNeighbors(v2)));
			if(!neighbors.isEmpty()){
				score = super.getScore(v1, v2)/neighbors.size();
			}
		}
		return score;
	}

	public String getName() {
		return NAME;
	}	

	public String getFullName(){
		return FULL_NAME;
	}
}
