class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] index = new int[2];
    for(int i=0;i<nums.length;i++){
        int difference = target - nums[i];
        if(map.containsKey(difference)){
            index[0] = map.get(difference);
            index[1] = i;
            return index;
        }else{
            map.put(nums[i],i);
        }
    }
    return index;   
    }
}
