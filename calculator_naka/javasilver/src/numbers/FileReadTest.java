package numbers;

import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("nonexistentfile.txt")){
        		System.out.println("完了しました");
            // 他のファイル読み取り処理
        } catch (IOException e) {
            System.out.println("I/Oエラーが発生しました: " + e.getMessage());
        }
    }
}