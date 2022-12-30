// Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
// Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса,
// которые записывают в файл информацию о студентах в разных формах.

public class Main
{
    public static void main(String[] args)
    {
        SaveDocument txt = new SaveDocumentTxt();
        SaveDocument json = new SaveDocumentJson();
        SaveDocument xml = new SaveDocumentXml();

        txt.LineSaveDoс("task1/src/DOC", "file", "Иван Иванов=4.8");
        txt.LineSaveDoс("task1/src/DOC", "file", "Мария Кузнецова=5.0");
        txt.LineSaveDoс("task1/src/DOC", "file", "Степан Кузьмин=3.6");

        json.LineSaveDoс("task1/src/DOC", "file", "{");
        json.LineSaveDoс("task1/src/DOC", "file", "\"Иван Иванов\": 4.8,");
        json.LineSaveDoс("task1/src/DOC", "file", "\"Мария Кузнецова\": 5.0,");
        json.LineSaveDoс("task1/src/DOC", "file", "\"Степан Кузьмин\": 3.6");
        json.LineSaveDoс("task1/src/DOC", "file", "}");

        xml.LineSaveDoс("task1/src/DOC", "file", "<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<students>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<student>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<name>Иван Иванов</name>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<grade>4.8</grade>");
        xml.LineSaveDoс("task1/src/DOC", "file", "</student>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<student>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<name>Мария Кузнецова</name>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<grade>5.0</grade>");
        xml.LineSaveDoс("task1/src/DOC", "file", "</student>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<student>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<name>Степан Кузьмин</name>");
        xml.LineSaveDoс("task1/src/DOC", "file", "<grade>3.6</grade>");
        xml.LineSaveDoс("task1/src/DOC", "file", "</student>");
        xml.LineSaveDoс("task1/src/DOC", "file", "</students>");

    }
}
