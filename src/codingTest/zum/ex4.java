package codingTest.zum;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
    static List<List<Node>> graph;

    static class Node {
        int node;
        int distance;
        Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
    public static void main(String args[]) {

    }

    public static int[] solution(int[][] grid) {

        graph = new ArrayList<>();
        for (int i=0; i<=grid.length; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] info : grid) {
            graph.get(info[0]).add(new Node(info[1],1));
            graph.get(info[1]).add(new Node(info[0],1));
        }

        int[] answer = {};
        return answer;
    }
}
