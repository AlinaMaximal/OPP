package Lab10.Task1.Task1.Task4;

public class FileDocument implements Readable,Writable {
    @Override
   public void read(){
        System.out.println("Reading  file");
    }
    @Override
    public void write(){
        System.out.println("Writing file");
    }
}