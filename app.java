import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем максимальную громкость
        System.out.print("Введите максимальную громкость (от 50 до 70): ");
        int maxVolume = scanner.nextInt();
        while (maxVolume < 50 || maxVolume > 70) {
            System.out.println("Максимальная громкость должна быть от 50 до 70.");
            System.out.print("Введите максимальную громкость (от 50 до 70): ");
            maxVolume = scanner.nextInt();
        }

        // Создаем массив телевизоров
        Television[] televisions = new Television[10];
        for (int i = 0; i < televisions.length; i++) {
            System.out.printf("Введите данные для телевизора %d:\n", i + 1);
            System.out.print("Диагональ экрана (в дюймах): ");
            int screenSize = scanner.nextInt();
            System.out.print("Бренд: ");
            String brand = scanner.next();
            System.out.print("Смарт ТВ (true/false): ");
            boolean smartTV = scanner.nextBoolean();
            System.out.print("Номер включенного канала: ");
            int channelNumber = scanner.nextInt();
            System.out.print("Громкость звука: ");
            int volume = scanner.nextInt();
            System.out.print("Телевизор включен (true/false): ");
            boolean isOn = scanner.nextBoolean();
            televisions[i] = new Television(screenSize, brand, smartTV, channelNumber, volume, isOn);
        }

        // Сортировка телевизоров по номеру канала
        Arrays.sort(televisions, (t1, t2) -> Integer.compare(t1.getChannelNumber(), t2.getChannelNumber()));

        // Вывод включенных телевизоров с допустимой громкостью
        for (Television television : televisions) {
            if (television.isOn() && television.getVolume() <= maxVolume) {
                System.out.println(television);
            }
        }

        scanner.close();
    }
}
