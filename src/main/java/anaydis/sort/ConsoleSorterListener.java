package anaydis.sort;

import anaydis.sort.gui.SorterListener;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 27/08/13
 * Time: 10:18
 */
class ConsoleSorterListener implements SorterListener {


    @Override
    public void box(int from, int to) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void copy(int from, int to, boolean copyToAux) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void equals(int i, int j) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    private int greater=0;
    private int swap=0;

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
