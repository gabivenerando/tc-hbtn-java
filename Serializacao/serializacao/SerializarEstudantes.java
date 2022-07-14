import java.io.*;
import java.util.List;

public class SerializarEstudantes<Estudante> {

    private String nomeArquivo;


    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes)  {
        try{
            FileOutputStream fos = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);
            oos.close();
            fos.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        try
        {
            FileInputStream fis = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (List<Estudante>) ois.readObject();
        }
        catch (IOException ioe)
        {
            System.out.println("Nao foi possivel desserializar");
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Nao foi possivel desserializar");
        }
        return null;
    }
}
