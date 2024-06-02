package patterns;
//Паттерн Decorator надає нові можливості для Service

abstract class ServiceDecorator extends Service {
    protected Service decoratedService;

    public ServiceDecorator(Service decoratedService) {
        this.decoratedService = decoratedService;
    }

    public void serve() {
        decoratedService.serve();
    }
}

class AdditionalServiceDecorator extends ServiceDecorator {
    public AdditionalServiceDecorator(Service decoratedService) {
        super(decoratedService);
    }

    @Override
    public void serve() {
        decoratedService.serve();
        addAdditionalService();
    }

    private void addAdditionalService() {
        System.out.println("Надання додаткової послуги");
    }
}