class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0,candidates,target,new ArrayList<>(),res);
        return res;
    }
    private void backtrack(int start, int[] candidates,int target,List<Integer> current,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }

        for(int i = start;i < candidates.length;i++ ){

            current.add(candidates[i]);

            backtrack(i,candidates,target - candidates[i],current,res);//we can use same element many times

            current.remove(current.size()-1);
        }
    }
}