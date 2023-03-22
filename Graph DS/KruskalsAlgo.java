import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class KruskalsAlgo {

    public static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int wt)
        {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2)
        {
            return this.wt - e2.wt;
        }
    }

    public static void createGraph(ArrayList<Edge> edges)
    {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4;       //verices
    static int par[] = new int[n];
    static int rank[] = new int[n];

    //INITALIZATION
    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    //FIND FUNCTION
    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    //UNION FUNCTION
    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void kruskalMST(ArrayList<Edge> edges, int V)
    {
        init();
        Collections.sort(edges);
        int ans = 0;
        int count = 0;

        for(int i=0; count < V-1; i++)
        {
            Edge e = edges.get(i);
            int src = e.src;
            int dest = e.dest;
            int wt = e.wt;

            int parA = find(src);
            int DestPar = find(dest);

            if(parA != DestPar)
            {
                union(src, dest);
                ans += wt;
                count++;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);

        kruskalMST(edges, V);
    }
}
