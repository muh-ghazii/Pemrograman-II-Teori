package page;

public class ScanInputPage extends AbstractPage {

    public ScanInputPage() {
        super("FITUR: SCAN INPUT");
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();
        String input = prompt(context.getScanner(), "Masukkan data baru:");
        showFooter();
        context.setSharedData(input);


        System.out.println("\nData berhasil disimpan!");
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");

        return "MENU";
    }
}