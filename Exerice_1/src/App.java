import java.util.Scanner;

public class App {

    public static void fibonacci(int nombre) {
        int TermUn = 0, TermDeux = 1;
        System.out.println("Fibonacci Series till " + nombre + " terms:");

        int i=1;
        do {
        // compute the next term
            int termSuivant = TermUn + TermDeux;
            TermUn = TermDeux;
            TermDeux = termSuivant;
            System.out.print(TermUn + ", ");
            i++;
        } while (TermDeux < nombre);

    }

    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("entrez un nombre entier");
        int nombre = scanner.nextInt();
       fibonacci(nombre); 
    }

    
}

