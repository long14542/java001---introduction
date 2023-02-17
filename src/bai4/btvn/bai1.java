package bai4.btvn;

public class bai1 {
        public static boolean isPalindrome(int number) {
            int reverse = 0;
            int original = number;
            while (number > 0) {
                int lastDigit = number % 10;
                reverse = reverse * 10 + lastDigit;
                number /= 10;
            }
            return original == reverse;
        }

        public static boolean isValid(int number) {
            int sum = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                if (lastDigit != 0 && lastDigit != 6 && lastDigit != 8) {
                    return false;
                }
                sum += lastDigit;
                number /= 10;
            }
            return sum % 10 == 0;
        }

        public static void main(String[] args) {
            int count = 0;
            for (int i = 1000000; i < 10000000; i++) {
                if (isPalindrome(i) && isValid(i)) {
                    System.out.println(i + " is a palindrome and has only 0, 6, or 8 digits");
                    count++;
                }
            }
            System.out.println("There are " + count + " palindromes that satisfy the conditions");
        }
    }

