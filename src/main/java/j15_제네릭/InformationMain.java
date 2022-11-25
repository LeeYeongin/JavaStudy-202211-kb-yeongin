package j15_제네릭;

public class InformationMain {

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .name("박준현")
                .build();

        Teacher teacher = Teacher.builder()
                .teacherCode(200)
                .name("김준일")
                .build();

        Information<Student> studentInformation
                = new Information<Student>(student);

        Information<Teacher> teacherInformation
                = new Information<>(teacher);

        Information2 i1 = new Information2(student);    // upcasting 발생
        Information2 i2 = new Information2(teacher);

        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생이름: " + studentInformation.getTarget());  // student type
        System.out.println("학생이름2: " + i1.getTarget()); // object type -> student로 downcasting해줘야함
    }
}
