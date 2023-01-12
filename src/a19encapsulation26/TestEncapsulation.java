package a19encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Bhavesh");
        obj.setAge(19);
        obj.setRollNo(51);
        System.out.println("CodeBusters name: " + obj.getName());
        System.out.println("CodeBuster age: " + obj.getAge());
        System.out.println("CodeBuster rollNo: " + obj.getRollNo());
    }
}
