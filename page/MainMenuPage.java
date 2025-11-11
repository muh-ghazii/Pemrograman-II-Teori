package page;

public class MainMenuPage extends AbstractPage {

    public MainMenuPage() {
        super("MENU UTAMA");
    }

    @Override
    public String display(AppContext context) {
        showHeader(); // <-- DITAMBAHKAN
        showTitle();

        System.out.println("1. Scan Input Pengguna");
        System.out.println("2. Tampilkan Input Tersimpan");
        System.out.println("0. Keluar");

        showFooter(); // <-- DITAMBAHKAN

        String choice = prompt(context.getScanner(), "Pilih menu (0-2):");

        switch (choice) {
            case "1":
                return "SCAN";
            case "2":
                return "DISPLAY";
            case "0":
                return "EXIT";
            default:
                System.out.println("Pilihan tidak valid, coba lagi.");
                return "MENU";
        }
    }
}