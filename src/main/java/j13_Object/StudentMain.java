package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args){
        Student student = new Student(20220001, "김준일");
        Student student2 = new Student(20220001, "김준일");

        System.out.println(student);
        System.out.println(student2);

        System.out.println();
        System.out.println(student == student2);
        System.out.println(student.equals(student2)); // 클래스를 비교 -> 다른 패키지에 있는 경우 비교X

        System.out.println();
        print(student);

        System.out.println();
        System.out.println(student.hashCode()); // override전에는 실제 주소 출력
        System.out.println(student2.hashCode());// override후 새로운 hashCode생성
        System.out.println(student.hashCode() == student2.hashCode());  // 클래스는 중요X -> 들어있는 값을 중점으로 비교

        Class c = student.getClass();
        System.out.println(c);
        System.out.println(c.getName()); // package.class 이름을 가져옴
        System.out.println(c.getSimpleName()); // class 이름만 가져옴

        System.out.println();
        Field[] fields = c.getDeclaredFields();
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getName());    // 변수명 가져오기
        }

        System.out.println();
        Method[] methods = c.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i].getName());   // 메소드명 가져오기
        }

    }
}
