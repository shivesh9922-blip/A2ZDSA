/*
E 
E D 
E D C 
E D C B 
E D C B A  
*/
class Solution {
  public static void alphaTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + n - j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaTriangle(5);
    }
}
