package com.company;
import org.junit.jupiter.api.Test;
import static com.company.CalcAngle.calcAngle;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test1() {
        assertEquals(113, calcAngle(11,15));
    }

    @Test
    void test2() {
       assertThrows(NumberFormatException.class, () -> {calcAngle(Integer.parseInt("five"), Integer.parseInt("forty"));});
    }

    @Test
    void test3() {
        assertThrows(NumberFormatException.class, () -> {calcAngle(Integer.parseInt(""), Integer.parseInt(""));});
    }

    @Test
    void test4() {

        assertThrows(NumberFormatException.class, () -> {calcAngle(Integer.parseInt(""), 50);});
    }

    @Test
    void test5() {
            assertNotEquals(calcAngle(11,15),-113);
    }

}


