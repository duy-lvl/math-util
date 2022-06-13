/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duylvl.mathutil.test.core;

import com.duylvl.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author DuyLVL
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] { {0, 1}, 
                                {1, 1}, 
                                {2, 2}, 
                                {3, 6}, 
                                {4, 24}, 
                                {5, 120}, 
                                {6, 720}   
                            };
    }
    
    @Parameterized.Parameter(value = 0)
    public int n; //map với value trong mảng
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
}
