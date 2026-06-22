import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva sua Lista");
        String lista = scanner.nextLine();
        String[] saborLista = lista.split(" ");
        ArrayList<Integer> listaNum = new ArrayList<>();

        for (int i = 0; i < saborLista.length; i++) {
            listaNum.add(Integer.parseInt(saborLista[i]));
        }
        for (int i = 0; i < listaNum.size(); i++) {
            for (int a = 0; a < listaNum.size(); a++) {
                if (listaNum.get(i) < listaNum.get(a)) {
                    Collections.swap(listaNum,a,i);
                }
            }
        }
        System.out.println(listaNum);
    }
}