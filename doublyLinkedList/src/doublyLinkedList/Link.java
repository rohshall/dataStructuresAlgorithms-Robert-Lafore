package doublyLinkedList;

public class Link {

	public int iData;
	public Link next;
	public Link previous;
	
	public Link(int data) {
		iData = data;
	}
	public void displayLink() {
		System.out.print(iData + " ");
	}
}
