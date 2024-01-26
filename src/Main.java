public class Main {
    public static void main(String[] args){


        //client will interact with the system using the TodoFacade class - Facade design pattern
        TodoFacade todoFacade = new TodoFacade();
        todoFacade.addItem("Do assigment");
        todoFacade.addItem("Do math assigment");
        todoFacade.viewItem();

        todoFacade.delItem("Do assigment");
        todoFacade.viewItem("Do assigment");

    }
}
