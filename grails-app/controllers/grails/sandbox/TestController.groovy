package grails.sandbox

import org.springframework.beans.factory.annotation.Autowired

class TestController extends AbstractController {


    @Autowired
    MyTestService t;

    def index() {
        render t.getStr()
    }
}
