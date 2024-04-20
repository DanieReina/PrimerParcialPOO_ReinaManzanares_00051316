public class Celular extends Articulo{ ;
    String marca;
    String resolutionCamara;

    public Celular(String nombre, String modelo, String descripcion, String marca, String resolutionCamara){
        super(nombre, modelo, descripcion);
        this.marca = marca;
        this.resolutionCamara = resolutionCamara;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getResolutionCamara() {
        return resolutionCamara;
    }

    public void setResolutionCamara(String resolutionCamara) {
        this.resolutionCamara = resolutionCamara;
    }


}

