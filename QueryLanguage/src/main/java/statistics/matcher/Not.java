package statistics.matcher;

import statistics.Player;

/**
 * Created by Daniel Riissanen on 9.12.2018.
 */
public class Not implements Matcher {

    private Matcher matcher;

    public Not(Matcher matcher) {
        this.matcher = matcher;
    }

    @Override
    public boolean matches(Player p) {
        return !matcher.matches(p);
    }
}
