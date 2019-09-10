import java.util.Date;

public class LogEntry {
   private Date createdAt;
   private Date updatedAt;
   private String messege;

    public LogEntry(String message){
        this.messege = message;
        createdAt = new Date();
        updatedAt = new Date();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getMessage() {
        return messege;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", message='" + messege + '\'' +
                '}';
    }

    public void update(String message){

    }
}
