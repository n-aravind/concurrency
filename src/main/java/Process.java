import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Process extends Thread{

    private static final String header = "<html><meta http-equiv=\"refresh\" content=\"1\"/><body><h1>";
    private static final String footer = "</h1></body></html>";
    @Override
    public void run() {
        while(true){
            writeTimeToFile();
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }

    private void writeTimeToFile() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try(FileWriter fileWriter = new FileWriter(new File("timeFile.html"))){
            fileWriter.write(header+dateFormat.format(new Date())+footer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
