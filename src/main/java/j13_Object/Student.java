package j13_Object;

import java.util.Objects;

public class Student {

    private int code;
    private String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 주소가 같은지 비교
        if (o == null || getClass() != o.getClass()) return false; //getClass() == instanceof
        Student student = (Student) o;
        return code == student.code && Objects.equals(name, student.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(code, name);  // 변수 값으로 새로운 hashCode생성 -> 변수 값이 같으면 hashCode값도 같음
    }
}
