package com.example.main;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by ksenya on 18.06.16.
 */

public class CustomCollection implements Iterable<Integer> {
    private int start, end;

    public CustomCollection(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    private class RangeIterator implements
            Iterator<Integer> {
        private int cursor;

        public RangeIterator() {
            this.cursor = CustomCollection.this.start;
        }

        public boolean hasNext() {
            return this.cursor < CustomCollection.this.end;
        }

        public Integer next() {
            if (this.hasNext()) {
                int current = cursor;
                cursor++;
                return current;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    public String name;
}

