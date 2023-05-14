class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        int [] results = new int[2];
        int diff = 0;
        List<Integer> visited = new ArrayList<>();
        
        for (int i = 0; i < nums.length ; i++) {
            diff = target - nums[i];
            
            if(visited.contains(diff)){
                results[0] = visited.indexOf(diff);
                results[1] = i ;
                  break;
                
            
        }
            else{
                visited.add(i, nums[i]);
            }
        }
        
        return results;
    }
}