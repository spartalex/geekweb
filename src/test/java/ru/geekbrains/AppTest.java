package ru.geekbrains;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

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
