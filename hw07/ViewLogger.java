// Вывод на консоль
public class ViewLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
