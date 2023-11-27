import java.util.Scanner;

public class Main2 {
    public static void main (String[] args) {
        Scanner requisiti = new Scanner(System.in);
        System.out.println("inserisci i tuoi dati");
        String name = requisiti.nextLine();
        String surname = requisiti.nextLine();
        String email = requisiti.nextLine();

        System.out.println(name + surname + " " + email );
    }
}
