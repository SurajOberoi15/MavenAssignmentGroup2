package com.application;

import com.application.StringFunctions;

public class Application {
    public static void main(String[] args)
    {
        StringFunctions object = new StringFunctions();
        System.out.println(object.calculate_length("MavenAssignment"));   //Calculating String Length
        System.out.println(object.reverse("MavenAssignment"));      // Printing reverse of a string
    }
}
