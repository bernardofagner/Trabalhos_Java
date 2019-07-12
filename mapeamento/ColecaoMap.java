package mapeamento;

import java.util.HashMap;
import java.util.Map;

public class ColecaoMap {
  public static void main (String[] args){
    // Map<tipoChave, alorChave>
    Map<String, String> pais = new HashMap<>();
    pais.put("BR", "Brasil");
    pais.put("RU", "R�ssia");
    pais.put("IN", "India");
    // Exibe o conte�do do mapeamento
    System.out.println(pais);
    //Verifica se a chave BR est� no mapa
    System.out.println(pais.containsKey("BR"));
    System.out.println(pais.containsKey("US"));
    //Verifica se o valor est� presente no mapa
    System.out.println(pais.containsValue("Brasil"));
    //Recupera um conte�do pela chave
    System.out.println(pais.get("IN"));
    //Remove um conte�do pela chave
    System.out.println(pais.remove("BR"));
    System.out.println(pais);
  }
}
