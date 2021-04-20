package com.rakovets.course.java.core.practice.jcf_list.comporator;

import com.rakovets.course.java.core.practice.jcf_list.model.Actor;

import java.util.Comparator;

public class ActorsLastNameComporator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
