package Lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void zadanie1() {
        Set<String> zbiorDni = new TreeSet<>();
        zbiorDni.add("poniedziałek");
        zbiorDni.add("wtorek");
        zbiorDni.add("środa");
        zbiorDni.add("czwartek");
        zbiorDni.add("piątek");
        zbiorDni.add("sobota");
        zbiorDni.add("niedziela");

        for (String dzien : zbiorDni) {
            System.out.println(dzien);
        }
        /*
        Tree przechowuje dane w inny sposob niz Hash
         */
    }

    public static void zadanie2() {
        Map<String, Teacher> prowadzacy = new HashMap<>();
        Teacher T1 = new Teacher("Jan", "Nowak", "JNowak@mail.pl", "programowanie obiektowe");
        Teacher T2 = new Teacher("Aleksander", "Nowak", "ANowak@mail.pl", "super fajny przedmiot");
        Teacher T3 = new Teacher("Tomasz", "Kowalski", "TKowalski@mail.pl", "przetwarzanie obrazów");
        Teacher T4 = new Teacher("Roman", "Kowalski", "RKowalski@mail.pl", "technika cyfrowa");

        prowadzacy.put("programowanie obiektowe", T1);
        prowadzacy.put("inne", T2);
        prowadzacy.put("dziwne", T3);
        prowadzacy.put("przedmioty", T4);

        Teacher _prowadzacy = prowadzacy.get("programowanie obiektowe");
        System.out.println("\nProwadzacy programowanie obiektowe: " + _prowadzacy + "\n");

        List<Student> A32 = new ArrayList<>();
        A32.add(new Student("Marcin", "Jabłoński", "Jablonski@armyspy.com", "32A"));
        A32.add(new Student("Ania", "Adamska", "AniaAdamska@jourrapide.com", "32A"));
        A32.add(new Student("Krystiana", "Piotrowska", "KrystianaPiotrowska@armyspy.com ", "32A"));
        A32.add(new Student("Celestyna", "Rutkowska", "CelestynaRutkowska@rhyta.com ", "32A"));
        A32.add(new Student("Krzysztof", "Adamczyk", "KrzysztofAdamczyk@armyspy.com ", "32A"));

        List<Student> A35 = new ArrayList<>();
        A32.add(new Student("Marcin", "Nowak", "Nowak1@armyspy.com", "35A"));
        A32.add(new Student("Ania", "Nowak", "Nowak2@jourrapide.com", "35A"));
        A32.add(new Student("Krystiana", "Nowak", "Nowa3@armyspy.com ", "35A"));
        A32.add(new Student("Celestyna", "Nowak", "Nowak4@rhyta.com ", "35A"));
        A32.add(new Student("Krzysztow", "Nowak", "NowaK5@armyspy.com ", "35A"));

        List<Student> A39 = new ArrayList<>();
        A32.add(new Student("Adam", "Biernat", "Nowak1@armyspy.com", "39A"));
        A32.add(new Student("Ania", "Biernat", "Nowak2@jourrapide.com", "39A"));
        A32.add(new Student("Artur", "Biernat", "Nowa3@armyspy.com ", "39A"));
        A32.add(new Student("Antoni", "Biernat", "Nowak4@rhyta.com ", "39A"));
        A32.add(new Student("Arnold", "Biernat", "NowaK5@armyspy.com ", "39A"));

        Map<String, List> grupy = new HashMap<>();
        grupy.put("32A", A32);
        grupy.put("35A", A35);
        grupy.put("39A", A39);

        List<Student> Studenci_32A = grupy.get("32A");
        System.out.println("Lista studentow 32A: ");
        for (Student S : Studenci_32A) {
            if (S.getGroupID().compareTo("32A") == 0) {
                System.out.println(S);
            }
        }
    }

    public static void readFromFile() {
        try (BufferedReader in = new BufferedReader(new FileReader("plik.txt"))) {

            String s = in.readLine();

            while (s != null) {
                System.out.println(s);

                s = in.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void zadanie3() {

        ArrayList<Product> ListaProduktow = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader("plik.txt"))) {

            String s = in.readLine();

            while (s != null) {
                //System.out.println(s);
                String[] pola = s.split(";");
                //_id, String _name, String _price, String _category
                ListaProduktow.add(new Product(pola[0], pola[1], pola[3], pola[2]));
                s = in.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        Map<Integer, Product> produktPoID = new HashMap<>();
        for (Product P : ListaProduktow) {
            produktPoID.put(P.getID(), P);
        }
/*
        Map<String, List<Product>> produktyWKategorii = new HashMap<>();
        for (Product P : ListaProduktow) {

        }
*/

Map<String, List<Product>> produktyWKategorii = new HashMap<String, List<Product>>();
    for (Product item : ListaProduktow) {
        if (!produktyWKategorii.containsKey(item.getCategory())) {
            produktyWKategorii.put(item.getCategory(), new ArrayList<Product>());
        }
        produktyWKategorii.get(item.getCategory()).add(item);
    }
    }

    public static void main(String[] args) {
        zadanie1();
        zadanie2();
        zadanie3();
    }

}
