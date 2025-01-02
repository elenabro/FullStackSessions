package Session10;

import java.util.List;

public class LibraryDemo {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java");
        library.displayBooks();


        List<String> lib = library.getBooks();
        lib.add("Python");
        lib.add(" ");
        library.displayBooks();
    }
}
