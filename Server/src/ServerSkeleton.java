import Enrolment.Course;
import Enrolment.CourseList;
import Enrolment.Student;
import Enrolment.StudentList;
import jshGrpc.JSHSkeleton;

public class ServerSkeleton extends JSHSkeleton {

    private final DataStub dataStub;

    public ServerSkeleton(DataStub dataStub) {this.dataStub = dataStub;}

    public StudentList getStudentList() throws Exception {
        StudentList studentList = dataStub.getStudentList();
        if(studentList.isNoData()) throw new Exception("No Data");
        else return studentList;
    }
    public CourseList getCourseList() throws Exception {
        CourseList courseList = dataStub.getCourseList();
        if(courseList.isNoData()) throw new Exception("No Data");
        else return courseList;
    }
    public void addStudent(Student student) throws Exception {
        StudentList studentList = dataStub.getStudentList();
        studentList.addStudent(student);
        dataStub.setStudentList(studentList);
    }
    public void addCourse(Course course) throws Exception {
        CourseList courseList = dataStub.getCourseList();
        courseList.addCourse(course);
        dataStub.setCourseList(courseList);
    }
    public void deleteStudent(String id) throws Exception{
        StudentList studentList = dataStub.getStudentList();
        studentList.deleteStudent(id);
        dataStub.setStudentList(studentList);
    }
    public void deleteCourse(String id) throws Exception {
        CourseList courseList = dataStub.getCourseList();
        courseList.deleteCourse(id);
        dataStub.setCourseList(courseList);
    }
    public void enrolment(String[] ids) throws Exception {
        StudentList studentList = dataStub.getStudentList();
        studentList.enrolment(ids[0], dataStub.getCourseList().find(ids[1]));
        dataStub.setStudentList(studentList);
    }
}
