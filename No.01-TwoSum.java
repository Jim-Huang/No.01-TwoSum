//解法02 使用HashMap
/*以題目為例 HashMap內容如下
    (2,0)
    (7,1)
    (11,2)
    (15,3)
    由於HashMap無順序性
    因此使用value存放陣列索引值 並可以利用map.get方法拉出索引值*/
//map.get(x)取得x的value值 
//map.containsKey(y)是否有y這個key 
//map.containsValue(z)是否有z這個value
 class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map = new HashMap<>();  
    for(int i = 0; i<nums.length; i++){
        if(map.containsKey(target-nums[i])){
            ans[1]=i;
            ans[0]=map.get(target-nums[i]);
            break;
        }
        map.put(nums[i],i); //(key,value)
    }        
     return ans;
    }
}
