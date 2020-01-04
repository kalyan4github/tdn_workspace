import java.util.Scanner;


public class App {
    int principle;
    float rate,time,interest;
    
    public void userInput() {
        Scanner scanner = new Scanner(System.in);
        principle= scanner.nextInt();
        rate= scanner.nextFloat();
        time= scanner.nextFloat();
    }
    public void calculateSI() {
        interest=(principle*rate*time)/100;
        System.out.println("Interest "+interest);
    }

    public static void main(String[] args) {
        App app = new App();
        app.userInput();
        app.calculateSI();
        float totalAmt= app.principle+app.interest;
        System.out.println("Total Amount "+totalAmt);
    }
}