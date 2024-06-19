
package com.mycompany.library.books.users;

import com.mycompany.library.books.Item;
import java.util.ArrayList;


public class User {
    
    private String name;
    private String id;
    private ArrayList<Item> itemsTheUser = new ArrayList<>();

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Item> getItemsTheUser() {
        return itemsTheUser;
    }

    public void setItemsTheUser(ArrayList<Item> itemsTheUser) {
        this.itemsTheUser = itemsTheUser;
    }
    
    public void lendItem(){
        System.out.println("Item prestado con exito");
    }
    
    public void returnItem(){
        System.out.println("Item devuelto con exito");
    }
}

    
