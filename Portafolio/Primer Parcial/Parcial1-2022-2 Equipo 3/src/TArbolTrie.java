
import java.util.LinkedList;



/**
 *
 * @author Casales
 */
class TArbolTrie implements IArbolTrie{

    private TNodoTrie raiz;
    
    @Override
    public LinkedList<TDispositivo> buscarDispositivos(String mascaraSubRed) {
        LinkedList<TDispositivo> resultado = new LinkedList<>();
        
        if (!mascaraValida(mascaraSubRed)) return resultado;
        
        if(raiz == null){
            return resultado;
        }
        
        raiz.buscarDispositivos(mascaraSubRed, resultado);
        return resultado;
    }

    @Override
    public void insertar(TDispositivo unDispositivo) {
        if (!ipValido(unDispositivo.getDirIP())) return;
        
        if (raiz == null){
            raiz = new TNodoTrie(unDispositivo);
        }else{
            raiz.insertar(unDispositivo);
        }
    }
    
    public boolean ipValido(String ip){
        ip = ip.replace(".", ",");
        String[] arregloIp = ip.split(",");
        
        if (ip.length() != 15 || arregloIp.length != 4) return false;
        
        for (String string : arregloIp) {
            if(string.length() != 3) return false;
        }
        
        return true;
    }
    
    public boolean mascaraValida(String mascara){
        mascara = mascara.replace(".", ",");
        String[] arregloIp = mascara.split(",");
        
        if (mascara.length() % 4 != 0 || mascara.length() > 12) return false;
        
        for (String string : arregloIp) {
            if(string.length() != 3) return false;
        }
        
        return true;
    }
    
}
