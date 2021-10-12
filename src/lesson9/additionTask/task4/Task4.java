package lesson9.additionTask.task4;

import java.io.*;

//Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
//сериализации произвести обратный процесс
public class Task4 {
    public static void main(String[] args) {
        Car car = new Car("Audi", 160, 6000);
        Car car2 = null;
//-------------------------------сериализация-----------------------------------------
        try (FileOutputStream outputStream = new FileOutputStream("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/additionTask/task4/saveCar.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(car);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//-------------------------------десериализация---------------------------------------
        try (FileInputStream fileInputStream = new FileInputStream("/home/alexander/IdeaProjects/FreeIt_Roman/src/lesson9/additionTask/task4/saveCar.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            car2 = (Car) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        car.setPrice(5000);
        System.out.println(car.toString());
        System.out.println(car2.toString());

    }
}
