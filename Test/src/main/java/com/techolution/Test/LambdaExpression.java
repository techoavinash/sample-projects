package com.techolution.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Avinash on 14-12-2017.
 */
public class LambdaExpression {

    public static void main(String args[]) {
        List<String> pointList = new ArrayList();
        pointList.add("1");
        pointList.add("2");
        pointList.forEach(p -> display(p));
    }

    private static void display(String data) {
        System.out.println("Displayed from function & data  = " + data);
    }
}
