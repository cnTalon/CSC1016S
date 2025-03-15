// Assignment 6
// Exercise 1
// 17 September 2022

public class NumberUtils {
    private NumberUtils () {

    }

    // Given a number that is n digits in length, maps the digits to an array length n
    public static int[] toArray(int number) {
        String num = String.valueOf(number);
        int[] array = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            char c= num.charAt(i);
            int valC = Character.getNumericValue(c);
            array[i] = valC;
        }
        return array;
    }

    // Given two numbers, count the quantity of matching digits those with the same value and position
    public static int countMatches(int numberA, int numberB) {
        int count = 0;
        String numA = Integer.toString(numberA);
        int [] array1 = toArray(numberA);
        int [] array2 = toArray(numberB);
        for (int i=0; i < numA.length(); i++) {
            if (array1[i] == array2[i]) {
                count += 1;
            }
        }
        return count;
    }

    // Count the quantity of digits that two numbers have in common, regardless of position.
    public static int countIntersect(int numberA, int numberB) {    // cows
        int count = 0;
        int[] array1 = toArray(numberA);
        int[] array2 = toArray(numberB);
        for (int i=0; i < array1.length; i++) {
            for (int k=0; k < array2.length; k++) {
                if (array1[i] == array2[k]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

        
}
