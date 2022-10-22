package com.doze.List.ArrayList.GenericParadigm.day01;

public class Stu<T> {

    private T t;

    public Stu(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "t=" + t +
                '}';
    }
}
