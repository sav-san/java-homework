package Homework13;

public class Task3 {
    public static void main (String[]args){
        Address first = new Address("Россия;МСК.Москва,Проспект Вернадского,78,-,-");
        Address second = new Address("Россия;Оренбургская область.Оренбург,Правды,2,1,43");
        Address third = new Address("United States;Florida.Miami,Saint Lois,345,7,1234");
        Address fourth = new Address("Казахстан;Карагадинская область.Караганда,Святого Котакбаса,15,-,85");
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
        System.out.println(fourth.toString());
    }
}

