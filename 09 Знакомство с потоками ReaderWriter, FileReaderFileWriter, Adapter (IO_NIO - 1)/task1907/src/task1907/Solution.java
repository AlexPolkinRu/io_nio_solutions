package task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Requirements:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int worldCounter = 0;
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filenameInput = br.readLine();
        try (BufferedReader bfr = new BufferedReader(new FileReader(filenameInput))) {
            StringBuilder sb = new StringBuilder();
            while (bfr.ready()) {
                sb.append(bfr.readLine()).append(" ");
            }
            String workString = sb.toString().replaceAll("\\p{Punct}", " ").replaceAll("\\s+", " ");

            for (String word : workString.split(" ")) {

                if (word.toLowerCase().equals("world")) {
                    worldCounter++;
                }
                System.out.println(word);
            }
        }
        System.out.println(worldCounter);
        br.close();
    }
}
