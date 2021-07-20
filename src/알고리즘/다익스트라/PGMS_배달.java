package 알고리즘.다익스트라;

import java.util.*;

public class PGMS_배달 {
    static int[] distance;
    static List<List<Node>> graph;

    static class Node {
        int node;
        int distance;

        Node(int node, int distance) {
            this.node=node;
            this.distance=distance;
        }
    }


    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        distance = new int[N+1];
        Arrays.fill(distance,Integer.MAX_VALUE);

        graph = new ArrayList<>();
        for (int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] info : road) {
            graph.get(info[0]).add(new Node(info[1], info[2]));
            graph.get(info[1]).add(new Node(info[0], info[2]));
        }

        dijkstra(1);
        for (int i : distance) {
            if (i <=K) {
                answer++;
            }
        }

        return answer;
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
