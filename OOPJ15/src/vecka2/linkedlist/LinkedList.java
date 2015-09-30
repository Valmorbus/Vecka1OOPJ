package vecka2.linkedlist;

public class LinkedList<Typ> {
	Node<Typ> head = null;
	private int size = 0;

	public void add(Typ value) {
		if (head == null)
			head = new Node<Typ>(value, null);
		else
			add(head, value);
		this.size++;
	}

	private Node<Typ> add(Node<Typ> node, Typ value) {
		if (node.getNext() == null) {
			node.setNext(new Node<Typ>(value, null));
		} else
			add(node.getNext(), value);
		return node;
	}

	public Node<Typ> getHead() {
		return head;
	}

	public void setHead(Node<Typ> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public String tostring()
	{
		return toString(head);
	}

	private String toString(Node<Typ> node) {

		if (node == null) { // base case: no nodes in the list
			return "";
		} else { // convert node to text and recurse with remainder list
			Node<Typ> next = node.getNext();
			return node.getType() + (next == null ? "" : "\n") + toString(next);

		}
	}

}
