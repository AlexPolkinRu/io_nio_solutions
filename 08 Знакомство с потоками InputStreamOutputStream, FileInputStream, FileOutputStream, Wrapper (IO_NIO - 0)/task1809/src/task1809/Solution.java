package task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.*/

public class Solution {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final List<Integer> bytes = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        String filenameInput = br.readLine();
        String filenameOutput = br.readLine();

        try (
                FileInputStream fis = new FileInputStream(filenameInput);
                FileOutputStream fos = new FileOutputStream(filenameOutput)
        ) {
            while (fis.available() > 0) {
                bytes.add(fis.read());
            }
            Collections.reverse(bytes);
            for (Integer b : bytes) {
                fos.write(b);
            }
        }
    }
}
