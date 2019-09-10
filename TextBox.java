package com.classes;

public class TextBox {
    public String text = ""; // inicializar reference types pra nao ter risco de dar nullPointerException

    public void setText(String text) {
        this.text = text;
    }

    public void print(){
        System.out.println(text);
    }

    public void clear() {
        text = "";
    }
}