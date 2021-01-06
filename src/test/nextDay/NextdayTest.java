package test.nextDay;

import static org.junit.Assert.*;

import org.junit.Test;

public class NextdayTest {
    Date date1 = new Date(8, 20, 2020);
    Date result1 = new Date(8, 21, 2020);

    //    Date date2 = new Date(8,32,2020);
//    Date result2 = new Date(8,33,2020);
    @Test
    public void test() {
        Nextday n = new Nextday();
        assertEquals(result1, n.nextDay(date1));
//        assertEquals(result2,n.nextDay(date2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        Date date2 = new Date(8, 32, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        Date date2 = new Date(1, 32, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test4() {
        Date date2 = new Date(2, 30, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test5() {
        Date date2 = new Date(3, 32, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test6() {
        Date date2 = new Date(4, 31, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test7() {
        Date date2 = new Date(4, 31, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test8() {
        Date date2 = new Date(5, 32, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test9() {
        Date date2 = new Date(6, 31, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test10() {
        Date date2 = new Date(7, 32, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test11() {
        Date date2 = new Date(8, 32, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test12() {
        Date date2 = new Date(9, 31, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test13() {
        Date date2 = new Date(10, 32, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test14() {
        Date date2 = new Date(11, 31, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test15() {
        Date date2 = new Date(12, 31, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }
    @Test
    public void test16(){
        Date date1 = new Date(1, 31, 2020);
        Date result1 = new Date(2, 1, 2020);
        Nextday n = new Nextday();
        assertEquals(result1, n.nextDay(date1));
    }

    @Test
    public void Test17(){
        Date date1 = new Date(12, 31, 2020);
        Date result1 = new Date(1, 1, 2021);
        Nextday n = new Nextday();
        assertEquals(result1, n.nextDay(date1));

    }

    @Test
    public void Test18(){
        Date date1 = new Date(2, 28, 2020);
        Date result1 = new Date(2, 29, 2021);
        Nextday n = new Nextday();
        assertEquals(result1, n.nextDay(date1));

    }

    @Test
    public void Test19(){
        Date date1 = new Date(2, 28, 2020);
        Date result1 = new Date(2, 29, 2021);
        Nextday n = new Nextday();
        assertEquals(result1, n.nextDay(date1));

    }

    @Test(expected = IllegalArgumentException.class)
    public void test20() {
        Date date2 = new Date(13, 30, 2020);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test21() {
        Date date2 = new Date(13, 30, 0000);
        Nextday n = new Nextday();
        Date date = n.nextDay(date2);
    }

    @Test
    public void Test22(){
        Date date1 = new Date(2, 28, 2021);
        Date result1 = new Date(3, 1, 2021);
        Nextday n = new Nextday();
        assertEquals(result1, n.nextDay(date1));

    }









}
