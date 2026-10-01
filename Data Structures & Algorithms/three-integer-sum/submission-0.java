class Solution {
    public java.util.List<java.util.List<Integer>> threeSum(int[] nums) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        
        java.util.Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int izquierdo = i + 1;
            int derecho = nums.length - 1;
            
            while (izquierdo < derecho) {
                int suma = nums[i] + nums[izquierdo] + nums[derecho];
                
                if (suma == 0) {
                    int[] tripleteArray = new int[3];
                    tripleteArray[0] = nums[i];
                    tripleteArray[1] = nums[izquierdo];
                    tripleteArray[2] = nums[derecho];
                    
                    java.util.List<Integer> listaTemporal = new java.util.ArrayList<>();
                    listaTemporal.add(tripleteArray[0]);
                    listaTemporal.add(tripleteArray[1]);
                    listaTemporal.add(tripleteArray[2]);
                    
                    res.add(listaTemporal);
                    
                    izquierdo++;
                    derecho--;
                    
                    while (izquierdo < derecho && nums[izquierdo] == nums[izquierdo - 1]) {
                        izquierdo++;
                    }
                    while (izquierdo < derecho && nums[derecho] == nums[derecho + 1]) {
                        derecho--;
                    }
                } else if (suma < 0) {
                    izquierdo++;
                } else {
                    derecho--;
                }
            }
        }
        return res;
    }
}

