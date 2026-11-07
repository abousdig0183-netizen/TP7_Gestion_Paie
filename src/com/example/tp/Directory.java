
package com.example.tp;

public class Directory extends FsItem {

    private FsItem[] children;
    private int count;

    public Directory(String name) {
        super(name);
        children = new FsItem[4];
        count = 0;
    }

    public void add(FsItem item) {

        if (count == children.length) {

            FsItem[] expanded = new FsItem[children.length * 2];

            for (int i = 0; i < count; i++) {
                expanded[i] = children[i];
            }

            children = expanded;
        }

        children[count] = item;
        count++;
    }

    @Override
    public long getSize() {

        long directorySize = 0;

        for (int i = 0; i < count; i++) {
            directorySize += children[i].getSize();
        }

        return directorySize;
    }

    public void list(int indent) {

        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }

        System.out.println(this);

        for (int i = 0; i < count; i++) {

            FsItem child = children[i];

            if (child instanceof Directory) {
                ((Directory) child).list(indent + 1);
            } else {

                for (int j = 0; j <= indent; j++) {
                    System.out.print("  ");
                }

                System.out.println(child);
            }
        }
    }
}
