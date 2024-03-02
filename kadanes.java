public class kadanes {
    public static void maxkadanes(int num[]){
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            currSum = currSum + num[i];
            if(currSum<0){
                currSum=0;
            }
           maxsum = Math.max(maxsum, currSum);
        }
        System.out.println("The maximum sum is:"+maxsum);
    }
    public static void main(String args[]){
  int num[] ={-2,-3,4,-1,-2,1,5,-3};
      maxkadanes(num);
    }
}


