package statistics.matcher;

import statistics.Player;

/**
 * Created by Daniel Riissanen on 9.12.2018.
 */
public class All implements Matcher {
    @Override
    public boolean matches(Player p) {
        return true;
    }
}
