public class reverse {
    public static int Reverse(int num[]){
        int first=0 , last=num.length-1;
        while(first<last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
        return last;
    }
    public static void main(String args[]){
        int num[]={3,6,9,12,15,18};

        Reverse(num);

        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }

    }
    
}
