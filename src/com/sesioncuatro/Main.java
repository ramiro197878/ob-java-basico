package com.sesioncuatro;

//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//
//Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//
//Crear constructor vacío y con todos los parámetros para cada clase.
//
//Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

public class Main {

    public static void main(String[] args) {
        SmartWatch reloj = new SmartWatch("1,4 pulgadas", "Exynos W920", 2,
                16, "roja", "No");

        SmartPhone celular = new SmartPhone("6,2 pulgadas", "Cortex-A78", 8,
                128, "64 MP","12 MP");

        System.out.println(celular);
        System.out.println(reloj);

    }
}
