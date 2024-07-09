import java.util.Scanner;

public class 19-J1 {
    public static void main(String[] args) {
        
        int pointMultipler = 3;
        int pointsApple = 0;
        int pointsBanana = 0;
        
        for(int a = 0; a < 2; a++){
            for(int i = 0; i < 3; i++){
                Scanner pointsInput = new Scanner (System.in);
                int tempPoints = pointsInput.nextInt() * pointMultipler;
                pointMultipler--;
                
                if(a == 0){
                    pointsApple += tempPoints;
                }else{
                    pointsBanana += tempPoints;
                }
            }
            
            pointMultipler = 3;
        }
        
        if(pointsApple > pointsBanana){
            System.out.println("A");
        }else if(pointsApple < pointsBanana){
            System.out.println("B");
        }else{
            System.out.println("T");
        }
    }
}
