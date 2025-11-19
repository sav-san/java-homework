package Homework4.Task2;

public class Monitor {
    private final int frequency;
    private final String resolution;
    public Monitor(int frequency,String resolution){
        this.frequency=frequency;
        this.resolution=resolution;
    }
    public int getFrequency() {
        return frequency;
    }
    public String getResolution() {
        return resolution;
    }

    public String toString(){
        return (resolution+" resolution, "+frequency+" Hrz");
    }
}
