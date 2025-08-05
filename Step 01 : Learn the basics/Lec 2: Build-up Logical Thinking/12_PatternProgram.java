/*

1                 1 
1 2             2 1 
1 2 3         3 2 1 
1 2 3 4     4 3 2 1 
1 2 3 4 5 5 4 3 2 1

*/
public class Solution {
   public static void numberCrown(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int s = 1; s <= 2 * n - 2 * i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((i - j + 1) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        numberCrown(5);
    }
}
