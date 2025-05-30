interface ContractBuilder {
    void buildContractID(String contractID);

    void buildPropertyID(String propertyID);

    void buildTenantID(String tenantID);

    void buildRentAmount(int rentAmount);

    Contract signContract(String type);
}
