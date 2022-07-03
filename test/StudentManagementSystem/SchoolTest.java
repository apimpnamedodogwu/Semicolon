package StudentManagementSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School mySchool;

    @BeforeEach
    void setUp() {
        mySchool = new School();
    }

    @AfterEach
    void tearDown() {
        Student.resetId();
    }


    @Test
    void getAllCourses() {
        mySchool.addCourse("Java", "Java301");
        mySchool.addCourse("Python", "Py101");
        mySchool.addCourse("Sex Education", "SexEd101");
        assertEquals("Python",mySchool.getCourses().get(1).getCourseName());
        assertEquals(3, mySchool.getCourses().size());
    }

    @Test
    void addCourse() {
        mySchool.addCourse("Java", "Java301");

        Course result = mySchool.getCourse("Java301", "Java");
        assertNotNull(result);
    }

    @Test
    void testThatAddExceptionMessageWorks() {
        mySchool.addCourse("Java", "Java301");
        assertThrows(IllegalArgumentException.class,
                () -> mySchool.getCourse("test", "test101"));
    }

    @Test
    void deleteCourse() {
        mySchool.addCourse("Java", "Java301");
        mySchool.removeCourse("Java");
        assertEquals(0, mySchool.getCourses().size());
    }

    @Test
    void testThatDeleteMethodExceptionMessageWorks() {
        assertThrows(IllegalArgumentException.class,
                () -> mySchool.removeCourse("Java"));
    }

    @Test
    void getAllStudents() {
        mySchool.addStudents("Chibobo");
        mySchool.addStudents("My Priest");
        mySchool.addStudents("Tunde The Fool");
        mySchool.addStudents("Dorcas My Love");
        assertEquals(4, mySchool.getStudents().size());
    }

    @Test
    void addStudent() {
        mySchool.addStudents("Grace");
        assertEquals(1, mySchool.getStudents().size());
    }

    @Test
    void testThatAddStudentExceptionMessageWorks() {
        mySchool.addStudents("Grace");
        assertThrows(IllegalArgumentException.class,
                () -> mySchool.getStudent(5));
    }

    @Test
    void deleteStudent() {
        mySchool.addStudents("Grace");
        mySchool.addStudents("Chibuzo");
        mySchool.addStudents("Mofe");
        mySchool.deleteStudent(1);
        mySchool.deleteStudent(2);
        assertEquals(1, mySchool.getStudents().size());
    }

    @Test
    void testThatDeleteStudentExceptionMessageWorks() {
        assertThrows(IllegalArgumentException.class,
                () -> mySchool.deleteStudent(1));
    }


}