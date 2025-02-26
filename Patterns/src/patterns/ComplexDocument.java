package patterns;
import java.util.ArrayList;
import java.util.List;
//Composite. Цей паттерн дозволяє згрупувати декілька об'єктів у деревоподібну структуру. Тепер можна створити складний документ з кількох частин.

class ComplexDocument implements Document {
    private final List<Document> documents = new ArrayList<>();

    public void addDocument(Document document) {
        documents.add(document);
    }

    @Override
    public void create() {
        for (Document document : documents) {
            document.create();
        }
    }
}