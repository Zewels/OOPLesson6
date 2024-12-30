// Класс Student представляет сущность студента с его идентификатором и именем.
public class Student implements Comparable<Student> {

    // Уникальный идентификатор студента
    private Long studentId;

    // Имя студента
    private String firstName;

    // Фамилия студента
    private String lastName;

    // Отчество студента
    private String middleName;

    // Геттер для studentId
    public Long getStudentId() {
        return studentId;
    }

    // Сеттер для studentId
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    // Геттер для firstName
    public String getFirstName() {
        return firstName;
    }

    // Сеттер для firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Геттер для lastName
    public String getLastName() {
        return lastName;
    }

    // Сеттер для lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Геттер для middleName
    public String getMiddleName() {
        return middleName;
    }

    // Сеттер для middleName
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Реализация метода compareTo для сравнения студентов по их идентификатору.
     * @param o другой объект Student для сравнения
     * @return отрицательное число, если текущий идентификатор меньше,
     *         положительное число, если больше,
     *         или 0, если идентификаторы равны
     */
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
