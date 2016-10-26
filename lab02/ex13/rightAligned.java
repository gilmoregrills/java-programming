public class rightAligned {
     public static void main (String[] args) {
          int rows = Integer.parseInt(args[0]);
          int j = 0;
          int k = 0;

          for (int i = 0; i <= rows; i++) {
               for (j = rows; j > k; j--) {
                    System.out.print(" ");
               }
               for (k = 0; k < i; k++) {
                    System.out.print("*");
               }
               System.out.println("");
          }
     }
}
