package page;

public class DisplayDataPage extends AbstractPage {

    public DisplayDataPage() {
        super("FITUR: TAMPILKAN DATA");
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();

        String data = context.getSharedData();

        System.out.println("Data yang tersimpan saat ini:");
        System.out.println("-> " + data);
        showFooter();
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");
        return "MENU";
    }
}