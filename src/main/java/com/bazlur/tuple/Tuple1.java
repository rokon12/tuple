package com.bazlur.tuple;

/**
 * @author A N M Bazlur Rahman
 * @since 3/15/15.
 */
public class Tuple1<T0> implements Tuple<Tuple1<T0>> {

    public final T0 _0;

    protected Tuple1(T0 _0) {
        this._0 = _0;
    }

    public static <T0> Tuple1<T0> valueOf(T0 _0) {
        return new Tuple1<>(_0);
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public Object apply(int value) {
        switch (value) {
            case 0:
                return _0;
            default:
                throw new IndexOutOfBoundsException();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuple1)) return false;

        Tuple1 tuple1 = (Tuple1) o;

        if (_0 != null ? !_0.equals(tuple1._0) : tuple1._0 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return _0 != null ? _0.hashCode() : 0;
    }


    @Override
    public String toString() {
        return "(" + _0 + +')';
    }
}
