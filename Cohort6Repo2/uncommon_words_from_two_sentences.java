class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        // 2 ms, faster than 75.09%
        // 38.2 MB, less than 71.28%
        
        String[] a = A.split(" ");
        String[] b = B.split(" ");
        
        HashMap<String, Integer> multiset = new HashMap<>();
        
        for(String s : a)
            multiset.put(s, multiset.getOrDefault(s, 0) + 1);
        
        for(String s : b)
            multiset.put(s, multiset.getOrDefault(s, 0) + 1);
        
        ArrayList<String> uncommons = new ArrayList<>();
        
        Iterator iterateKeys = multiset.keySet().iterator();
        
        while(iterateKeys.hasNext())
        {
            String word = (String) iterateKeys.next();
            if(multiset.get(word) == 1)
                uncommons.add(word);
        }
        
        String[] answer = uncommons.toArray(new String[0]);
        
        return answer;
    }
}
