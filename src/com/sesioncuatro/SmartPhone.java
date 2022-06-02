package com.sesioncuatro;

public class SmartPhone extends SmartDevice{
    String camaraFrontal;
    String camaraTrasera;

    public SmartPhone() {
    }
    public SmartPhone(String pantalla, String procesador, Integer memoria, Integer almacenamiento,
                      String camaraFrontal, String camaraTrasera) {
        super(pantalla, procesador, memoria, almacenamiento);
        this.camaraFrontal = camaraFrontal;
        this.camaraTrasera = camaraTrasera;
    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "camaraFrontal='" + camaraFrontal + '\'' +
                ", camaraTrasera='" + camaraTrasera + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoria=" + memoria +
                ", almacenamiento=" + almacenamiento +
                '}';
    }
}
