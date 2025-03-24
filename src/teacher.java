public class teacher {
    public String fname;
    public String lname;
    public String email;
    public String subject;

    public teacher(String fname, String lname, String email, String subject) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("Teacher: " + fname + " " + lname);
        System.out.println("Email: " + email + ", Subject: " + subject);
    }
}
