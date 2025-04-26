public class Property {
    private String propertyID;
    private String description;
    private String ownerId;

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Property(String propertyID, String description, PropertyOwner propertyOwner) {
        this.propertyID = propertyID;
        this.description = description;
        this.ownerId = propertyOwner.getPropertyOwnerID();
    }

}
