/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ak13.mathutil.core;

import com.AK13.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author nguye
 */
public class MathUtilityDDTTest {

    /*
  ta tách bộ dât kiểm thửu ra khỏi câu lệnh ssanh kĩ thuật này gọi là DDT
    - Data driven testing kiểm thử hàm, app mà tách riêng bộ data ra 1 chỗ dể dễ kiếm
    soát sự thiếu đủ của các test case, các tesst data data test ta để riêng ra 1 chỗ , thường là mảng hay file excel hoặc table
    
    0!->1
    ... 5!=120
    ta thấy mảng 2 chìu
     */
    
    public static Object[][] initData(){
       Object[][] testData= {{0,1},
           {1,1},
           {2,2},
           {4,24},
           {5,120}
       };
       return testData;
           
       }
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnOK(int n, long expected ) {
        
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
