package patterns;
//Паттерн Template Method реалізує підкласи для їх використання з метою оптимізації.

abstract class ServiceTemplate {
    public final void execute() {
        prepare();
        serve();
        finish();
    }

    protected abstract void prepare();
    protected abstract void serve();
    protected abstract void finish();
}

class LegalServiceTemplate extends ServiceTemplate {
    @Override
    protected void prepare() {
        System.out.println("Підготовка юридичної послуги");
    }

    @Override
    protected void serve() {
        System.out.println("Надання юридичної послуги");
    }

    @Override
    protected void finish() {
        System.out.println("Завершення юридичної послуги");
    }
}

class FinancialServiceTemplate extends ServiceTemplate {
    @Override
    protected void prepare() {
        System.out.println("Підготовка фінансової послуги");
    }

    @Override
    protected void serve() {
        System.out.println("Надання фінансової послуги");
    }

    @Override
    protected void finish() {
        System.out.println("Завершення фінансової послуги");
    }
}