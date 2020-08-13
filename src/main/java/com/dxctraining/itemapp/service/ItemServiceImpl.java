package com.dxctraining.itemapp.service;
import com.dxctraining.itemapp.dao.*;
import com.dxctraining.itemapp.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
private Itemdao itemdao;

    @Override
    public Item findItem(int id) {
        validateId(id);
       Item item=itemdao.findItem(id);
       return  item;
    }

    private void validateId(int id) {
       if(id<0)
       {
           System.out.println("ID can not be negative");
       }
    }

    @Override
    public Item update(Item item) {
        item=itemdao.update(item);
        return item;
    }

    @Override
    public void removeItem(int id) {
    itemdao.removeItem(id);
    }

}


