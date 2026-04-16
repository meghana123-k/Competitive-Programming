class Student {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class PrivateExample {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ram");
        student.setAge(34);
        System.out.println(student.getName()+" is "+student.getAge()+" year old.");
    }
}
