package Module7;

public class RotatedSearch {

        public static void main(String[] args) {

            int[] arr={4,5,6,7,0,1,2};
            int target=0;

            int l=0,r=arr.length-1;

            while(l<=r){
                int mid=(l+r)/2;

                if(arr[mid]==target){
                    System.out.println(mid);
                    return;
                }

                if(arr[l]<=arr[mid]){
                    if(target>=arr[l] && target<arr[mid])
                        r=mid-1;
                    else
                        l=mid+1;
                }
                else{
                    if(target>arr[mid] && target<=arr[r])
                        l=mid+1;
                    else
                        r=mid-1;
                }
            }
        }
    }

