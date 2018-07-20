public class InitLei {
    public static void main(String args[]){
        Lei lei = new Lei();
        lei.call();
	lei.cpu = 5.0f;
        lei.mem = 10.0f;
	lei.var = 6.0f;
        lei.call();
    }
}
