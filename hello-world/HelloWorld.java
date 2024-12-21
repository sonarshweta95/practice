public class HelloWorld {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}