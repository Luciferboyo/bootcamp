package demoThread.src;



public class StringBuilderDemo {
  public static void main(String[] args) {
        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    stringBuilder.append("a");
                }
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("StringBuilder length: " + stringBuilder.length());

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    stringBuffer.append("a");
                }
            }).start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("StringBuffer length: " + stringBuffer.length());
  }
}
