import java.util.Scanner;

public class 19-S2 {
    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter Amount of Lines");
        int T = userInput.nextInt();
        
        for (int e = 0; e < T; e++){
            int N = userInput.nextInt();
            int doubled = N * 2;

            for (int i = doubled; i <= doubled; i--) {
                if(isPrime(i)){
                    int endvar = doubled - i;
                    if(isPrime(endvar)){
                        System.out.println(i + "  " + endvar);
                        continue;
                    } else{
                        continue;
                    }
                }
            }
        }
        userInput.close();
}
    static boolean isPrime (int num)
        {
            if(num<=1)
            {
                return false;
            }
            for(int j=2;j<=num/2;j++){
                if((num%j)==0){
                return false;
                              }
            }
                 return true;
        }
    }
//}
