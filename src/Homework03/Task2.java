package Homework03;

public class Task2 {
    public static void main (String[] args){
        String st = "213213.203123";
        Double D = Double.valueOf(st);
        double d = Double.parseDouble(st);

        Double from = 12.56;
        double db = from;
        float f = (float)(double)from;
        byte b = from.byteValue();
        short s = from.shortValue();
        int i = from.intValue();
        long l = from.longValue();
        if (from!=0){boolean bool = true;} else {boolean bool = false;}
        char c = (char)from.intValue();
        System.out.println(db);

        double str = 2319.23132;
        String string = Double.toString(str);






    }

}
