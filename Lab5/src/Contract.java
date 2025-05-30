public class Contract {
    private String contractID;
    private int rentAmount;
    private String tenantID;
    private String propertyID;
    private String type;
    public Contract(String contractID, int rentAmount, String tenantID, String propertyID, String type) {
        this.contractID = contractID;
        this.rentAmount = rentAmount;
        this.tenantID = tenantID;
        this.propertyID = propertyID;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractID='" + contractID + '\'' +
                ", rentAmount=" + rentAmount +
                ", tenantID='" + tenantID + '\'' +
                ", propertyID='" + propertyID + '\'' +
                '}';
    }
}
