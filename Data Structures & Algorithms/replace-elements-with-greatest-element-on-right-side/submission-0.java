class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                arr[i] = -1;
            }else{
            int largest = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > largest){
                    largest = arr[j];
                }
            }
            arr[i] = largest;
        }
        }
    return arr;
    }
}