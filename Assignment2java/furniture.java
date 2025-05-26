public class furniture extends product{
    private String material;

    public furniture(String name, double price, int id, String material) {
        super(name, price, id);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Material: " + material);
    }
    
}
