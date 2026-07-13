public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[]{
                "cat",
                "dog",
                "horse",
                "chicken",
                "fish"
        };

        String animal = animals[3];
        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}
