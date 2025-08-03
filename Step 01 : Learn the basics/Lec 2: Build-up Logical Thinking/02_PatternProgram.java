 /*
/////////OUTPUT
* 
* * 
* * * 
* * * * 
* * * * *  
/////////
  */ 
class Solution {
        public static void nForest(int n) {
        // Iterate over each row
        for (int i = 1; i <= n; i++) {            
            // Print 'i' number of "* " for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing all asterisks in the current row
            System.out.println();
        }
    }
    public static void main(String[] args) {
       nForest(5);
    }
}
