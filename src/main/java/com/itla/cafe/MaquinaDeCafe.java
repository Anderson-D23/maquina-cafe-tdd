package com.itla.cafe;

public class MaquinaDeCafe {

    private Cafetera cafetera;
    private Vaso vasosPequeno;
    private Vaso vasosMediano;
    private Vaso vasosGrande;
    private Azucarero azucarero;

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Azucarero getAzucarero() {
        return azucarero;
    }

    public Vaso getTipoDeVaso(String tipoDeVaso) {
        if ("pequeno".equals(tipoDeVaso)) {
            return vasosPequeno;
        } else if ("mediano".equals(tipoDeVaso)) {
            return vasosMediano;
        } else if ("grande".equals(tipoDeVaso)) {
            return vasosGrande;
        }
        return null;
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadVasos, int cantidadAzucar) {
        if (!vaso.hasVasos(cantidadVasos)) {
            return "No hay Vasos";
        }

        if (!cafetera.hasCafe(vaso.getContenido())) {
            return "No hay Cafe";
        }

        if (!azucarero.hasAzucar(cantidadAzucar)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadVasos);
        cafetera.giveCafe(vaso.getContenido());
        azucarero.giveAzucar(cantidadAzucar);

        return "Felicitaciones";
    }
}
