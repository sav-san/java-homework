package Homework2.Shop;

import java.util.ArrayList;

public class PC {
    public int id;
    public String CPU;
    public String GPU;
    public static ArrayList<Integer> ids = new ArrayList<Integer>();
    public PC(int id, String cpu, String gpu){
        this.id = id;
        this.CPU = cpu;
        this.GPU = gpu;
        ids.add(id);
    }

    public static ArrayList<Integer> getIds() {
        return ids;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "PC: "+id+", CPU: "+CPU+", GPU: "+GPU;
    }
}
