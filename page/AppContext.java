package page;
import java.util.Scanner;

public class AppContext {

    private final Scanner scanner;
    private String sharedData;

    public AppContext() {
        this.scanner = new Scanner(System.in);
        this.sharedData = "Belum ada data yang di-scan.";
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public String getSharedData() {
        return this.sharedData;
    }

    public void setSharedData(String data) {
        this.sharedData = data;
    }

    public void close() {
        this.scanner.close();
    }
}