package gyakorlas0314;

/** 
 *
 * @author SimonGergő(SZOFT_202
 * 
 **/
public class Main {

   
    public static void main(String[] args) {
        tomb();
    }

    private static void tomb() {
        int[] szamok = {24, 12, 7, 51, 65};
        
        for (int i = 0; i < szamok.length; i++) {
            System.out.println(szamok[i]);
            tombSzamai(szamok, i);
        }
    }

    private static void tombSzamai(int[] szamok, int i) {
        int szamai = szamok[i];
        primE(szamai);
    }

    private static void primE(int szamai) {
        boolean primszE = false;
        for (int j = 2; j <= szamai / 2; j++) {
            if (szamai % j == 0){
                primszE = true;
            }
        }
        kiir(primszE);
    }

    private static void kiir(boolean primszE) {
        if (!primszE){
            System.out.println("Prím");
        }else{
            System.out.println("Nem prim");
        }
    }
    
}
