public class ������ extends Animal implements Flyable {
    private int ����;

    public void ����(){
    	System.out.println("�������� ���ƿ�");
    }

    public void move(){
    	this.����();
    }

	@Override
	public void fly() {
		this.����();
	}

}
