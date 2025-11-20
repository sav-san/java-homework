package Homework13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String URL = scan.next();

        try {
            String content = Files.readString(Paths.get(URL));
            content = content.toLowerCase();
            System.out.println(content);
            String[] arr = (content.trim().split(" "));
            for (int i = 0; i < arr.length; i++){
                for (int j = i+1; j < arr.length; j++){
                    if (arr[i].charAt(arr[i].length()-1)==arr[j].charAt(0)){
                        String temp = arr[i+1];
                        arr[i+1]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
            for (String s : arr){
                System.out.print(s+' ');
            }


        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }


    }
}