import java.util.Scanner;

public class 19S2PAP {
    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner (System.in);
        System.out.println("How many lines of averages?");
        int T = userInput.nextInt();
        System.out.println("Enter " + T + " numbers, and we'll find all 2 primes that are the averages of those numbers.");
        
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