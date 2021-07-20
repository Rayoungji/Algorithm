package 알고리즘.다익스트라;

import java.util.*;

public class PGMS_가장먼노드 {

    static int[] distance;
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
        int[][] edge = {{3,6}, {4,3}, {3,2}, {1,3}, {1,2}, {2,4}, {5,2}};
        System.out.println(solution(6,edge));
    }

    public static int solution(int n, int[][] edge) {

        distance = new int[n+1];
        Arrays.fill(distance,Integer.MAX_VALUE);

        graph = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] info : edge) {
            graph.get(info[0]).add(new Node(info[1],1));
            graph.get(info[1]).add(new Node(info[0],1));
        }

        dijkstra(1);
        distance[0] = 0; //쓰레기값 최소로 바꿔주기
        int max = Arrays.stream(distance).max().getAsInt();
        int count = (int) Arrays.stream(distance).filter(e -> e == max).count();
        return count;
    }

    static void dijkstra(int startNode) {
        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.distance - o2.distance;
            }
        });

        distance[startNode] = 0;
        queue.offer(new Node(startNode, distance[startNode]));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int currentNode = node.node;
            int currentDistance = node.distance;

            for (int i=0; i<graph.get(currentNode).size(); i++) {
                int nextNode = graph.get(currentNode).get(i).node;
                int nextDistance = graph.get(currentNode).get(i).distance + currentDistance;

                if (distance[nextNode] > nextDistance) {
                    distance[nextNode] = nextDistance;
                    queue.offer(new Node(nextNode, distance[nextNode]));
                }
            }
        }
    }
}
