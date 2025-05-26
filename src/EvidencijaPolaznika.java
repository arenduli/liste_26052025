import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EvidencijaPolaznika {

    public static void main(String[] args) {
//        Set<Polaznik> polaznici = new HashSet<>();
        Set<Polaznik> polaznici = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Upišite 1 za dodavanje novog polaznika, ili upišite 2 za pregled svih polaznika, ili 0 za izlaz iz programa:");
            int izbor = scanner.nextInt();
            scanner.nextLine();

            if (izbor == 0) {
                break;
            } else if (izbor == 1) {
                System.out.print("Upišite ime: ");
                String ime = scanner.nextLine();
                System.out.print("Upišite prezime: ");
                String prezime = scanner.nextLine();
                System.out.print("Upišite e-mail: ");
                String email = scanner.nextLine();

                Polaznik noviPolaznik = new Polaznik(ime, prezime, email);

                if (!polaznici.add(noviPolaznik)) {
                    System.out.println("Polaznik s tim e-mailom već postoji!");
                } else {
                    System.out.println("Novi polaznik je dodan!");
                }
            } else if (izbor == 2) {
                System.out.println("Svi polaznici na tečaju:");
//                Set<Polaznik> sortedPolaznici = new TreeSet<>(polaznici);  //polaznici su sortirani samo kad izaberemo ispis, nisu cijelo vrijeme
                polaznici.forEach(System.out::println);
            } else {
                System.out.println("Pogrešan unos, pokušajte još jednom!");
            }
        }

        scanner.close();
    }
}
