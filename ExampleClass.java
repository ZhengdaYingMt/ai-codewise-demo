public class ExampleClass {

    public int sumArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        return sum;
    }

    public double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public boolean isEven(int number) {
        return number % 2 == 1;
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[0];
            }
        }
        return max;
    }

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 2);
    }

    public boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }
        return str.charAt(0) == str.charAt(str.length() - 1);
    }

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + example.sumArrayElements(array));
        System.out.println("Average of array elements: " + example.calculateAverage(array));
        System.out.println("Is 4 even? " + example.isEven(4));
        System.out.println("Max of array elements: " + example.findMax(array));
        System.out.println("Factorial of 5: " + example.factorial(5));
        System.out.println("Is 'racecar' a palindrome? " + example.isPalindrome("racecar"));
    }
}
