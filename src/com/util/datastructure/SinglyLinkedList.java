package com.util.datastructure;

public class SinglyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	@SuppressWarnings("unused")
	private String key;
	static String[] str = new String[100];
	@SuppressWarnings("rawtypes")
	static SinglyLinkedList newList = new SinglyLinkedList();

	public boolean isEmpty() {
		return head == null;
	}

	public String addElement(T key) {
		Node<T> nd = new Node<T>();
		nd.setValue(key);
		size++;

		/**
		 * check if the list is empty
		 */
		if (isEmpty()) {
			// since there is only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		} else {
			// set current tail next link to new node
			tail.setNextRef(nd);
			// set tail as newly created node
			tail = nd;
		}
		return null;
	}

	public void traverse() {

		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}

	}

	@Override
	public String toString() {
		Node<T> temp = head;
		String elements = "";
		while (temp.getNextRef() != null) {
			elements += " " + temp.getValue() + " ";
			temp = temp.getNextRef();
		}
		return elements + temp.getValue();
	}

	public void get() {

		Node<T> tmp = head;
		int k = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			str[k] = String.valueOf(tmp.getValue());
			k++;
			tmp = tmp.getNextRef();
		}
	}

	@SuppressWarnings("unchecked")
	public SinglyLinkedList<T> searchKey(SinglyLinkedList<T> list, String key) {
		Node<T> current = head;
		boolean status = false;

		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] != null && str[i].equals(key)) {
				status = true;
				str[i] = null;
				current = current.getNextRef();
				break;
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null)
				newList.addElement(str[i]);
		}
		if (status) {
			System.out.println("Element is present in the list ");
			
		} else {
			System.out.println("Element is not present in the list ");
			newList.addElement(key);
		}

		return (SinglyLinkedList<T>)newList;
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
			}

			
		

		
	
