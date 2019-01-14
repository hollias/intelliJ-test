package com.hollias.inflearn.intelliJ.editor;

import java.util.List;

public class Method {


    private void loopAuthors(Book book) {
        for (String s :
                book.getAuthors()) {
            print(s);
        }
    }

    private void print(String s) {
        if ("hollias".equals(s)) {
            System.out.println("담당자가 맞습니다.");
        }
    }


    public static class Book{
        private String title;
        private long price;
        private List<String> authors;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public long getPrice() {
            return price;
        }

        public void setPrice(long price) {
            this.price = price;
        }

        public List<String> getAuthors() {
            return authors;
        }

        public void setAuthors(List<String> authors) {
            this.authors = authors;
        }
    }
}
