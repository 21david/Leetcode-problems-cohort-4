/*
https://leetcode.com/problems/subdomain-visit-count/
*/

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String cpdomain : cpdomains)
        {
            String[] split = cpdomain.split(" ");
            // should be split into a number and a domain
            String[] domains = split[1].split("[.]");
            //[google, mail, com]
            
            int visits = Integer.parseInt(split[0]);
            String domain = "";
            for(int i = domains.length - 1; i >= 0; i--)
            {
                domain = domains[i];
                for(int j = i + 1; j < domains.length; j++)
                {
                    domain += "." + domains[j];
                }
                if(map.containsKey(domain))
                    map.put(domain, map.get(domain) + visits);
                else 
                    map.put(domain, visits);
            }
            
            
        }
        
        ArrayList<String> list = new ArrayList<>();
        for(String s : map.keySet())
        {
            list.add(map.get(s) + " " + s);
        }
        
        return list;
    }
}
