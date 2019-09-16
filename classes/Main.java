package com.classes;

public class Main {
    public static void main(String[] args) {
        //jeito 1 de declarar objeto
        TextBox textBox1 = new TextBox();

        //jeito 2 de declarar objeto
        var textBox2 = new TextBox();

        textBox2.setText("teste");
        System.out.println(textBox2.text);
        //textBox2.print();

        var textBox3 = new TextBox();
        textBox3.setText("Box 3");
        System.out.println(textBox3.text.toUpperCase());
    }
}