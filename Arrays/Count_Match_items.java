class Solution {
    public int countMatches(List<List<String>> items, String rulekey, String ruleValue) {
        int index = 0;
        if(rulekey.equals("color")){
            index = 1;
        }
        else if (rulekey.equals("name")){
            index = 2;
        }
        
        int ans = 0;
        for(List<String> item : items){
            if(item.get(index).equals(ruleValue))
                ans++;
       }
        return ans;
    }
}