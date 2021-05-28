package SpiralSequence;

public class Addspiral {
private ListNode head;
	
	Addspiral() {
		head = null;
	}
	
    public void insertNode(int n, int m, int val) {
        /*	���ο� ��� ����	*/
    	ListNode newNode = new ListNode(n, m, val);
        /*	ó�� �Էµɶ� head Node�� null�̱� ������ newNode�� �����Ѵ�.	*/
    	if(head == null) {
            this.head = newNode;
        } 
        else {            
            /*	tempNode�� ������ ��带 ã�Ƽ� �����ϱ� ���� ����Ѵ�.	*/
            ListNode tempNode = head;
            
            /*	temp ����� link�� null�� �ƴ� ������ ���� ��带 ����.
             *	tempNode.link�� ���� ��带 �����ϰ� �����Ƿ�,
             *	tempNode = tempNode.link�� tempNode�� ���� ��带 ����.
             *	while���� ��� ����Ǹ� tempNode�� ���� ������ ��带 ����.	*/
            while(tempNode.link != null) {
                tempNode = tempNode.link;
            }
            
            /*	tempNode(������ ���)�� link�� ���� ��带 ����.	*/
            tempNode.link = newNode;
        }
        
    }
	
    public ListNode searchNode(int n, int m) {
        /*	temp ��忡 head�� ����Ű�� ù ��° �Ҵ�.	*/
    	ListNode tempNode = this.head;
        
        /*	temp ��尡 null�� �ƴ� ������ �ݺ��Ͽ� Ž��
         * 	�־��� �����Ϳ� temp ����� �����Ͱ� ��ġ�� ��� �ش� temp ��带 return
         * 	�����Ͱ� ��ġ���� ���� ��� temp ��忡 ���� ��� �Ҵ�.	*/
        while(tempNode != null) {
            if(tempNode.getn()==n && tempNode.getm()==m) {
                return tempNode;
            } else {
                tempNode = tempNode.link;
            }
        }
        
        return tempNode;
    }
    
	public void printList(int n, int m) {
		/*	tempNode�� head�� ����Ű�� ù��° ��带 �Ҵ�	
		 * 	index�� ������ ����ϱ����� 
		 * 	(index n, index m)�� ���� �� ���� List�ݺ� �˻�*/
        ListNode tempNode = this.head;
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		tempNode = searchNode(i, j);
        		System.out.printf("%5d ", tempNode.getval());
        		
        	}
        	System.out.println();
        }
        System.out.println();
    }
}
