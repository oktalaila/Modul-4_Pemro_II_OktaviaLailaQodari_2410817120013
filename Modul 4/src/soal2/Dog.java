package soal2;

public class Dog extends Pet {
    private String[] abilities;

    public Dog(String n, String r, String[] ab) {
        super(n, r);
        this.abilities = ab;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("Memiliki kemampuan: ");
        if (abilities != null) {
            for (int i = 0; i < abilities.length; i++) {
                System.out.print(abilities[i]);
                if (i < abilities.length - 1) {
                    System.out.print("  ");
                }
            }
        }
        System.out.println();
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }
}