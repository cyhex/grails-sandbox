package grails.sandbox

import grails.transaction.Transactional

@Transactional
class MyTestService {

    private String str = "lalalal";

    public String getStr() {
        return str
    }

    public void setStr(String str) {
        this.str = str
    }
}
