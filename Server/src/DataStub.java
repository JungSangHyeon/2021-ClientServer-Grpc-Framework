import Enrolment.CourseList;
import Enrolment.StudentList;
import jshGrpc.JSHStub;

public class DataStub extends JSHStub {

    public DataStub(String name, int portNumber) { super(name, portNumber); }

    public StudentList getStudentList() throws Exception { return (StudentList) request(null); }
    public CourseList getCourseList() throws Exception { return (CourseList) request(null); }
    public void setStudentList(StudentList list) throws Exception { request(list); }
    public void setCourseList(CourseList list) throws Exception { request(list); }
}
