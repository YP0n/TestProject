public class NerworkUtils {
    public static void getConnection() {
        //получаем соедю с сервером
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
