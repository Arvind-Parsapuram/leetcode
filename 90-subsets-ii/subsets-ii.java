class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>(),res);
        return res;
    }

    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> res){
        //List<Integer> current, List<List<Integer>> res" are sub parts of new ArrayList<>()
        res.add(new ArrayList<>(current));

        for(int i = start;i<nums.length;i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            current.add(nums[i]);//current index added to res like[[],[1],[1,2],[1,2,3]] at first iteration

            backtrack(i+1,nums,current,res);

            current.remove(current.size()-1);
            
    }
}
}