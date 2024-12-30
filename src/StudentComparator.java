import java.util.Comparator;

// Класс StudentComparator реализует Comparator для сравнения объектов Student.
public class StudentComparator implements Comparator<Student> {

    /**
     * Метод для сравнения двух объектов Student по имени, фамилии и отчеству.
     * @param o1 первый объект Student
     * @param o2 второй объект Student
     * @return отрицательное число, если o1 меньше o2, положительное число, если больше, и 0, если равны
     */
    @Override
    public int compare(Student o1, Student o2) {
        // Сначала сравниваем имена
        int resultofComparing = o1.getFirstName().compareTo(o2.getFirstName());

        // Если имена одинаковые, сравниваем фамилии
        if (resultofComparing == 0) {
            resultofComparing = o1.getLastName().compareTo(o2.getLastName());

            // Если и фамилии одинаковые, сравниваем отчества
            if (resultofComparing == 0) {
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            } else {
                // Возвращаем результат сравнения фамилий
                return resultofComparing;
            }
        } else {
            // Возвращаем результат сравнения имен
            return resultofComparing;
        }
    }
}
