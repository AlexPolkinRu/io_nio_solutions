package task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.*/

public class Solution {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int data, maxByte = 0;

    public static void main(String[] args) throws Exception {
        String filename = br.readLine();

        try (FileInputStream fis = new FileInputStream(filename)) {
            while (fis.available() > 0) {
                data = fis.read();
                if (maxByte < data)
                    maxByte = data;
            }
        }

        System.out.println(maxByte);
    }
}
