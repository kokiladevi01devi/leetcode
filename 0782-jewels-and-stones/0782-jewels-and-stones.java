class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<stones.length();i++)
        {
            h.put(stones.charAt(i),h.getOrDefault(stones.charAt(i),0)+1);

        }
        int s=0;
        for(int i=0;i<jewels.length();i++)
        {
            if(h.containsKey(jewels.charAt(i)))
            {
                s=s+h.get(jewels.charAt(i));
            }
        }
        return s;
    }
}