public class product implements displayDet {


    protected String name;
    protected double price;
    protected int id;

    public product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    // Discount method overloading
    public void discount(double percentage) {
        price -= price * (percentage / 100);
    }

    public void discount(double Amount, boolean isFlat) {
        if (isFlat) {
            price = price - Amount;

        } else {
            price = price * (Amount / 100);
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name + "Price: " + price + "ID: " + id);
    }

}


