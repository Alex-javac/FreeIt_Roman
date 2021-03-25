package lesson6;

import lesson6.annotation.MyService;
import lesson6.annotation.Version;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//Написать программу, которая будет анализировать присутствие аннотации над классом MyService
// и если она присутствует - создавать экземпляр этого класса,
// задавать значения его полям и вызывать метод thisClassInfo
// (использовать возможности пакета reflection).
public class Runner {
    public static void main(String[] args) {
        inspectService(MyService.class);
        inspectService(Object.class);

    }

    static void inspectService(Class<?> service) {
        try {
            Class<?> clazz = Class.forName(service.getName());
            if (service.isAnnotationPresent(Version.class)) {
                Object obj = clazz.newInstance();//создаем экземпляр класса
                System.out.println(service.getName());

                Field[] privateField = service.getDeclaredFields(); //массив полей
                Method[] privateMethod = service.getDeclaredMethods(); // массив методов

                for (Method method : privateMethod) {
                    int methodModifiers = method.getModifiers();
                    if (Modifier.isPrivate(methodModifiers)) {//проверяем если метод приватный
                        System.out.println(method.getName());
                    }
                }
                for (Field fil : privateField) {
                    int fieldModifiers = fil.getModifiers();
                    if (Modifier.isPrivate(fieldModifiers)) {//проверяем если поле приватное
                        System.out.println(fil.getName());
                    }
                }
//         Version ver = service.getAnnotation(Version.class);
//            System.out.println(ver);
            } else {
                System.out.println("Этот класс не содержит анатацию Version");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }
}
