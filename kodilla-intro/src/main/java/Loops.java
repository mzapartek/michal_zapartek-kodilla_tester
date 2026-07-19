public class Loops {

    public static void main(String[] args) {
        int i = 0;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public int sumNumbers(int[] numbers) {
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }

        return result;
    }
}