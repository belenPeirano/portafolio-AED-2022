
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author belu_
 */
public class TArbolTrie implements IArbolTrie {

    private TNodoTrie raiz;

    @Override
    public LinkedList<TDispositivo> buscarDispositivos(String mascaraSubRed) {
        if (raiz == null) {
            return null;
        }
        String[] mascara = mascaraSubRed.split(".");
        if (mascara.length % 3 == 0) {
            LinkedList<TDispositivo> dispositivos = new LinkedList<TDispositivo>();
            raiz.buscarDispositivos(mascaraSubRed, dispositivos);
            return dispositivos;
        }
        System.out.println("Máscara no válida.");
        return null;
    }

    @Override
    public void insertar(TDispositivo unDispositivo) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(unDispositivo);
    }

}
