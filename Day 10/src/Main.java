// Review Day

//Warmup-1 > sleepIn
public class Main {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));  // Output: true
        System.out.println(sleepIn(true, false));   // Output: false
        System.out.println(sleepIn(false, true));   // Output: true
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}

//The sleepIn function helps me decide whether I can sleep in or not.
// It takes two inputs: weekday and vacation.
// If it's not a weekday or if I'm on vacation, I can sleep in, so I return true.
// Otherwise, if it's a weekday and I'm not on vacation, I can't sleep in, so I return false.


//Warmup-1 > sumDouble
public class Main {
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));  // Output: 3
        System.out.println(sumDouble(3, 2));  // Output: 5
        System.out.println(sumDouble(2, 2));  // Output: 8
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }
}
// Okay, so I have this problem where I need to create a function called sumDouble.
// It should take two numbers, a and b, as inputs.
// Here's what I'm thinking: I'll start by defining the function and giving it the parameters a and b.
// Then, I need to check if a is equal to b.
// If they are the same, I'll return double their sum, which means I'll multiply (a + b) by 2.
// If they are not the same, I'll simply return their sum using a + b.

//String-1 > helloName
public class Main {
    public static void main(String[] args) {
        System.out.println(helloName("Bob"));    // Output: Hello Bob!
        System.out.println(helloName("Alice"));  // Output: Hello Alice!
        System.out.println(helloName("X"));      // Output: Hello X!
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
//I started by defining the helloName function and ensuring it takes a string parameter called name.
// Then, I knew I needed to construct the greeting message by concatenating different pieces together.
// The greeting began with "Hello ", so I added that string to the greeting.
// Next, I included the value of name to personalize the greeting for each input.
// Finally, I added an exclamation mark "!" to provide emphasis and excitement.
// By concatenating these strings and returning the resulting message.

//Logic-1 > love6
public class Main {
    public static void main(String[] args) {
        System.out.println(isTrulyGreat(6, 4));    // Output: true
        System.out.println(isTrulyGreat(4, 6));    // Output: true
        System.out.println(isTrulyGreat(5, 1));    // Output: true
        System.out.println(isTrulyGreat(2, 9));    // Output: true
        System.out.println(isTrulyGreat(4, 5));    // Output: false
        System.out.println(isTrulyGreat(-6, 12));  // Output: true
    }

    public static boolean isTrulyGreat(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }
}
//Okay, so I have this task to create a function called isTrulyGreat that takes two numbers, a and b.
// Here's how I'm going to approach it:
//To determine if the numbers are "truly great," I need to check a few conditions.
// First, I'll check if either a or b is equal to 6 using the equality operator ==.
// If either of them is 6, then I know one of the numbers satisfies the condition.
//Next, I'll check if the sum of a and b is equal to 6 using a + b == 6.
// If the sum is 6, that means the numbers together fulfill the condition.
//Additionally, I'll check if the absolute difference between a and b is equal to 6 using Math.abs(a - b) == 6.
// This ensures that even if a and b have different signs or orders, their difference is still considered.
//By combining these conditions using the logical OR operator ||, I can determine if either one of the numbers is 6, or if their sum or difference is 6.
// If any of these conditions is true, then the numbers are "truly great" and I'll return true. Otherwise, I'll return false.


// Array-2 CountEvens
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2, 1, 2, 3, 4};
        int count1 = countEvens(nums1);
        System.out.println(count1);  // Output: 3

        int[] nums2 = {2, 2, 0};
        int count2 = countEvens(nums2);
        System.out.println(count2);  // Output: 3

        int[] nums3 = {1, 3, 5};
        int count3 = countEvens(nums3);
        System.out.println(count3);  // Output: 0
    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
//First, I defined the function and provided it with a parameter named nums, which represents the array of integers to be counted.
// Then, I used a for-each loop to iterate through each element in the array.
// Inside the loop, I checked if the current element was even by using the modulus operator % to see if the remainder of dividing the element by 2 was equal to 0.
// If the remainder was 0, it meant the number was even.
// Whenever I encountered an even number, I incremented a variable called count to keep track of the total count.
// After looping through all the elements, I returned the final value of count as the result

// Array 2 - Sum 13

    public class Main {
        public static void main(String[] args) {
            int[] nums1 = {1, 2, 2, 1};
            int sum1 = sum13(nums1);
            System.out.println("Sum: " + sum1);  // Output: Sum: 6

            int[] nums2 = {1, 1};
            int sum2 = sum13(nums2);
            System.out.println("Sum: " + sum2);  // Output: Sum: 2

            int[] nums3 = {1, 2, 2, 1, 13};
            int sum3 = sum13(nums3);
            System.out.println("Sum: " + sum3);  // Output: Sum: 6
        }

        public static int sum13(int[] nums) {
            int sum = 0;
            if (nums.length == 0) {
                sum = sum;
            } else {
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] == 13) {
                        sum = sum;
                        nums[i + 1] = 0;
                    } else {
                        sum += nums[i];
                    }
                }

                if (nums[nums.length - 1] != 13)
                    sum += nums[nums.length - 1];
            }
            return sum;
        }
    }
}

//To solve the problem of calculating the sum of numbers in an array while excluding 13 and any numbers that come immediately after it,
//    I defined the sum13 function and gave it a parameter called nums, representing the array of numbers.
//    I initialized a variable called sum to keep track of the sum, setting its initial value to 0.
//    Next, I checked if the array is empty by comparing its length to 0. If it is empty, I left the sum as it is.
//    If the array is not empty, I used a for loop to iterate through each element, except the last one, of the array.
//    Inside the loop, I checked if the current element is equal to 13.
//    If it is, I left the sum unchanged and set the next element to 0,
//    as I didn't want to include 13 or the number immediately following it in the sum.
//    If the current element is not 13, I added it to the sum variable, accumulating the sum of the valid numbers.
//    After the loop, I checked the last element of the array to ensure it is not 13. If it is not, I added it to the sum.
//    Finally, I returned the sum as the result of the function.

// Array -2 Lucky 13

    public class Main {
        public void main(String[] args) {
            int[] nums1 = {0, 2, 4};
            boolean result1 = lucky13(nums1);
            System.out.println(result1);

            int[] nums2 = {1, 2, 3};
            boolean result2 = lucky13(nums2);
            System.out.println(result2);

            int[] nums3 = {1, 2, 4};
            boolean result3 = lucky13(nums3);
            System.out.println(result3);
        }

        public boolean lucky13(int[] nums) {
            for (int i : nums) {
                if (i == 1 || i == 3)
                    return false;
            }
            return true;
        }
    }

//To begin, I defined the lucky13 function and gave it a parameter called nums,
// which represents the array of numbers to check.
// I used a for-each loop to iterate through each element in the array.
// Inside the loop, I checked if the current element, i, is equal to 1 or 3.
// If i is equal to either 1 or 3, it means the array contains either a 1 or a 3,
// which is considered unlucky in this case. So, I immediately returned false to indicate that the array is not "lucky."
// If the loop finishes without finding any 1s or 3s, it means none of those numbers are present in the array.
// In that case, I returned true to indicate that the array is "lucky."
// By following this approach, I was able to check if an array contains the numbers 1 or 3.
// If it does, the function returns false; otherwise, it returns true. This way, I obtained the desired result.

// Array-1 firstLast6
public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 6};
        boolean result1 = firstLast6(nums1);
        System.out.println(result1);  // Output: true

        int[] nums2 = {6, 1, 2, 3};
        boolean result2 = firstLast6(nums2);
        System.out.println(result2);  // Output: false

        int[] nums3 = {1, 2, 3, 4, 5, 6};
        boolean result3 = firstLast6(nums3);
        System.out.println(result3);  // Output: true
    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }
}

//To start, I defined the firstLast6 function and provided it with a parameter called nums,
// which represents the array of integers.
//Inside the function, I used an if statement to check if either the first element of the array,
// nums[0], or the last element of the array, nums[nums.length - 1], is equal to 6.
//If the first element is equal to 6 or the last element is equal to 6,
// it means that either the first or last element satisfies the condition.
// In that case, I immediately returned true from the function to indicate that the condition is met.
//If the condition is not met, it means that neither the first nor last element is equal to 6.
// In that case, I reached the else block, and I returned false to indicate that the condition is not satisfied.
//By using the == equality operator to check for equality and the logical OR operator || to combine the conditions,
// I checked if either the first or last element of the array is equal to 6. If either condition is true,
// I returned true; otherwise, I returned false.