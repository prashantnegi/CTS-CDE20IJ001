public class DayTwo {

    static int sum(int... values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return sum;
    }

    public static void main(String[] args) {

        // System.out.println(sum(1,2,3));
        // System.out.println(sum(1,2,3,4,5));
        // System.out.println(sum(1,2,3,5,6,7,7));
        // System.out.println(sum(1,2,3,5,6,7,3,6,7,8));

        String names = "ashish,arun,rahul";

        String [] split = names.split(",");

        for (String name : split) {
            System.out.println(name);
        }

    }
}

class Student {

    private String name;
    private String course;
    private String email;
    private int age;

    private static String schedule;
    private static String topics;

    static {
        topics = "FSE_COHORTS_TOPICS";
        System.out.println("Static block for topic.");
    }

    static {
        schedule = "FSE_COHORTS";
        System.out.println("Static block for schedule.");
    }

    Student() {
        System.out.println("Student zero args constructor.");
        // System.out.printf("Student\t[ Name: %s, Email: %s, Course: %s, Age: %d ]\n",
        // name, email, course, age);
    }

    Student(String name, String course, String email, int age) {
        this();
        // System.out.println("Student multi args constructor.");
        this.name = name;
        this.course = course;
        this.email = email;
        this.age = age;
    }

    /**
     * @return the schedule
     */
    public static String getSchedule() {
        return schedule;
    }

    /**
     * @param schedule the schedule to set
     */
    public static void setSchedule(String schedule) {
        Student.schedule = schedule;
    }

    /**
     * @return the topics
     */
    public static String getTopics() {
        return topics;
    }

    /**
     * @param topics the topics to set
     */
    public static void setTopics(String topics) {
        Student.topics = topics;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.printf("Student\t[ Name: %s, Email: %s, Course: %s, Age: %d ]\n", name, email, course, age);
    }
}

class FunctionOverloading {
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public long add(int number1, long number2) {
        return number1 + number2;
    }

    public long add(long number1, long number2) {
        return number1 + number2;
    }

    public long add(long number1, int number2) {
        return number1 + number2;
    }
}
