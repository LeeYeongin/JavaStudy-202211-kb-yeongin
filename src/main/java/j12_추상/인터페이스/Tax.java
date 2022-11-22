package j12_추상.인터페이스;

/*
    연말정산
 */
public class Tax implements Calculator{ // 인터페이스에 의해 추상메소드를 가지고있으므로 추상클래스로 만들어주거나
                                        // override 해줘야한다. -> 추상클래스로 만들면 클래스를 독립적으로 사용 불가 -> override 해주기
    @Override
    public int calc(int[] values) {
        System.out.println("연말정산을 진행합니다.");
        int result = 0;
        for (int i = 0; i < values.length; i++){
            result += values[i];
        }
        return result;
    }
}
