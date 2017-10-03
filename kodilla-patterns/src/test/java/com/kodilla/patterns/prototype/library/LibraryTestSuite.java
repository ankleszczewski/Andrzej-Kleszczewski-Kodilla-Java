package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");
        IntStream.iterate(1, i -> i+1)
                .limit(9)
                .forEach(i -> library.getBooks().add(new Book("Title" + i, "Author" + i,
                        LocalDate.of(2015, 7, 7))));

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, cloneLibrary.getBooks().size());
        Assert.assertEquals(9, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertEquals(deepCloneLibrary.getBooks(), cloneLibrary.getBooks());

    }
}
