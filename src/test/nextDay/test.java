package test.nextDay;

/**
 *
 */


import static org.junit.Assert.*;

import org.junit.Test;

public class test {

    //有效等价类
    Date nd1 = new Date(5, 14, 2014);
    Date d1 = new Date(5, 13, 2014);


//            //为负日期
//            //Date nd2 = new Date(5, 0, 2014);
//            //Date d2 = new Date(5, -1, 2014);
//        　　
//        　　    //为零日期
//        　　    //Date nd3 = new Date(5, 1, 2014);
//        　　    //Date d3 = new Date(5, 0, 2014);
//        　　
//        　　    //31号
//        　　    Date nd4 = new Date(8, 31, 2015);
//　　    Date d4 = new Date(8, 30, 2015);
//　　
//        　　    Date nd5 = new Date(7, 31, 2014);
//　　    Date d5 = new Date(7, 30, 2014);
//　　
//        　　    Date nd6 = new Date(7, 1, 2013);
//　　    Date d6 = new Date(6, 30, 2013);
//　　
//        　　    //闰年
//        　　    Date nd7 = new Date(3, 1, 2004);
//　　    Date d7 = new Date(2, 29, 2004);
//　　
//        　　    Date nd8 = new Date(2, 29, 2004);
//　　    Date d8 = new Date(2, 28, 2004);
//　　
//        　　    //400年是闰年
//        　　    Date nd9 = new Date(3, 1, 2000);
//　　    Date d9 = new Date(2, 29, 2000);
//　　
//        　　    Date nd10 = new Date(3, 1, 2013);
//　　    Date d10 = new Date(2, 28, 2013);
//　　
//        　　    //被4整除，不被100整除
//        　　    Date nd11 = new Date(3, 1, 2100);
//　　    Date d11 = new Date(2, 28, 2100);
//　　
//        　　    //到第二年
//        　　    Date nd12 = new Date(1, 1, 2014);
//　　    Date d12 = new Date(12, 31, 2013);
//　　
//        　　    //下一个月
//        　　    Date nd13 = new Date(1, 31, 2013);
//　　    Date d13 = new Date(1, 30, 2013);
//　　
//        　　    Date nd14 = new Date(2, 1, 2013);
//　　    Date d14 = new Date(1, 31, 2013);
//　　
//        　　    Date nd15 = new Date(4, 1, 2014);
//　　    Date d15 = new Date(3, 31, 2014);
//　　
//        　　    Date nd16 = new Date(5, 1, 2014);
//　　    Date d16 = new Date(4, 30, 2014);
//
//　　    Date nd17 = new Date(6, 1, 2014);
//　　    Date d17 = new Date(5, 31, 2014);
//
//　　    Date nd18 = new Date(7, 1, 2014);
//　　    Date d18 = new Date(6, 30, 2014);
//　　

    @Test
    public void test() {
        Nextday n = new Nextday();

        assertEquals(nd1, n.nextDay(d1));
    }

}