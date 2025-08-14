
package insertionsort;

public class InsertionSort {


    public static void main(String[] args) {
        int Arr[] = {15,3,20,8,12,1,9,18,5,10};
        int n = Arr.length;
        for(int j=0;j<n;j++){
            int key = Arr[j];
            int i = j - 1;
            while(i>=0 && Arr[i]> key){
                Arr[i +1] = Arr[i];
                i -=1;
            }
            Arr[i+1] = key;
            for(i=0;i<n;++i){
                System.out.print(Arr[i]+" ");
            }
            System.out.println();
        }
        
    }
    
}
