package leecode;

import java.util.Arrays;

public class A0088 {

	public static void main(String[] args) {
		int[] nums1  = {1,2,3,0,0,0,0};
		int[] nums2  = {2,5,6};
		int m = 3;
		int n = 3;
		
		A0088 test = new A0088();
		test.merge(nums1, m, nums2, n);
		
		for(int z:nums1){
			System.out.print(z+",");	
		}
		
	}
	
	
    public  void merge(int[] nums1, int m, int[] nums2, int n) {
    	
    	
    	//取一个新的数组a容量为m+n,将nums1和nums2的实际数据都放到新数组中，排序新数组
    	//将a数组中的内容，覆盖到nums1
/*    	
    	int[] temp = new int[m+n];
    	for(int i = 0; i < m; i++){
    		temp[i] = nums1[i];
    	}
    	int z = 0;
    	for(int i = m; i < m+n; i++){
    		temp[i] = nums2[z++];
    	}    	
    	
    	Arrays.sort(temp);
	
		
		for(int i = 0; i < nums1.length; i++){
			if (i >= m + n) {
				nums1[i] = 0;
			} else {
				nums1[i] = temp[i];				
			}
		}

 */   	
    	
    	//nums1末尾和nums2末尾比大小，大的放在nums1的m+n位置上，且对应数组索引前进1，
    	//某一个数组索引为0后，由另外一个数组直接替代。
    	
    	int tail = m + n - 1;
    	while(tail >= 0){
    		if (m < 0 && n >= 0) {
    			nums1[n] = nums2[n];
    			n--;
    		} else if (nums1[m-1] >= nums2[n-1]) {
    			nums1[tail] = 
    		} else {
    			
    		}
    		
    		tail--;
    	}
   	
    }
    
    
    
    

}
