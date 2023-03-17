package ru.tinkoff.edu.java.parser;

import ru.tinkoff.edu.java.parser.links.Links;
import ru.tinkoff.edu.java.parser.links.impl.GitHubLinks;
import ru.tinkoff.edu.java.parser.links.impl.StackOverflowLinks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class LinkParserApplication {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Parser parser;

    private static void init() {
        parser = new Parser();
        Links supportedLinks = Links.link(
                new GitHubLinks(),
                new StackOverflowLinks());
        parser.setLinks(supportedLinks);
    }

    public static void main(String[] args) throws IOException {
        init();
        String input;

        while (true) {
            System.out.print("Enter link: ");
            input = reader.readLine();
            if (Objects.equals(input, "exit")) {
                break;
            }
            Links links = parser.checkLink(input);
            System.out.println(links == null ? null : links.toString());
        }
    }
}