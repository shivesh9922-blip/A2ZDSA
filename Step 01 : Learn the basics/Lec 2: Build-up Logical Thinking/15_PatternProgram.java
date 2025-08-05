/*

A B C D E 
A B C D 
A B C 
A B 
A 

*/
public class Solution {
    public static void nLetterTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print((char)('A' - 1 + j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        nLetterTriangle(5);
    }
}
