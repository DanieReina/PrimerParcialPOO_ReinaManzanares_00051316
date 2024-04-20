public class Laptop extends Articulo {
    double precio;
    String procesador;
    String tarjetaGrafica;
    String capacidadAlmacenamientoGB;

    public Laptop(String nombre, String modelo, String descripcion, String procesador, String tarjetaGrafica, String capacidadAlmacenamientoGB) {
        super(nombre, modelo, descripcion);
        this.precio = precio;
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.capacidadAlmacenamientoGB = capacidadAlmacenamientoGB;

    }

    @Override
    public double obtenerPrecio(double precio) {
        return precio;
    }

    @Override
    public String obtenerDescripcion(String descripcion) {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getCapacidadAlmacenamientoGB() {
        return capacidadAlmacenamientoGB;
    }

    public void setCapacidadAlmacenamientoGB(String capacidadAlmacenamientoGB) {
        this.capacidadAlmacenamientoGB = capacidadAlmacenamientoGB;
    }
}
