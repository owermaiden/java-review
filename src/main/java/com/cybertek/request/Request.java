package com.cybertek.request;

public class Request {

    public Header header;
    public String Body;

    public Request(Header header, String body) {
        this.header = header;
        Body = body;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    @Override
    public String toString() {
        return new com.google.gson.Gson().toJson(this);
    }
}
