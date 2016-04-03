package com.rdas.dateutils;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


/**
 * Created by rdas on 03/04/2016.
 */
public class DateFormatterTest {

    private DateFormatter dateFormatter;

    @Before
    public void setUp() throws Exception {
        dateFormatter = new DateFormatter();
    }

    @Test
    public void testNotNll() {
        assertThat(dateFormatter).isNotNull();
    }

    @Test
    public void testThatDateFormatterReturnsNotNullString() {
        assertThat(dateFormatter.getFormattedCurrentDate()).isNotNull();
    }
}