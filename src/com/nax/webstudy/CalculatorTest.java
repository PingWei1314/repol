package com.nax.webstudy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class CalculatorTest {
    /**
     * 初始化方法，
     * 申请资源，测试是先执行此方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /**
     * 释放资源
     * 所有测试方法测试完后，都会执行此方法
     */
    @After
    public void close() {
        System.out.println("close...");
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = calculator.add(num1, num2);
        Assert.assertEquals(7, result);
        System.out.println("testAdd");
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(4, 3);
        Assert.assertEquals(1, result);
        System.out.println("testSub");
    }

    public static void main(String[] args) {
       /* Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int num3 = sc.nextInt();
        int result = calculator.max(num1, num2, num3);
        System.out.println(result);*/
        MyRed myRed=new MyRed("恭喜发财");
        myRed.setOwnerName("王思聪");
        OpenMode mode=new RandomMode();
        myRed.setOpenWay(mode);
    }
}
