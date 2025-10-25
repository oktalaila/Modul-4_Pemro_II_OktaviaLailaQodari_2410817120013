package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih jenis hewan yang ingin diinputkan: 1= Kucing 2= Anjing\nMasukkan pilihan: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String name = input.nextLine();
            System.out.print("Ras: ");
            String breed = input.nextLine();
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();

            Cat cat = new Cat(name, breed, furColor);

            cat.display();
        } else if (choice == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String name = input.nextLine();
            System.out.print("Ras: ");
            String breed = input.nextLine();
            System.out.print("Warna Bulu: ");
            String furColor = input.nextLine();
            System.out.print("Kemampuan: ");
            String abilitiesInput = input.nextLine();
            String[] abilities = abilitiesInput.split(",\\s*");

            Dog dog = new Dog(name, breed, abilities);

            dog.display();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}