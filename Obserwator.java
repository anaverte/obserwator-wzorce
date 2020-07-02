package obserwator;

import java.util.Scanner;

public class Obserwator {

    public static void main(String[] args) {
        ZegarCentralny zegarCentralny = new ZegarCentralny();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean centralny = false;
        boolean pokojowy = false;
        boolean kuchenny = false;
        boolean ogrodowy = false;
        IWyswietlacz wyswietlaczPokojowy = new WyswietlaczPokojowy();
        IWyswietlacz wyswietlaczKuchenny = new WyswietlaczKuchenny();
        IWyswietlacz wyswietlaczOgrodowy = new WyswietlaczOgrodowy();

        System.out.println("Menu");
        System.out.println("1. Aby uruchomić zegar centralny naciśnij \"1\".");
        System.out.println("2. W celu dodania/usunięcia wyświetlacza pokojowego naciśnij \"2\".");
        System.out.println("3. W celu dodania/usunięcia wyświetlacza kuchennego naciśnij \"3\".");
        System.out.println("4. W celu dodania/usunięcia wyświetlacza ogrodowego naciśnij \"4\".");
        System.out.println("5. Aby zatrzymać działanie programu naciśnij \"0\".");

        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (!centralny) {
                        zegarCentralny.start();
                        System.out.println("Zegar centralny zaczął odmierzać czas.");
                        centralny = true;
                    } else {
                        System.out.println("Zegar centralny już został uruchomiony.");
                    }
                    break;
                case 2:
                    if (!pokojowy) {
                        pokojowy = true;
                        zegarCentralny.dodajWyswietlacz(wyswietlaczPokojowy);
                        System.out.println("Dodano wyświetlacz pokojowy.");
                    } else {
                        pokojowy = false;
                        zegarCentralny.usunWyswietlacz(wyswietlaczPokojowy);
                        System.out.println("Usunięto wyświetlacz pokojowy.");
                    }
                    break;
                case 3:
                    if (!kuchenny) {
                        kuchenny = true;
                        zegarCentralny.dodajWyswietlacz(wyswietlaczKuchenny);
                        System.out.println("Dodano wyświetlacz kuchenny.");
                    } else {
                        kuchenny = false;
                        zegarCentralny.usunWyswietlacz(wyswietlaczKuchenny);
                        System.out.println("Usunięto wyświetlacz kuchenny.");
                    }
                    break;
                case 4:
                    if (!ogrodowy) {
                        ogrodowy = true;
                        zegarCentralny.dodajWyswietlacz(wyswietlaczOgrodowy);
                        System.out.println("Dodano wyświetlacz ogrodowy.");
                    } else {
                        ogrodowy = false;
                        zegarCentralny.usunWyswietlacz(wyswietlaczOgrodowy);
                        System.out.println("Usunięto wyświetlacz ogrodowy.");
                    }
                    break;
                case 0:
                    zegarCentralny.zatrzymajZegar();
                    System.out.println("Zegar zatrzymany.");
                    System.out.println("Koniec.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Podano nieprawidłową wartość.\nProszę wybrać ponownie.");
            }
        } while (choice != 0);
    }
}
