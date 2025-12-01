package Homework17.Task2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retrieveCoursefromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setName("Рубцов Савелий");
        controller.setSalary(65165.666522);
        System.out.println("\nПосле обновления:");
        controller.updateView();
    }
    private static Employee retrieveCoursefromDatabase(){
        Employee employee = new Employee();
        employee.setName("Бубцов Совелий");
        employee.setSalary(5611146);
        return employee;
    }
}
