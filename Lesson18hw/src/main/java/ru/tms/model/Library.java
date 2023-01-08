package ru.tms.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Library {
    private List<Book> allBooks = new ArrayList<>();

    private List<Reader> allReader = new ArrayList<>();


}
