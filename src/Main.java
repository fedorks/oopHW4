/*
С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.
Например:
Должен быть класс Задачи (общий/родительский и подтипы)
У задачи должно быть длительность, дедлайн, приоритет, тема, ответсвенный... - параметры на Ваше усмотрение
**У задачи должна быть возможность включить или выключить нотификацию на разные события, например, приближение дедлайна.
Должен быть класс Календарь, в который можно добавлять Задачи.
*** При пересечении задач по времени - выводить сообщение пользователю.
**** Должна быть возможность выгрузки Календаря в файл (тип на Ваше усмотрение)
**** Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора и др
 */

public class Main {

    public static void main(String[] args) {

        Task check = new WorkTask("Учёба в GB","Проверить работу программы", 20, 00, 0, 23, 30);
        Task pack = new PersonalTask("Ежедневные задачи","Прогулять собаку", 17, 30, 1, 19, 00);

        System.out.println(check.getTask());
        System.out.println(pack.getTask());

        Calendar.addCalendar(check);
        Calendar.addCalendar(pack);

        Calendar.fileWriter();


    }
}