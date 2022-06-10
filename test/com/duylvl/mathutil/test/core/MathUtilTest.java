/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duylvl.mathutil.test.core;

import com.duylvl.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DuyLVL
 */
public class MathUtilTest {

    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ nói 1ên mục dích của các case/ tình huống kiểm thử
    //tình huồng xài hàm theo kiểu thành công và thất bại
    //@Test chính là psvm()
    //có nhiều @Test ứng với nhiều case
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }

    //kì vọng exception xuất hiện
    //inp: -5
    //out: IllegalArgumentException
    //exception không thể đo lường, so sánh theo kiểu value
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }

    //hàm ném ngoại lệ nếu nhận vào 21
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            MathUtil.getFactorial(21);
        });

    }

    //bắt try-catch là JUnit sẽ xanh do đã chủ động kiểm soát ngoại lệ
    //nhưng không chắc ngoại lệ mình cần có xuất hiện hay không
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        try {
            MathUtil.getFactorial(21);
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument. n must be between 0..20", e.getMessage());
        }

    }

}
