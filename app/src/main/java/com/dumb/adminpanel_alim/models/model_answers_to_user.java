package com.dumb.adminpanel_alim.models;

public class model_answers_to_user {
    String answerby,question,answer,question_date,answer_date;


    public model_answers_to_user(String answerby, String question, String answer, String question_date, String answer_date) {
        this.answerby = answerby;
        this.question = question;
        this.answer = answer;
        this.question_date = question_date;
        this.answer_date = answer_date;
    }


    public String getQuestion_date() {
        return question_date;
    }

    public void setQuestion_date(String question_date) {
        this.question_date = question_date;
    }

    public String getAnswer_date() {
        return answer_date;
    }

    public void setAnswer_date(String answer_date) {
        this.answer_date = answer_date;
    }

    public String getAnswerby() {
        return answerby;
    }

    public void setAnswerby(String answerby) {
        this.answerby = answerby;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
