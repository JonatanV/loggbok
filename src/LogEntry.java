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
    public LogEntry(String message, long createdAt, long updatedAt) {
        this.messege = message;
        this.createdAt = new Date(createdAt);
        this.updatedAt = new Date(updatedAt);
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
    return  "createdAt = 2" + createdAt + '\n'+
            " updatedAt = " + updatedAt +'\n'+
            " message =" + messege + '\n'
            ;
    }
    public String toLong(){
        return createdAt.getTime()+ '\n'+
                 updatedAt.getTime()  +'\n'+
                " message =" + messege + '\n'
        ;
    }

    public void update(String newMessage){
        this.messege = newMessage;
        updatedAt = new Date();
    }
}
