class Permanent implements ContractBuilder {
    private String contractID;
    private int rentAmount;
    private String tenantID;
    private String propertyID;

    @Override
    public void buildContractID(String contractID) {
        this.contractID = contractID;
    }

    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    @Override
    public void buildRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public Contract signContract(String type) {
        return new Contract(contractID, rentAmount, tenantID, propertyID,type);
    }
}