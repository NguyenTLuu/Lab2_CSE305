import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority() {
        this.priority = "Medium";

    }

    @Override
    public void setStatus() {
        this.status = "Accepted";

    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().minusDays(30).toString();

    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
