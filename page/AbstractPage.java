package page;
import java.util.Scanner;

public abstract class AbstractPage implements Page {

    protected final String title;

    public AbstractPage(String title) {
        this.title = title;
    }

    protected void showHeader() {
        System.out.println("||========================================||");
        System.out.println("||        APLIKASI CLI OOP JAVA           ||");
        System.out.println("||========================================||");
        System.out.println();
    }

    protected void showTitle() {
        System.out.println("--- " + this.title.toUpperCase() + " ---");
        System.out.println("------------------------------------------");
    }

    protected void showFooter() {
        System.out.println("------------------------------------------");
        System.out.println("|| (c) 2025 | Tugas Pemrograman II      ||");
        System.out.println("||======================================||");
    }

    protected String prompt(Scanner scanner, String message) {
        System.out.print(message + " ");
        return scanner.nextLine();
    }

    @Override
    public abstract String display(AppContext context);
}