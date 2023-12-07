package ru.netology.graphics.image;

public class MyColorSchema implements TextColorSchema {

    static char[] charArray = new char[]{'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};

    @Override
    public char convert(int color) { //использовать деление по модулю (%)
        if (color > 255 || color < 0) {
            throw new IllegalArgumentException("Недопустимое значение color: " + color);
        }

        return charArray[(int) Math.floor(color / 256. * charArray.length)];

        //старое решение
//        float countSection = Math.round((float) 256 / charArray.length); //дыры в диапазонах могут быть, поэтому тип данных float
//
//        for (int i = 0; i < charArray.length; i++) {
//            if (color <= (i + 1) * countSection) {
//                return charArray[i];
//            }
//        }

 //       return charArray[charArray.length - 1]; //загоняем в последний диапазон 9 (что в него не взшло: 253,254,355
    }
}
