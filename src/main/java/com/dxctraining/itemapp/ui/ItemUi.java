package com.dxctraining.itemapp.ui;

import com.dxctraining.itemapp.entities.Item;
import com.dxctraining.itemapp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.dxctraining.itemapp.exceptions.*;

import javax.annotation.PostConstruct;

@Component

public class ItemUi {
    @Autowired
private ItemService itemService;


    @PostConstruct
    public void runApp()
    {
     try
     {
      Item item1=new Item(1,"arshad");
         Item item2=new Item(2,"bike");
         Item item3=new Item(3,"book");
   int id1=item1.getid();
   Item fetcheditem=itemService.findItem(id1);
System.out.println("The item is "+fetcheditem.getid() +"  "+" The name is "+fetcheditem.getname());


     }
     catch (ItemNotFoundException e)
     {
         e.printStackTrace();
     }
     catch (InvalidArgumentException e) {
    	 e.printStackTrace();
     }

    }

}
