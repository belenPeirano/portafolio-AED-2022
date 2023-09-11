
import java.util.LinkedList;

/**
 *
 * @author Casales
 */
public class TNodoTrie implements INodoTrie {

    private TDispositivo dispositivo;
    private TNodoTrie[] hijos;
    private boolean esPalabra = false;

    public TNodoTrie(TDispositivo dispositivo) {
        this.dispositivo = dispositivo;
        this.hijos = new TNodoTrie[10]; // Tamaño de 10
    }

    private TNodoTrie obtenerHijo(int number) {
        if (hijos[number] != null) {
            return hijos[number];
        }
        return null;
    }

    @Override
    public void insertar(TDispositivo unDispositivo) {
        TNodoTrie actual = this;

        String ip = unDispositivo.getDirIP();
        ip = ip.replace(".", "");

        for (int i = 0; i < ip.length(); i++) {
            int valor = Character.getNumericValue(ip.charAt(i));
            if (actual.hijos[valor] == null) {
                actual.hijos[valor] = new TNodoTrie(unDispositivo);
            }
            actual = actual.hijos[valor];
        }
        
        actual.esPalabra = true;
    }

    @Override
    public void buscarDispositivos(String primerosDigitos, LinkedList<TDispositivo> dispositivos) {
        TNodoTrie actual = this;
        primerosDigitos = primerosDigitos.replace(".", "");

        for (int i = 0; i < primerosDigitos.length(); i++) {
            int valor = Character.getNumericValue(primerosDigitos.charAt(i));
            TNodoTrie hijo = actual.obtenerHijo(valor);
            if (hijo == null) {
                return;
            }
            actual = hijo;
        }

        actual.recorrer(dispositivos);
    }

    public void recorrer(LinkedList<TDispositivo> dispositivos) {
        if (dispositivo != null) {
            dispositivos.add(dispositivo);
        }

        for (TNodoTrie hijo : hijos) {
            if (hijo != null) {
                hijo.recorrer(dispositivos);
            }
        }
    }
}
