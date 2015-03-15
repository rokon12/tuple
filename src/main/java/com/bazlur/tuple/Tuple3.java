package com.bazlur.tuple;

/**
 * @author A N M Bazlur Rahman
 * @since 3/15/15.
 */
public class Tuple3<T0, T1, T2> implements Tuple<Tuple3<T0, T1, T2>> {
    public final T0 _O;
    public final T1 _1;
    public final T2 _2;

    public Tuple3(T0 _O, T1 _1, T2 _2) {
        this._1 = _1;
        this._O = _O;
        this._2 = _2;
    }

    @Override
    public int size() {
        return 3;
    }

    public static <T0, T1, T2> Tuple3<T0, T1, T2> valueOf(T0 _O, T1 _1, T2 _2) {
        return new Tuple3<>(_O, _1, _2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuple3)) return false;

        Tuple3 tuple3 = (Tuple3) o;

        if (_1 != null ? !_1.equals(tuple3._1) : tuple3._1 != null) return false;
        if (_2 != null ? !_2.equals(tuple3._2) : tuple3._2 != null) return false;
        if (_O != null ? !_O.equals(tuple3._O) : tuple3._O != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = _O != null ? _O.hashCode() : 0;
        result = 31 * result + (_1 != null ? _1.hashCode() : 0);
        result = 31 * result + (_2 != null ? _2.hashCode() : 0);
        return result;
    }

    @Override
    public Object apply(int value) {

        switch (value) {
            case 0:
                return _O;
            case 1:
                return _1;
            case 2:
                return _2;
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "(" + _O + ',' + _1 + ',' + _2 + ')';
    }
}
