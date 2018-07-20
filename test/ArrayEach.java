public class ArrayEach {
    public static void main(String[] args) {
		
		// 定义一个长度为 3 的字符串数组，并赋值初始值
		String[] hobbys = { "sports", "game", "movie" };
	    int len = hobbys.length;
	    for(int i=0; i<len;i++) {
	    
		  System.out.println("循环输出数组中元素的值："+hobbys[i]);
	    }
      }
}
