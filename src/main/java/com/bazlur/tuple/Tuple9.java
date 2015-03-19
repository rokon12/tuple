package com.bazlur.tuple;

/**
 * @author A N M Bazlur Rahman
 * @since 3/19/15.
 */
public class Tuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements Tuple<Tuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8>> {
    public final T0 _0;
    public final T1 _1;
    public final T2 _2;
    public final T3 _3;
    public final T4 _4;
    public final T5 _5;
    public final T6 _6;
    public final T7 _7;
    public final T8 _8;

    public Tuple9(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        this._0 = _0;
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
        this._7 = _7;
        this._8 = _8;
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> Tuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8> valueOf(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        return new Tuple9<>(_0, _1, _2, _3, _4, _5, _6, _7, _8);
    }


    @Override
    public int size() {
        return 9;
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
            case 5:
                return _5;
            case 6:
                return _6;
            case 7:
                return _7;
            case 8:
                return _8;
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "(" + _0 + ',' + _1 + ',' + _2 + ',' + _3 + ',' + _4 + ',' + _5 + ',' + _6 + ',' + _7 +',' + _8 + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tuple9)) return false;

        Tuple9 tuple9 = (Tuple9) o;

        if (_0 != null ? !_0.equals(tuple9._0) : tuple9._0 != null) return false;
        if (_1 != null ? !_1.equals(tuple9._1) : tuple9._1 != null) return false;
        if (_2 != null ? !_2.equals(tuple9._2) : tuple9._2 != null) return false;
        if (_3 != null ? !_3.equals(tuple9._3) : tuple9._3 != null) return false;
        if (_4 != null ? !_4.equals(tuple9._4) : tuple9._4 != null) return false;
        if (_5 != null ? !_5.equals(tuple9._5) : tuple9._5 != null) return false;
        if (_6 != null ? !_6.equals(tuple9._6) : tuple9._6 != null) return false;
        if (_7 != null ? !_7.equals(tuple9._7) : tuple9._7 != null) return false;
        if (_8 != null ? !_8.equals(tuple9._8) : tuple9._8 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = _0 != null ? _0.hashCode() : 0;
        result = 31 * result + (_1 != null ? _1.hashCode() : 0);
        result = 31 * result + (_2 != null ? _2.hashCode() : 0);
        result = 31 * result + (_3 != null ? _3.hashCode() : 0);
        result = 31 * result + (_4 != null ? _4.hashCode() : 0);
        result = 31 * result + (_5 != null ? _5.hashCode() : 0);
        result = 31 * result + (_6 != null ? _6.hashCode() : 0);
        result = 31 * result + (_7 != null ? _7.hashCode() : 0);
        result = 31 * result + (_8 != null ? _8.hashCode() : 0);
        return result;
    }
}
