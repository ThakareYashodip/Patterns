import java.io.*;

class Num6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Rows : ");
        int rows = Integer.parseInt(br.readLine());
       
       int num = 1 ;
       for( int i = 1 ; i <= 2*rows-i ; i++ ){
            if( i < rows ){
                num = i ;
            } else {
                num = rows*2-i ;
            }
            for( int j = 1 ; j <= (num-1)*2+1 ; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
       }
        }
    }
