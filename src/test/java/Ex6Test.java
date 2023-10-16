import org.example.Ex6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6Test {
    private Ex6 digitTest;
    @BeforeEach
    public void setup(){
        Ex6 digitTest = new Ex6();
    }
    @Test
    public void digitTest1() {
        assertEquals(2,digitTest.avgDigits(222));
    }
    @Test
    public void digitTest2() {
        assertEquals(3,digitTest.avgDigits(135));
    }
}
