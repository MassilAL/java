import java.util.Scanner;
public class TP2 {
    public static void main(String[] args) {
        //discriminant();
        //partie();
        //max();
        min();
        egalitestr();
        countdown();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        float delta = (float) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        }
        if (delta == 0) {
            delta = (int) (-b / 2 * a);
            System.out.println(delta);
        } else if (delta > 0) {
            System.out.print("x1: ");
            delta = (float) (-b + Math.sqrt(delta) / 2 * a);
            System.out.println(delta);
            System.out.print("x2: ");
            delta = (float) ((-b) - Math.sqrt(delta) / 2 * a);
            System.out.println(delta);

        }

    }

    public static void partie() {
        System.out.println("saisir un entier:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " est pair");
        }
        else{
            System.out.println(num + " est impair");
        }
    }
    public static void max() {
        System.out.println("saisir un entier:");
        Scanner scanner = new Scanner (System.in);
        int nombre= scanner.nextInt();
        System.out.println("saisir un second entier:");
        int nombre2= scanner.nextInt();
        if (nombre>nombre2) {
            System.out.println(nombre + " est le max");
        }
        else{
            System.out.println(nombre2 + " est le max");
        }
    }
    public static void min() {
        System.out.println("saisir un entier:");
        Scanner scanner = new Scanner (System.in);
        int number= scanner.nextInt();
        System.out.println("saisir un second entier:");
        int number2= scanner.nextInt();
        if (number>number2) {
            System.out.println(number2 + " est le min");
        }
        else{
            System.out.println(number + " est le min");
        }
    }
    public static void egalitestr() {
        System.out.println("saisir une chaine de caractere:");
        Scanner scanner = new Scanner (System.in);
        String chaine = scanner.next();
        System.out.println("saisir une seconde chaine de caractere:");
        String chaine2 = scanner.next();
        if(chaine.equals(chaine2)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        long factorielle = 1;
        for (int i = 1; i <= n; i++) {

            factorielle *= i;
            System.out.println(n + "! = " + factorielle);
        }
    }
    public static void countdown() {

        for (int i = 10;i>=0; i--) {

            if (i==0){
                System.out.println("BOOM!");
            }
            else {System.out.println(i);}
        }

    }
}
