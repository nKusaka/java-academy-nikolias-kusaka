package com.pluralsight;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();

        try {
            ui.display();
        }
        catch (Exception e) {
            System.out.println("Unable to start program");
        }
    }
}