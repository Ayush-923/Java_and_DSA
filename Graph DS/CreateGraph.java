import java.util.ArrayList;

public class CreateGraph {
    
    public static class Edge{
        int src;
        int dest;
        int weight;

        Edge(int s, int d, int w)
        {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for(int i=0; i<v; i++)
        {
            graph[i] = new ArrayList<>();
        }

        //vretex at 0
        graph[0].add(new Edge(0, 1, 5));

        //vertex at 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        //vertext at 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        //vetext at 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2,1));

        //vertext at 4
        graph[4].add(new Edge(4, 2, 2));

        //2's neighbors
        for (int i = 0; i < graph[2].size(); i++) 
        {
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}
