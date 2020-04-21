package com.example.whowroteit;

import android.os.SystemClock;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test(){
       // double result = 3.1 + 5.2;
        double result = 2. + 2.;
       // assertThat(result, is(equalTo(2.865)));
        assertThat(result, is(equalTo(4.)));
        SystemClock.elapsedRealtime();
    }
}