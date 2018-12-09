package statistics.matcher;

import statistics.Player;

/**
 * Created by Daniel Riissanen on 9.12.2018.
 */
public class Or implements Matcher {

    private Matcher[] matchers;

    public Or(Matcher... matchers) {
        this.matchers = matchers;
    }

    @Override
    public boolean matches(Player p) {
        for (Matcher matcher : matchers) {
            if (matcher.matches(p))
                return true;
        }
        return false;
    }
}
