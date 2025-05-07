package rut;

class patron_singleton {
    private static patron_singleton instancia;
    private patron_singleton plantillaBase;

    private patron_singleton(String string, String string1, String string2) {
        plantillaBase = new patron_singleton("", "", "");
    }

    public static patron_singleton getInstance() {
        if (instancia == null) {
            instancia = new patron_singleton("", "", "");
        }
        return instancia;
    }

    public patron_singleton crearpatron_singleton(String nombre, String cargo, String rut) throws CloneNotSupportedException {
        patron_singleton copia = (patron_singleton) plantillaBase.clone();
        copia.plantillaBase(nombre, cargo, rut);
        return copia;
    }

    private void plantillaBase(String nombre, String cargo, String rut) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
