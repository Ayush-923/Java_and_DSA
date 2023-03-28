import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgo {
    
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w)
        {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[])
    {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    public static class Pair implements Comparable<Pair>{
        int vertex;
        int path;

        public Pair(int v, int path)
        {
            this.vertex = v;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2)
        {
            //path based sorting for my pairs
            return this.path - p2.path;
        }

    }

    public static void dijkstra(ArrayList<Edge> graph[], int src)
    {
        int g = graph.length;
        int dist[] = new int[g];
        for(int i=0; i<g; i++)
        {
            if(i != src)
            {
                dist[i] = Integer.MAX_VALUE;    //infinity
            }
        }

        boolean[] vis = new boolean[g];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        pq.add(new Pair(src, 0));

        //Loop
        while(!pq.isEmpty())
        {
            Pair curr = pq.remove();
            if(!vis[curr.vertex])
            {
                vis[curr.vertex] = true;
                for(int i=0; i<graph[curr.vertex].size(); i++)
                {
                    Edge e = graph[curr.vertex].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v])
                    {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        //print all source to destination
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        int src = 0;
        dijkstra(graph, src);
    }
}
