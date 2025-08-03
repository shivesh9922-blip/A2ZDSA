 /*
/////////OUTPUT
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
/////////
  */ 
class Solution {
  public static void nTriangle(int n) {
        // This is the outer loop which will loop for the rows.
        for (int i = 1; i <= n; i++) {
            // This is the inner loop which loops for the columns no. of columns = row number for each line here.
            // Here, we print numbers from 1 to the row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after printing numbers in the current row
            System.out.println();
        }
    }
    public static void main(String[] args) {
       nTriangle(5);
    }
}
