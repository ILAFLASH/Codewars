package com.codewars.kyu7;

public class Edureka {
    int e_x, e_y;

    public Edureka(int x, int y) {
        e_x = x;
        e_y = y;
    }

    public static void main(String[] args) {
        Edureka edu = new Edureka(1,2);
        System.out.print(edu.e_x);
        System.out.print(edu.e_y);
    }

}
