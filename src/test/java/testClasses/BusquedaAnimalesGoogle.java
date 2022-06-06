package testClass;

public class BusquedaAnimalesGoogle {

    private Google google;

    public void busquedaPerro(){
        google = new Google(webDriver);
        google.ingresarBusqueda("Perro");
        google.clickBtnBuscar();
    }

    public void busquedaGato(){
        google = new Google(webDriver);
        google.ingresarBusqueda("Gato");
        google.clickBtnBuscar();
    }
}
