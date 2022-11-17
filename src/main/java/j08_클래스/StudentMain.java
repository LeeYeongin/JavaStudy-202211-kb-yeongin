package j08_클래스;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("부경대학교", "홍길순", 2, false);

        student.school = "부산대학교";
        student.name = "홍길동";
        student.studentYear = 3;
        student.gender = true;

        student.showStudentInfo();
        System.out.println();
        student2.showStudentInfo();
    }
}

/*
    Class: Student, StudentMain
    학생 정보
    String school(학교명)
    String name(학생이름)
    int studentYear(학년)
    boolean gender(성별 true = 남, false = 여)

    showStudentInfo(){
        학교명: 부산대학교
        이름: 홍길동
        학년: 3
        성별: 남
    }
 */
