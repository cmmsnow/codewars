public class RomanNumerals {
    /**
     *
     * @param n
     * @return a string containing the Roman Numeral representation of that integer
     *
     * Symbol    Value
     * I          1
     * V          5
     * X          10
     * L          50
     * C          100
     * D          500
     * M          1,000
     *
     * Remember that there can't be more than 3 identical symbols in a row.
     *
     */

    public String solution(int n) {
        String answer = "";
        int amountOfLetters = 0;
        while (n > 0){
            if (n >= 1000){
                amountOfLetters = (n/1000);
                answer += makeLetterStrand(amountOfLetters, "M");
                n = n%1000;
            } else if (n >= 900){
                amountOfLetters = (n/900);
                answer += makeLetterStrand(amountOfLetters, "CM");
                n = n%900;
            } else if (n >= 500){
                amountOfLetters = (n/500);
                answer += makeLetterStrand(amountOfLetters, "D");
                n = n%500;
            } else if (n >= 400){
                amountOfLetters = (n/400);
                answer += makeLetterStrand(amountOfLetters, "CD");
                n = n%400;
            } else if (n >= 100){
                amountOfLetters = (n/100);
                answer += makeLetterStrand(amountOfLetters, "C");
                n = n%100;
            } else if (n >= 90){
                amountOfLetters = (n/90);
                answer += makeLetterStrand(amountOfLetters, "XC");
                n = n%90;
            } else if (n >= 50){
                amountOfLetters = (n/50);
                answer += makeLetterStrand(amountOfLetters, "L");
                n = n%50;
            } else if (n >= 40){
                amountOfLetters = (n/40);
                answer += makeLetterStrand(amountOfLetters, "XL");
                n = n%40;
            } else if (n >= 10){
                amountOfLetters = (n/10);
                answer += makeLetterStrand(amountOfLetters, "X");
                n = n%10;
            } else if (n >= 9){
                amountOfLetters = (n/9);
                answer += makeLetterStrand(amountOfLetters, "IX");
                n = n%9;
            } else if (n >= 5){
                amountOfLetters = (n/5);
                answer += makeLetterStrand(amountOfLetters, "V");
                n = n%5;
            } else if (n >= 4){
                amountOfLetters = (n/4);
                answer += makeLetterStrand(amountOfLetters, "IV");
                n = n%4;
            } else if (n >= 1){
                amountOfLetters = (n/1);
                answer += makeLetterStrand(amountOfLetters, "I");
                n = n%1;
            }
        }
        return answer;
    }

    public String makeLetterStrand(int amountOfLetters, String letter){
        String answer = "";
        for (int i=1; i<=amountOfLetters; i++){
            answer += letter;
        }
        return answer;
    }

}
