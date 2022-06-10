public class Display {
    private String lastName;
    private String firstName;
    private int age;

    public Display(String lastName, String firstName, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName(){
        return lastName;
    }
    public void display(){
        System.out.print(" Last name: " +lastName);
        System.out.print(" First name: " +firstName);
        System.out.println(" Age: " +age);
    }
}
