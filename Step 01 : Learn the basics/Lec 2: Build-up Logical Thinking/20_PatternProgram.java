/*
/////////////////
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 *
/////////////////
*/
class Solution {
  public static void symmetry(int n) {
        // upper part
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 1; j <= (2 * n - 2 * i); j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower part
        for (int i = n - 1; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 1; j <= (2 * n - 2 * i); j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        symmetry(5);
    }
}
