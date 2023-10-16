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

//    public static long getFactorial(int n) {
//        //ham tinh n!=1,2,3,...n
//        //ko tinh dc giai thua so am
//        // quy uoc 0! la 1
//        //vi giai thua tang rat nhanh kieu long chua ko noi(vuot 18 so 0)
//        //do do' ham` getF() chi co n=0-20
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException();
//        
//
//        if (n == 0 || n == 1) 
//            return 1;
//        
//
//        long result = 1; //n>=2-<=20
//        
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//
//        return result;
//    }
//    5!=1*2*3*4 5
//    5!= 4! *5=5*4!
//    4!=3!*4=4*3!
//    3!=2!*3=3*2!
//    2!=2*1!=1!*2
//    --> N!=N*(N-1)!
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException();
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);

        /*
        tối ưu code, thay ruột của hàm để chạy ngon hơn
        nhanh hơn, code đẹp hơn
        fix bug
        dù sửa code vì lí do gì thì code phải được test lại
        test lại để đảm bảo rằng nó vẫn xanh như lần nào
        viết code đi kèm test scrip thì việc test lại hàm cực nhanh
        ko cần dùng mắt dò từng dòng lệnh, chỉ cần xem EP==EV không
        test lại những gì đã từng test -Regression test(kiểm thử hồi quy)
        kiểm thử lần này cực nhanh vì github lo dùm
        ta chỉ cần màu xanh hoặc nhận mail chửi khi đỏ
         */
    }
}
