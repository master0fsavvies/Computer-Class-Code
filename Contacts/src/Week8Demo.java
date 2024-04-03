public class Week8Demo {

	public static void main(String[] args) 
	{
		BinarySearchTree bst = new BinarySearchTree();
		
		
		bst.addNode(50);
		bst.addNode(22);
		bst.addNode(27);
		bst.addNode(45);
		bst.addNode(99);
		bst.addNode(36);
		bst.addNode(24);
		bst.addNode(15);
		
		if(bst.findNode(60))
			System.out.println(bst.getPositionData());
		else
			System.out.println("no found");
		
		
		
		System.out.println(bst.printTree());
		bst.clear();
		bst.addNode(36);
		bst.addNode(24);
		
		
		
		System.out.println(bst.printTree());
		

	}

}