import java.util.Scanner;

class Student {
    String name;
    int age;
    int sub1, sub2, sub3, sub4, sub5;
    int total;
    double average;

    void calculate() {
        total = sub1 + sub2 + sub3 + sub4 + sub5;
        average = total / 5.0;
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        for (int i = 1; i <= 5; i++) {

            Student s;

            // Select the student object
            if (i == 1)
                s = s1;
            else if (i == 2)
                s = s2;
            else if (i == 3)
                s = s3;
            else if (i == 4)
                s = s4;
            else
                s = s5;

            System.out.println("\nEnter details of Student " + i);

            System.out.print("Name: ");
            s.name = sc.nextLine();

            System.out.print("Age: ");
            s.age = sc.nextInt();

            System.out.print("Subject 1: ");
            s.sub1 = sc.nextInt();

            System.out.print("Subject 2: ");
            s.sub2 = sc.nextInt();

            System.out.print("Subject 3: ");
            s.sub3 = sc.nextInt();

            System.out.print("Subject 4: ");
            s.sub4 = sc.nextInt();

            System.out.print("Subject 5: ");
            s.sub5 = sc.nextInt();

            s.calculate();

            sc.nextLine(); // consume newline
        }

        // Display details
        System.out.println("\n========== STUDENT DETAILS ==========");

        System.out.println(s1.name + "  Total: " + s1.total +
                           "  Average: " + s1.average);

        System.out.println(s2.name + "  Total: " + s2.total +
                           "  Average: " + s2.average);

        System.out.println(s3.name + "  Total: " + s3.total +
                           "  Average: " + s3.average);

        System.out.println(s4.name + "  Total: " + s4.total +
                           "  Average: " + s4.average);

        System.out.println(s5.name + "  Total: " + s5.total +
                           "  Average: " + s5.average);

        // Find topper
        Student topper = s1;

        if (s2.total > topper.total)
            topper = s2;

        if (s3.total > topper.total)
            topper = s3;

        if (s4.total > topper.total)
            topper = s4;

        if (s5.total > topper.total)
            topper = s5;

        System.out.println("\n========== TOPPER ==========");
        System.out.println("Name    : " + topper.name);
        System.out.println("Total   : " + topper.total);
        System.out.println("Average : " + topper.average);

        sc.close();
    }
}