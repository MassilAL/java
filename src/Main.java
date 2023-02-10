import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
        System.out.println("Bonjour quel est votre prénom?");
        String prenom = scanner.next();
        System.out.println("Bonjour "+ prenom);
        volume();
    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + somme);


    }
    public static void div() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float pEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir le deuxieme entier");
        float dEntier = scanner.nextFloat();
        float div = pEntier / dEntier;
        System.out.println("La division de " + pEntier + " avec " + dEntier +
                " est egale a " + div);


    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longeur");
        float longeur = scanner.nextFloat();
        System.out.println("Veuillez saisir la hauteur");
        float hauteur = scanner.nextFloat();
        System.out.println("Veuillez saisir la largeur");
        float largeur = scanner.nextFloat();
        float volume = longeur*hauteur*largeur;
        System.out.println("Le volume du carré est" + volume + "m3");


    }
}
