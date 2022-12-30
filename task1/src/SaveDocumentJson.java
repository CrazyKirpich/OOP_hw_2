import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class SaveDocumentJson extends SaveDocument
{
    public SaveDocumentJson() {
        super.scan = new Scanner(System.in);
    }

    @Override
    void EnterSaveDoс(String pathDoc, String nameDoc)
    {
        try
        {
            String expansion = ".json";
            if (new File(pathDoc + "/" + nameDoc + expansion).isFile() != true)
            {
                Writer fw = new FileWriter(pathDoc + "/" + nameDoc + expansion);
                String input = scan.nextLine();
                fw.write(input);
                fw.close();
            }
            else
            {
                Writer fw = new FileWriter(pathDoc + "/" + nameDoc + expansion, true);
                String input = scan.nextLine();
                fw.append("\n" + input);
                fw.close();
            }
        }
        catch (Exception e)
        {
            System.out.println("Произошла ошибка!");
        }
    }

    @Override
    void LineSaveDoс(String pathDoc, String nameDoc, String line)
    {
        try
        {
            String expansion = ".json";
            if (new File(pathDoc + "/" + nameDoc + expansion).isFile() != true)
            {
                Writer fw = new FileWriter(pathDoc + "/" + nameDoc + expansion);
                fw.write(line);
                fw.close();
            }
            else
            {
                Writer fw = new FileWriter(pathDoc + "/" + nameDoc + expansion, true);
                fw.append("\n" + line);
                fw.close();
            }
        }
        catch (Exception e)
        {
            System.out.println("Произошла ошибка!");
        }
    }
}