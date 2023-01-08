package ru.tms.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.setAllBooks(Arrays.asList(
                new Book("Лев Толстой", "Смерть Ивана Ильича", 1886),
                new Book("Фёдор Михайлович Достоевский", "Преступление и наказание", 1886),
                new Book("Чарлз Диккенс", "Повесть о двух городах", 1859),
                new Book("Чарлз Диккенс", "Оливер Твист", 1839),
                new Book("Антон Павлович Чехов", "Вишнёвый сад", 1901),
                new Book("Антон Павлович Чехов", "Попрыгунья", 1891),
                new Book("Виктор Гюго", "Человек, который смеётся", 1860),
                new Book("Виктор Гюго", "Собор Парижской Богоматери", 1831),
                new Book("Виктор Гюго", "Отверженные", 1862),
                new Book("Эрнест Хемингуэй", "По ком звонит колокол", 1940),
                new Book("Эрнест Хемингуэй", "Снега Килиманджаро", 1936),
                new Book("Александр Сергеевич Пушкин", "Руслан и Людмила", 1820),
                new Book("Александр Сергеевич Пушкин", "Медный всадник", 1833),
                new Book("Александр Сергеевич Пушкин", "Борис Годунов", 1825)));
        library.setAllReader(Arrays.asList(
                new Reader("Вася", new Email("vasia@mail.ru"), true,
                        new Book("Александр Сергеевич Пушкин", "Борис Годунов", 1825),
                        new Book("Александр Сергеевич Пушкин", "Медный всадник", 1833)),
                new Reader("Олег", new Email("oleg@mail.ru"), false,
                        new Book("Антон Павлович Чехов", "Вишнёвый сад", 1901),
                        new Book("Антон Павлович Чехов", "Попрыгунья", 1891),
                        new Book("Эрнест Хемингуэй", "По ком звонит колокол", 1940)),
                new Reader("Петя", new Email("petia@mail.ru"), true,
                        new Book("Виктор Гюго", "Отверженные", 1862),
                        new Book("Эрнест Хемингуэй", "По ком звонит колокол", 1940)),
                new Reader("Иван", new Email("ivan@mail.ru"), false)));

        //  Получить список всех книг библиотеки, отсортированных по году издания.
        {
            Stream<Book> stream = library.getAllBooks().stream();
            stream.sorted(Comparator.comparingInt(Book::getYearOfPublishing)).forEach(System.out::println);
        }
// Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
// При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
        {
            Stream<Reader> stream = library.getAllReader().stream();
            List<Email> mailingList = stream.map((Reader::getEmail))
                    .collect(Collectors.toList());
            System.out.println(mailingList);
        }
//         Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
//                      Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
        {

            Stream<Reader> stream = library.getAllReader().stream();
            List<Reader> mailingList = stream.filter((Reader::isMailAgreement))
                    .filter(x -> x.getListTakeBooks().size() > 1).toList();
            System.out.println(mailingList.size());

        }
//         Получить список всех книг, взятых читателями.
//             Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
        {

            Stream<Reader> stream = library.getAllReader().stream();
            Set<Book> books = stream.flatMap(x -> x.getListTakeBooks().stream())
                    .collect(Collectors.toSet());
            System.out.println(books.size());

        }
//        Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина Александра Сергеевича.

        Stream<Reader> stream = library.getAllReader().stream();
        System.out.println(stream.flatMap(x -> x.getListTakeBooks().stream())
                .anyMatch(x -> x.getAuthor().equals("Александр Сергеевич Пушкин")));

        {

        }
    }
}
