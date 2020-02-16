import java.util.ArrayList;
import java.util.List;

public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        Notebook heavyNotebook = new Notebook(2000, 1500, 2016);
        Notebook oldNotebook = new Notebook(1600, 500, 2011);

        List<Notebook> notebookList = new ArrayList<>();
        notebookList.add(notebook);
        notebookList.add(heavyNotebook);
        notebookList.add(oldNotebook);

        for(Notebook notebook1: notebookList) {
            checkParameters(notebook1);
        }

    }
    public static void checkParameters(Notebook notebook){
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkHowOld();
    }
}