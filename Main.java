package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the basic:  ");
        String basic = value.next();
        char grade = value.next().charAt(0);
        int bas= Integer.parseInt(basic);



        int hra = (int) (0.2*bas);
        int da = (int)(0.5*bas);
        int pf =(int)(0.11*bas);
        int allow =0;
        if(grade=='A'){
            allow=1700;}
        if(grade=='B'){
            allow=1500;}
        if (grade=='C'){
            allow=1300;}

        long total_salary= bas+hra+da+allow-pf;
        System.out.println(total_salary);
    }
}
