package com.jp.springbootlesson10cache.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 张俊鹏 on 4/3/2018
 */
public class HashTest {

//    lock-free
    private volatile int data;

    private synchronized void doSome(){
        Lock lock=new ReentrantLock(  );
        try{
            lock.tryLock();
        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Integer var = new Integer( 1 );
        Integer var2 = new Integer( 1 );

        System.out.println( "var.hashCode() = " + var.hashCode() );
        System.out.println( "var2.hashCode() = " + var2.hashCode() );

        System.out.println(System.identityHashCode( var ));
        System.out.println(System.identityHashCode( var2 ));

    }

}
