import java.io.* ;

class Num11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Rows : ");
        int rows = Integer.parseInt(br.readLine());

        int num = 1 ; 
        for( int i = 1 ; i <= rows ; i++ ){
            int temp = num ;
            for( int j = 1 ; j <= i ; j++ ){
                System.out.print( temp + " " );
                temp += 3 ; 
            }
            num += 3 ;
            System.out.println();
        }
    }
}
