import java.util.Arrays;

public class ArrayForeach {
    
    public static void main(String[] args) {
        
		// 定义一个整型数组，保存成绩信息
		int[] scores = { 89, 72, 64, 58, 93 };
       		int len = scores.length; 
		// 对Arrays类对数组进行排序
		for(int i=0; i<len; i++) {
			System.out.println(scores[i]);
		}
               System.out.println("\n\n\n"); 
		// 使用foreach遍历输出数组中的元素
		for (   int score : scores               ) {
			System.out.println(score);
		}
	}
}
