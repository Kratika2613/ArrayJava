public class binarysearch {

    public static int BinarySearch(int num[],int key)
    {
        int n=num.length;
        int low=0 , high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                low =mid+1;
            }
            else{
                high =mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={2,5,7,9,10,14,15};
        int key= 14;
         System.out.println("The key is found at index:"+ BinarySearch(num, key));
    }
}
