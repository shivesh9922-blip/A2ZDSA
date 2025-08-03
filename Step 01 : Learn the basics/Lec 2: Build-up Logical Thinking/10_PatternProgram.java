/*
////////
*
**
***
****
*****
****
***
**
*
/////////
*/
class Solution {
   public static void nStarTriangle(int n) {
        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
       nStarTriangle(5);
    }
}
