package com.util.datastructure;
public class CustomLinkedList<T> {
		private Node<T> head;
	private Node<T> tail;
	public CustomLinkedList() {
		head = null;
	}

	
	public boolean isEmpty() {
		return head == null;
	}

	public void add(T data) {
		Node<T> nd = new Node<T>();

		nd.setValue(data);

		System.out.println("Adding: " + data);
		if (isEmpty()) {
			head = nd;
			tail = nd;
		} else {
			tail.setNextRef(nd);
			tail = nd;
		}
	}

	public boolean search(T data) {
		Node<T> temp = head;

		while (temp.getNextRef() != null) {

			if (data.equals(temp.getValue())) {
				return true;
			}
			temp = temp.getNextRef();
		}
		return false;
	}

	public int index(T data) {
		Node<T> curr = head;
		int count = 0;
		while (curr != null) {
			if (curr.getValue().equals(data)) {
				curr.getNextRef();
				return count;
			}
			count++;
			curr = curr.getNextRef();
		}
		assert (false);
		return 0;
	}

	public void remove(int index) {
		if (isEmpty())
			return;
		Node<T> temp = head;
		if (index == 0) {
			head = temp.getNextRef();
			return;
		}
		for (int i = 0; temp != null && i < index - 1; i++) {
			temp = temp.getNextRef();
		}
		if (temp == null || temp.getNextRef() == null)
			return;
		Node<T> next = temp.getNextRef().getNextRef();

		temp.setNextRef(next);
	}



    public void get() {
        Node<T> tmp = head;
        while (true) {
            if (tmp == null) {
                break;
            }
            if(tmp.getValue()!=null)
            {
            System.out.print(tmp.getValue()+"\t\t\t\t");
            }
            tmp = tmp.getNextRef();
        }
    }
	
	public int size() {
		Node<T> tnode = head;
		int len = 0;
		while (tnode != null) {
			len++;
			tnode = tnode.getNextRef();
		}
		return len;
	}

	public String[] convArray(String[] array) {
		Node<T> tnode = head;
		int i = 0;
		while (tnode != null) {
			array[i] = String.valueOf(tnode.getValue());
			tnode = tnode.getNextRef();
			i++;
		}
		return array;
	}

	public int[] convertIntArray(String[] arr) {
		int[] arrInt = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrInt[i] = Integer.valueOf(arr[i]);
		}
		return arrInt;
	}

	public int[] sort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	public static <T extends Comparable<T>> T[] inserstionSort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j].compareTo(array[j - 1]) < 0) {
					T temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else
					break;
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		return array;
	}

	public void printList() {
		Node<T> tnode = head;
		while (tnode != null) {
			System.out.print(tnode.getValue() + " ");
			tnode = tnode.getNextRef();
		}
	}
}