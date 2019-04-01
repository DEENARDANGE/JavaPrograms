package com.util.datastructure;

	public class Node1<T> implements Comparable<T> {
    
    
	private String value;
   private Node1<T> nextRef;
	public String key;     
   public String getValue() {
       return value;
   }
   public void setValue(String key2) {
       this.value = key2;
   }
   public Node1<T> getNextRef() {
       return nextRef;
   }
   public void setNextRef(Node1<T> ref) {
       this.nextRef = ref;
   }
   public Node1<T> getSize()
   { 
   	return this.getSize();
   }
   public void setSize(Node1<T> size) {
       this.nextRef = size;
   }
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
