package Homework17;

public class StudentController {
    private Student model;
    private StudentView view;
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public String getName() {
        return model.getName();
    }
    public String getRollNo() {
        return model.getRollNo();
    }

    public void setName(String name){
        model.setName(name);
    }
    public void setRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public void updateView(){
        view.printStudentDetails(model.getName(),model.getRollNo());
    }
}
