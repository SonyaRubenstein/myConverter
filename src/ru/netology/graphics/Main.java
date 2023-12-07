package ru.netology.graphics;

import ru.netology.graphics.image.MyColorSchema;
import ru.netology.graphics.image.MyConverter;
import ru.netology.graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        MyConverter converter = new MyConverter(); //создала объект, как просили строкой ниже
        //можно это было сделать через конструктор, но тк в этом интерфейсе - будем использовать его
        converter.setTextColorSchema(new MyColorSchema()); //передать схему нужно

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

       //  Или то же, но с выводом на экран:
//        converter.setMaxHeight(300);
//        converter.setMaxWidth(300);
//        converter.setMaxRatio(4);
//        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
//      //  String url = "https://i.ibb.co/6DYM05G/edu0.jpg"; - ВЕРНУЛО 503-Ю ОШИБКУ. СЕРВЕР ПОЛЕГ - БЕЗУСПЕШНА ПОПЫТКА МОЯ :((
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);
    }
}
