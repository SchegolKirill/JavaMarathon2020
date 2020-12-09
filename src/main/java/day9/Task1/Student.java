package day9.Task1;

public class Student extends Human {
    private String groupname;

    public Student(String name, String nameGroup) {
        super(name);
        this.groupname = nameGroup;
    }

    public String getGroupName() {
        return groupname;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}
