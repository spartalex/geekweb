package ru.geekbrains;

import static org.junit.Assert.assertTrue;

import okhttp3.OkHttpClient;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        OkHttpClient okHttpClient = new OkHttpClient();
        System.out.println("test1");
    }

    @Test
    public void shouldAnswerWithTrue2()
    {
        System.out.println("test2");
    }
}
