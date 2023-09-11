
import java.util.Iterator;
import java.util.LinkedList;

public class TNodoTrieTelefonos implements INodoTrieTelefonos {

    private static final int CANT_CHR_TELEFONO = 10;
    private TNodoTrieTelefonos[] hijos;
    private boolean esTelefono;
    private TAbonado abonado;

    public TNodoTrieTelefonos() {
        hijos = new TNodoTrieTelefonos[CANT_CHR_TELEFONO];
        esTelefono = false;
    }

    @Override
    public void buscarTelefonos(String primerosDigitos, LinkedList<TAbonado> abonados) {
        TNodoTrieTelefonos nodoActual = this;

        for (int i = 0; i < primerosDigitos.length(); i++) {
            int indice = primerosDigitos.charAt(i) - '0';
            System.out.println(indice);
            if (nodoActual.hijos[indice] == null) {
                return;
            }
            nodoActual = nodoActual.hijos[indice];
        }
        nodoActual.predecir(primerosDigitos, abonados);
    }

    public void predecir(String primerosDigitos, LinkedList<TAbonado> abonados) {
        if (this.abonado != null) {
            abonados.add(this.abonado);
        }
        for (int c = 0; c < CANT_CHR_TELEFONO; c++) {
            if (hijos[c] != null) {
                hijos[c].predecir(primerosDigitos + c, abonados);
            }
        }
    }

    @Override
    public void insertar(TAbonado unAbonado) {
        TNodoTrieTelefonos nodoActual = this;
        for (int c = 0; c < unAbonado.getTelefono().length(); c++) {
            int indice = unAbonado.getTelefono().charAt(c) - '0';

            if (nodoActual.hijos[indice] == null) {
                nodoActual.hijos[indice] = new TNodoTrieTelefonos();
            }
            nodoActual = nodoActual.hijos[indice];
        }
        nodoActual.abonado = unAbonado;
        nodoActual.esTelefono = true;
    }
}