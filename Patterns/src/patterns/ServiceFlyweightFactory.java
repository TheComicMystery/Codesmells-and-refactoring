package patterns;
import java.util.HashMap;
import java.util.Map;
//Flyweight - патерн розділяє спільний стан об'єктів для Service, щоб забезпечити єдиний екземпляр кожного типу.

class ServiceFlyweightFactory {
    private static final Map<String, Service> services = new HashMap<>();

    public static Service getService(String type) {
        Service service = services.get(type);
        if (service == null) {
            switch (type) {
                case "Legal":
                    service = new LegalService();
                    break;
                case "Financial":
                    service = new FinancialService();
                    break;
            }
            services.put(type, service);
        }
        return service;
    }
}