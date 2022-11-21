package j11_상속.동물;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();  //Animal객체 생성 후 Human객체 생성
        Tiger tiger = new Tiger();  //Animal객체 생성 후 Tiger객체 생성

        Animal hAnimal = (Animal) human;    //업캐스팅 -> 형변환 명시 필요 X
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[3];   //animal객체를 담기위한 우리 생성

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Animal();

        for(int i = 0; i < animals.length; i++){
            animals[i].move();
        }


        // 하위클래스 고유의 메소드를 사용하고 싶을때
        for(int i = 0; i < animals.length; i++){
            if(animals[i] instanceof Human){    //생성될때 Human객체였다면
                Human h = (Human) animals[i];   //다운캐스팅 -> 형변환 명시 필요
                h.readBooks();
            }else if(animals[i] instanceof Tiger){
                Tiger t = (Tiger) animals[i];
                t.hunting();
            }else{
                System.out.println("다운캐스팅 불가");
            }
        }

        /*
        Animal a = new Animal();
        Human h = (Human) a;
        다운캐스팅 불가 -> Human객체를 위한 공간 X(메모리 할당 X)
         */
    }
}
