import java.util.Iterator;
import java.util.List;

// Класс StudentGroup представляет группу студентов и поддерживает итерацию по ним.
public class StudentGroup implements Iterable<Student> {

    // Список студентов в группе
    private List<Student> studentList;

    /**
     * Геттер для получения списка студентов.
     * @return список студентов
     */
    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * Сеттер для установки списка студентов.
     * @param studentList список студентов
     */
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    /**
     * Реализация метода iterator из интерфейса Iterable.
     * Этот метод возвращает объект StudentGroupIterator для обхода студентов в группе.
     * @return итератор для студентов
     */
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
