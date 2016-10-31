public class rightAligned {
     public static void main (String[] args) {
          int rows = Integer.parseInt(args[0]);
	  int j = 0;
	  int k = 0;
	  //if I could change the j>k evaluation in the first loop
	  //then I wouldn't need to declare k in advance. As it is
	  //it seems ugly to only declare k up here and j in the 
	  //loop so here they both are 
          for (int i = 1; i <= rows; i++) {
          
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
