package ru.tinkoff.edu.java.parser.links.impl;

import ru.tinkoff.edu.java.parser.links.Links;

import java.util.Objects;

public class StackOverflowLinks extends Links {
    private String userId;

    @Override
    public Links check(String link) {
        String[] splitLink = link.split("/");
        if (splitLink[2].equals("stackoverflow.com") && splitLink.length > 4 && splitLink[3].equals("questions")) {
            userId = splitLink[4];
            return this;
        }
        return checkNext(link);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StackOverflowLinks that = (StackOverflowLinks) o;
        return Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return userId;
    }
}