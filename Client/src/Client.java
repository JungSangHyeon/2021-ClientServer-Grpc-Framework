import Enrolment.Course;
import Enrolment.Student;
import jshMenu.JSHTUIMenu;

public class Client extends JSHTUIMenu {

    private final ServerStub serverStub;

    public Client(String name, int portNumber) { serverStub = new ServerStub(name, portNumber); }

    public void method1_PrintStudent() throws Exception { System.out.println(serverStub.getStudentList().getFileContent()); }
    public void method2_PrintCourse() throws Exception { System.out.println(serverStub.getCourseList().getFileContent()); }
    public void method3_AddStudent() throws Exception { serverStub.addStudent(new Student(sc.nextLine())); }
    public void method4_AddCourse() throws Exception { serverStub.addCourse(new Course(sc.nextLine())); }
    public void method5_DeleteStudent() throws Exception { serverStub.deleteStudent(sc.nextLine()); }
    public void method6_DeleteCourse() throws Exception { serverStub.deleteCourse(sc.nextLine()); }
    public void method7_Enrolment() throws Exception { serverStub.enrolment(sc.nextLine(), sc.nextLine()); }
}
