import java.util.ArrayList;
import java.util.List;

/**Subsystem class
 *  It’s responsible for the actual management of the to-do items,
 *  including adding items, removing items, and getting the list of items.
 *  This class encapsulates the data (the to-do items) and the operations that can be performed on this data.*/

public class TodoList {

    private List<String> items;

    public TodoList(){
        items = new ArrayList<>();
    }

    public void addItem(String item){
        items.add(item);

        System.out.println("\nYour ToDo List:");
        for (String i : this.getItems()) {
            System.out.println(item);
        }
    }

    public void removeItem(String item){
        items.remove(item);

        System.out.println("\nYour ToDo List:");
        for (String i : this.getItems()) {
            System.out.println(item);
        }
    }

    public List<String> getItems(){
        return items;
    }

}
