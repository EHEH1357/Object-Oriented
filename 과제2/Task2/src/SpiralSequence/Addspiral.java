package SpiralSequence;

public class Addspiral {
private ListNode head;
	
	Addspiral() {
		head = null;
	}
	
    public void insertNode(int n, int m, int val) {
        /*	새로운 노드 생성	*/
    	ListNode newNode = new ListNode(n, m, val);
        /*	처음 입력될때 head Node가 null이기 때문에 newNode를 참조한다.	*/
    	if(head == null) {
            this.head = newNode;
        } 
        else {            
            /*	tempNode는 마지막 노드를 찾아서 참조하기 위해 사용한다.	*/
            ListNode tempNode = head;
            
            /*	temp 노드의 link가 null이 아닐 때까지 다음 노드를 참조.
             *	tempNode.link는 다음 노드를 참조하고 있으므로,
             *	tempNode = tempNode.link는 tempNode에 다음 노드를 참조.
             *	while문이 모두 실행되면 tempNode는 가장 마지막 노드를 참조.	*/
            while(tempNode.link != null) {
                tempNode = tempNode.link;
            }
            
            /*	tempNode(마지막 노드)의 link가 다음 노드를 참조.	*/
            tempNode.link = newNode;
        }
        
    }
	
    public ListNode searchNode(int n, int m) {
        /*	temp 노드에 head가 가리키는 첫 번째 할당.	*/
    	ListNode tempNode = this.head;
        
        /*	temp 노드가 null이 아닐 때까지 반복하여 탐색
         * 	주어진 데이터와 temp 노드의 데이터가 일치할 경우 해당 temp 노드를 return
         * 	데이터가 일치하지 않을 경우 temp 노드에 다음 노드 할당.	*/
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
		/*	tempNode에 head가 가리키는 첫번째 노드를 할당	
		 * 	index의 순서로 출력하기위해 
		 * 	(index n, index m)이 같을 때 까지 List반복 검색*/
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
