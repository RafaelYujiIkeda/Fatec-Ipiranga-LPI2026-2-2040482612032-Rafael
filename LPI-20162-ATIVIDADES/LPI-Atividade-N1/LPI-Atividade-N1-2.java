import java.util.Scanner;

public class LPI-Atividade-N1-2
 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Valor para comparação de primitivos: ");
        int valorPrimitivo = sc.nextInt();

        System.out.print("Valor para comparação de objetos (new Integer): ")
        int valorObjeto = sc.nextInt();

        System.out.print("Valor dentro do Integer Cache (-128 a 127): ");
        int valorCache = sc.nextInt();

        System.out.print("Valor fora do Integer Cache: ");
        int valorForaCache = sc.nextInt();

        int aPrimitivo = valorPrimitivo;
        
        int bPrimitivo = valorPrimitivo;

        System.out.println("--- Comparação de Primitivos (int) ---");

        System.out.println("aPrimitivo == bPrimitivo: " + (aPrimitivo == bPrimitivo));

        Integer aObjeto = new Integer(valorObjeto);

        Integer bObjeto = new Integer(valorObjeto);

        System.out.println("--- Comparação de Objetos via 'new Integer()' ---");

        System.out.println("aObjeto == bObjeto (Identidade): " + (aObjeto == bObjeto));

        System.out.println("aObjeto.equals(bObjeto) (Valor): " + aObjeto.equals(bObjeto));
    }
}