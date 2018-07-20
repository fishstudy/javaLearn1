//导入Arrays类

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        
		// 定义一个字符串数组
		String[] hobbies = { "sports", "game", "movie" };
                Arrays.sort(hobbies);
                System.out.println("the array content is:");
		// 使用Arrays类的sort()方法对数组进行排序
		int len = hobbies.length - 1;
		for(int i=len; i>=0; i--) {
			System.out.println("data:"+hobbies[i]);
		}
		
		System.out.println(Arrays.toString(hobbies));
	}
}
