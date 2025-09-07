import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String texto = "ABC def GHI jKlMn OPQ rst Uvwx Yz";

        String minusculo = texto.toLowerCase(); // abc def ghi jklmn opq rst uvwx yz
        String maiusculo = texto.toUpperCase(); // ABC DEF GHI JKLMN OPQ RST UVWX YZ
        String tiraEspacoComecoFim = texto.trim(); // -ABC def GHI jKlMn OPQ rst Uvwx Yz-
        String cortaTexto = texto.substring(2, 8); //corta do index 2 ao 7 "C def "
        String trocaLugar = texto.replace(" ", "-"); // ABC-def-GHI-jKlMn-OPQ-rst-Uvwx-Yz

        String[] array = texto.split(" "); //vai separa cada parte em um espaço do array
        // System.out.println(Arrays.toString(array)); // [ABC, def, GHI, jKlMn, OPQ, rst, Uvwx, Yz]
    }
}