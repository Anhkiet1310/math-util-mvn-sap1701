/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ak13.mathutil.core;

import com.AK13.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nguye
 */
public class MathUtilityTest {

    /* test case#1 check getFactorial with n=0
        STEPS/PROCEDURES:
            1. GIVEN N=0;
            2.Invoke/call getFactorial(n=0;)
        EXECUTED RESULT: the method return 1 stands for 0!=1
        STATUS : PASSED OR FAILED?
    
        test case#2 check getFactorial with n=1
        1. given n=1
        2. call/invoke getFactorial n=1
       EXPECTED RESULT: the method return 1 stands for 0!=1
        STATUS : PASSED OR FAILED?
     */
    @Test
    public void verifyFactorialGivenRightArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    @Test
    public void verifyFactorialGivenRightArgument6ReturnOk() {
        assertEquals(720, MathUtility.getFactorial(6));
    }

}
