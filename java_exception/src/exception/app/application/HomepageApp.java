package exception.app.application;

import java.util.Scanner;

public class HomepageApp {
    public static void HomePage() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("===== HOME PAGE =====");
        System.out.println("[1] - Input Transaction");
        System.out.println("[2] - Master Data");
        System.out.println("[0] - Logout");
        System.out.println();
        System.out.println("Input Next Command (Number)");
        Integer menu = inputScanner.nextInt();

        switch(menu) {
            case 1 : System.out.println("Go to Menu Input transaction");
            break;
            case 2 : System.out.println("Go to Menu Master");
            break;
            case 0 : System.out.println("Go to Menu Logout");
            break;
        }
        inputScanner.close();
    }
       
    
    
}
