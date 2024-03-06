import java.io.*;

class TrianglePattern3_4 {
    public static void main(String[] args) throws IOException {
      BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Rows : "); 
      int rows = Integer.parseInt(br.readLine());
      
      int temp = (rows*(rows+1))/2 ;
      int num = temp ;
      char ch = (char)(num+64); 
      for( int i =  1 ; i <= rows ; i++ ){
        for( int j = 1 ; j <= rows-i+1 ; j++ ){
            System.out.print( ch-- + " ");
        }
        System.out.println();
      }
    }
}
