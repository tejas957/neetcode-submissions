class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int bproduct = 1;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            product *= nums[i];
            bproduct *= nums[nums.length-i-1];
            prefix[i] = product;
            suffix[nums.length-i-1] = bproduct;

        }

        int[] except = new int[nums.length];
        for(int i = 1; i < nums.length-1; i++){
            except[i] = prefix[i-1]*suffix[i+1];
        }
        except[0] = suffix[1];
        except[nums.length-1] = prefix[nums.length-2];

        return except;

    }
}  
