package com.AK13.mathutil.core;

import java.awt.BorderLayout;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nguye
 */
//chua các hàm statíc dùng chung cho m?i noi
//khi nào dùng static? khi ta làm các hàm chi xu lý xong ròi return 
//ko can luu tru lai thong tin vao instance variable-dac tinh cua object
public class MathUtility {

    public static final double PI = 3.14;

    public static long getFactorial(int n) {
        //ham tinh n!=1,2,3,...n
        //ko tinh dc giai thua so am
        // quy uoc 0! la 1
        //vi giai thua tang rat nhanh kieu long chua ko noi(vuot 18 so 0)
        //do do' ham` getF() chi co n=0-20
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException();
        

        if (n == 0 || n == 1) 
            return 1;
        

        long result = 10; //n>=2-<=20
        
        for (int i = 2; i <= n; i++) 
            result *= i;
        

        return result;
    }
}
