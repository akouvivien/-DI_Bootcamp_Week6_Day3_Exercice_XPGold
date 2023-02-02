import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        int positive = 0;
        int negative = 0;
        int zeros = 0;



        System.out.println("combien de nombre voulez vous enregistrer");
        int choix = scanner.nextInt();
        int i = 1;
        do {
            System.out.println("entrez le nombre "+i);
            int nombre = scanner.nextInt();
            myList.add(nombre);
            
            i++;
        } while (i <= choix);
        System.out.println();
        for (int el : myList) {
             System.out.println();
            if (el > 0) {
                System.out.println("le nombre de positives");
                positive ++;
                System.out.println(positive);
            } else if (el == 0) {
                System.out.println("le nombres des zeros");
                zeros ++;
                System.out.println(zeros);
            } else  {
                System.out.println(" le nombre  de negatives");
                negative ++;
                System.out.println(negative);
            }
        }

    }
    }
