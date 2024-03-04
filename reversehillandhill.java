import java.io.*;

public class reversehillandhill {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Rows : ");
        int rows = Integer.parseInt(br.readLine());
        for( int i = 1 ; i < rows ; i++ ){
            for( int j = 1 ; j <= rows-i+1 ; j++ ){
                System.out.print("   ");
            }
            for( int k = 1 ; k <= i ; k++ ){
                System.out.print(" * ");
            }
            for( int l = 1 ; l < i ; l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for( int i = 1 ; i <= rows ; i++ ){
            for( int j = 1 ; j <= i ; j++ ){
                System.out.print("   ");
            }
            for( int k = 1 ; k <= rows-i+1 ; k++ ){
                System.out.print(" * ");
            }
            for( int l = 1 ; l < rows-i+1 ; l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
       
    }    
}
