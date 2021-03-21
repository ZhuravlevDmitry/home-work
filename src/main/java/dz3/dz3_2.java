/*
 * Журавлев Дмитрий
 * Д/З № 3
 */
package dz3;
import java.util.Scanner;

public class dz3_2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 2.");
        System.out.println("Ваша задача угадать загаданное слово из представленных:");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        for (int i = 0; i < words.length; i++) {
            System.out.print((words[i]) + "; ");
            if (i == 11) System.out.println();
        }
        int indexAnswer;
        indexAnswer = (int) (Math.random() * words.length);
        System.out.println("\n" + (words[indexAnswer]));
        System.out.println("\nВведите ответ: ");
        String userWord = sc.nextLine();
        userWord = userWord.toLowerCase();
        //System.out.println(userWord);
        game2(words[indexAnswer], userWord);
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его
        //с загаданным словом и сообщает, правильно ли ответил пользователь.
        // Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно можно пользоваться:
        //String str = "apple";
        //char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово.
        //Используем только маленькие буквы.
    }
    private static void game2(String correctAnswer, String userAnswer) {
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Вы Угадали!!!");
                break;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < correctAnswer.length() & i < userAnswer.length()) {
                        if (correctAnswer.charAt(i) == userAnswer.charAt(i)) {
                            System.out.print(correctAnswer.charAt(i));
                        } else System.out.print("#");
                    } else System.out.print("#");
                }
                System.out.println("\nВведите новый ответ: ");
                userAnswer = sc1.nextLine();
                userAnswer = userAnswer.toLowerCase();
                System.out.println(userAnswer);
            }
        }
    }
}

