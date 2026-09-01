import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Valor para comparação de primitivos: ");
        int valorPrimitivo = sc.nextInt();

        System.out.print("Valor para comparação de objetos (new Integer): ");
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

        Integer xCache = new Integer(valorCache);

        Integer yCache = new Integer(valorCache);

        System.out.println("--- Comparação com Autoboxing e Integer Cache ---");

        System.out.println("Dentro do Cache (120) -> xCache == yCache: " + (xCache == yCache));

        Integer xForaCache = new Integer(valorForaCache);

        Integer yForaCache = new Integer(valorForaCache);

        System.out.println("Fora do Cache (200) -> xForaCache == yForaCache: " + (xForaCache == yForaCache));

        System.out.println("Fora do Cache (200) -> xForaCache.equals(yForaCache: " + (xForaCache.equals(yForaCache)));

        sc.close();
    }
}
