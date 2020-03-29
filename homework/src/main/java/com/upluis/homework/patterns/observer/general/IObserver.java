package com.upluis.homework.patterns.observer.general;

//抽象观察者
public interface IObserver<E> {
    void update(E event);
}