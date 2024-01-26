import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a to-do item");
            System.out.println("2. Delete a to-do item");
            System.out.println("3. View to-do items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String addItem = scanner.nextLine();
                    todoList.addItem(addItem);
                    break;
                case 2:
                    System.out.print("Enter the item to delete: ");
                    String deleteItem = scanner.nextLine();
                    todoList.removeItem(deleteItem);
                    break;
                case 3:
                    System.out.println("To-do items:");
                    for (String item : todoList.getItems()) {
                        System.out.println(item);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
