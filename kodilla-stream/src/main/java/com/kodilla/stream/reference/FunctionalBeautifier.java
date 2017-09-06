package com.kodilla.stream.reference;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class FunctionalBeautifier {
    public static String addABC(String poem) { return "ABC " + poem + " ABC";}

    public static String bigLetters(String poem) { return toUpperCase(poem); }

    public static String mostBeautifier(String poem) { return poem.substring(0, 6) + "został upiekszony"; }
}
