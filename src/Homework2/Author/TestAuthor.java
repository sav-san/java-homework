package Homework2.Author;

public class TestAuthor {
    public static void main (String[] args){
        Author a = new Author("Александр Сергеевич Пушкин","directshot@golubinayapochta.ri",'M');
        System.out.println(a.getName());
        System.out.println(a.getEmail());
        System.out.println(a.getGender());
        a.setEmail("123@mail.ru");
        System.out.println(a.toString());
    }
}
