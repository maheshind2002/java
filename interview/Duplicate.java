package interview;

// removeing duplicate from sorted array in place without using extra space

public class Duplicate {
        public static void main(String[] args) {
        int [] arr = new int[]{21,35,35,47,47,56,68};
        int j = 0;

        for(int i =1;i<arr.length;i++){
            if(arr[i] != arr[j]){
                j++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]= temp;
            }
        }
        for(int i =0;i<=j;i++){
            System.out.println(arr[i]+ " ");
        }
        
    }
}