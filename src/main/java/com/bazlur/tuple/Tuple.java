package com.bazlur.tuple;

import java.io.Serializable;
import java.util.Objects;
import java.util.function.IntFunction;

/**
 * @author A N M Bazlur Rahman
 * @since 3/15/15.
 */
public interface Tuple<T extends Tuple> extends IntFunction, Cloneable, Serializable, Comparable<T> {

    public static <T0> Tuple0 valueOf() {

        return Tuple0.valueOf();
    }

    public static <T0, T1> Tuple2<T0, T1> valueOf(T0 _0, T1 _1) {
        return Tuple2.valueOf(_0, _1);
    }

    public static <T0, T1, T2> Tuple3<T0, T1, T2> valueOf(T0 _0, T1 _1, T2 _2) {
        return Tuple3.valueOf(_0, _1, _2);
    }

    public static <T0, T1, T2, T3> Tuple4<T0, T1, T2, T3> valueOf(T0 _0, T1 _1, T2 _2, T3 _3) {
        return Tuple4.valueOf(_0, _1, _2, _3);
    }

    public static <T0, T1, T2, T3, T4> Tuple5<T0, T1, T2, T3, T4> valueOf(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4) {
        return Tuple5.valueOf(_0, _1, _2, _3, _4);
    }

    public static <T0, T1, T2, T3, T4, T5> Tuple6<T0, T1, T2, T3, T4, T5> valueOf(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
        return Tuple6.valueOf(_0, _1, _2, _3, _4, _5);
    }

    public static <T0, T1, T2, T3, T4, T5, T6> Tuple7<T0, T1, T2, T3, T4, T5, T6> valueOf(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
        return Tuple7.valueOf(_0, _1, _2, _3, _4, _5, _6);
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7> Tuple8<T0, T1, T2, T3, T4, T5, T6, T7> valueOf(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7) {
        return Tuple8.valueOf(_0, _1, _2, _3, _4, _5, _6, _7);
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> Tuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8> valueOf(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        return Tuple9.valueOf(_0, _1, _2, _3, _4, _5, _6, _7, _8);
    }

    int size();

    @Override
    default int compareTo(T o) {
        Objects.requireNonNull(o);
        if (!getClass().equals(o.getClass())) {
            throw new ClassCastException(o.getClass() + " must equal " + getClass());
        }

        for (int i = 0; i < size(); i++) {
            @SuppressWarnings("unchecked")
            Comparable<Object> l = (Comparable<Object>) apply(i);
            Object r = o.apply(i);
            int c = l.compareTo(r);
            if (c != 0) {
                return c;
            }
        }

        return 0;
    }
}
