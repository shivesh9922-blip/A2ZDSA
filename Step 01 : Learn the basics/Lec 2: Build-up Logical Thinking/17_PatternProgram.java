/*
        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A 
*/
class Solution {
         public static void alphaHill(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i >= j) {
                    System.out.print((char) ('A' - 1 + j) + " ");
                } else {
                    System.out.print((char) ('A' - 1 + (2 * i - j)) + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaHill(5);
    }
}
