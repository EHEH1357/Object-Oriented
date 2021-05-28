package SpiralSequence;

public class ListNode {
	/*	n - Row의 index를 저장
	 * 	m - Col의 index를 저장
	 * 	value - (index n, index m)의 값 저장
	 * 	link - 다른 노드를 참조할 링크 노드	*/
	private int n;
    private int m;
    private int value;
    public ListNode link;
    /*	ListNode에 Row, Col의 index저장, 값 저장	*/
    public ListNode(int n, int m, int val) {
    	this.n = n;
        this.m = m;
        this.value = val;
        this.link = null;
    }
    /*	값 불러오기	*/
    public int getval() {
        return this.value;
    }
    /*	index n 불러오기	*/
    public int getn() {
        return this.n;
    }
    /*	index m 불러오기	*/
    public int getm() {
        return this.m;
    }
}
