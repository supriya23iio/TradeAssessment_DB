package com.db.tradestorage.exception;

public class InvalidTradeException extends RuntimeException {

    private final String id;

    public InvalidTradeException(final String id) {
        super("Invalid Tradegiven: " + id);
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
