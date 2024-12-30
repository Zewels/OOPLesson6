import java.util.*;

public class StudentGroupService {

    private StudentGroup studentGroup; // Группа студентов, с которой работает сервис

    /**
     * Метод для удаления студента из группы по полному имени (ФИО).
     * @param firstName Имя студента
     * @param lastName Фамилия студента
     * @param middleName Отчество студента
     */
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        // Получаем итератор для обхода студентов в группе
        Iterator<Student> iterator = studentGroup.iterator();

        // Проходим по всем студентам в группе
        while (iterator.hasNext()){
            Student student = iterator.next();

            // Проверяем, совпадают ли имя, фамилия и отчество с переданными значениями
            if (student.getFirstName().equals(firstName) &&
                    student.getLastName().equals(lastName) &&
                    student.getMiddleName().equals(middleName)){

                // Если совпадает, удаляем студента через итератор
                iterator.remove();
            }
        }
    }

    /**
     * Метод для получения отсортированного списка студентов (по идентификатору).
     * @return Отсортированный список студентов
     */
    public List<Student> getSortedStudentList(){
        // Копируем список студентов из группы
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());

        // Сортируем список студентов (по умолчанию сравниваются по ID, так как Student реализует Comparable)
        Collections.sort(studentList);

        // Возвращаем отсортированный список
        return studentList;
    }

    /**
     * Метод для получения отсортированного списка студентов по ФИО.
     * @return Отсортированный список студентов по ФИО
     */
    public List<Student> getSortedStudentByFIO(){
        // Копируем список студентов из группы
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());

        // Сортируем список студентов по ФИО с использованием кастомного компаратора
        studentList.sort(new StudentComparator());

        // Возвращаем отсортированный список
        return studentList;
    }
}
