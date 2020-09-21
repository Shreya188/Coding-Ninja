import java.util.Scanner;

public class LInkedList1 {
	
	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		 int data=s.nextInt();
		 
		 Node<Integer> head=null,tail=null;
		 while(data!=-1) {
			 Node<Integer> newnode=new Node<>(data);
			 if(head==null) {
				 head=newnode;
				 tail=newnode;
			 }else {
				 tail.next=newnode;
				 tail=tail.next;
			 }
			 
			 data=s.nextInt();
		 }
		 return head;
	}

	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		        }
		System.out.println();
	}
	
	public static int findNode(Node<Integer> head, int n) {
		if(head==null) {
			return -1;
		}
		int i=0;
		while(head.data!=null) {
			if(head.data==n) {
				return i;
			}
			i++;
			head=head.next;
		}
		return -1;
		
	}
	
	public static void printIthNode(Node<Integer> head, int i){
		int count =1;
		Node<Integer> temp=head;
		while(temp!=null && count<=i) {
			temp=temp.next;
			count++;
			
		}
		System.out.println(temp.data);
	}
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		if(n==0) {
			return head;
		}
		if(head==null) {
			return head;
		}
		
		Node<Integer> temp1=head;
		int size=0;
		while(temp1!=null) {
			size++;
			temp1=temp1.next;
		}
		
		
		Node<Integer> temp=head;
		
		int l=0;
		while(l<size-n-1) {
			l++;
			temp=temp.next;
		}
		Node<Integer> newhead=temp.next,temp2=newhead;
		temp.next=null;
		while(temp2.next!=null) {
			temp2=temp2.next;
		}
		temp2.next=head;
		return newhead;
	}
	
		
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		Node<Integer> temp=head;
		
		while(temp.next!=null) {
			if(temp.data.equals(temp.next.data) ){
				temp.next=temp.next.next;
			}else {
			temp=temp.next;
			}
		}
	
		return head;
	}
public static Node<Integer> reverse(Node<Integer> head){
		
		
		if(head.next==null) {
			return head;
		}
		Node<Integer> tail=head.next;
		Node<Integer> newHead= reverse(head.next);
		tail.next=head;
		head.next=null;
		return newHead;
	}
	
	public static void printReverse(Node<Integer> root) {
		if(root==null) {
			return;
		}
		printReverse(root.next);
		System.out.print(root.data+" ");
	}
	
	public static boolean isPalindrome(Node<Integer> head) {
		if(head==null || head.next==null){
	           return true;
	       }
		
         Node<Integer> slow=head,fast=head;
		
		while(fast.next!=null && fast.next.next!=null) {
			
			slow=slow.next;
			fast=fast.next.next;
		}
		Node<Integer> head1=slow.next;
		Node<Integer> head2= head;
		head1=reverse(head1);
		

		while(head1!=null && head2!=null) {
			
			if(!head1.data.equals(head2.data)) {
				return false;
			}
			head1=head1.next;
			head2=head2.next;
		}
		return true;
				
	}
		
			
	
		

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node<Integer> head=takeInput();
		//print(head);
		
		//head=appendLastNToFirst(head,4);
		//print(head);
		
		// head=removeDuplicates(head);
		 //print(head);
		
		//int a=findNode(head,2);
		//System.out.println(a);
		
		 //printIthNode(head,2);
		
        boolean ispal=isPalindrome(head);
        System.out.println(ispal);

	}

}
