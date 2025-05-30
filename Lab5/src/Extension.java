import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Extension {
    public void saveFile(Contract contract){
        String path = "normal_doc_output.txt";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            bufferedWriter.write(contract.toString());
            System.out.println("Contract saved to " + path);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
