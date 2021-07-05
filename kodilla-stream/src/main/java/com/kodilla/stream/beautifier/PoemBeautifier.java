package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify (String decorateText, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(decorateText);
        System.out.println(result);
    }
}
