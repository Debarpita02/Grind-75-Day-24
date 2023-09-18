class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenBefore = new HashSet<Integer>();
        for(int i : nums) {
        if(seenBefore.contains(i)) {
            return true;
        }
        seenBefore.add(i);
    }
    return false;
  }
}