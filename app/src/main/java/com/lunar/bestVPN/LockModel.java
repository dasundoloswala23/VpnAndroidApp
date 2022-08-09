package com.lunar.bestVPN;

public class LockModel {

    private boolean lock;

    public LockModel() {
        lock = false;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }
}
