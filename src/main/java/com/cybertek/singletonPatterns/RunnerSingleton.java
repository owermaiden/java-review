package com.cybertek.singletonPatterns;

public class RunnerSingleton {

    public static void main(String[] args) {

        new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    Thread.sleep(1);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Hash code of Lazy " + LazyCache.getInstance().hashCode());
                System.out.println("Hash code of Eager " + EagerCache.getInstance().hashCode());
                System.out.println("Hash code of Enum " + CacheSingleton.INSTANCE.hashCode());

            }
        }).start();

        new Thread(() -> {

            System.out.println("Hash code of Lazy " + LazyCache.getInstance().hashCode());
            System.out.println("Hash code of Eager " + EagerCache.getInstance().hashCode());
            System.out.println("Hash code of Enum " + CacheSingleton.INSTANCE.hashCode());

        }).start();
    }

}
