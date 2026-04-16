import java.util.*;

class Graph {
    int u, v, w;

    Graph(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}

class DSU {
    int p[];
    int r[];

    DSU(int n) {
        p = new int[n];
        r = new int[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = i;
        }
    }

    int find(int x) {
        if (p[x] == x)
            return p[x];
        return p[x] = find(p[x]);
    }

    boolean union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        if (pa == pb)
            return false;
        if (r[pa] < r[pb]) {
            p[pa] = pb;
        } else if (r[pa] > r[pb]) {
            p[pb] = pa;
        } else {
            p[pa] = pb;
            r[pa]++;
        }
        return true;
    }
}

public class MinimumSpanningTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Graph[] g = new Graph[m];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            g[i] = new Graph(u, v, w);
        }
        int cost = 0;
        DSU dsu = new DSU(m);
        Arrays.sort(g, (a, b) -> (a.w - b.w));
        for (int i = 0; i < m; i++) {
            if (dsu.union(g[i].u, g[i].v)) {
                cost += g[i].w;
            }
        }
        System.out.println(cost);
        sc.close();
    }
}
