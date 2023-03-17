package ru.tinkoff.edu.java.parser.links;

public abstract class Links {
    private Links next;

    public static Links link(Links first, Links... chain) {
        Links head = first;
        for (Links nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract Links check(String link);

    protected Links checkNext(String link) {
        if (next == null) {
            return null;
        }
        return next.check(link);
    }
}
