class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c=0;
        int c1=capacity;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i]<=capacity)
            {
                capacity=capacity-plants[i];
                c=c+1;
            }
            else{
                capacity=capacity+(c1-capacity);
                c=c+(2*(i))+1;

                capacity=capacity-plants[i];
            }
        }
        return c;
    }
}