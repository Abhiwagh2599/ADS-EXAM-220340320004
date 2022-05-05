class LinkedList{
	static ListNode head;
	
	public static class ListNode{
		int data;
		ListNode next;
	ListNode(int data){
		this.data=data;
		this.next=null;
		}
	}
	static public ListNode reverse(ListNode head){
		if(head==null){
			return head;
		}
		ListNode current=head;
		ListNode next=null;
		ListNode previous=null;
		
		while(current!=null){
		next=current.next;
		current.next=previous;
		previous=current;
		current=next;
		}
		return previous;
	}
	static void display(){
		ListNode temp=head;
		while(temp.next!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[]args){
	ListNode first	=new ListNode(10);
	ListNode second	=new ListNode(20);
	ListNode third	=new ListNode(30);
	ListNode fourth	=new ListNode(40);
	first.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=null;
	head=first;
	head=reverse(head);
	display();
	}

}