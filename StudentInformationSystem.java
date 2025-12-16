class Student {
    String name;
    int age;
    int marks;
    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}
public class StudentInformationSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 20, 85);
        Student s2 = new Student("Riya", 21, 90);
        Student s3 = new Student("Kiran", 19, 78);
        Student[] students = {s1, s2, s3};
        int totalMarks = 0;
        System.out.println("----- Student Information -----");
        for (Student s : students) {
            System.out.println("Name  : " + s.name);
            System.out.println("Age   : " + s.age);
            System.out.println("Marks : " + s.marks);
            System.out.println("------------------------------");
            totalMarks += s.marks;
        }
        double average = totalMarks / 3.0;
        System.out.printf("Average Marks of 3 Students: %.2f%n", average);
    }
}

