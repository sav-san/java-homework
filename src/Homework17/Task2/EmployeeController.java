package Homework17.Task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public String getName(){ return model.getName();}
    public double getSalary(){ return model.getSalary();}

    public void setName(String name){model.setName(name);}
    public void setSalary(double salary){model.setSalary(salary);}

    public void updateView(){view.printEmployeeDetails(model.getName(), model.getSalary());}

}
