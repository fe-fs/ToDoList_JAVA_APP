/**client will interact with the system using the TodoFacade class - Facade design pattern
 *
 * Its purpose is to provide a simplified interface to the TodoList subsystem.
 * It contains the same operations (add, remove, get), but these operations are simplified and can be accessed through the facade.
 * The facade delegates the operations to the subsystem.
 * */
import java.util.List;

public class TodoFacade {

    private TodoList todoList;

    //Intro messages
    Welcome welcome = new Welcome();

    //Constructor that initializes the facade with a TodoList subsystem.
    public TodoFacade(){
        todoList = new TodoList();
    }

    public void todoAddItem(String item){
        todoList.addItem(item);
        System.out.println("\nYour ToDo List:");
        todoViewItem();

    }
    public void todoDelItem(String item){
        todoList.removeItem(item);
        System.out.println("\nYour ToDo List:");
        todoViewItem();
    }

    //TodoListFacade is concerned with providing a simplified interface to the subsystem, including presentation logic.
    //That is why this method is here instead of all in the subclass
    public void todoViewItem(){
    List<String> items= todoList.getItems();
    for (String item: items){
        System.out.println(item);
    }
    }
}
