package com.gmail.lev.romanenko.data.line;

import com.gmail.lev.romanenko.data.constituents.Question;
import com.gmail.lev.romanenko.data.constituents.Response;
import com.gmail.lev.romanenko.data.constituents.Service;

public abstract class Line {
    private Service service;
    private Question questionType;
    private Response responseType;

    public Line(Service service, Question questionType, Response responseType) {
        this.service = service;
        this.questionType = questionType;
        this.responseType = responseType;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Question getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Question questionType) {
        this.questionType = questionType;
    }

    public Response getResponseType() {
        return responseType;
    }

    public void setResponseType(Response responseType) {
        this.responseType = responseType;
    }
}
