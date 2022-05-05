import java.util.*;
class Item{
	Integer itemId;
	String itemName;
	Item(Integer itemId,String itemName){
		this.itemId=itemId;
		this.itemName=itemName;
	}
	@Override
	public String toString(){
		return this.itemId+" "+this.itemName;
	}
	
	@Override
	 public boolean equals(Object o)
	{
		if(o instanceof Item)
		{
			Item temp=(Item)o;
			if( (this.itemId.equals(temp.itemId)) && (this.itemName.equals(temp.itemName)) )
			 return true;
			else 
				return false;
		}
		else
			return false;
	}
	
}	
class StockCompare implements Comparator<Item>{
	public int compare(Item i1,Item i2){
		if(i1.itemId.equals(i2.itemId))
		 return 0;
		else if(i1.itemName.equals(i2.itemName))
		 return 1;
		else 
		 return -1;
	}
	
}	

class Stock{	
	public static void main(String[]args){
	ArrayList<Item>list=new ArrayList<>();
	list.add(new Item(1,"Item1"));
	list.add(new Item(3,"Item3"));
	list.add(new Item(2,"Item2"));
	list.add(new Item(4,"Item4"));
	System.out.println(list);
	StockCompare c=new StockCompare();
	Collections.sort(list,c);
	}
}
