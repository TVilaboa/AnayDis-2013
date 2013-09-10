package anaydis.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 10/09/13
 * Time: 11:33
 */
public class QuickSorterNonRecursive extends QuickSorter {
    public QuickSorterNonRecursive() {
        super(SorterType.QUICK_NON_RECURSIVE);
    }

    @Override
    protected <T> void sort(@NotNull Comparator<T> comparator, @NotNull List<T> list, int l, int r) {
        Stack<Integer> stack=new Stack<>();
        stack.push(l);
        stack.push(r);
        while (!stack.empty()){

        }
    }
}
