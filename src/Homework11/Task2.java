package Homework11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        System.out.println("Введите дату с которой хотите сравнить сегодняшнюю дату (dd/mm/yyyy):");
        String inputDate = scan.nextLine();
        try {
            Date userDate = sdf.parse(inputDate);
            Date currentDate = new Date();

            System.out.println("Введенная дата: " + sdf.format(userDate));
            System.out.println("Текущая дата: " + sdf.format(currentDate));
            if (userDate.getDay()==currentDate.getDay() && userDate.getMonth()==currentDate.getMonth() && userDate.getYear()==currentDate.getYear()){
                System.out.println("Сегодня");
            }
            else if (userDate.before(currentDate)) {
                System.out.println("Прошлое");
            } else if (userDate.after(currentDate)) {
                System.out.println("Будущее");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты!");
        }

    }
}
