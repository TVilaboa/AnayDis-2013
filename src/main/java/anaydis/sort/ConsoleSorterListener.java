package anaydis.sort;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 27/08/13
 * Time: 10:18
 */
public class ConsoleSorterListener implements SorterListener {

    int greater=0;
    int swap=0;

    @Override
    public void greater(int i, int j) {
        System.out.println("Se comparo el elemento en la posicion " + i +" con el elemento" +
                "en la posicion "+ j);
        greater++;
    }

    @Override
    public void swap(int i, int j) {
        System.out.println("Se intercambio el elemento en la posicion " + i +" con el elemento" +
                "en la posicion "+ j);
        swap++;
    }

    public int getGreater() {
        return greater;
    }

    public int getSwap() {
        return swap;
    }
}
