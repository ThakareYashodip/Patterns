import java.io.*;

class TrianglePattern3_10 {
    public static void main(String[] args) throws IOException {
      BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Rows : "); 
      int rows = Integer.parseInt(br.readLine());
       
      for( int i =  1 ; i <= rows ; i++ ){
        int num = rows-i+1;
        for( int j = 1 ; j <= rows-i+1 ; j++ ){
            if( i % 2 == 1 ){
                System.out.print( (char)(64+num) + " ");       
            } else {
                System.out.print( (char)(96+num) + " ");
            }
            num--;
        }
        System.out.println();
      }
    }
}
