package Task5_CourseRegistration;

class Course {

    String code;
    String title;
    String description;
    int capacity;
    int registeredCount;

    Course(String code, String title, String description, int capacity) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.registeredCount = 0;
    }

    void displayCourse() {
        System.out.println(
                code + " | " + title +
                        " | Available Slots: " +
                        (capacity - registeredCount)
        );
    }
}