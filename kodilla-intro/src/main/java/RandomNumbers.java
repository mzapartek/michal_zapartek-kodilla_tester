import java.util.Random;

public class RandomNumbers {
    private int minimum = 30;
    private int maximum = 0;

    public void drawNumbers() {
        Random random = new Random();
        int sum = 0;

        while (sum <= 5000) {
            int number = random.nextInt(31);
            sum = sum + number;

            if (number < minimum) {
                minimum = number;
            }

            if (number > maximum) {
                maximum = number;
            }
        }
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();

        randomNumbers.drawNumbers();

        System.out.println("Najmniejsza liczba: " + randomNumbers.getMinimum());
        System.out.println("Największa liczba: " + randomNumbers.getMaximum());
    }
}