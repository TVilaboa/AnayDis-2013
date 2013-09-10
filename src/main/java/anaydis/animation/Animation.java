package anaydis.animation;

import anaydis.animation.sort.gui.Main;
import anaydis.sort.SortProvider;

/**
 * Created with IntelliJ IDEA.
 * Author: Tomás Vilaboa
 * Project: anaydis-2013
 * Date: 10/09/13
 * Time: 11:59
 */
public class Animation {
    public static void main(String[] args) {
        Main.animate(new SortProvider());
    }
}
