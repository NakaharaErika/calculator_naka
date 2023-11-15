package numbers;


public class Number {
    public static int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = divideNumbers(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { 
        	System.out.println("エラー: " + e.getMessage() + "が発生したよ");
        }
    }
}