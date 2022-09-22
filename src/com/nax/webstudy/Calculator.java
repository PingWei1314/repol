package com.nax.webstudy;

public class Calculator {
    /**
     * 加法
     * @param a
     * @param b
     * @return
     */
  public int add(int a,int b){
      return a+b;
  }
    /**
     * 减法
     * @param a
     * @param b
     * @return
     */
    public int sub(int a,int b){
        return a-b;
    }
    public int max(int a,int b,int c){
        return Math.max(Math.max(a,b),c);
    }
}
