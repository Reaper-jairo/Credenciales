package rut;

class Prototype implements Cloneable {
    private String nombre;
    private String cargo;
    private String rut;

    public Prototype(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

    public void setDatos(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre + "\nCargo  : " + cargo + "\nRUT    : " + rut;
    }

    public Prototype clone(Prototype Prototype) {
        try {
            return (Prototype super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar la credencial", e);
        }
    }
}
