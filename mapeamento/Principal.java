package mapeamento;
/*Aplica��o para contar quantas vezes uma palavra ocorre numa sequencia.
Para fazer isto, o usu�rio insere uma frase e a frase ser� quebrada em
palavras. Cada palavra ser� mapeada e a partir dai contaremos a ocorr�ncia de
uma dada palavra numa frase.
e a */

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Principal
{
  /*Nota��o "< X >" serve para deixar implicito o tipo da vari�vel passada no
    parametro de uma fun��o, desta forma, qualquer tipo de dado pode ser
    passado para a fun��o*/  
  public static <Tipo> void printArray(Tipo[] array)
  {
    for(Tipo x: array)
    {
      // "%s" Converte o tipo para String e o imprime.
      System.out.printf("%s ", x);
    }
    System.out.println();
  }
  
  public static <T1 extends Comparable <T1>> T1 maximo(T1 a, T1 b)
  {
    T1 max = a;
    if (b.compareTo(max) > 0)
    {
      max = b;      
    }
    return max;
  }
  public static void main(String[] args) 
  {
    System.out.println("Insira uma frase com palavras repetidas");
    Scanner ler = new Scanner(System.in);
    String frase = ler.nextLine();
    System.out.println("Frase capturada");
    //Instancia um mapeamento
    Map<String,Integer> m = new Hashtable<>();
    /* Este for serve p capturar cada palavra da String (como se fosse um vetor)
       onde cada palavra ocupasse uma posi��o deste vetor*/
    for(String palavra: frase.split(" "))
    {
      //Integer cria um objeto do tipo int
      Integer n = m.get(palavra);
      if (n == null)
      {
        m.put(palavra, 1);
      }
      else
      {
        m.put(palavra,n + 1);
      }
      // Exibe a ocorr�ncia de cada palavra na frase
      System.out.println(m);
    }
    
    // Usando Classes de tipos primitovos e criando m�todos de tipos genericos
    Integer array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Double array2[] = {1.0, 2.0, 3.5, 4.5, 6.3, 7.4, 10.0};
    Integer a = 5; Integer b = 8;
    String s1 = "Fagner"; String s2 = "Camila";
    printArray(array1);
    printArray(array2);
    System.out.println("O maior eh: " + maximo(a, b));
    System.out.println("O maior eh: " + maximo(s1, s2));
    
    frase = null;
    s1 = null;
    s2 = null;
    ler.close();
  }

}
