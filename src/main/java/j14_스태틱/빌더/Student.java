package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {    // 내부 클래스(클래스 안의 클래스)
        private int studentCode;    //똑같이 변수 선언
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode){ // 메소드명, 매개변수명은 변수이름이랑 똑같이
            this.studentCode = studentCode;
            return this;
        }

        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder address(String address){
            this.address = address;
            return this;
        }

        public Student build(){
            return new Student(studentCode, name, address);
        }

    }
}
