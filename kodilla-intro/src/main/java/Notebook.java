public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight <= 1600) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYearAndPrice() {
        if (this.year > 2018 && this.price >= 1000) {
            System.out.println("This notebook is new and has a good price.");
        } else if (this.year <= 2005 && this.price <= 600) {
            System.out.println("This notebook is old and cheap.");
        } else {
            System.out.println("This notebook has a standard price and production year.");
        }
    }
}