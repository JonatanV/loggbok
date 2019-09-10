import java.util.ArrayList;
import java.util.Scanner;

public class loggBok {
    public static void main(String[] args) {

        Scanner tgb = new Scanner(System.in);
        ArrayList<LogEntry> posts = new ArrayList<LogEntry>();
        while(true) {
            printMenu();
            choose(tgb, posts);
        }
    }

    private static void choose(Scanner tgb, ArrayList<LogEntry> posts) { //gör att man kan välja ett alternativ
        int input = tgb.nextInt();
        String fix = tgb.nextLine();
        switch (input) {
            case 1:
                System.out.println("Visa");
                show(posts);
                break;
            case 2:
                add(posts, tgb);
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
                quit();
                break;
            default:
                System.out.println("Ogiltigt input");
                break;
        }
    }

    private static void show(ArrayList<LogEntry> posts) { //visar vad som finns i ArrayListen
        System.out.println(posts);
    }

    private static void quit() {
        System.exit(0);
    }


    private static void add(ArrayList<LogEntry> posts, Scanner tgb) { //Lägger till en ny post
        String newPost = tgb.nextLine();
        posts.add(new LogEntry(newPost));
    }


    private static void printMenu(){ // skriver ut menyn
        System.out.println("Välj ett alternativ" + "\n"+
                "1. Visa" +"\n"+
                "2. Lägg till post" + "\n"+
                "3. Uppdatera" +"\n"+
                "4. Spara" +"\n"+
                "5. LÄs in" + "\n" +
                "6. Avsluta" );
    }
}
