public class Null {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4,5,6,0};
        for(int num : nums)
        if(num % 3 == 0){
            System.out.println(num);
        }
    }
}
