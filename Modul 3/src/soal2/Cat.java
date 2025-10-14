package soal2;

public class Cat extends Pet {
    private String furColor;

    public Cat(String n, String r, String fc) {
        super(n, r); // Call parent constructor
        this.furColor = fc;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu: " + furColor);
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}