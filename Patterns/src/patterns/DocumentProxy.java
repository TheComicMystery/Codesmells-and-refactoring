//Паттерн Proxy дозволяє підставляти замість реальних об'єктів спеціальні об'єкти-замінники (тут для Document).
package patterns;

class DocumentProxy implements Document {
    private final String type;
    private Document realDocument;

    public DocumentProxy(String type) {
        this.type = type;
    }

    @Override
    public void create() {
        if (realDocument == null) {
            switch (type) {
                case "Legal":
                    realDocument = new LegalDocument();
                    break;
                case "Financial":
                    realDocument = new FinancialDocument();
                    break;
            }
        }
        realDocument.create();
    }
}