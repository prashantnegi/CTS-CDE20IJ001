package com.cts.training.model;

import com.cts.training.dao.BookDAO;
import com.cts.training.dao.BookDAOImpl;
import jdk.jshell.execution.Util;
import junit.framework.TestCase;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.file.Path;
import java.time.Year;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UtilsTest {

    @Mock private Utils utils;

    @Test
    public void test_parse_library_from(){
        List<Book> expected = Arrays.asList(new Book[]
                {new Book("head First Java", 300, Topic.COMPUTING, Year.of(2019),"Head First")});

        when(utils.parseLibraryFrom(any(Path.class))).thenReturn(expected);

        assertThat(utils.parseLibraryFrom(BookDAOImpl.DEFAULT_PATH), is(equalTo(expected)));
    }

    @Test(expected = RuntimeException.class)
    public void test_get_book_return_runtimeexception(){

        when(utils.getBook(anyString())).thenThrow(RuntimeException.class);

        utils.getBook("");

//        assertThat();
    }
}