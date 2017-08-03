package modelopc;


public abstract class pc implements teclado, pantalla, imprimir {

    private String modelo; 
    private String marca;
    private String fabrica;   
    private String origen;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getFabrica() {
        return fabrica;
    }

    public String getOrigen() {
        return origen;
    }

    }
