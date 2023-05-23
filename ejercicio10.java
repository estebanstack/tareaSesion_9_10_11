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
//utilicé el patron builder para realizar la union del array de strings, en este caso el StringBuilder, y con la palabra
//reservada append uní cada elemento del array como se habia pedido en ese ejercicio, ya que antes, como se puede ver lo hice con for
