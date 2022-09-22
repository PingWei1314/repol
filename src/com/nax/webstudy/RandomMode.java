package com.nax.webstudy;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMeney, final int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        Random random=new Random();
        int leftMoney=totalMeney;
        int leftCount=totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            int arv = random.nextInt(leftMoney / leftCount * 2) + 1;
            System.out.println(arv);
            leftMoney-=arv;
            leftCount--;
            list.add(arv);
        }
        list.add(leftMoney);
        System.out.println(leftMoney);
        return list;
    }
}
