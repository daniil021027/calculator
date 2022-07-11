package ru.ac.uniyar.mf.bespokoev.summer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
// вввод
        String[] parts = str.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        if (parts[1].equals("+")){
            String[] marts = parts[0].split("/");
            String[] marts1 = parts[2].split("/");
            int one = Integer.parseInt(parts[0]);
            int two = Integer.parseInt(parts[2]);
            int otvet = one + two;
            System.out.println(otvet);
        }
        else if (parts[1].equals("-")){
            String[] marts = parts[0].split("/");
            String[] marts1 = parts[2].split("/");
            int one = Integer.parseInt(parts[0]);
            int two = Integer.parseInt(parts[2]);
            int otvet = one - two;
            System.out.println(otvet);
        }
        else if (parts[1].equals("*")){
            String[] marts = parts[0].split("/");
            String[] marts1 = parts[2].split("/");
            int one = Integer.parseInt(parts[0]);
            int two = Integer.parseInt(parts[2]);
            int otvet = one * two;
            System.out.println(otvet);
        }
        else if (parts[1].equals("/")){
            if (parts[2].equals("0")) {
                System.out.println("На ноль делить нельзя!");
            }
            else {
                String[] marts = parts[0].split("/");
                String[] marts1 = parts[2].split("/");
                int one = Integer.parseInt(parts[0]);
                int two = Integer.parseInt(parts[2]);
                int otvet = one / two;
                System.out.println(otvet);
            }
        }

        String result = calculate(str);
        System.out.println(result);

    }

    public static String calculate(String str) {
        String[] parts = str.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        if (parts[1].equals("+")){
            String[] marts = parts[0].split("/");
            String[] marts1 = parts[2].split("/");
            int one = Integer.parseInt(parts[0]);
            int two = Integer.parseInt(parts[2]);
            int otvet = one + two;
            return String.valueOf(otvet);
        }
        else if (parts[1].equals("-")){
            String[] marts = parts[0].split("/");
            String[] marts1 = parts[2].split("/");
            int one = Integer.parseInt(parts[0]);
            int two = Integer.parseInt(parts[2]);
            int otvet = one - two;
            return String.valueOf(otvet);
        }
        else if (parts[1].equals("*")){
            String[] marts = parts[0].split("/");
            String[] marts1 = parts[2].split("/");
            int one = Integer.parseInt(parts[0]);
            int two = Integer.parseInt(parts[2]);
            int otvet = one * two;
            return String.valueOf(otvet);
        }
        else if (parts[1].equals("/")) {
            if (parts[2].equals("0")) {
                return String.valueOf("На ноль делить нельзя!");
            }
            else {
                String[] marts = parts[0].split("/");
                String[] marts1 = parts[2].split("/");
                int one = Integer.parseInt(parts[0]);
                int two = Integer.parseInt(parts[2]);
                int otvet = one / two;
                return String.valueOf(otvet);
            }
        }
        return part1;
    }
}
