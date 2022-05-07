package toSkewedTree;

public class SkewedTree {
	
	
	public void printSkewedTree(Node aNode) {
		
		if (aNode == null) {			
			return;
		}
		

		printSkewedTree(aNode.getLeftNode());
		System.out.println(aNode.getData());
		printSkewedTree(aNode.getRightNode());
	}
	
		

}
