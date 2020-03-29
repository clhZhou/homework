package com.upluis.homework.patterns.observer.homework_guava;

import com.google.common.eventbus.Subscribe;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Luis.
 */
public class Teacher {


    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void ToDoQuestion(Question question) {
        System.out.println("提问者：" + question.getUserName() + "\n内容：" + question.getContent() + "\n" + name + "老师，开始解答问题:˙这个问题值得思考");
    }
}
