package com.epam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UtilsTest {
    @Test void isAllPositiveNumbersTest(){
        assertFalse(Utils.isAllPositiveNumbers("-12","-19"));
        assertTrue(Utils.isAllPositiveNumbers("23","15"));
    }
}
