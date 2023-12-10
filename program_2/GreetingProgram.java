import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // スキャナーを使ってユーザーからの入力を取得
        Scanner scanner = new Scanner(System.in);

        // ユーザーに名前を尋ねる
        System.out.print("あなたの名前は何ですか？ ");
        String userName = scanner.nextLine();

        // あいさつメッセージを表示
        System.out.println("こんにちは、" + userName + "さん！");

        // スキャナーを閉じる
        scanner.close();
    }
}

