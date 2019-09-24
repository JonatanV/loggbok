import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class loggBok {
    public static void main(String[] args) {

        Scanner tgb = new Scanner(System.in);
        ArrayList<LogEntry> posts = new ArrayList<LogEntry>();
        while (true) {
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
                System.out.println("REDIGERA");
                edit(posts, tgb);
                break;
            case 4:
                System.out.println("SPARA");
                save(posts);
                break;
            case 5:
                System.out.println("LÄS IN");
                read(posts);
                break;
            case 6:
                System.out.println("AVSLUTA");
                quit();
                break;
            default:
                System.out.println("Ogiltigt input");
                break;
        }
    }

    private static void read(ArrayList<LogEntry> posts) {
        String filenameBin = "randomNumbers.bin";
        try {
            DataInputStream binIn = new DataInputStream(new BufferedInputStream(new FileInputStream(filenameBin)));
            while (binIn.available() > 0) {

                char c;
                String msg = "";
                while ((c = binIn.readChar()) != ',' && binIn.available() > 0) {
                    msg += c;
                }
                posts.add(new LogEntry(msg));
            }
            binIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void save(ArrayList<LogEntry> posts) {
        String filenameBin = "randomNumbers.bin";
        try {
            DataOutputStream binOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filenameBin)));
            binOut.writeChars(String.valueOf(posts));
            binOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
    }

    private static void edit(ArrayList<LogEntry> posts, Scanner tgb) {
        System.out.println("Välj en post att redigera ");
        index(posts);
        int elementAt = tgb.nextInt();
        tgb.nextLine();
        String newMessage = tgb.nextLine();
        posts.get(elementAt).update(newMessage);
    }

    private static void index(ArrayList<LogEntry> posts) {
        for (int i = 0; i < posts.size(); i++) {
            System.out.println(i + posts.get(i).toString());
        }
    }

    private static void show(ArrayList<LogEntry> posts) { //visar vad som finns i ArrayListen
        System.out.println(posts + "\n");
    }

    private static void quit() {
        System.exit(0);
    }


    private static void add(ArrayList<LogEntry> posts, Scanner tgb) { //Lägger till en ny post
        String newPost = tgb.nextLine();
        posts.add(new LogEntry(newPost));
    }


    private static void printMenu() { // skriver ut menyn
        System.out.println("Välj ett alternativ" + "\n" +
                "1. Visa" + "\n" +
                "2. Lägg till post" + "\n" +
                "3. Uppdatera" + "\n" +
                "4. Spara" + "\n" +
                "5. LÄs in" + "\n" +
                "6. Avsluta");
    }
}
