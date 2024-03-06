import java.io.*;

class TrianglePattern3_5 {
    public static void main(String[] args) throws IOException {
      BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter Rows : "); 
      int rows = Integer.parseInt(br.readLine());
       
      for( int i =  1 ; i <= rows ; i++ ){
        char ch1 = 'a';
        char ch2 = 'A';
        for( int j = 1 ; j <= rows-i+1 ; j++ ){
            if( i % 2 == 1 ){
                System.out.print( ch2++ + " ");       
            } else {
                System.out.print( ch1++ + " ");
            }
        }
        System.out.println();
      }
    }
}
