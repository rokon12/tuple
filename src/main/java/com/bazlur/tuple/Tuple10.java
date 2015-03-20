package com.bazlur.tuple;

/**
 * @author Bazlur Rahman Rokon
 * @date 3/21/15.
 */
public class Tuple10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> implements Tuple<Tuple10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9>> {
    public final T0 _0;
    public final T1 _1;
    public final T2 _2;
    public final T3 _3;
    public final T4 _4;
    public final T5 _5;
    public final T6 _6;
    public final T7 _7;
    public final T8 _8;
    public final T9 _9;

    public Tuple10(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        this._0 = _0;
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
        this._7 = _7;
        this._8 = _8;
        this._9 = _9;
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> valueOf(T0 _0, T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        return new Tuple10<>(_0, _1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public int size() {
        return 10;
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
            case 9:
                return _9;
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "(" + _0 + ',' + _1 + ',' + _2 + ',' + _3 + ',' + _4 + ',' + _5 + ',' + _6 + ',' + _7 + ',' + _8 + ',' + _9 + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tuple10 tuple10 = (Tuple10) o;

        if (_0 != null ? !_0.equals(tuple10._0) : tuple10._0 != null) return false;
        if (_1 != null ? !_1.equals(tuple10._1) : tuple10._1 != null) return false;
        if (_2 != null ? !_2.equals(tuple10._2) : tuple10._2 != null) return false;
        if (_3 != null ? !_3.equals(tuple10._3) : tuple10._3 != null) return false;
        if (_4 != null ? !_4.equals(tuple10._4) : tuple10._4 != null) return false;
        if (_5 != null ? !_5.equals(tuple10._5) : tuple10._5 != null) return false;
        if (_6 != null ? !_6.equals(tuple10._6) : tuple10._6 != null) return false;
        if (_7 != null ? !_7.equals(tuple10._7) : tuple10._7 != null) return false;
        if (_8 != null ? !_8.equals(tuple10._8) : tuple10._8 != null) return false;
        if (_9 != null ? !_9.equals(tuple10._9) : tuple10._9 != null) return false;

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
        result = 31 * result + (_9 != null ? _9.hashCode() : 0);

        return result;
    }
}
