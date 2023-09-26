package com.example.questone.model;

import java.awt.geom.QuadCurve2D;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Data_base {

    private final List<String> questions = Arrays.asList(
            "Ты потерял память. Принять вызов НЛО?",
            "Ты приинял вызов. Поднимишся на мостик к капитану?",
            "Ты поднялся на мостик к капитану. Ты кто?");
    private final List<String> anwsers = Arrays.asList(
            "Принять вызов",
            "Отклонить вызов",
            "Поднятся на мостик.",
            "Отказаться подниматся на мостик.",
            "Рассказать правду о себе.",
            "Солгать о себе.");

    private final List<String> fail = Arrays.asList(
            "Ты отклонил вызов.",
            "Ты не пошел на переговоры.",
            "Твою ложь разоблачили.");

    public Data_base() {
    }

    public List<String> getQuestions() {
        return questions;
    }

    public List<String> getAnwsers() {
        return anwsers;
    }

    public List<String> getFail() {
        return fail;
    }
}
