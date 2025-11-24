package Homework14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s+7");
        String[] words = p.split("sdaifj 7sadgfdi 7jasdf oisadf j 7sd sdoifsdf");
        for (String word : words)
            System.out.println(word);

    }
}
