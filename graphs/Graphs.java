package graphs;

import java.util.Collection;
import java.util.HashMap;
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
                str = str + nbr.name + "(" + this.nbrs.get(nbr) + "),";
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

    public void display() {
        Collection<Vertex> vtces = this.vtces.values();

        for (Vertex vtx : vtces) {
            vtx.display();
        }
    }

}
