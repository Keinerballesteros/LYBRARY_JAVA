

package com.mycompany.library;

import com.mycompany.library.books.Books;
import com.mycompany.library.books.Item;
import com.mycompany.library.books.Magazine;
import com.mycompany.library.books.users.User;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class LIBRARY {

    public static void main(String[] args) throws Exception {
        try{
        Books book = new Books("Gabriel", 100, 382372, "Soledad", "2004");
        Magazine magazine = new Magazine("102832", "enero", 3264, "revist", "2002");
        User user = new User("keiner", "120372");
        User userTwo = new User("kasa", "109283");
        
        Libraries biblioteca = new Libraries();
        biblioteca.addItem(book);
        biblioteca.addUser(user);
        biblioteca.addItem(magazine);
        
        biblioteca.lendItem(user, book);
        biblioteca.lendItem(user, magazine);
        biblioteca.returnItem(user, book);
        biblioteca.lendItem(userTwo, book);
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("./archive.txt", true))) {
                biblioteca.setPrintWriter(printWriter);
                // ... más operaciones con la biblioteca que usan printWriter
            } catch (IOException e) {
                System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
            }
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
