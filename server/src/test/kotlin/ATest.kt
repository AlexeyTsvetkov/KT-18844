package foo

import org.junit.Assert
import org.junit.Test

class ATest {
    @Test
    fun testASimple() {
        val a = A(10)
        Assert.assertEquals(10, a.x)
    }
}