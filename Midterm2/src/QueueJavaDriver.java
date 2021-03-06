import java.util.LinkedList;
import java.util.Queue;

public class QueueJavaDriver {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(10);
		q.add(40);
		q.add(10);
		q.add(60);
		
		System.out.println(q);
		System.out.println(average(q));
		removeVal(q,10);
		 
		System.out.println(q);
		

	}
	
	public static void removeVal (Queue<Integer> inputQ, int val){
		
		int tempVal;
		int size = inputQ.size(); 
		for (int i=0 ; i < inputQ.size(); i++){
			tempVal = inputQ.remove();
			if (tempVal != val)
				inputQ.add(tempVal);
		}
		
		
	}
	
	public static int average(Queue<Integer> inputQ) {
		int total = 0;
		int size = inputQ.size();
		for(int i = 0; i < size; i++) {
			total += inputQ.poll();
		}
		total = total / size;
		return total;
	}


}
