/*

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/
public class Solution {
    public static void nNumberTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        nNumberTriangle(5);
    }
}
