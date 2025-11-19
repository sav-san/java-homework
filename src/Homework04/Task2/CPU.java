package Homework04.Task2;

public class CPU {
    private final int cores;
    private final int frequency;
    public CPU(int cores,int frequency){
        this.frequency = frequency;
        this.cores = cores;
    }
    public int getCores() {
        return cores;
    }
    public int getFrequency() {
        return frequency;
    }
    public String toString(){
        return (cores+" cores, "+frequency+" Hrz");
    }
}