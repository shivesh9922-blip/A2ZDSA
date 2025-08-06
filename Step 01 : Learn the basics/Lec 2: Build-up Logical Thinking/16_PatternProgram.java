/*
A 
B B 
C C C 
D D D D 
E E E E E 
*/
class Solution {
     public static void alphaRamp(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' - 1 + i) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaRamp(5);
    }
}
