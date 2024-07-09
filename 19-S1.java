import java.util.Scanner;

public class 19S1F {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        String HV = userInput.next();

        char H = 'H';
        char V = 'V';
        int hCounter = 0;
        int vCounter = 0;

        for (int i = 0; i < HV.length(); i++) {
            if (HV.charAt(i) == 'H') {
                hCounter++;
            }
            if (HV.charAt(i) == 'V') {
                vCounter++;
            }
        }

        if (hCounter++ % 2 == 0) {
            if (vCounter++ % 2 == 0) { //H and V are both even
                System.out.println("1" + " 2");
                System.out.println("3" + " 4");
            } else {  //H is even and V odd
                System.out.println("2" + " 1");
                System.out.println("4" + " 3");
            }
        } else {
            if (vCounter++ % 2 == 0) { //H is odd and V is even
                System.out.println("3" + " 4");
                System.out.println("1" + " 2");
            } else {  //H and V are both odd
                System.out.println("4" + " 3");
                System.out.println("2" + " 1");
            }
        }
    }
}