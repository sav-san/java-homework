package Homework4;

public class Task1 {
    public enum Season{
        SPRING(10),SUMMER(25),FALL(5),WINTER(-15);
        private final int seasonAvgTemp;
        Season(int t){
            this.seasonAvgTemp = t;
        }
        public static String getDescription(Season s){
            if (s.seasonAvgTemp>10){
                return "Теплое время года";
            } else {
                return "Холодное время года";
            }
        }
        public void iLove (Season s) {
            switch (s) {
                case SPRING:
                    System.out.println("Я люблю весну");
                case SUMMER:
                    System.out.println("Я люблю лето");
                case FALL:
                    System.out.println("Я люблю осень");
                case WINTER:
                    System.out.println("Я люблю зиму");
            }
        }

    }
    public static void main (String[]args){
        for (Season s : Season.values()){
            System.out.println(s+" "+s.seasonAvgTemp+"C "+Season.getDescription(s));
        }
    }
}
