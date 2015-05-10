public class IntSet {

	private Node headNode;
	private Node tailNode;

	IntSet()
	{
		headNode=null;
		tailNode=null;
	}

	// Goes through every node in the IntSet looking for the given value, if it finds it it returns true.
	// Otherwise it will default return false.
	public boolean contain(int value) {
		int size = size();
		Node thisNode= headNode;
		for(int i=0;i<size;i++){
			if(thisNode.getNodeNumber() == value)
				return true;
			else if(thisNode.getNextNode()!=null)
				thisNode=thisNode.getNextNode();
		}
		return false;
	}

	// Goes through the IntSet looking for the value until it finds it or reaches the tail of the IntSet.
	// If it finds it, it'll link the current node to link to the next next node instead of the next node
	// which is the node with the given integer.
	public void remove(int value){
		Node thisNode = headNode;
		while(thisNode!=null)
		{
			if(headNode.getNodeNumber()== value)
				headNode=headNode.getNextNode();
			if(thisNode.getNextNode() !=null)
				if(thisNode.getNextNode().getNodeNumber() == value)
					thisNode.setNextNode(thisNode.getNextNode().getNextNode());
			thisNode=thisNode.getNextNode();
		}
	}

	// Checks to see if it contains the value through the contain method, then if it does it just returns and does
	// nothing. If it doesn't it links it to the tail node, then makes that added node the new tail node.
	public void addElement(int value){
		Node toBeAdded = new Node(value,null);
		if(contain(value)==true)
			return;
		if(headNode==null)
			headNode=toBeAdded;
		else
			tailNode.setNextNode(toBeAdded);
		tailNode = toBeAdded;
	}

	// Adds one to the the integer size for every node that appears in the IntSet. Then returns size.
	public int size(){
		int size = 0;
		Node thisNode = headNode;
		while(thisNode !=null)
		{
			thisNode=thisNode.getNextNode();
			size++;
		}
		return size;
	}

	// Checks to see if every element in this IntSet appears in the givenSet.
	public boolean subsetOf(IntSet givenSet){
		Node thisNode = headNode;
		while(thisNode!=null)
		{
			int x = thisNode.getNodeNumber();
			if (givenSet.contain(x)==false)
				return false;
			thisNode=thisNode.getNextNode();
		}
		return true;
	}

	// It's basically like subsetOf except now you have to check both ways as if two sets are both subsets
	// of each other, than they are equal.
	public boolean isEqual(IntSet givenSet){
		boolean ss1 = this.subsetOf(givenSet);
		boolean ss2 = givenSet.subsetOf(this);
		if(ss1==true && ss2==true)
			return true;
		else
			return false;
	}

	// Just goes through both sets and adds all the nodes, there is no need to check for duplicates
	// since addElement does that automatically.
	public IntSet union(IntSet givenSet){
		IntSet newSet = new IntSet();
		Node thisNode = givenSet.getHeadNode();
		while(thisNode!=null)
		{
			int x = thisNode.getNodeNumber();
			newSet.addElement(x);
			thisNode=thisNode.getNextNode();
		}
		thisNode = headNode;
		while(thisNode !=null)
		{
			int x = thisNode.getNodeNumber();
			newSet.addElement(x);
			thisNode=thisNode.getNextNode();
		}
		return newSet;
	}

	// Just checks the givenSet to see if it contains any given numbers in this IntSet, and if so it adds it to
	// the new set.
	public IntSet intersection(IntSet givenSet){
		IntSet newSet = new IntSet();
		Node thisNode = headNode;
		while(thisNode !=null)
		{
			int x = thisNode.getNodeNumber();
			if (givenSet.contain(x) == true)
				newSet.addElement(x);
			thisNode=thisNode.getNextNode();
		}
		return newSet;
	}

	// The same thing as intersection, except only if contain is false do you add the element
	public IntSet complement(IntSet givenSet){
		IntSet newSet = new IntSet();
		Node thisNode = headNode;
		while(thisNode!=null)
		{
			int x = thisNode.getNodeNumber();
			if (givenSet.contain(x)==false)
				newSet.addElement(x);
			thisNode=thisNode.getNextNode();
		}
		return newSet;
	}
	// Goes through the IntSet and adds every node's number to the string along with a comma. At the end it
	// removes the last character in the string because an unnecessary commma will usually appear at the end of most
	// strings with this given implementation.
	public String toString(){
		String s="{";
		Node thisNode = headNode;
		while(thisNode!=null)
		{
			s = s + thisNode.getNodeNumber() + ",";
			thisNode =thisNode.getNextNode();
		}
		if(s.length()>1)
			s=s.substring(0,s.length()-1);
		s= s + "}";
		return s;
	}

	private Node getHeadNode(){
		return headNode;
	}
}
