package com.bridgelabz.inventory.data.main;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import com.bridgelabz.inventory.data.impl.InventoryImpl;
import com.bridgelabz.inventory.data1.InventoryNameData;

public class JSONInventory {
	    @SuppressWarnings({ "static-access", "unused" })
		public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
	    {
	      
	        InventoryNameData InventoryName = new InventoryImpl();
	        InventoryImpl invImpl=new InventoryImpl();
	        invImpl.fileRead();

	       String name = null;
	       double price = 0;
	       double weight = 0;
	        	
	        	System.out.println("addition of Inventory ");
	        		invImpl.add(name, price, weight);
	        		System.out.println("\n remove of Inventory");
	        		invImpl.remove(name, price, weight); 
	        		System.out.println("\n Calculating the price");
	        		invImpl.calculate(name, price, weight); 
	        	
	        	}
	    
}
