/*
/////
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
////
*/
class Solution {
   public static void getNumberPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int currentNum = 0;
            for (int j = 0; j < 2 * n - 1; j++) {
                currentNum = Math.min(Math.min(i, j), Math.min(2 * n - i - 2, 2 * n - j - 2));
                System.out.print((n - currentNum)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getNumberPattern(4);
    }
}
