
package com.example.tp;

public class FileSystem {

    private FsItem[] items;
    private int count;

    public FileSystem() {
        items = new FsItem[4];
        count = 0;
    }

    public void addRoot(FsItem item) {

        if (count == items.length) {

            FsItem[] largerArray = new FsItem[items.length * 2];

            for (int i = 0; i < count; i++) {
                largerArray[i] = items[i];
            }

            items = largerArray;
        }

        items[count] = item;
        count++;
    }

    public void listAll() {

        for (int i = 0; i < count; i++) {

            FsItem element = items[i];

            if (element instanceof Directory) {
                ((Directory) element).list(0);
            } else {
                System.out.println(element);
            }
        }
    }

    public long totalSize() {

        long total = 0;

        for (int i = 0; i < count; i++) {
            total += items[i].getSize();
        }

        return total;
    }
}
