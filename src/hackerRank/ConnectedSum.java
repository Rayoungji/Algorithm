package hackerRank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConnectedSum {
    public static void main(String args[]){
        List<String> edges = new LinkedList<>();
        edges.add("1 2");
        edges.add("1 3");
        edges.add("2 4");
        edges.add("3 5");
        edges.add("7 8");

        System.out.println(connectedSum(10,edges));

    }

    static boolean[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    public static int connectedSum(int n, List<String> edges){
        visited = new boolean[n];

        graphInit(n);

        int answer = 0;
        for(String edge : edges){
            String[] s = edge.split(" ");
            graph.get(Integer.parseInt(s[1])-1).add(Integer.parseInt(s[0])-1);
            graph.get(Integer.parseInt(s[0])-1).add(Integer.parseInt(s[1])-1);
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){

            if(!visited[i]){
                list.add(i);
                dfs(i, list);
                answer += Math.ceil(Math.sqrt(list.size()));
            }
            list.clear();
        }
        return answer;
    }

    private static void dfs(int n, List<Integer> list){
        if(visited[n])
            return ;

        visited[n] = true;

        for(int node : graph.get(n)){
            if(visited[node])
                continue;
            list.add(node);
            dfs(node, list);
        }

    }

    private static void graphInit(int n){
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
    }
}
