/**
 * Created by $[USER] on $[DATE]
 */

/*
If the numbers 1 to 5 are written out in words: one, two, three, four, five,
then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two)
contains 23 letters and 115 (one hundred and fifteen)
contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.
 */

public class EulerProblem17 {
    public static void main(String[] args){

        int LiczbaWszystkichLiter = 0;
        int LiczbaLiterLiczby;

        for(int i = 0; i <= 1000; i++) {

            int a, b, c, d;

            d = i % 10;
            c = ((i % 100) - d) / 10;
            b = ((i % 1000) - c*10 - d) / 100;
            a = ((i % 10000) - b*100 - c*10 - d) / 1000;

            LiczbaLiterLiczby = 0;

            if (a == 1) LiczbaLiterLiczby += 11;

            if (b == 1 || b == 2 || b == 6) LiczbaLiterLiczby += 10;
            if (b == 4 || b == 5 || b == 9) LiczbaLiterLiczby += 11;
            if (b == 3 || b == 7 || b == 8) LiczbaLiterLiczby += 12;

            if ((b != 0) && (c != 0 || d != 0)) LiczbaLiterLiczby += 3;

            if ( c >= 2 && c <= 9){
                if (c == 2 || c == 3 || c == 8 || c == 9) LiczbaLiterLiczby += 6;
                if (c == 4 || c == 5 || c == 6) LiczbaLiterLiczby += 5;
                if (c == 7) LiczbaLiterLiczby += 7;

                if (d == 1 || d == 2 || d == 6) LiczbaLiterLiczby += 3;
                if (d == 3 || d == 7 || d == 8) LiczbaLiterLiczby += 5;
                if (d == 4 || d == 5 || d == 9) LiczbaLiterLiczby += 4;
            } else if (c == 1){
                    if (d == 0) LiczbaLiterLiczby += 3;
                    if (d == 1 || d == 2) LiczbaLiterLiczby += 6;
                    if (d == 3 || d == 4 || d == 8 || d == 9) LiczbaLiterLiczby += 8;
                    if (d == 5 || d == 6) LiczbaLiterLiczby += 7;
                    if (d == 7) LiczbaLiterLiczby += 9;
                    } else if (c == 0){
                            if (d == 1 || d == 2 || d == 6) LiczbaLiterLiczby += 3;
                            if (d == 3 || d == 7 || d == 8) LiczbaLiterLiczby += 5;
                            if (d == 4 || d == 5 || d == 9) LiczbaLiterLiczby += 4;
                            }
            LiczbaWszystkichLiter += LiczbaLiterLiczby;
        }

        System.out.println("All the numbers from 1 to 1000 use " + LiczbaWszystkichLiter + " letters.");
    }
}
