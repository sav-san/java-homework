package Homework11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/H/m");
        sdf.setLenient(false);
        System.out.println("Введите дату (yyyy/MM/dd/H/m):");
        String inputDate = scan.nextLine();
        String[] dateForCal = inputDate.split("/");
        try {
            Date userDate = sdf.parse(inputDate);
            System.out.println("Date: "+userDate);

            cal.set(Calendar.YEAR,Integer.parseInt(dateForCal[0]));
            cal.set(Calendar.MONTH,Integer.parseInt(dateForCal[1])-1);
            cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(dateForCal[2]));
            cal.set(Calendar.HOUR_OF_DAY,Integer.parseInt(dateForCal[3]));
            cal.set(Calendar.MINUTE,Integer.parseInt(dateForCal[4]));
            cal.set(Calendar.SECOND,0);

            System.out.println("Calendar: "+cal.getTime());
        } catch (ParseException e){
            System.out.println("Ошибка: неверный формат даты!");
        }

    }
}
