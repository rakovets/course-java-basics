package com.rakovets.course.java.core.practice.jcf.list.Studio;

import java.util.Comparator;

public class ActorsAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
