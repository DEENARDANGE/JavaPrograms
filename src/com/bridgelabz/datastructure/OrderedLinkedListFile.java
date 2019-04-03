package com.bridgelabz.datastructure;

import com.util.datastructure.OrderedLinkedList;

public class OrderedLinkedListFile
{
    public static void main(String[] args)
    {
        OrderedLinkedList obj = new OrderedLinkedList();
       obj.getDataFromFile();
        obj.display();
        obj.size();
       	obj.searchData();
    }
}
