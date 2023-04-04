public class Main {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 10;
        int num3 = 11;
        int num4 = 17;
        int sum1 = num1 + num4;
        int sum2 = num3 + num2;
        String result = sum1 > sum2 ? "True" : "False";
        System.out.println(result);
        sum1++;
        sum2-= 2;
        // Можна зменшити число на 2 використовуючи ще такий спосіб  (sum2--; sum2--;)
        System.out.println(sum1);
        System.out.println(sum2);

        String result1 = sum1 > sum2 ? "True" : "False";
        System.out.println(result1);
        String result3 = (sum1 % 2 == 0) || (sum2 % 2 == 0) ? "True" : "False";
        System.out.println(result3);
    }
}