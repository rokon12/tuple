package com.bazlur.tuple;

import org.junit.Test;

public class Tuple3Test {

    @Test
    public void test() {
        Tuple3<String, String, Integer> t3 = Tuple3.valueOf("a", "b", 1);
        System.out.println(t3);

        System.out.println(t3.apply(1));

    }

    public static void main(String[] args) {
        Tuple3<String, String, Integer> t3 = Tuple3.valueOf("a", "b", 1);
        System.out.println(t3);

        System.out.println(t3.apply(2));
    }

}
