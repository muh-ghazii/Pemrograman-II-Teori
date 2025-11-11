package page;
import java.util.List;

public class ViewTodoPage extends AbstractPage {

    public ViewTodoPage() {
        super("FITUR: LIHAT SEMUA TODO");
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();

        List<String> todos = context.getTodoList();

        if (todos.isEmpty()) {
            System.out.println("Daftar pekerjaan masih kosong.");
        } else {
            System.out.println("Daftar Pekerjaan Anda:");
            for (int i = 0; i < todos.size(); i++) {
                System.out.println((i + 1) + ". " + todos.get(i));
            }
        }
        showFooter();
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");
        return "MENU";
    }
}