import Enrolment.Course;
import Enrolment.CourseList;
import Enrolment.Student;
import Enrolment.StudentList;
import jshGrpc.JSHStub;

public class ServerStub extends JSHStub {

    public ServerStub(String name, int portNumber) { super(name, portNumber); }

    public StudentList getStudentList() throws Exception{ return (StudentList) request(null); }
    public CourseList getCourseList() throws Exception{ return (CourseList) request(null); }
    public void addStudent(Student student) throws Exception { request(student); }
    public void addCourse(Course course) throws Exception { request(course); }
    public void deleteStudent(String id) throws Exception{ request(id); }
    public void deleteCourse(String id) throws Exception { request(id); }
    public void enrolment(String studentId, String courseId) throws Exception { request(new String[]{studentId, courseId}); }
}
