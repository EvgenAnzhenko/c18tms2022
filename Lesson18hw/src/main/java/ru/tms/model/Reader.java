package ru.tms.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ToString
@Getter
public class Reader {
    private String name;
    private Email email;
    private boolean mailAgreement;
    private List<Book> listTakeBooks = new ArrayList<>();

    public Reader(String name, Email email, boolean mailAgreement, Book... books) {
        this.name = name;
        this.email = email;
        this.mailAgreement = mailAgreement;
        listTakeBooks.addAll(Arrays.asList(books));

    }

}
