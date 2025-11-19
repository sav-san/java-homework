package Homework02.Shop;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ДОБРО ПОЖАЛОВАТЬ В МАГАЗИН КОМПЬЮТЕРОВ РУБЦОВА САВЕЛИЯ");
        System.out.println("______________________________________________________________________________");
        while(true){
            System.out.println("Что вы хотите сделать?");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            System.out.println("4. Все компьютеры");
            int action = scan.nextInt();
            switch (action){
                case 1:
                    System.out.println("ID: ");
                    int id = scan.nextInt();
                    if (PC.getIds().contains(id)){
                        System.out.println("Такой ID уже есть");
                        break;
                    } else {
                        System.out.println("CPU: ");
                        String cpu = scan.next();
                        System.out.println("GPU: ");
                        String gpu = scan.next();
                        PC a = new PC(id,cpu,gpu);
                        Shop.getComputers().add(a);
                        System.out.println("Компьютер успешно добавлен!");
                    }
                    break;
                case 2:
                    System.out.println("Введите ID компьютера для удаления: ");
                    id = scan.nextInt();
                    if (PC.getIds().contains(id)){
                        for (int i = 0; i < Shop.getComputers().size();i++){
                            if (Shop.getComputers().get(i).getId()==id) {
                                Shop.deletePC(Shop.getComputers().get(i));
                            }
                        }
                        System.out.println("Компьютер успешно удален");
                    } else {
                        System.out.println("Нет такого ID");
                    }
                    break;
                case 3:
                    System.out.println("Введите ID компьютера который хотите найти:");
                    id = scan.nextInt();
                    if (PC.getIds().contains(id)){
                        for (int i = 0; i < Shop.getComputers().size();i++){
                            if (Shop.getComputers().get(i).getId()==id) {
                                Shop.findPC(id);
                            }
                        }
                    } else {
                        System.out.println("Нет такого ID");
                    }
                    break;
                case 4:
                    if (Shop.getComputers().isEmpty()){
                        System.out.println("Компьютеров нет в наличии");
                    } else {
                        for (int i = 0; i < Shop.getComputers().size(); i++) {
                            System.out.println(Shop.getComputers().get(i).toString());
                        }
                    }
                    break;
                default:
                    System.out.println("");
                    System.exit(1);
            }
        }
    }
}
