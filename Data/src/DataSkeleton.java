import Enrolment.CourseList;
import Enrolment.StudentList;
import jshGrpc.JSHSkeleton;

import java.io.*;

public class DataSkeleton extends JSHSkeleton {

    private static final String STUDENT = getFileDirectory("Students.txt"), COURSE = getFileDirectory("Courses.txt");

    public Object getStudentList() throws Exception { return new StudentList(STUDENT); }
    public Object getCourseList() throws Exception { return new CourseList(COURSE); }
    public void setStudentList(StudentList list) throws Exception { writeToFile(STUDENT, list.getFileContent()); }
    public void setCourseList(CourseList list) throws Exception { writeToFile(COURSE, list.getFileContent()); }

    private void writeToFile(String directory, String content) throws Exception { new FileWriter(directory).append(content).close(); }
    private static String getFileDirectory(String name) { return DataSkeleton.class.getResource(name).getFile(); }
}
