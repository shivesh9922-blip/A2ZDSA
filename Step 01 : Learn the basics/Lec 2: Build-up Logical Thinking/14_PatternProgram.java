/*

A 
A B 
A B C 
A B C D 
A B C D E 

*/
public class Solution {
    public static void nLetterTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
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
