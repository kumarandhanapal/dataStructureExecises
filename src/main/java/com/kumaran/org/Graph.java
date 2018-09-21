package com.kumaran.org;

import java.util.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Graph {


    private int nodesOrvertices;
    Map<String, List<String>> edges;

    public int getNodesOrvertices() {
        return nodesOrvertices;
    }

    public void setNodesOrvertices(int nodesOrvertices) {
        this.nodesOrvertices = nodesOrvertices;
    }

    public Map<String, List<String>> getEdges() {
        return edges;
    }

    public void setEdges(Map<String, List<String>> edges) {
        this.edges = edges;
    }

    public Graph(int nodesOrvertices){
        this.nodesOrvertices = nodesOrvertices;
        edges = new HashMap<>(nodesOrvertices);
    }

    public void addEdge(String src,String destination) {

        if (edges.get(src) == null) {
            List<String> list = new ArrayList<>();
            list.add(destination);
            edges.put(src,list);
        }else {
            edges.get(src).add(destination);
        }
    }

    public List<String> getAdjacent(String i) {
        List<String> defaultArray = new ArrayList<>();
        return this.getEdges().get(i)== null?defaultArray:this.getEdges().get(i);
    }

    public boolean checkIsRouteAvailable(List<String> srcAdjList,String destination) {

        boolean isAvailable = false;


        for (String adj : srcAdjList) {
            if (adj.equals(destination)) {
                System.out.println("Route is available.");
                isAvailable = true;
                return true;
            }
        }

        for (String adj : srcAdjList) {
            if(checkIsRouteAvailable(getAdjacent(adj), destination)) {
                isAvailable = true;
                break;
            }
        }

        return isAvailable;
    }

    public void isRouteAvailable(String src,String destination) {
        List<String> srcAdjacentslist = getAdjacent(src);
        if (!checkIsRouteAvailable(srcAdjacentslist,destination)){
            System.out.println("Route is not available");
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(8);
        graph.addEdge("A","B");
        graph.addEdge("C","D");
        graph.addEdge("E","D");
        graph.addEdge("F","A");
        graph.addEdge("I","Q");
        graph.addEdge("A","I");
        graph.addEdge("B","E");

        graph.isRouteAvailable("A","E");
        graph.isRouteAvailable("A","Q");
    }
}
