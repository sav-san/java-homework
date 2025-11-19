package Homework04.Task2;

public class Main {
    public static void main(String[]args){
        Monitor MSI = new Monitor(165,"1920x1080");
        RAM kingston = new RAM(32,3200);
        CPU intelcore = new CPU(8,3200);
        Computer first = new Computer(MSI,intelcore,kingston, Computer.Model.INTEL);
        System.out.println("Computer:");
        System.out.println("Monitor: "+MSI.toString());
        System.out.println("RAM: "+kingston.toString());
        System.out.println("CPU: "+intelcore.toString());
    }
}
