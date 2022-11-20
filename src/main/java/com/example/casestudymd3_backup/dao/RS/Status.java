package com.example.casestudymd3_backup.dao.RS;

public enum Status {
    ACTIVE(1),
    BLOCKED(0);

    private final int status;

    Status(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}

