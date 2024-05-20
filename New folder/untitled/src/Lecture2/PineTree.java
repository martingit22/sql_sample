package Lecture2;


public class PineTree {
        public static void main(String[] args) {
            int height = 6; // Adjust the height of the tree here

            // Print the tree
            for (int i = 0; i < height; i++) {
                // Print spaces before the asterisks
                for (int j = height - 1; j > i; j--) {
                    System.out.print(" ");
                }
                // Print asterisks for the tree's body
                for (int j = 0; j < (i * 2 + 1); j++) {
                    System.out.print("*");
                }
                // Move to the next line after printing each level
                System.out.println();
            }

            // Print the tree trunk
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < height - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("***");
            }
        }
    }
