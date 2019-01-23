package com.harium.util;

import org.junit.Assert;
import org.junit.Test;

public class SystemUtilsTest {

    @Test
    public void testInit() {
        Assert.assertFalse(SystemUtils.OS_NAME.isEmpty());
        Assert.assertFalse(SystemUtils.OS_ARCH.isEmpty());
        Assert.assertFalse(SystemUtils.OS_VERSION.isEmpty());
    }

}
