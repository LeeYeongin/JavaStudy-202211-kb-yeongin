package j06_반복;

public class Continue {

    public static void main(String[] args) {
        int count = 0;

        while(true){
            count++;
            System.out.println("나무를 " + count + "번 찍습니다.");
            if(count < 10){
                continue;   //현재 반복을 멈추고 다음 반복으로 넘어감
            }
            System.out.println("나무가 넘어갑니다.");
            break;
        }
    }
}
