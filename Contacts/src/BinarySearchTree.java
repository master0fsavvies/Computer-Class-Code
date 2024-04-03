public class BinarySearchTree  //BST
{
	class Node
	{
		int data;
		Node right = null;
		Node left = null;
		//Node parent = null;
		
		public Node(int input)
		{
			data = input;
		}
		
		public int  getData()
		{
			return data;
		}
		
		public void setData(int input)
		{
			data = input;
		}
		
		public Node getRight()
		{
			return right;
		}
		
		public void setRight(Node n)
		{
			right = n;
		}
		
		public Node getLeft()
		{
			return left;
		}
		
		public void setLeft(Node n)
		{
			left = n;
		}
		
	}
	
	Node Root;
	Node position;
	Node iterator;
	int Size;
	
	//constructor
	public BinarySearchTree()
	{
		Root =null;
		position = null;
		iterator = null;
		Size = 0;
	}
	
	
	public void addNode(int input)
	{
		if(isEmpty())
		{
			Root = new Node(input);
		}
		else
		{
			add(Root,input);
		}
		
		Size++;
	}
	
	private void  add(Node root, int input)
	{
		if(root.getData() > input)
		{
			//System.out.println("go left");
			if(root.getLeft()==null)
			{
				Node temp=new Node(input);
				root.setLeft(temp);
				//System.out.println("assign left");
				//System.out.println(input);
			}
			else
			{
				add(root.getLeft(),input);
				
			}
		}
		else
		{
			//System.out.println("go right");
			if(root.getRight()==null)
			{
				Node temp = new Node(input);
				root.setRight(temp);
				//System.out.println("assign right");
				//System.out.println(input);
			}
			else
			{
				add(root.getRight(),input);
				
			}
		}
	}
	
	//Start
	
	public boolean isEmpty()
	{
		return Root == null;
	}
	
	public int getSize()
	{
		return Size;
	}
	
	public void clear()
	{
		Root=null;
	}
	/*
	public boolean deleteNum(int num)
	{
		boolean found = findNode(num);
		
		if(found)
		{
			//delete node
			
		
			if(position.left==null && position.right==null)
			{
				if(Root == position)
				{
					Root =null;
					position = null;
				}
				else
				{
					Node parent = findParent(Root,position);
					
					if(parent.left ==position)
					{
						parent.left = null;
						position = null;
					}
					else
					{
						parent.right = null;
						position = null;
					}
				}
					
				
				
			}
			else if(position.left==null)
			{
				Node parent = findParent(Root,position);
				
				//position=position.right;
				
			}
			else if (position.right == null)
			{
				position = position.left;
				
			}
			else//two children
			{
				//go left find right most
				
				Node leftRightMost = position.left;
				
				while(leftRightMost.right!=null)
					leftRightMost=leftRightMost.right;
				int temp = leftRightMost.getData();
				
				deleteNum(temp);	
						
				position.setData(temp);
				
				
				
			}
			
		}
		
	}
	
	*/
	
	private Node findParent(Node root,Node child)
	{
		if(root.left==child || root.right==child)
			return root;
		if(root.getData()>child.getData())
			return findParent(root.left,child);
		else
			return findParent(root.right,child);
		
	}
/*	
	private boolean delete(Node pos)
	{
		
		
	}
	*/
	public boolean findNode(int num)
	{
		position=null;
		
		if(isEmpty())
			return false;

		
		return find(num, Root);
		
		
		
		
	}
	
	private boolean find(int num,Node root)
	{
		if(root.getData()==num)
		{
			position = root;
				return true;
		}
		
		if(root.getData()>num)
		{
			if(root.left!=null)
				return find(num,root.left);
			else
				return false;
		}
		else
		{
			if(root.right!=null)
				return find(num,root.right);
			else
				return false;
		}
		
	}
	
	public int getPositionData()
	{
		if(position==null)
			return -9999;
		
		return position.getData();
	}
	
	
	
	public String printTree()
	{
		if(isEmpty())
			return "Empty Tree";
		
		return printTreePreorder(Root);
		
		//return printTreeInorder(Root);
		
		//return printTreePostOrder(Root);
	}
	
	
	//returns input order
	private String printTreePreorder(Node root)//Middle Left Right (MLR) 
	{
		String output;
		
		output = Integer.toString(root.getData())+", ";
		
		if(root.getLeft()!= null)
			output = output +  printTreePreorder(root.getLeft());
		
		if(root.getRight()!= null)
			output = output +printTreePreorder(root.getRight());
		
		return output;
	}
	
	private String printTreeInorder(Node root)//Left Middle Right (LMR) ordered values
	{
		
		String output="";
		
		if(root.getLeft()!= null)
			output = output +  printTreeInorder(root.getLeft());
		
		output = output +  Integer.toString(root.getData())+ ", ";
		
		if(root.getRight()!= null)
			output = output  + printTreeInorder(root.getRight());
		
		return output;
		
	}
	
	
	private String printTreePostOrder(Node root)//Left Right Middle (LRM)
	{
		String output="";
		
		if(root.getLeft()!= null)
			output = output  + printTreePostOrder(root.getLeft());
		
		
		
		if(root.getRight()!= null)
			output = output + printTreePostOrder(root.getRight());
		
		output = output  + Integer.toString(root.getData())+ ", ";
		
		return output;
	}
	
	
	
	

}