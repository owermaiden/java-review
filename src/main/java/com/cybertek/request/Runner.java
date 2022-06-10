package com.cybertek.request;

public class Runner {

    public static void main(String[] args) {

        Header header = new Header("application_json", "raw");
        Request request = new Request(header,"body");

        System.out.println(request);
    }
}
