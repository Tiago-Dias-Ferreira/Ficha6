import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testSum ( ) {
        Calculator calculation = new Calculator ( ) ;
        double sum = calculation.sum ( 2 , 5 ) ;
        int testSum = 7 ;
        assertEquals ( sum , testSum , "Error calculating the sum!" ) ;
    }
    @Test
    public void testRectangle1() {
        Calculator calculation = new Calculator ( ) ;
        int perimeter=calculation.perimeter(3,5);
        int area=calculation.area(3,5);
        int testArea=15;
        int testPer=16;
        assertEquals ( perimeter , testPer , "Error calculating the perimeter!" ) ;
        assertEquals ( area , testArea , "Error calculating the area!" ) ;

    }
    @Test
    public void testRectangle2() {
        Calculator calculation = new Calculator ( ) ;
        int perimeter=calculation.perimeter(5,8);
        int area=calculation.area(5,8);
        int testArea=40;
        int testPer=26;
        assertEquals ( perimeter , testPer , "Error calculating the perimeter!" ) ;
        assertEquals ( area , testArea , "Error calculating the area!" ) ;

    }
    @Test
    public void testRectangle3() {
        Calculator calculation = new Calculator ( ) ;
        int perimeter=calculation.perimeter(2,4);
        int area=calculation.area(2,4);
        int testArea=8;
        int testPer=12;
        assertEquals ( perimeter , testPer , "Error calculating the perimeter!" ) ;
        assertEquals ( area , testArea , "Error calculating the area!" ) ;

    }
    @Test
    public void testTriangle() {
        Calculator calculation = new Calculator();
        assertFalse(calculation.isTriangle(1,2,3));
        assertTrue(calculation.isTriangle(2,2,3));
    }
}
