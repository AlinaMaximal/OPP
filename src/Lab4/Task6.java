package Lab4;

public class Task6 {

        public static void printNumber() {
            int num = 10; // локальна змінна
            System.out.println("Значення num у методі printNumber(): " + num);
        }

        public static void main(String[] args) {

            printNumber();


        }
    }

/*
ЧОМУ НЕ ПРАЦЮЄ:
Змінна 'num' оголошена всередині методу printNumber(), тому вона є локальною.
Локальні змінні існують лише в межах того методу (або блоку коду), де вони оголошені.
Метод main() не "бачить" змінну num, тому виникає помилка компіляції:
"cannot find symbol".
*/






