package SpiralSequence;

public class SpiralFill {
	SpiralFill(){}
	
	public void FillnPrint(int n, int m){
		// Initialize value to be filled in matrix 
		/*	val - Spiral Sequence�� �Էµ� ��
		 * 	row - Spiral Sequence�� N(Row)�� ũ�� ����
		 * 	col - Spiral Sequence�� M(Col)�� ũ�� ����  */
	    int val = 1; 
	    int row = n;
	    int col = m;
	    Addspiral a = new Addspiral();
	    /*	k - Row�� ���� index
	     * 	m - Row�� ������ index
	     * 	l - Col�� ���� index
	     * 	n - Col�� ������ index  */
	    int k = 0, l = 0; 
	    while (k < n && l < m) 
	    { 
	    	/*	�����ϴ�(�����ִ�) �������� ù���� ���� ListNode�� ����	*/
	        for (int i = l; i < m; i++) {
	            a.insertNode(k, i, val++);
	        }
	        k++; 
	  
	        /*	�����ϴ�(�����ִ�) �࿡���� ������ ���� ListNode�� ����	*/
	        for (int i = k; i < n; i++) {
	            a.insertNode(i, m-1, val++);
	        }
	        m--; 
	  
	        /*	�����ϴ�(�����ִ�) �������� ������ ���� ListNode�� ����	*/
	        if (k < n) { 
	            for (int i = m-1; i >= l; i--) 
	                a.insertNode(n-1, i, val++); 
	            n--; 
	        } 
	  
	        /*	�����ϴ�(�����ִ�) �࿡���� ù��° ���� ListNode�� ����	*/
	        if (l < m) { 
	            for (int i = n-1; i >= k; i--) 
	                 a.insertNode(i, l, val++);
	            l++; 
	        } 
	    }
	    
	    /*	���	*/
	    a.printList(row, col);
	}
}
