package anaydis.sort;

import anaydis.sort.gui.SorterListener;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 27/08/13
 * Time: 11:08
 */
public class OnlyCountsSorterListener implements SorterListener {

    private int greater=0;
    private int swap=0;

    public int getGreater() {
        return greater;
    }

    public int getSwap() {
        return swap;
    }

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

    @Override
    public void greater(int i, int j) {
        greater++;
    }

    @Override
    public void swap(int i, int j) {
        swap++;
    }

    public void reset(){
        swap=0;
        greater=0;
    }
}
