package j12_추상.인터페이스;

public class CalcMain {

    public static void main(String[] args) {
        int[] taxPay = new int[] {0, 0, 0, 0};  //2000000, 2500000, 2600000, 2700000
        int[] salaryPay = new int[] {1000000, 1000000, 1000000, 1000000};

        int result1 = 0;
        int result2 = 0;

        // 같은 form안에서 다른 기능사용가능
        Calculator calculator = new Tax();  // 업캐스팅
        result1 = calculator.calc(taxPay);
        if (result1 == 0) {
            System.out.println("오류: " + calculator.ERROR_CODE); // Calculator.ERROR_CODE로 주로 사용
        }else{
            System.out.println("result1 => " + result1);
        }

        calculator = new Salary();
        result2 = calculator.calc(salaryPay);
        if (result2 == 0) {
            System.out.println("오류: " + calculator.ERROR_CODE);
        }else{
            System.out.println("result2 => " + result2);
        }
    }

}