package Graph;

import java.util.ArrayList;
import java.util.HashMap;


/* 인접리스트*/
public class AdjacencyList {


    /*방향그래프*/
    private HashMap<Integer,ArrayList<Integer>> graph;
    private HashMap<Integer,Boolean> visit;
    private ArrayList<Integer> searchList = new ArrayList<Integer>();

    AdjacencyList (int arr[][]) {
        graph = new HashMap<Integer, ArrayList<Integer>>();
        visit = new HashMap<Integer, Boolean>();

        for (int i = 0; i < arr.length ; i++) {
            int fromNode = arr[i][0];
            int toNode = arr[i][1];
            visit.put(fromNode,false);
            visit.put(toNode,false);
            putSingleGraph(fromNode,toNode);
        }


    }

    public void putSingleGraph(int fromNode, int toNode){
       if(!graph.containsKey(fromNode)) { ArrayList<Integer> nodes = new ArrayList<Integer>();
           nodes.add(toNode);
           graph.put(fromNode,nodes);
       }else{
           graph.get(fromNode).add(toNode);
       }
    }

    public void search(int a){
        ArrayList<Integer> nodes = graph.get(a);
        visit.put(a,true);
        searchList.add(a);

        for(int v : nodes){
            if(!visit.get(v)){
                search(v);
            }
        }

    }

    public ArrayList<Integer> getSearchList() {
        return searchList;
    }

    public HashMap<Integer, ArrayList<Integer>> getGraph() {
        return this.graph;
    }

    public HashMap<Integer, Boolean> getVisit() {
        return visit;
    }


    public static void main(String[] arg){
        int [][] arr = {{1,3},{2,4},{1,5},{3,4},{5,6}};
        AdjacencyList adjacencyList = new AdjacencyList(arr);
        HashMap<Integer,ArrayList<Integer>> graph =adjacencyList.getGraph();
        HashMap<Integer, Boolean> visit  = adjacencyList.getVisit();
        System.out.println(graph);
        System.out.println(visit);
        adjacencyList.search(1);

        System.out.println(adjacencyList.getSearchList());


    }

}
