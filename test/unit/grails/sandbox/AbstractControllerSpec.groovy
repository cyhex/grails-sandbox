package grails.sandbox

import grails.test.mixin.TestFor
import org.junit.Test

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(AbstractController)
class AbstractControllerSpec extends GroovyTestCase {

    /**
     * run as junit not grails test
     */
    @Test
    public void testIndex() {
        controller.index()
        assertEquals('xxx',response.text)
    }
}
