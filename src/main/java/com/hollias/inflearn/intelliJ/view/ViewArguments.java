package com.hollias.inflearn.intelliJ.view;

import java.util.ArrayList;
import java.util.List;

public class ViewArguments {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender(1L,"String","emailaldflakjfd");

        emailSender.receive("fromemail","toemail");
    }


}
