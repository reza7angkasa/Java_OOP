package com.company;
import java.util.*;
public class if_else_branch_3 {
    public static void main(String[] args) {
        Scanner inputUser;
        float a,b,hasil;
        char operator;
        inputUser= new Scanner(System.in);
        System.out.print("nilai a= ");
        a = inputUser.nextFloat();
        System.out.print("operator= ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b= ");
        b = inputUser.nextFloat();
        System.out.println("input user: " + a + "" + operator + "" + b);
        if (operator == '+'){
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            hasil = a-b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            hasil = a*b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            if (b == 0){
                System.out.println("pembagi nol menghasilkan tak hingga");
            } else{
                hasil = a / b;
                System.out.println("hasil = " + hasil);;
            }
        } else {
            System.out.println("operator tidak ditemukan");
        }

    }
}
