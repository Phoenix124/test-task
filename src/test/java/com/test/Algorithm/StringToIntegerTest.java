package com.test.Algorithm;

import org.junit.Assert;
import org.junit.Test;

public class StringToIntegerTest {

    @Test
    public void testParseIntegerWithOneDigit() {
        Assert.assertEquals(3, StringToInteger.stringToInteger("3"));
        Assert.assertEquals(1, StringToInteger.stringToInteger("1"));
    }

    @Test
    public void testParseInteger() {
        Assert.assertEquals(123, StringToInteger.stringToInteger("123"));
        Assert.assertEquals(1, StringToInteger.stringToInteger("1"));
    }

    @Test
    public void testParseNegativeInteger() {
        Assert.assertEquals(-2147483648, StringToInteger.stringToInteger("-91283472332"));
        Assert.assertEquals(-98745, StringToInteger.stringToInteger("-98745"));
        Assert.assertEquals(-42, StringToInteger.stringToInteger("   -42"));
    }

    @Test
    public void testParseIntegerWithWords() {
        Assert.assertEquals(4193, StringToInteger.stringToInteger("4193 with words"));
        Assert.assertEquals(0, StringToInteger.stringToInteger("words and 987"));
    }
}