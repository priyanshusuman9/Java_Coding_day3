package Day3Problems;

public class oddPosition {

        public static void main(String[] args) {
            //Initialize array  as arrr
            int [] arr = {1, 2, 3, 4, 5};
            System.out.println("Elements of given array present on odd position: ");
            //Loop through the array by incrementing value of i by 2
            for (int i = 0; i < arr.length; i = i+2) {
                System.out.println(arr[i]);
            }
        }
    }
