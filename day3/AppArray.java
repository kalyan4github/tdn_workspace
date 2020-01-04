
public class AppArray {

    public static void main(String[] args) {
        int [] nums = {2,5,8,11,12};
        
        System.out.println(nums);
        int total=0;
        for (int num : nums) {
            System.out.println(num);
            total = total+num;
        }
        System.out.println(total);
    }
    
}
