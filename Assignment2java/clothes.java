public class clothes extends product{

    private String size;

    public clothes(String name, double price, int id, String size) {
        super(name, price, id);
        this.size = size;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
    }
    
}
