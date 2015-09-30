package vecka2.linkedlist;

public class Node <T>{
	
	private T typ;
	private Node<T> next;

	public Node(T type, Node<T> nextNode)
	{
		this.typ = type;
		this.next = nextNode;
		//Node last;
	}
	
	public T getType()
	{
		return this.typ;
	}
	public void SetType(T type)
	{
		this.typ = type;
	}
	public void setNext(Node<T> nextNode)
	{
		this.next = nextNode;
	}
	public Node<T> getNext()
	{
		return this.next;
	}
	
	
	
	public Node<T> nextNode(Node<T> node)
	{
		if(node != null)
		{
			return node;
		}
		else 
			return null;
	}
		 

}
