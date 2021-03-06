package com.dumb.adminpanel_alim.models;

public class model_answers_to_user {
    String answerby,question,answer;

    public model_answers_to_user(String answerby, String question, String answer) {
        this.answerby = answerby;
        this.question = question;
        this.answer = answer;
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
