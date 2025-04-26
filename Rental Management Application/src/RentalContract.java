public class RentalContract {
    public String getContractID() {
        return contractID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public int getRentAmount() {
        return rentAmount;
    }

    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;

    public RentalContract(String contractID, String propertyID, String tenantID, int rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public void createContract(){}

    public void terminateContract(){}
}
