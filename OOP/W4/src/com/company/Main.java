package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in); //키보드 입력
        System.out.println(">>");
        while(s1.hasNext()){
            System.out.println(s1.next());
        }
    }
}
