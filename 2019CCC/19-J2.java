import java.util.Scanner;

public class 19-J2 {
    public static void main(String[] args) throws Exception {

        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter Amount of Lines");
        int num1 = 0;
        int Lines = userInput.nextInt();
        userInput.nextLine();
        
        for(int i = 0; i < Lines; i++){
            String symbol = userInput.nextLine();
            String[] symbolcalc = symbol.split(" ", 2);
            
            for(int a = 0; a < symbolcalc.length; a++){
                if((a % 2) == 0){
                    int num = Integer.parseInt(symbolcalc[a]);
                    num1 = num;
                }
                for(int e = (num1/2); e > 0; e--){
                    System.out.print(symbolcalc[1]);
                }
            }
                System.out.println(" ");
        }
        
    }
}
