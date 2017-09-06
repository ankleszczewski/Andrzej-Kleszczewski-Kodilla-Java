package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalBeautifier;
import com.kodilla.stream.reference.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator:: multiplyAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator:: addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator:: subBFromA);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator:: divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Beautifing text with lambdas");
        poemBeautifier.beautify("Tekst do upiększenia", (poem) -> ("ABC " + poem + " ABC"));
        poemBeautifier.beautify("Tekst do upiększenia", (poem) -> toUpperCase(poem));
        poemBeautifier.beautify("Tekst do upiększenia", (poem) -> poem.substring(0, 6) + "został upiększony");

        System.out.println("Beautifing text with method references");
        poemBeautifier.beautify("Tekst do upiększenia", FunctionalBeautifier:: addABC);
        poemBeautifier.beautify("Tekst do upiększenia", FunctionalBeautifier:: bigLetters);
        poemBeautifier.beautify("Tekst do upiększenia", FunctionalBeautifier:: mostBeautifier);
    }
}
