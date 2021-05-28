package SpiralSequence;

public class SpiralFill {
	SpiralFill(){}
	
	public void FillnPrint(int n, int m){
		// Initialize value to be filled in matrix 
		/*	val - Spiral Sequence의 입력될 값
		 * 	row - Spiral Sequence의 N(Row)의 크기 저장
		 * 	col - Spiral Sequence의 M(Col)의 크기 저장  */
	    int val = 1; 
	    int row = n;
	    int col = m;
	    Addspiral a = new Addspiral();
	    /*	k - Row의 시작 index
	     * 	m - Row의 마지막 index
	     * 	l - Col의 시작 index
	     * 	n - Col의 마지막 index  */
	    int k = 0, l = 0; 
	    while (k < n && l < m) 
	    { 
	    	/*	존재하는(남아있는) 열에서의 첫번쨰 열을 ListNode에 저장	*/
	        for (int i = l; i < m; i++) {
	            a.insertNode(k, i, val++);
	        }
	        k++; 
	  
	        /*	존재하는(남아있는) 행에서의 마지막 열을 ListNode에 저장	*/
	        for (int i = k; i < n; i++) {
	            a.insertNode(i, m-1, val++);
	        }
	        m--; 
	  
	        /*	존재하는(남아있는) 열에서의 마지막 열을 ListNode에 저장	*/
	        if (k < n) { 
	            for (int i = m-1; i >= l; i--) 
	                a.insertNode(n-1, i, val++); 
	            n--; 
	        } 
	  
	        /*	존재하는(남아있는) 행에서의 첫번째 행을 ListNode에 저장	*/
	        if (l < m) { 
	            for (int i = n-1; i >= k; i--) 
	                 a.insertNode(i, l, val++);
	            l++; 
	        } 
	    }
	    
	    /*	출력	*/
	    a.printList(row, col);
	}
}
