class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res =new ArrayList<>();
        bkt(1,k,n,new ArrayList<>(),res);
        return res;
    }
    private void bkt(int start,int k,int n,List<Integer> current,List<List<Integer>> res){
        if(n == 0 && current.size() == k){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=9;i++){
            if(n<0 || current.size() > k) continue;

            current.add(i);

            bkt(i+1,k,n-i,current,res);

            current.remove(current.size() - 1);
        }
    }
}