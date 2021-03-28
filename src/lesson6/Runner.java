package lesson6;

import lesson6.annotation.MyService;
import lesson6.annotation.Version;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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

    public static void inspectService(Class<?> service) {
        try {
            Class<?> clazz = Class.forName(service.getName());
            if (service.isAnnotationPresent(Version.class)) {//проверяем помечен ли класс анотацией
                Object obj = clazz.newInstance();//создаем экземпляр класса

                System.out.println("Полное имя класса: " + service.getName());
                Version ver = service.getAnnotation(Version.class);
                System.out.println("Аннотация: " + ver);
                //передаём в методы класс и его экземпляр
                methods(service, obj);
                fields(service, obj);
                methods(service, obj);

            } else {
                System.out.println("Этот класс не содержит анатацию Version");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException exception) {
            exception.printStackTrace();
        }
    }

    private static void methods(Class<?> service, Object obj) throws InvocationTargetException, IllegalAccessException {

        Method[] privateMethod = service.getDeclaredMethods(); // массив методов
        for (Method method : privateMethod) {
            int methodModifiers = method.getModifiers();
            if (Modifier.isPrivate(methodModifiers)) {//проверяем если метод приватный
                method.setAccessible(true);//отключает проверку доступа для указанного метода
                method.invoke(obj, null);//вызываем метод у обьекта obj

                System.out.println("Приватный метод: " + method.getName());
            }
        }
    }

    private static void fields(Class<?> service, Object obj) throws IllegalAccessException {
        Field[] privateField = service.getDeclaredFields(); //массив полей

        for (Field fil : privateField) {
            int fieldModifiers = fil.getModifiers();
            if (Modifier.isPrivate(fieldModifiers)) {//проверяем если поле приватное
                System.out.println("Приватное поле: " + fil.getType().getTypeName() + " " + fil.getName());
                fil.setAccessible(true);//отключает проверку доступа для указанного поля
                switch (fil.getType().getTypeName()) {//проверяем тип поля
                    case "java.lang.String":
                        fil.set(obj, "Jacket");
                        break;
                    case "int":
                        fil.set(obj, 30);
                        break;
                    case "boolean":
                        fil.set(obj, true);
                        break;
//если есть другие типы данных укзываем в кейсах

                }
            }
        }
    }
}
