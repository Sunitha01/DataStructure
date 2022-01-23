package com.company;

public class Sum {
    public static void main(String[] args) {
        int [] even = new int[50];
        int [] odd = new int[50];
        int k,L;
        k = 0;
        L= 0;
        for (int i = 0 ; i <= 99; i++) {
            if (i%2 == 0 ) {
                even[k] = i;
                k++;
            } else {
                odd[L] = i;
                L++;
            }

        }
        System.out.println(" Even numbers from 0 & 98 (inclusive) are " );
        for ( k = 0 ; k <= 49; k++) {
           System.out.println(even[k]);

        }

        System.out.println(" Odd numbers from 1 & 99 (inclusive) are ");

        for ( L = 0 ; L <= 49; L++) {
            System.out.println(odd[L]);

        }
        System.out.println("Powers of 2 from 1 to 4096  ");
        int power;
        power = 1;
        while (power <= 4096) {
            System.out.println(power);
            power = power * 2;

        }

    }
}
