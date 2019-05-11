package newcoder_45;

public class 数组中的逆序对_35 {
public int num = 0;
    
    // 将有二个有序数列a[first...mid]和a[mid...last]合并。  
    public void mergearray(int a[],int first,int mid,int last,int temp[]){
        int i=first,j=mid+1;
        int k=0;
        while(i<=mid && j<=last){
            if(a[i]>a[j]){
                num+=mid-i+1;
                num=num>1000000007?num%1000000007:num;
                temp[k++]=a[j++];
            }
            else{
                temp[k++]=a[i++];
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=last){
            temp[k++]=a[j++];
        }
        for(int t=0;t<k;t++){
            a[first+t]=temp[t];
        }
    }
    public void mergesort(int a[],int first,int last,int temp[]){
        if(first<last){
            int mid = (first+last)/2;
            mergesort(a,first,mid,temp);
            mergesort(a,mid+1,last,temp);
            mergearray(a,first,mid,last,temp);
        }
    }
    public int InversePairs(int [] array) {
        int[] p = new int[array.length];  
        mergesort(array, 0, array.length - 1, p); 
        return num;
    }
}
