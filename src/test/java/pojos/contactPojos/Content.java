package pojos.contactPojos;

public class Content {
    public String date;
    public String email;
    public String message;
    public String name;
    public String subject;

    public Content(String date, String email, String message, String name, String subject) {
        this.date = date;
        this.email = email;
        this.message = message;
        this.name = name;
        this.subject = subject;
    }

    public Content() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Content{" +
                "date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
