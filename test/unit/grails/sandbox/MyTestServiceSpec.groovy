package grails.sandbox

import grails.test.mixin.TestFor
import org.junit.Test

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(MyTestService)
class MyTestServiceSpec extends GroovyTestCase {

    def setup() {

    }

    def cleanup() {
    }

    @Test
    public void testA() {

        assertEquals('lalalal',service.getStr())
    }
}
