package statistics;

import statistics.matcher.*;

/**
 * Created by Daniel Riissanen on 9.12.2018.
 */
public class QueryBuilder {
    private Matcher matcher;

    public QueryBuilder() {
        matcher = new All();
    }

    public Matcher build() {
        Matcher retMatcher = matcher;
        matcher = new All();
        return retMatcher;
    }

    public QueryBuilder playsIn(String team) {
        this.matcher = new And(this.matcher, new PlaysIn(team));
        return this;
    }

    public QueryBuilder hasAtLeast(int value, String category) {
        this.matcher = new And(this.matcher, new HasAtLeast(value, category));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        this.matcher = new And(this.matcher, new HasFewerThan(value, category));
        return this;
    }

    public QueryBuilder oneOf(Matcher m1, Matcher m2) {
        this.matcher = new Or(m1, m2);
        return this;
    }
}
