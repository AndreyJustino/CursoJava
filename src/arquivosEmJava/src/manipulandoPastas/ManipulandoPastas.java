package manipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho de uma pasta: ");
        String path = sc.nextLine();

        File folderRoot = new File(path);

        File[] folders = folderRoot.listFiles(File::isDirectory);
        File[] files = folderRoot.listFiles(File::isFile);

        for (File folder : folders){
            System.out.println(folder);
        }

        for (File file : files){
            System.out.println(file);
        }

        System.out.print("De um nome para a nova pasta: ");
        String nameFolder = "/" + sc.nextLine() + "/";

        System.out.println(nameFolder);

        boolean sucess = new File(path + nameFolder).mkdir();

        sc.close();

    }
}
