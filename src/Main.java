import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pasirinkite figūrą: (1 - Kvadratas, 2 - Trikampis)");
        int pasirinkimas = scanner.nextInt();

        Figura figura = null;
        if (pasirinkimas == 1) {
            System.out.println("Įveskite kvadrato kraštinės ilgį:");
            double krastine = scanner.nextDouble();
            figura = new Kvadratas(krastine);
        } else if (pasirinkimas == 2) {
            System.out.println("Įveskite trikampio pirmos statinės ilgį:");
            double krastine1 = scanner.nextDouble();
            System.out.println("Įveskite trikampio antros statinės ilgį:");
            double krastine2 = scanner.nextDouble();
            figura = new Trikampis(krastine1, krastine2);
        } else {
            System.out.println("Pasirinktas netinkamas variantas. Programos vykdymas nutrauktas.");
            System.exit(0);
        }

        figura.skaiciuokPlota();

        System.out.println(figura);

    }

}
