package com.dumb.adminpanel_alim.models;

public class model_answers_by_alim {
    String username,question,answer,q_time,a_time;

    public model_answers_by_alim(String username, String question, String answer, String q_time, String a_time) {
        this.username = username;
        this.question = question;
        this.answer = answer;
        this.q_time = q_time;
        this.a_time = a_time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getQ_time() {
        return q_time;
    }

    public void setQ_time(String q_time) {
        this.q_time = q_time;
    }

    public String getA_time() {
        return a_time;
    }

    public void setA_time(String a_time) {
        this.a_time = a_time;
    }
}
