package page;

public class MainMenuPage extends AbstractPage {

    public MainMenuPage() {
        super("MENU UTAMA");
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();

        System.out.println("1. Scan Input Pengguna");
        System.out.println("2. Tampilkan Input Tersimpan");
        System.out.println("3. Tambah Todo");
        System.out.println("4. Lihat Semua Todo");
        System.out.println("0. Keluar");

        showFooter();
        String choice = prompt(context.getScanner(), "Pilih menu (0-4):");

        switch (choice) {
            case "1":
                return "SCAN";
            case "2":
                return "DISPLAY";
            case "3":
                return "ADD_TODO";
            case "4":
                return "VIEW_TODOS";
            case "0":
                return "EXIT";
            default:
                System.out.println("Pilihan tidak valid, coba lagi.");
                return "MENU";
        }
    }
}