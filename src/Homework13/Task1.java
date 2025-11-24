package Homework13;

public class Task1 {
    public static void main(String[] args) {
        String str = new String("I like Java!!!");
        System.out.println("Последний символ строки "+str.charAt(str.length()-1));
        if (str.endsWith("!!!")){
            System.out.println("Строка заканчивается подстрокой !!!");
        }
        else{
            System.out.println("Строка не заканчивается подстрокой !!!");
        }
        if (str.startsWith("I like")){
            System.out.println("Строка начинается подстрокой I like");
        }
        else{
            System.out.println("Строка не начинается подстрокой I like");
        }
        if (str.contains("Java")){
            System.out.println("Строка содержит подстроку Java");
        }
        else{
            System.out.println("Строка не содержит подстроку Java");
        }
        System.out.println("Индекс подстроки Java в строке: "+str.indexOf("Java"));
        System.out.println("Замена всех символов а на о "+str.replace('a','o'));
        System.out.println("Верхний регистр "+str.toUpperCase());
        System.out.println("Нижний регистр "+str.toLowerCase());
        System.out.println("Вырезанная подстрока "+str.substring(7,11));

    }
}
