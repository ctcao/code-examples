
public class Node {
	private Node nextNode;
	private int nodeNumber;

	public Node(int nodeNumber, Node nextNode){
		this.nextNode=nextNode;
		this.nodeNumber=nodeNumber;
	}

	public int getNodeNumber()
	{
		return nodeNumber;
	}

	public Node getNextNode()
	{
		return nextNode;
	}

	public void setNodeNumber(int newNum){
		nodeNumber=newNum;
	}

	public void setNextNode(Node newNode)
	{
		nextNode=newNode;
	}
}
