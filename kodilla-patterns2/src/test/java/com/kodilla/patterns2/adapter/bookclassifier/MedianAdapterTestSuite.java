package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Przyszła na Sarnath zagłada. Opowieści niesamowite i fantastyczne",
                "H.P.Lovecraft", 2016, "01"));
        books.add(new Book("Zgroza w Dunwich i inne przerażające opowieści",
                "H.P.Lovecraft", 2012, "02"));
        books.add(new Book("Dracula", "Bram Stoker", 2011, "03"));

        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        System.out.println(median);
        assertEquals(2012, median);
    }
}
