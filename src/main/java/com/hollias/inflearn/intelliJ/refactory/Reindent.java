package com.hollias.inflearn.intelliJ.refactory;

import com.hollias.inflearn.intelliJ.editor.Member;

import java.time.LocalDate;
import java.util.Optional;

public class Reindent {
    public void rename() {
        System.out.print(Optional.of(new Member().equals("a")));
        System.out.print(LocalDate.of(2018, 5, 14));
        System.out.print(LocalDate.of(2018, 5, 14));
        System.out.print(LocalDate.of(2018, 5, 14));
        System.out.print(LocalDate.of(2018, 5, 14));
        System.out.print(LocalDate.of(2018, 5, 14));
    }
}
