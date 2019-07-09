package com.test.Algorithm;

class StringToInteger {

    static int stringToInteger(String str) {
        int index = 0;
        int sign = 1;
        int total = 0;

        if (str.length() == 0) {
            return 0;
        }

        while (str.charAt(index) == ' ') {
            index++;
        }

        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while (index < str.length()) {
            int digit = str.charAt(index) - '0';

            if (digit < 0 || digit > 9) {
                break;
            }
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }

}
