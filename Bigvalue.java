
public class Bigvalue {
    public static int MinValue(int num[]){
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(minimum>num[i]){
                minimum = num[i];
            }
        }
        return minimum;
    }
    public static void main(String args[]){
        int num[]={4,9,5,12,1,20,2};

        System.out.println("Smallest value is :"+MinValue(num));
    }
}
