import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

         /*     Task    LMS    Interface
        EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
Абстракт класска School , University, College деген саб класстарды тузунуз.
Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()
 деген 2 метод тузунуз.
Student деген класс тузунуз. Полелери: name, surname,  gender,  LocalDate dateOfStart()
(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
Main класста 1 метод тузунуз.
1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты жана
окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.
         */

        EducationCenter school = new School("Central High School", "USA", LocalDate.of(1950, 1, 1));
        EducationCenter university = new University("Tech University", "Germany", LocalDate.of(1900, 1, 1));
        EducationCenter college = new College("National College", "Canada", LocalDate.of(1980, 1, 1));

        Student[] students = {
                new Student("John", "Doe", "Male", LocalDate.of(2021, 9, 1), school),
                new Student("Jane", "Smith", "Female", LocalDate.of(2019, 9, 1), university),
                new Student("Alice", "Johnson", "Female", LocalDate.of(2020, 9, 1), college),
                new Student("Bob", "Brown", "Male", LocalDate.of(2018, 9, 1), school),
                new Student("Charlie", "Davis", "Male", LocalDate.of(2021, 9, 1), university),
                new Student("Diana", "Evans", "Female", LocalDate.of(2017, 9, 1), college),
                new Student("Eva", "Harris", "Female", LocalDate.of(2022, 9, 1), school),
                new Student("Frank", "Miller", "Male", LocalDate.of(2020, 9, 1), university),
                new Student("Grace", "Wilson", "Female", LocalDate.of(2019, 9, 1), college),
                new Student("Henry", "Taylor", "Male", LocalDate.of(2018, 9, 1), school)
        };

        printStudentsInfo(students);
    }

         public static void printStudentsInfo(Student[] students) {
        for (Student student : students) {
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
            System.out.println();
        }
    }








}