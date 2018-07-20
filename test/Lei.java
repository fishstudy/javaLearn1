public class Lei{
        float var;
        float cpu;
        float mem;
        float sceen;

	public  Lei(){
		System.out.println("construct doing");
	}

    public void call() {
        System.out.println("var" + this.var);
        System.out.println("cpu" + this.cpu);
    }
}
