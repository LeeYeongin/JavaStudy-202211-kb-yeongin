package j16_컬렉션.List;

import java.util.ArrayList;

public class StringList {

    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Jsp";
        strArray[2] = "Servlet";

        //일반 반복
        System.out.println("<<<<< 일반반복 >>>>>");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        System.out.println();

        //foreach
        System.out.println("<<<<< foreach >>>>>");
        for (String str : strArray) {
            System.out.println(str);
        }

        ArrayList<String> strList = new ArrayList<String>();
        //값 추가(Create) -> add(값), add(index, 값)
        strList.add("Java");
        strList.add("jsp");
        strList.add("Servlet");
        strList.add(1, "C++"); // add는 추가하는 기능이므로 기존 index 1번 이후의 데이터는 한칸씩 뒤로 미뤄짐
        strList.add(0, "HTML");

        System.out.println();
        System.out.println("<<<<< list foreach >>>>>");
        for (String str : strList) {
            System.out.println(str);
        }

        //값 조회(Read) -> get(index)
        System.out.println();
        System.out.println("<<<<< list 일반반복 >>>>>");
        for (int i = 0; i < strList.size(); i++) { //length X -> size O
            System.out.println(strList.get(i)); //list와 map에는 get존재
        }

        System.out.println();
        //값 수정(Update) -> set(index, 값)
        strList.set(0, "HTML5");
        System.out.println(strList);

        System.out.println();
        //값 삭제(Delete) -> remove(index)
        String removeData = strList.remove(2);
        System.out.println(removeData);
        System.out.println(strList);
    }
}