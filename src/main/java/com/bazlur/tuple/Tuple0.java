package com.bazlur.tuple;

/**
 * @author A N M Bazlur Rahman
 * @since 3/15/15.
 */
public class Tuple0 implements Tuple<Tuple0> {
    private static final Tuple0 INSTANCE = new Tuple0();

    public static Tuple0 valueOf() {
        return INSTANCE;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object apply(int value) {
        throw new IndexOutOfBoundsException();
    }
}
