
package com.mycompany.library;

import com.mycompany.library.books.Item;
import com.mycompany.library.books.users.User;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

 class Libraries {
    private File file;
    private FileWriter filewriter;
    private PrintWriter printWriter;
    private ArrayList<Item> listItems = new ArrayList<>();
    private ArrayList<User> listUsers = new ArrayList<>();

    public Libraries() throws IOException {
        this.file = new File("./archive.txt");
        this.filewriter = new FileWriter(file);
        this.printWriter = new PrintWriter(filewriter);
    }
    
    
    
    public void addItem(Item item){
        listItems.add(item);
    }
    public void deleteItem(Item item){
        listItems.remove(item);
    }
    public void addUser(User username){
        listUsers.add(username);
    }
    public void deleteUser(User username){
        listUsers.remove(username);
    }
    public void setPrintWriter(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    public void lendItem(User username, Item item) throws Exception{
        if(item.isAvailable()){
            System.out.println("Libro prestado con exito");
            item.setAvailable(false);
            printWriter.println("Libros prestado");
            printWriter.println("");
            printWriter.print(username.getName());
            printWriter.print("    title: ");
            printWriter.print(item.getTitle());
            printWriter.flush(); 
        }else{
            throw new Exception("El libro ya fue prestado");
        }
        
    }
    public void returnItem(User username, Item item) throws Exception{
        if(!item.isAvailable()){
            System.out.println("Libro devuelto con exito");
            item.setAvailable(true);
            
            printWriter.print("Libros devuelto");
            printWriter.println("");
            printWriter.println(" ");
            printWriter.print(username.getName());
            printWriter.print("    title: ");
            printWriter.print(item.getTitle());
           printWriter.flush(); 
        }else{
            throw new Exception("Error, El libro no se puede devolver");
        }
            }
    
}
