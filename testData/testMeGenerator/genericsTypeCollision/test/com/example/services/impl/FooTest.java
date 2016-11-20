package com.example.services.impl;

import com.example.warriers.FooFighter;
import com.example.util.List;
import com.example.hole.Fire;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** created by TestMe integration test on MMXVI */
public class FooTest {
    @Mock
    private FooFighter fooFighter;
    @InjectMocks
    private Foo foo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFight() throws Exception {
        List<Fire> result = foo.fight(new ArrayList<com.example.foes.Fire>());
        Assert.assertEquals(new List<Fire>(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://github.com/yaronyam/testme-intellij/issues