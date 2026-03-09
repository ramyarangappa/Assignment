package Module7;


    import java.util.*;

    public class MergeSort {

        static void merge(int[] arr,int l,int m,int r){
            int[] left=Arrays.copyOfRange(arr,l,m+1);
            int[] right=Arrays.copyOfRange(arr,m+1,r+1);

            int i=0,j=0,k=l;

            while(i<left.length && j<right.length){
                if(left[i]<=right[j])
                    arr[k++]=left[i++];
                else
                    arr[k++]=right[j++];
            }

            while(i<left.length)
                arr[k++]=left[i++];

            while(j<right.length)
                arr[k++]=right[j++];
        }

        static void sort(int[] arr,int l,int r){
            if(l<r){
                int m=(l+r)/2;
                sort(arr,l,m);
                sort(arr,m+1,r);
                merge(arr,l,m,r);
            }
        }

        public static void main(String[] args){
            int[] arr={12,11,13,5,6,7};

            sort(arr,0,arr.length-1);

            for(int x:arr)
                System.out.print(x+" ");
        }
    }

