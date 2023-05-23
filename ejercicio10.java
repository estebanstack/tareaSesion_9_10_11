package com.exercise;

import java.util.Arrays;

public class ejercicio10 {

    public static void main(String[] args) {

        String[] texto = {"Hola ", "a ", "todos", " como estan"};

        for (String concatenar : texto) {
            System.out.print(concatenar); //sin "ln" porque sin este no se salta de linea
        }
        StringBuilder cadena = new StringBuilder("Hola ");
        cadena.append("a ").append("todos ").append("como estan");
        System.out.println("\n"+ cadena);
    }
    }

