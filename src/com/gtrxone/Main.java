package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int original = number; // 252
        if (number<=9 && number>0){ // 5 -> true
            return number + number;
        }
        if (number >= 0) { // 1round -> 252 >= 0 -> true     2round -> 25 >= 0 -> true
            while (number > 0) { // 1round -> 252 > 0 ->true     2round ->  25 > 0 -> true
                if (number == original) { // 1round -> 252 == 252 -> true    2round -> 25 == 252 -> false
                    sum += number % 10; // 252 % 10 += 2 -> 0 + 2 -> sum = 2
                }
                number /= 10; // 1round -> 252 / 10  = 25      2round -> 25 / 10 = 2
                if (number < 10) { // 1round -> 25 < 10 -> false     2round -> 2 < 10 -> true
                    sum += number % 10; // 2round -> 2 += 2 % 10 -> 4
                }
            }
            return sum;
        }
        return -1;
    }
}
