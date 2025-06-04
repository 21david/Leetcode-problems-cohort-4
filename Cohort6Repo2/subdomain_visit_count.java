class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        // 15 ms, faster than 71.91%
        // 40.8 mb, less than 35.68%
        
        // store all the subdomains, and the total amout of times they were visited
        HashMap<String, Integer> map = new HashMap<>();
        
        // for each element in cpdomains, add count to all the subdomains
        for(String cpdomain : cpdomains)
        {
            String[] countAndDomain = cpdomain.split(" ");
            
            int count = Integer.parseInt(countAndDomain[0]);
            String domain = countAndDomain[1];
            
            while(domain.length() > 0)
            {
                // either add it to the map, or increase the count if already there
                map.put(domain, map.getOrDefault(domain, 0) + count);

                // remove the lowest level domain
                domain = trim(domain);
            }
        }
        
        // create the answer array
        ArrayList<String> answer = new ArrayList<>();
        
        Iterator iterateKeys = map.keySet().iterator();
        
        while(iterateKeys.hasNext())
        {
            String domain = (String) iterateKeys.next();
            answer.add( map.get(domain) + " " + domain );
        }
        
        return answer;
    }
    
    /*
    "discuss.leetcode.com" -> "leetcode.com"
    "leetcode.com" -> "com"
    "com" -> ""
    */
    public String trim(String domain)
    {
        int i = 0;
        
        while(i < domain.length() && domain.charAt(i) != '.')
            i++;
        
        if(i == domain.length())
            return "";
        
        return domain.substring(i + 1);
    }
}
