package Task5_CourseRegistration;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentCourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Course> registeredCourses = new ArrayList<>();

        // Adding courses

        courses.add(new Course("C101", "Java", "Core Java Programming", 3));

        courses.add(new Course("C102", "Python", "Python Programming", 2));

        courses.add(new Course("C103", "SQL", "Database Management", 3));

        int choice;

        do {

            System.out.println("\n===== COURSE REGISTRATION SYSTEM =====");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register Course");
            System.out.println("3. Remove Course");
            System.out.println("4. View Registered Courses");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Courses:");

                    for (Course c : courses) {
                        c.displayCourse();
                    }
                    break;

                case 2:
                    System.out.print("Enter course code: ");
                    String code = sc.next();

                    Course selected = null;

                    for (Course c : courses) {
                        if (c.code.equalsIgnoreCase(code)) {
                            selected = c;
                            break;
                        }
                    }

                    if (selected == null) {
                        System.out.println("Course not found!");
                    }
                    else if (registeredCourses.contains(selected)) {
                        System.out.println("Already registered!");
                    }
                    else if (selected.registeredCount >= selected.capacity) {
                        System.out.println("No available slots!");
                    }
                    else {
                        registeredCourses.add(selected);
                        selected.registeredCount++;
                        System.out.println("Registration successful!");
                    }
                    break;

                case 3:
                    System.out.print("Enter course code to remove: ");
                    String removeCode = sc.next();

                    boolean removed = false;

                    for (Course c : registeredCourses) {
                        if (c.code.equalsIgnoreCase(removeCode)) {
                            registeredCourses.remove(c);
                            c.registeredCount--;
                            removed = true;
                            break;
                        }
                    }

                    if (removed) {
                        System.out.println("Course removed successfully!");
                    } else {
                        System.out.println("Registered course not found!");
                    }
                    break;

                case 4:
                    System.out.println("\nYour Registered Courses:");

                    if (registeredCourses.isEmpty()) {
                        System.out.println("No courses registered.");
                    } else {
                        for (Course c : registeredCourses) {
                            System.out.println(c.code + " - " + c.title);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
