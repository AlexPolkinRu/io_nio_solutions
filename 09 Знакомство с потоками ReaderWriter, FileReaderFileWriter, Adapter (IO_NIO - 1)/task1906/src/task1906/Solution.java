package task1906;

import java.io.*;

/* 
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод


Requirements:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна записывать во второй файл все символы из первого файла с четным порядковым номером (используй FileWriter).
6. Поток записи в файл (FileWriter) должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filenameInput = br.readLine();
        String filenameOutput = br.readLine();
        try (BufferedReader bfr = new BufferedReader(new FileReader(filenameInput));
            BufferedWriter bfw = new BufferedWriter(new FileWriter(filenameOutput))
        ) {
            boolean even = false;
            int currentByte;
            while (bfr.ready()) {
                currentByte = bfr.read();
                if (even)
                    bfw.write(currentByte);
                even = !even;
            }
        }
        br.close();
    }
}
