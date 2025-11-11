package page;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AppContext {

    private final Scanner scanner;
    private String sharedData;
    private final List<String> todoList;

    public AppContext() {
        this.scanner = new Scanner(System.in);
        this.sharedData = "Belum ada data yang di-scan.";
        this.todoList = new ArrayList<>();
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

    public void addTodo(String todo) {
        this.todoList.add(todo);
    }

    public List<String> getTodoList() {
        return this.todoList;
    }

    public void close() {
        this.scanner.close();
    }
}