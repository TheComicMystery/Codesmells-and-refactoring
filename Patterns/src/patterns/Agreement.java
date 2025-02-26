package patterns;
//Builder. Клас Agreement представляє складний об'єкт, а AgreementBuilder допомагає створювати об'єкти Agreement покроково.
class Agreement {
    private String clientName;
    private String serviceType;
    private double amount;
    private double commission;
    private String description;

    public Agreement(String clientName, String serviceType, double amount, double commission, String description) {
        this.clientName = clientName;
        this.serviceType = serviceType;
        this.amount = amount;
        this.commission = commission;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Agreement [clientName=" + clientName + ", serviceType=" + serviceType + ", amount=" + amount +
                ", commission=" + commission + ", description=" + description + "]";
    }
}

class AgreementBuilder {
    private String clientName;
    private String serviceType;
    private double amount;
    private double commission;
    private String description;

    public AgreementBuilder setClientName(String clientName) {
        if (clientName == null || clientName.isEmpty()) {
            throw new IllegalArgumentException("Client name cannot be null or empty");
        }
        this.clientName = clientName;
        return this;
    }

    public AgreementBuilder setServiceType(String serviceType) {
        if (serviceType == null || serviceType.isEmpty()) {
            throw new IllegalArgumentException("Service type cannot be null or empty");
        }
        this.serviceType = serviceType;
        return this;
    }

    public AgreementBuilder setAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        this.amount = amount;
        return this;
    }

    public AgreementBuilder setCommission(double commission) {
        if (commission < 0) {
            throw new IllegalArgumentException("Commission cannot be negative");
        }
        this.commission = commission;
        return this;
    }

    public AgreementBuilder setDescription(String description) {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        this.description = description;
        return this;
    }

    public Agreement build() {
        if (clientName == null || serviceType == null) {
            throw new IllegalStateException("Client name and Service type cannot be null");
        }
        return new Agreement(clientName, serviceType, amount, commission, description);
    }
}