public class subarray {

    public static void printSubArray(int num[]){ 
        int n = num.length;
         int totalsb = n*(n+1)/2;
        for(int i=0; i<n; i++){
           
            int start = i;
            
            for(int j=i; j<n; j++){
                int end = j;

                for(int k= start; k<=end; k++){
                
                    System.out.print(num[k]+" ");
                   
                }
               
                System.out.println();
            }
            System.out.println();
        }
         System.out.println("total sub arrays are:"+totalsb);
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};
        printSubArray(num);
    }
    
}
