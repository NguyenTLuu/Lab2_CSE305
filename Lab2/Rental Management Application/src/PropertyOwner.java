import java.util.ArrayList;

public class PropertyOwner extends User{
    public PropertyOwner(String userID, String password, String email, String userType) {
        super(userID, password, email, userType);
        this.listOfProperties = new ArrayList();
    }
    public String getPropertyOwnerID() {
        return getUserID();
    }
    private ArrayList<Property> listOfProperties;
    public void addProperty(Property property) {
        listOfProperties.add(property);
    }
    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }
}