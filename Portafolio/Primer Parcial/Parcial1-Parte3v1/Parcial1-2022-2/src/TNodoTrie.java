
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author belu_
 */
public class TNodoTrie implements INodoTrie {

    private static final int CANT_CHR_IP = 10;
    private TNodoTrie[] hijos;
    private boolean esIP;
    private TDispositivo dispositivo;

    public TNodoTrie() {
        this.hijos = new TNodoTrie[CANT_CHR_IP];
        this.esIP = false;
    }

    @Override
    public void insertar(TDispositivo unDispositivo) {
        TNodoTrie nodoActual = this;
        String[] IP = unDispositivo.getDirIP().split(".");
        String IpSinPuntos = "";
        for (int i = 0; i < IP.length; i++) {
            IpSinPuntos += IP[i];
        }
        for (int c = 0; c < IpSinPuntos.length(); c++) {
            int indice = IpSinPuntos.charAt(c) - '0';

            if (nodoActual.hijos[indice] == null) {
                nodoActual.hijos[indice] = new TNodoTrie();
            }
            nodoActual = nodoActual.hijos[indice];
        }
        nodoActual.dispositivo = unDispositivo;
        nodoActual.esIP = true;
    }

    @Override
    public void buscarDispositivos(String primerosDigitos, LinkedList<TDispositivo> dispositivos) {
        TNodoTrie nodoActual = this;

        for (int i = 0; i < primerosDigitos.length(); i++) {
            int indice = primerosDigitos.charAt(i) - '0';

            if (nodoActual.hijos[indice] == null) {
                return;
            }
            nodoActual = nodoActual.hijos[indice];
        }
        nodoActual.predecir(primerosDigitos, dispositivos);
    }

    public void predecir(String primerosDigitos, LinkedList<TDispositivo> dispositivos) {
        if (this.dispositivo != null) {
            dispositivos.add(this.dispositivo);
        }
        for (int c = 0; c < CANT_CHR_IP; c++) {
            if (hijos[c] != null) {
                hijos[c].predecir(primerosDigitos + c, dispositivos);
            }
        }
    }

}