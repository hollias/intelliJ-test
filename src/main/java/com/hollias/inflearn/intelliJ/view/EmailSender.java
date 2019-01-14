package com.hollias.inflearn.intelliJ.view;

public class EmailSender {
    private Long id;
    private String name;
    private String email;

    public EmailSender(Long id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static void receive(String from, String to){
        System.out.println(from + "님으로부터" + to + "님이 메일을 받았습니다");
    }

    public static void send(String to){
        System.out.println(to + "님이 메일을 보냈습니다.");
    }
}
