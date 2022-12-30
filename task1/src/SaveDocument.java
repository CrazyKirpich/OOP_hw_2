import java.util.Scanner;

public abstract class SaveDocument
{
    Scanner scan = new Scanner(System.in);
    public SaveDocument()
    {
        this.scan = new Scanner(System.in);
    }
    abstract void LineSaveDoс(String pathDoc, String nameDoc, String line);
    abstract void EnterSaveDoс(String pathDoc, String nameDoc);
}
