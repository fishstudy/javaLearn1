public class ArrayTask {
	public static void main(String[] args) {
	 int nums[] = new int[] {61,23,5,74,13,148,20};
	 int max = nums[0];
	 int min = nums[0];
         int sum = 0;
	 double avg = 0;
         int len = nums.length;
         for(int i=0; i<len; i++) {
	 	sum += nums[i];
		if(max < nums[i]) {
			max = nums[i];
		}
		if(min > nums[i] ) {
			min =  nums[i];
		}
	 }
	 avg = (double)sum / len;
	 System.out.println("max is:"+max);
	 System.out.println("min is:"+min);
	 System.out.println("avg is:"+avg);
	 System.out.println("sum is:"+sum);
	
	
	}




}
