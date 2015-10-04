package com.bazlur.either;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Bazlur Rahman Rokon
 * @date 10/5/15.
 */
public class EitherTest {
    @Test
    public void testEither() {
        Either<String, Integer> leftValue = Either.left("left");

        assertThat(leftValue.getLeft(), is("left"));

        String result = leftValue.fold((String::toUpperCase), (Object::toString));
        assertThat(result, is("LEFT"));

        Either<String, Integer> rightValue = Either.right(42);

        assertThat(rightValue.getRight(), is(42));

        Either<String, Integer> compute = compute(10);
    }


    public Either<String, Integer> compute(int value) {
        if (value > 100) {
            return Either.left("Can't compute, value greater than 100");
        } else {
            return Either.right(value * 45);
        }
    }


}