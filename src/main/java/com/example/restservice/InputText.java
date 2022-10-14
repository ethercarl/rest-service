package com.example.restservice;

// this class is a placeholder to get an input string for a RESTcontroller
// it is only intended to be used with StartPageController.java class in com.example.restservice package
public class InputText {
    private String input;
    public InputText(){
        this.input="my bonnie is over the ocean my bonnie is over" +
                " the sea my bonnie is over the ocean oh bring back my bonnie to me";
    }
    public String getInput(){
        return this.input;
    }
}
