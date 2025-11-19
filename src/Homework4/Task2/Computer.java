package Homework4.Task2;

public class Computer {
    public static enum Model{
        INTEL,NVIDIA,APPLE,AMD;
    }
    private Monitor monitor;
    private CPU processor;
    private RAM memory;
    private Model model;
    public Computer(Monitor m,CPU c, RAM r, Model mod){
        this.monitor = m;
        this.processor = c;
        this.memory = r;
        this.model = mod;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public CPU getProcessor() {
        return processor;
    }

    public RAM getMemory() {
        return memory;
    }

    public Model getModel() {
        return model;
    }
}
