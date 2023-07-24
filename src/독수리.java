public class 독수리 extends Animal implements Flyable {
    private int 날개;

    public void 날기(){
    	System.out.println("독수리가 날아요");
    }

    public void move(){
    	this.날기();
    }

	@Override
	public void fly() {
		this.날기();
	}

}
