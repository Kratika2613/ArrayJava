public class maxsub {

    public static void MaxSubarrSum(int num[]){ 
           
            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;
             for(int i=0; i<num.length; i++)
        {
                int start = i;
            
            for(int j=i; j<num.length; j++){
                int end = j;
                currsum = 0;
                for(int k= start; k<=end; k++){

                    currsum += num[k];
                    
                   
                }
                System.out.println("The sum of every sub array is:"+currsum);
                if(maxsum<currsum)
                {
                    maxsum = currsum;
                }
               
                System.out.println();
            }
          
        }
         System.out.println("maximum sum is:"+maxsum);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        MaxSubarrSum(num);
    }
    
}

