package ru.tinkoff.edu.java.parser;

import ru.tinkoff.edu.java.parser.links.Links;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Parser {
    private Links links;

    public void setLinks(Links links) {
        this.links = links;
    }

    public Links checkLink(String link) {
        if (!isValidUrl(link)) {
            return null;
        }
        return links.check(link);
    }

    private boolean isValidUrl(String url) {
        try {
            new URL(url).toURI();
            return true;
        } catch (MalformedURLException | URISyntaxException e) {
            return false;
        }
    }
}