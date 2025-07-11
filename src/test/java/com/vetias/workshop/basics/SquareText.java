package com.vetias.workshop.basics;
import com.java.workshop.lambda.Square;
import org.junit.jupiter.api.Assertions;    
import org.junit.jupiter.api.Test;

public class SquareText {
    @Test
    public void testFindSquare() {
        Square square = (int x) -> x * x;
        Assertions.assertEquals(25, square.findsquare(5));

}
}

