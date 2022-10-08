package ua.com.toryhel.primitives;
/**
1.
        Создать проект, имя проекта primitives
        В методе main создать все типы примитивных переменных
        Инициализировать их значениями
        Все значения вывести на экран

        2.
        Создать проект, имя operations
        В методы main создать все численные переменные
        Инициализировать их начальными значениями
        Провести математические операции над ними (не только с одниковыми, но и например int + long и тд)
        Создать переменные под результаты операций
        Результаты вывести в консоль

        *3.
        Повторить задание 2, но все математические операции выполнять в отделных, разных методах.
*/
public class MainOperations {
    public static void main(String[] args) {
        long longValue = 58;
        int intValue = 29;
        byte byteValue = 89;
        short shortValue = 130;
        float floatValue = 188.98F;
        double doubleValue = 348.98;

        int result1 = byteValue + shortValue;
        long result2 = longValue + intValue;
        double result3 = floatValue + doubleValue;
        double result4 = intValue + doubleValue;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

}
