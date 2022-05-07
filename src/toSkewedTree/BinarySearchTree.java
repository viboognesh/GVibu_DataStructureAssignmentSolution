package toSkewedTree;

public class BinarySearchTree {

	private Node root;
	
	
	public BinarySearchTree() {
		root = insert(root, 50);
		this.root.setLeftNode(newNode(30));
		this.root.setRightNode(newNode(60));
		this.root.getLeftNode().setLeftNode(newNode(10));
		this.root.getRightNode().setLeftNode(newNode(55));
		
	}

	public void insert(Integer value) {
		
		root = insert(root, value);
	}
	

	private Node insert(Node currentNode, Integer value){
		
		if (currentNode == null) {
			return newNode(value);					
		} 
		else if (value <= currentNode.getData()) {
			Node newNode = insert(currentNode.getLeftNode(), value);
			
			currentNode.setLeftNode(newNode);
			return currentNode; 
		}
		else {
			Node newNode = insert(currentNode.getRightNode(), value);
			
			currentNode.setRightNode(newNode);
			return currentNode;
		}
	}

	private Node newNode(Integer value) {
		Node newNode = new Node(value);
		return newNode;
	}
		
	public Node getRoot() {
		return root;
	}
	
}
