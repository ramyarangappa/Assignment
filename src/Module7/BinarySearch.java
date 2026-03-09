package Module7;

public class BinarySearch {

        public static void main(String[] args) {
            int[] arr = {1,3,5,7,9};
            int target = 7;

            int l = 0, r = arr.length-1;

            while(l<=r){
                int mid = (l+r)/2;

                if(arr[mid]==target){
                    System.out.println("Found at "+mid);
                    break;
                }

                if(arr[mid] < target)
                    l = mid+1;
                else
                    r = mid-1;
            }
        }
    }

