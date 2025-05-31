import java.time.LocalDate;
import java.util.Date;

public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;


    @Override
    public void setPriority() {
        this.priority = "Emergency";

    }

    @Override
    public void setStatus() {
        this.status = "Accept";

    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().toString();

    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administrator will contact you immediately!");
    }
}
