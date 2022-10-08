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

public class MainOperationsMethods {
    public static void main(String[] args) {

        long longValue = 58;
        int intValue = 29;
        byte byteValue = 89;
        short shortValue = 130;
        float floatValue = 188.98F;
        double doubleValue = 348.98;

        ByteShort(byteValue, shortValue);
        LongInt(longValue, intValue);
        FloatDouble(floatValue, doubleValue);
        IntDouble(intValue, doubleValue);
    }
        public static void ByteShort(byte byteValue, short shortValue){
        System.out.println(byteValue + shortValue);
        }

        public static void LongInt(long longValue, int intValue){
            System.out.println(longValue + intValue);
        }

        public static void FloatDouble(float floatValue, double doubleValue){
            System.out.println(floatValue + doubleValue);
        }

        public static void IntDouble(int intValue, double doubleValue){
            System.out.println(intValue + doubleValue);
        }
}
