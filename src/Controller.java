import java.util.List;

// Контроллер отвечает за взаимодействие между внешним интерфейсом и логикой приложения.
public class Controller {

    // Создание экземпляров сервисов
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();

    /**
     * Удаляет студента из группы по его полному имени.
     * @param firstName Имя студента
     * @param lastName Фамилия студента
     * @param middleName Отчество студента
     */
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    /**
     * Получает список студентов, отсортированный по определённым критериям (например, по успеваемости).
     * @return Отсортированный список студентов
     */
    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    /**
     * Получает список студентов, отсортированный по их полному имени (ФИО).
     * @return Список студентов, отсортированный по ФИО
     */
    public List<Student> getSortedStudentByFIO(){
        return studentGroupService.getSortedStudentByFIO();
    }

    /**
     * Метод для сортировки списка потоков.
     * @param streams Список потоков, который нужно отсортировать
     */
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams); // Используем сервис для сортировки
    }
}
