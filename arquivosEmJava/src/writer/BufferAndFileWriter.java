package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferAndFileWriter {

    public static void main(String[] args) {
        String path = ".\\src\\out.txt";

        String[] texts = new String[]{"Java", "Javinha", "Arquivo", "Spring"};

        //FileWriter fileWriter = new FileWriter(path); -> cria/recria arquivo no caminho passado

        //usar o "true" no fileWriter para que ele não recria um novo arquivo e mantenha o existente
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){

            for (String values : texts){
                bufferedWriter.write(values);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
