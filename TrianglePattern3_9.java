
import java.io.*;

class TrianglePattern3_9 {
    public static void main(String[] args) throws IOException {
      BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Rows : "); 
      int rows = Integer.parseInt(br.readLine());
       
      int num = (rows*(rows+1))-1;
      int temp = num ; 
      for( int i =  1 ; i <= rows ; i++ ){
        for( int j = 1 ; j <= rows-i+1 ; j++ ){
          System.out.print( temp + " ");
          temp -= 2 ; 
        }
        System.out.println();
      }
    }
}
