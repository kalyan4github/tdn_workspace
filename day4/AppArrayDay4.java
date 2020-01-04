import java.util.Scanner;

public class AppArrayDay4 {

    public static void main(String[] args) {
        int n = 3;
        int[] nums = new int[n];
        nums[0]=2;
        nums[1]=5;
        nums[2]=15;
        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Element");
        int newElement= scanner.nextInt();


        int[] tempArray = new int[n+1];
        for(int i =0;i<n;i++){
            tempArray[i]=nums[i];           
        } 
        
        tempArray[n]=newElement;

        //display array elements
        for (int num : tempArray) {
            System.out.print(num+"\t");
            
        }



















        /* //while (true) {
            System.out.println("Enter Elements");
            Scanner scanner = new Scanner(System.in);
            int newElement =scanner.nextInt();
            int[] tempArray = new int[n+1];
            for (int i = 0; i < n; i++) {
                tempArray[i] = nums[i]; 
            }
            tempArray[n] = newElement; 
            nums = tempArray;

        //} */
        


    }
}
        
                    
