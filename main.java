import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int polski; 
        int matematyka; 
        int programowanie; 
        int historia;

        System.out.print("Podaj ocenę z polskiego: ");
        polski = scanner.nextInt();

        System.out.print("Podaj ocenę z matematyki: ");
        matematyka = scanner.nextInt();

        System.out.print("Podaj ocenę z programowania: ");
        programowanie = scanner.nextInt();

        System.out.print("Podaj ocenę z historii: ");
        historia = scanner.nextInt();

        double srednia = (polski+ matematyka+ programowanie+ historia) / 4;

        System.out.printf("Średnia ocen wynosi: %.2f", srednia);
    }
}