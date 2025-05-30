import java.util.ArrayList;

public class Tenant extends User{
    public Tenant(String userID, String password, String email, String userType, ArrayList<RentalContract> listOfContract) {
        super(userID, password, email, userType);
        this.listOfContract = listOfContract;
    }

    private ArrayList<RentalContract> listOfContract;

    public void requestCreateRentalContract(){}

    public void requestTerminateRentalContract(){}

}
