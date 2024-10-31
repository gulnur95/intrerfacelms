import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Student implements Study  {

    String name;
    String surname;
    String gender;
    LocalDate dateOfStart;
    EducationCenter educationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }



    @Override
    public void getStudentsEducationCenter() {
        System.out.println(name + " " + surname + " окуйт: " + educationCenter.name);
    }


    @Override
    public void getStudentsStudyingYear() {
        long yearsStudying = ChronoUnit.YEARS.between(dateOfStart, LocalDate.now());
        System.out.println(name + " " + surname + " окуп жатканына " + yearsStudying + " жыл болду." );
    }



    }



