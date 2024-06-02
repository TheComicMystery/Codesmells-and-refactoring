package patterns;
//Singleton. Клас Database гарантує, що він має лише 1 екземпляр і надає глобальну точку доступу до нього через метод getInstance.

class Database {
    private static volatile Database instance;

    private Database() {
        // Приватний конструктор для запобігання створенню об'єктів
    }

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }

    public void connect() {
        System.out.println("Підключення до бази даних");
    }
}