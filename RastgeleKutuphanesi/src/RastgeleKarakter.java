/**
 *
 * @author Erdem ahmet çelik --- mail=>erdem.celik@ogr.sakarya.edu.tr
 * @since 13.03.2019
 * <p>
 * That's it!
 * </p>
 */
public class RastgeleKarakter {

    //parametreli metod 
    public char[] createChar(int number) {

        char[] characters = new char[number];
        if (number > 0) {
            int flag = 0;
            while (flag < number) {
                characters[flag] = createChar();
                flag++;
            }
        } else {
            System.out.println("Lütfen 0'dan büyük bir sayı giriniz!");
        }

        return characters;
    }

    //overloading
    public char createChar() {
        long time = System.nanoTime();//fonksiyonun çağrıldığı andaki zaman
        if (time % 2 == 0) {//büyük harfler için
            time = time % 26 + 65;
        } else {//küçük harfler için
            time = time % 26 + 97;
        }
        return (char) time;
    }

    public char[] givenChars(int amount, char a, char b) {
        char[] characters = new char[amount];
        try {
            if (amount > 0) {
                long time = System.nanoTime();

                int first = (int) a + 1;
                int second = (int) b;

                int flag = 0;

                while (flag < amount) {
                    if (first > 64 && first < 91) {//son karakterleri almıyoruz
                        time = time % (second - first) + (first);//büyük harfler için                
                        characters[flag] = (char) time;
                    } else if (first > 96 && first < 123) {
                        time = time % (second - first) + (first);//küçük harfler için                
                        characters[flag] = (char) time;
                    } else if ((first - 1) == second) {
                        System.out.println("Lütfen farklı harfler giriniz!");
                    } else {
                        System.out.println("Karakterleriniz ASCİİ içinde yer almıyor!");
                    }

                    flag++;
                }

            } else {
                System.out.println("Lütfen adet miktarını 0'dan büyük giriniz!");
            }
        } catch (Exception e) {
            System.out.println("Lütfen değerleri iki harf arasında en az bir harf olacak şekilde giriniz!");
        }

        return characters;
    }

    public char[] decleratedChars(int amount, char[] array) {
        char[] characters = new char[amount];

        if (amount > 0) {
            for (int i = 0; i < amount; i++) {
                long time = System.nanoTime();
                time = time % array.length;
                characters[i] = array[(int) time];
            }
        } else {
            System.out.println("Lütfen miktarı 0'dan büyük olacak şekilde giriniz");
        }

        return characters;
    }

    public void createSentence(int numberOfWords) {
        if (numberOfWords > 0) {
            for (int i = 0; i < numberOfWords; i++) {
                System.out.print(createChar((int) (System.nanoTime() % 10 + 2)));
                System.out.print(" ");
            }
        } else {
            System.out.println("Kelime sayısı 0'dan büyük olmalıdır!");
        }
    }
}
