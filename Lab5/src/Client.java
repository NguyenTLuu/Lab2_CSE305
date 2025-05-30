public class Client {
    public Contract requestCreateContract(ContractBuilder builder, String contractId, int rentAmount, String tenantId, String propertyId, String type) {
        builder.buildContractID(contractId);
        builder.buildRentAmount(rentAmount);
        builder.buildTenantID(tenantId);
        builder.buildPropertyID(propertyId);
        return builder.signContract(type);
    }
}
