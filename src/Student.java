public class Student {
    private String name;
    private String course;

    public Student() {

    }

    public Student(String n, String c) {
        name = n;
        course = c;
    }

    public String getName() {
        return this.name;
    }

    public String getCourse() {
        return this.course;
    }


    public void setName(String n) {
        this.name = n;
    }

    public void setCourse(String c) {
        this.course = c;
    }
    public String toString() {
        return this.name + " " + this.course;
    }
}
