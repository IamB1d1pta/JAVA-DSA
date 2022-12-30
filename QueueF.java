import java.util.*;

class QueueS{
	int[] queue = new int[5];
	int front;
	int rear;
	int size;

	void enqueue(int data){
		
		queue[rear]=data;
		rear = (rear+1)%5;
		size = size+1;
		
	}

	int dequeue(){
		
		int data = queue[front];
		front= (front+1)%5;
		size= size-1;
			
		
		return data;
	}

	void show(){
		for(int i=0; i<size; i++){
			System.out.println(queue[(front+i)%5]);
		}

	}
	
}

class QueueF{
	public static void main(String[] args) {
		QueueS q= new QueueS();
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.printf("\n1.Enqueue \n2.Dequeue\n3.Show\n4.Exit\n");
		System.out.println("Enter your choice..");
		int ch = sc.nextInt();
		System.out.println("....................");
		switch(ch){
		case 1:
			System.out.println("Enter data to insert");
			int data=sc.nextInt();
			q.enqueue(data);
			break;
		case 2: 
			int value= q.dequeue();
			System.out.printf("%d is deleted from queue",value);
			break;
		case 3:
			q.show();
			break;
		case 4: 
			System.exit(0);
		default: System.out.println("Enter valid choice..");		
		}
		}
	}
}