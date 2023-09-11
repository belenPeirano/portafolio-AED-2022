package ut6.pd1;



public class MedicionBuscarTrieHashMap extends Medible{

    private TArbolTrieHashMap trieHashMap;

    public MedicionBuscarTrieHashMap (TArbolTrieHashMap trie) {
        this.trieHashMap = trie;
    }
    
    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for(int i = 0; i < repeticion; i++){
            for(String palabra : palabras){
                trieHashMap.buscar(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return this.trieHashMap;
    }
}