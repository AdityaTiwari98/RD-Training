package com.epam.collections.collectionTask.customList;

public class CustomList<E> {
	
	Node<E> head;
	
	public CustomList() {
		head=null;
	}
	
	Node<E> lastNode(){
		Node<E> temp=head;
		while(temp.next!=null)
			temp=temp.next;
		return temp;
	}
	
	public void add(E e) {
		Node<E> temp=new Node<E>(e);
		if(head==null)
			head=new Node<E>(e);
		else {
			lastNode().next=temp;
		}
	}
	
	public void remove(E e) {
		
	}

}
