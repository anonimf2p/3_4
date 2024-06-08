import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę dla obliczenia silni: ");
        int mnozenie = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= mnozenie; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}