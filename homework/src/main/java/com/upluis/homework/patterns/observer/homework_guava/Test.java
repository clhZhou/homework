package com.upluis.homework.patterns.observer.homework_guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by Luis.
 */
public class Test {
    public static void main(String[] args) {

        EventBus eventBus = new EventBus();

        Question question = new Question();
        question.setUserName("搞事");
        question.setContent("提出了一个关于人生的问题");

        eventBus.register(new Teacher("Luis"));

        eventBus.post(question);

    }
}
