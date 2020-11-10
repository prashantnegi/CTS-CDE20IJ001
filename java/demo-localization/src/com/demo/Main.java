package com.demo;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", Locale.FRANCE);

        System.out.println(resourceBundle.getString("greeting_text"));
        
    }
}
