public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        Arrays.sort(nums);
        if(nums.length<4)
            return null;
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        List<Integer> l1 = null;
        int m = 0,n =0,sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i != 0 && i==i-1)
                continue;
            for(int j =i+1;j<nums.length;j++)
            {
                if(j != i+1 && j == j-1)
                    continue;
                m = j+1;
                n = nums.length -1;
                while(m<n)
                {
                    sum = nums[i] + nums[j] +nums[m] + nums[n];
                    if(sum < target)
                        m++;
                    else
                    {
                        if(sum < target)
                            n--;
                        else
                        {
                            l1 = new ArrayList<Integer>();
                            l1.add(nums[i]);
                            l1.add(nums[j]);
                            l1.add(nums[m]);
                            l1.add(nums[n]);
                            l.add(l1);
                            m++;
                            n--;
                        }