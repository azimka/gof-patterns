package com.azimka.structural.facade.service.authorservice;

import com.azimka.structural.facade.model.Author;

public class AuthorService {

    public void writeBook(Author author) {
        System.out.println(String.format("%s %s wrote a new book", author.getFirstName(), author.getLastName()));
    }

    public void meetWithCustomers(Author author) {
        System.out.println(String.format("%s %s met with fans", author.getFirstName(), author.getLastName()));
    }

    public void greetingFans(Author author) {
        System.out.println(String.format("%s %s greet his fans", author.getFirstName(), author.getLastName()));
    }
}
