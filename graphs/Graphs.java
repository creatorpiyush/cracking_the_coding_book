package graphs;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graphs {

    private class Vertex {
        String name;
        HashMap<Vertex, Integer> nbrs;

        Vertex(String name) {
            this.name = name;
            this.nbrs = new HashMap<>();
        }

        public void display() {
            String str = this.name + "=>";
            Set<Vertex> nbrs = this.nbrs.keySet();
            for (Vertex nbr : nbrs) {
                str = str + nbr.name + "(" + this.nbrs.get(nbr) + "), ";
            }

            str = str + "END";
            System.out.println(str);
        }
    }

    HashMap<String, Vertex> vtces;

    Graphs() {
        this.vtces = new HashMap<>();
    }

    public int numVtces() {
        return this.vtces.size();
    }

    public void addVertex(String name) {
        if (this.vtces.containsKey(name)) {
            return;
        }

        Vertex vtx = new Vertex(name);
        this.vtces.put(name, vtx);
    }

    public void removeVertex(String name) {
        if (!this.vtces.containsKey(name)) {
            return;
        }

        Vertex vtr = this.vtces.get(name);
        Set<Vertex> nbrs = vtr.nbrs.keySet();
        for (Vertex nbr : nbrs) {
            nbr.nbrs.remove(vtr);
        }
        this.vtces.remove(name);
    }

    public int numEdges() {

        Collection<Vertex> vtces = this.vtces.values();
        int rv = 0;
        for (Vertex vtx : vtces) {
            rv = rv + vtx.nbrs.size();
        }

        rv = rv / 2;
        return rv;
    }

    public void addEdge(String name1, String name2, int cost) {
        Vertex vtx1 = this.vtces.get(name1);
        Vertex vtx2 = this.vtces.get(name2);

        if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
            return;
        }

        vtx1.nbrs.put(vtx2, cost);
        vtx2.nbrs.put(vtx1, cost);
    }

    public void removeEdge(String name1, String name2) {
        Vertex vtx1 = this.vtces.get(name1);
        Vertex vtx2 = this.vtces.get(name2);

        if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vtx2)) {
            return;
        }

        vtx1.nbrs.remove(vtx2);
        vtx2.nbrs.remove(vtx1);
    }

    public void display() {
        Collection<Vertex> vtces = this.vtces.values();

        for (Vertex vtx : vtces) {
            vtx.display();
        }
    }

}
