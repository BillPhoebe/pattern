package yyd.phoebe.web.mvc;

/**
 * MVC模式
 * 毕竟我是做WEB，了解一下就行了
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student student = retrieveStudentFromDatabase();
        StudentController studentController = new StudentController(student, new StudentView());
        studentController.updateView();
        student.setName("Phoebe");
        studentController.updateView();
    }
    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
