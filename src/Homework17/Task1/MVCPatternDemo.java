package Homework17.Task1;

public class MVCPatternDemo {
    public static void main(String[]args){
        Student model = retrieveCoursefromDatabase();
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);
        controller.updateView();
        controller.setName("Рубцов Савелий Александрович");
        controller.setRollNo("1");
        System.out.println("\nПосле обновления:");
        controller.updateView();
    }
    private static Student retrieveCoursefromDatabase(){
        Student student = new Student();
        student.setName("Бубцов Сава");
        student.setRollNo("228");
        return student;
    }
}
