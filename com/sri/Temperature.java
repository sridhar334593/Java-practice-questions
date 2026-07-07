package com.sri;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter tem in C: ");
        float temC = in.nextFloat();

        float temF = (temC * 9/5) +32;
        System.out.println(temF);
    }
}
