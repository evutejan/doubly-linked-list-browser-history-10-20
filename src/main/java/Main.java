import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("=== Browser History Simulator ===");

        while (choice != 5) {
            System.out.println("Menu:");
            System.out.println("1. Visit new page");
            System.out.println("2. Go back");
            System.out.println("3. Go forward");
            System.out.println("4. View current page");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    System.out.println("Enter URL: ");
                    String url = sc.nextLine();
                    browser.visit(url);
                } else if (choice == 2) {
                    browser.back();
                } else if (choice == 3) {
                    browser.forward();
                } else if (choice == 4) {
                    System.out.println(browser.getCurrentPage());
                } else if (choice == 5) {
                    System.out.println("Exiting... Good bye!");
                } else {
                    System.out.println("Invalid choice.");
                }
            } else sc.next();
        }
        sc.close();
    }
}