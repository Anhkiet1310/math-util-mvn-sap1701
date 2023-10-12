/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.AK13.mathutil.main;

import com.AK13.mathutil.core.MathUtility;

/**
 *
 * @author nguye
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //TEST CASE 1-2-3
       // int n = 5;
        long expected = 120;
       // long actual =  MathUtility.getFactorial(n);
        System.out.println("5! --> expected = " + expected
                                + " | actual = " + MathUtility.getFactorial(5));

    }
    // dev chek code c?a mình
    // in ket qua ra màn hình
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
}
