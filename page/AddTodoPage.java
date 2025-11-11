package page;

public class AddTodoPage extends AbstractPage {

    public AddTodoPage() {
        super("FITUR: TAMBAH TODO");
    }

    @Override
    public String display(AppContext context) {
        showHeader();
        showTitle();

        System.out.println("Tambahkan pekerjaan baru ke daftar:");
        showFooter();
        String todo = prompt(context.getScanner(), "Pekerjaan baru: ");
        context.addTodo(todo);

        System.out.println("\n'" + todo + "' telah ditambahkan ke daftar.");
        prompt(context.getScanner(), "Tekan Enter untuk kembali ke menu...");

        return "MENU";
    }
}