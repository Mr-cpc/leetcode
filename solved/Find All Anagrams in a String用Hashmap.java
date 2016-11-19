public class Solution {
    Map<Character,Integer> hs ;
    char[] pp,ss;
    List<Integer> ans;
    public List<Integer> findAnagrams(String s, String p) {
        
        ans = new ArrayList<Integer>();
        if(s.equals("") )
            return ans;
        if(s.length() < p.length() )
            return ans;
        hs = new HashMap<Character,Integer>();
        pp = p.toCharArray();
        ss = s.toCharArray();
        for(char c : pp) {
            if(hs.containsKey(c) )
                hs.put(c,hs.get(c) + 1 );
            else
                hs.put(c,1);
        }
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        for(int j = 0;j<pp.length;j++) {
            if(m.containsKey(ss[j]) )
                m.put(ss[j],m.get(ss[j]) + 1 );
            else 
                m.put(ss[j],1);
            }
        if(m.equals(hs))
            ans.add(0);

        for(int i = pp.length;i<ss.length;i++) {
            if(m.get(ss[i-pp.length]) == 1 )
                m.remove(ss[i-pp.length]);
            else
                m.put(ss[i-pp.length],m.get(ss[i-pp.length])-1);
                if(m.containsKey(ss[i]) )
                    m.put(ss[i],m.get(ss[i]) + 1 );
                else 
                    m.put(ss[i],1);
                if(m.equals(hs))
                    ans.add(i-pp.length+1);

          
        }
        return ans;
    }
        
    
}