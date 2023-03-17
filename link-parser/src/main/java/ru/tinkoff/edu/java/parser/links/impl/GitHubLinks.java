package ru.tinkoff.edu.java.parser.links.impl;

import ru.tinkoff.edu.java.parser.links.Links;

import java.util.Objects;

public class GitHubLinks extends Links {
    private String userName;
    private String repository;

    @Override
    public Links check(String link) {
        String[] splitLink = link.split("/");
        if (splitLink[2].equals("github.com") && splitLink.length > 4) {
            userName = splitLink[3];
            repository = splitLink[4];
            return this;
        }
        return checkNext(link);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitHubLinks that = (GitHubLinks) o;
        return Objects.equals(userName, that.userName) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, repository);
    }

    @Override
    public String toString() {
        return userName + '/' + repository;
    }
}
