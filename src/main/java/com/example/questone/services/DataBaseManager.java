package com.example.questone.services;

import com.example.questone.model.Data_base;

public class DataBaseManager {

    public String question;

    public String answer1;

    public String answer2;

    public String fail;

    public DataBaseManager(String fail) {
        this.fail = fail;
    }


    public DataBaseManager(String question, String answer1, String answer2) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    public DataBaseManager() {
    }

    public static DataBaseManager getDatabaseManager(int counter, int param){
        Data_base dataBase = new Data_base();
        if(counter == 0){
            String question = dataBase.getQuestions().get(0);
            String answer1 = dataBase.getAnwsers().get(0);
            String answer2 = dataBase.getAnwsers().get(1);
            return new  DataBaseManager(question, answer1, answer2 );
        } else if(param == 1 && counter == 1){
            String question = dataBase.getQuestions().get(1);
            String answer1 = dataBase.getAnwsers().get(2);
            String answer2 = dataBase.getAnwsers().get(3);
            return new  DataBaseManager(question, answer1, answer2 );
        } else if (param == 1 && counter == 2){
            String question = dataBase.getQuestions().get(2);
            String answer1 = dataBase.getAnwsers().get(4);
            String answer2 = dataBase.getAnwsers().get(5);
            return new  DataBaseManager(question, answer1, answer2 );
        } else if (param == 2 && counter == 1){
            String fail = dataBase.getFail().get(0);
            return new DataBaseManager(fail);
        } else if (param == 2 && counter == 2){
            String fail = dataBase.getFail().get(1);
            return new DataBaseManager(fail);
        } else if (param == 2 && counter == 3){
            String fail = dataBase.getFail().get(2);
            return new DataBaseManager(fail);
        }
        return new  DataBaseManager();
    }


}
