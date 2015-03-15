package com.bazlur.tuple;

/**
 * @author A N M Bazlur Rahman
 * @since 3/15/15.
 */
public class Tuple5<T0, T1, T2, T3, T4> implements Tuple<Tuple5<T0, T1, T2, T3, T4>> {
    public final T0 _0;
    public final T1 _1;
    public final T2 _2;
    public final T3 _3;
    public final T4 _4;

    public Tuple5(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4) {
        this._0 = _0;
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
    }

    public static <T0, T1, T2, T3, T4> Tuple5<T0, T1, T2, T3, T4> valueOf(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4) {
        return new Tuple5<>(_0, _1, _2, _3, _4);
    }


    @Override
    public int size() {
        return 5;
    }

    @Override
    public Object apply(int value) {
        switch (value) {
            case 0:
                return _0;
            case 1:
                return _1;
            case 2:
                return _2;
            case 3:
                return _3;
            case 4:
                return _4;
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "(" + _0 + ',' + _1 + ',' + _2 + ',' + _3 + ',' + _4 + ')';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Tuple5)) return false;

        Tuple5 tuple5 = (Tuple5) o;

        if (_0 != null ? !_0.equals(tuple5._0) : tuple5._0 != null) return false;
        if (_1 != null ? !_1.equals(tuple5._1) : tuple5._1 != null) return false;
        if (_2 != null ? !_2.equals(tuple5._2) : tuple5._2 != null) return false;
        if (_3 != null ? !_3.equals(tuple5._3) : tuple5._3 != null) return false;
        if (_4 != null ? !_4.equals(tuple5._4) : tuple5._4 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = _0 != null ? _0.hashCode() : 0;
        result = 31 * result + (_1 != null ? _1.hashCode() : 0);
        result = 31 * result + (_2 != null ? _2.hashCode() : 0);
        result = 31 * result + (_3 != null ? _3.hashCode() : 0);
        result = 31 * result + (_4 != null ? _4.hashCode() : 0);
        return result;
    }
}
