package SpiralSequence;

public class ListNode {
	/*	n - Row�� index�� ����
	 * 	m - Col�� index�� ����
	 * 	value - (index n, index m)�� �� ����
	 * 	link - �ٸ� ��带 ������ ��ũ ���	*/
	private int n;
    private int m;
    private int value;
    public ListNode link;
    /*	ListNode�� Row, Col�� index����, �� ����	*/
    public ListNode(int n, int m, int val) {
    	this.n = n;
        this.m = m;
        this.value = val;
        this.link = null;
    }
    /*	�� �ҷ�����	*/
    public int getval() {
        return this.value;
    }
    /*	index n �ҷ�����	*/
    public int getn() {
        return this.n;
    }
    /*	index m �ҷ�����	*/
    public int getm() {
        return this.m;
    }
}
