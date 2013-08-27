package anaydis.sort;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 27/08/13
 * Time: 11:04
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        InsertionSorter insertionSorter = new InsertionSorter();
        SelectionSorter selectionSorter = new SelectionSorter();
        BubbleSorter bubbleSorter = new BubbleSorter();
        OnlyCountsSorterListener countsInsert=new OnlyCountsSorterListener();
        insertionSorter.addSorterListener(countsInsert);
        OnlyCountsSorterListener countsSelect= new OnlyCountsSorterListener();
        selectionSorter.addSorterListener(countsSelect);
        OnlyCountsSorterListener countsBubble=new OnlyCountsSorterListener();
        bubbleSorter.addSorterListener(countsBubble);
        IntDataSetGenerator setGenerator=new IntDataSetGenerator();


    }
}
