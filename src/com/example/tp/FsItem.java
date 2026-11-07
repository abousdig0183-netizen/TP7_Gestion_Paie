
package com.example.tp;

public abstract class FsItem {

    protected String name;

    public FsItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract long getSize();

    @Override
    public String toString() {
        return String.format("%s (%d B)", name, getSize());
    }
}
