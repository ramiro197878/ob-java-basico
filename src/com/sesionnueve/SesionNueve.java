package com.sesionnueve;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class SesionNueve {
    public static String reverse(String texto) {

         // Dada la función:
         // public static String reverse(String texto) { }
         // Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo",
         // debe retornar "odnum aloh".


        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }
        return invertida;
    }


    public static void arrayUnidimensional() {
        // Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.


        String []nombres = {"Nicolas", "Pedro", "Lucia", "Gisela", "Roberto"};

        System.out.println("------ array unidimensional  ------");

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println("------------------------------");
        System.out.println(" ");

    }

    public static void arrayBidimesional(){

        // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada
        // elemento en ambas dimensiones.

        int [][]arrayBidimesional = new int[3][6];

        arrayBidimesional[0][0] = 1;
        arrayBidimesional[0][1] = 2;
        arrayBidimesional[0][2] = 3;
        arrayBidimesional[0][3] = 4;
        arrayBidimesional[0][4] = 5;
        arrayBidimesional[0][5] = 6;

        arrayBidimesional[1][0] = 10;
        arrayBidimesional[1][1] = 20;
        arrayBidimesional[1][2] = 30;
        arrayBidimesional[1][3] = 40;
        arrayBidimesional[1][4] = 50;
        arrayBidimesional[1][5] = 60;

        arrayBidimesional[2][0] = 100;
        arrayBidimesional[2][1] = 200;
        arrayBidimesional[2][2] = 300;
        arrayBidimesional[2][3] = 400;
        arrayBidimesional[2][4] = 500;
        arrayBidimesional[2][5] = 600;


        System.out.println("------ array bidimensional  ------");

        for(int i=0; i < arrayBidimesional.length; i++) {
            for (int j=0; j < arrayBidimesional[i].length; j++) {
                System.out.println("La valor de la posision [" + i + "][" + j + "] es: " + arrayBidimesional[i][j]);
            }
        }

        System.out.println("------------------------------");
        System.out.println(" ");

    }

    public static void vectores(){
        // Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        // Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector<Integer> vector = new Vector<>();

        vector.add(2);
        vector.add(3);
        vector.add(5);
        vector.add(7);
        vector.add(11);

        System.out.println("--------- Vectores  ----------");

        System.out.println("Contenido del vector" + vector);

        vector.remove(1);
        vector.remove(1);

        System.out.println("Contenido del vector" + vector);

        System.out.println("------------------------------");
        System.out.println(" ");


    }

    public static void arrayListUno() {
        // Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Nicolas");
        lista.add("Pedro");
        lista.add("Gisela");
        lista.add("Lucia");

        LinkedList<String> listaEnlazada = new LinkedList<>(lista);

        System.out.println("--------- ArrayList  ----------");


        for(String nombre : listaEnlazada){

            System.out.println("Contenido de la lista enlazada: " + nombre);
        }


        System.out.println("------------------------------");
        System.out.println(" ");

    }

    public static void arrayListDos(){
        // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el
        // ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
        // el primer "for" de relleno.

        ArrayList<Integer> numeros = new ArrayList<>();


        for(int i=1; i <= 10; i++){
            numeros.add(i);
        }


        for(int i=0; i<numeros.size(); i++){
            if(numeros.get(i)%2==0){
                numeros.remove(i);
            }

        }
        System.out.println("--------- ArrayListDos  ----------");


        for(Integer numero:numeros){
            System.out.println(numero);
        }
        System.out.println("------------------------------");
        System.out.println(" ");

    }

    public static int DividePorCero(int num1, int num2) throws ArithmeticException{
        // Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        // Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos
        // en cualquier caso: "Demo de código".
        int numero = 0;

        try {
            numero =  num1 / num2;
        } catch (ArithmeticException e){
            throw new ArithmeticException();
        }
        return numero;

    }

    public static void inputOutput(){
        // Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado
        // en "fileOut".

        try {
            InputStream archivo = new FileInputStream("/etc/passwd");


            byte[] datos = archivo.readAllBytes();

            PrintStream out = new PrintStream("output.txt");
            out.write(datos);

            archivo.close();


        } catch (Exception e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        }


        }

}
