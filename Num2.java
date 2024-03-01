import java.io.*;

class Num2 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Rows : ");
            int rows = Integer.parseInt(br.readLine());

            for( int i = 1 ; i <= rows ; i++ ) {
                // 1st Increasing triangle
                int num = 1 ; 
                for( int j = 1 ; j < i ; j++ ){
                    System.out.print(num++ + " ");
                }
                //for spaces
                for( int l = 1 ; l < i ; l++) {
                    System.out.print("  ");
                }
                System.out.println();
            }

                 for( int m = 1 ; m <= rows ; m++ ){
                    int num = 1 ;
                    for( int j = 1 ; j <= rows-m+1 ; j++ ){
                        System.out.print(num++ + " ");
                    }
                    System.out.println();
                }
            }
        }


