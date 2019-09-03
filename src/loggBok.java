import java.util.ArrayList;
import java.util.Scanner;

public class loggBok {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        printMenu();
        int input = tgb.nextInt();
        ArrayList<String> posts = new ArrayList<String>();
        switch (input) {
            case 1:
                System.out.println("Under konstruktion");
                break;
            case 2:
                System.out.println("Under konstruktion");
                break;
            case 3:
                System.out.println("Under konstruktion");
                break;
            case 4:
                System.out.println("Under konstruktion");
                break;
            case 5:
                System.out.println("Under konstruktion");
                break;
            case 6:
                System.out.println("Under konstruktion");
                break;
            default:
                System.out.println("Ogiltigt input");
                break;
        }
    }


    private static void printMenu(){
        System.out.println("Välj ett alternativ" + "\n"+
                "1. Visa" +"\n"+
                "2. Lägg till post" + "\n"+
                "3. Uppdatera" +"\n"+
                "4. Spara" +"\n"+
                "5. LÄs in" + "\n" +
                "6. Avsluta" );
    }
}
