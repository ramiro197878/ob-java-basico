package com.sesioncuatro;

public class SmartWatch extends SmartDevice {
    String correa;
    String camara;

    public SmartWatch() {
    }
    public SmartWatch(String pantalla, String procesador, Integer memoria, Integer almacenamiento,
                      String correa, String camara) {
        super(pantalla, procesador, memoria, almacenamiento);
        this.correa = correa;
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correa='" + correa + '\'' +
                ", camara='" + camara + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoria=" + memoria +
                ", almacenamiento=" + almacenamiento +
                '}';
    }


}
