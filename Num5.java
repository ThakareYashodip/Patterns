import java.io.*;

public class Num5 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Rows : ");
            int rows = Integer.parseInt(br.readLine());
            
            for( int i = 1 ; i <= rows ; i++ ){
                // 1st numbers increasing triangle
                int num = rows - i ; 
                for( int j = 1 ; j <= i ; j++ ){
                    System.out.print( num++ + " " );
                }System.out.println();
            }
            
            for( int m = 1 ; m < rows ; m++ ){
                int num = m ; 
                for( int j = 1 ; j <= rows-m ; j++ ){
                    System.err.print(num++ + " " );
                }System.out.println();
            }
        }    
}
