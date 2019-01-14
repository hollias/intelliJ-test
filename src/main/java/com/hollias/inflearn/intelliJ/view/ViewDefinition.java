package com.hollias.inflearn.intelliJ.view;

public class ViewDefinition {
    public void viewDefinition(){
        EmailSender emailSender = new EmailSender(1L,"hollias","holllias@tomatosystem.co.kr");
        emailSender.send("hollias@tomatosystem.co.kr");
    }
}
