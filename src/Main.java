import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        TodoFacade todoListFacade = new TodoFacade();
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
                    todoListFacade.todoAddItem(addItem);
                    break;
                case 2:
                    System.out.print("Enter the item to delete: ");
                    String deleteItem = scanner.nextLine();
                    todoListFacade.todoDelItem(deleteItem);
                    break;
                case 3:
                    System.out.println("To-do items:");
                    todoListFacade.todoViewItem();
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
