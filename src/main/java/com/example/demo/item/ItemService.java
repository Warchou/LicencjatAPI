package com.example.demo.item;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public List<Item> getItems(){
        return List.of(
                new Item(1L,"Czekolada","Czekolada mleczna z lorem ipsum","Jedzenie",6.5, 70 ),
                new Item(2L,"Czekolada","Czekolada mleczna z lorem ipsum","Jedzenie",6.5, 70 ),
                new Item(3L,"Czekolada","Czekolada mleczna z lorem ipsum","Jedzenie",6.5, 70 )
        );
    }
}
