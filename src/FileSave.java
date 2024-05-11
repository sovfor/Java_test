import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileSave {
    private File file;
    private FileWriter fileWriter;
    public FileSave(){
        file = new File("Toys.csv");
    }

    public void toysSave(ArrayList<Toy> toys){
        try {
            fileWriter = new FileWriter("Toys.csv");


        for(int i = 0;i < toys.size();i++){
            String str = toys.get(i).getId() + ";" + toys.get(i).getName() + ";" + toys.get(i).getAmount() + ";" + toys.get(i).getFreguency();
            System.out.println(str);
            fileWriter.write(str);
        }

        }
        catch (IOException e){
            System.err.println("Error with File save");
        }
    }
}
