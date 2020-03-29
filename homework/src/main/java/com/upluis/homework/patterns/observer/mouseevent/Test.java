package com.upluis.homework.patterns.observer.mouseevent;


import com.upluis.homework.patterns.observer.mouseevent.handler.Mouse;
import com.upluis.homework.patterns.observer.mouseevent.handler.MouseEventLisenter;
import com.upluis.homework.patterns.observer.mouseevent.handler.MouseEventType;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        MouseEventLisenter lisenter = new MouseEventLisenter();

        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseEventType.ON_CLICK,lisenter);
        mouse.addLisenter(MouseEventType.ON_MOVE,lisenter);

        mouse.click();
        mouse.move();
    }
}
