package com.sesioncuatro;

public class SmartDevice {
    String pantalla;
    String procesador;
    Integer memoria;
    Integer almacenamiento;

    public SmartDevice(String pantalla, String procesador, Integer memoria, Integer almacenamiento) {
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "pantalla='" + pantalla + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoria=" + memoria +
                ", almacenamiento=" + almacenamiento +
                '}';
    }

    public SmartDevice() {
    }
}
