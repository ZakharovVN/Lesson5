/**
 * java1. HomeWorkFive
 *
 * @author ZakharovVladimir
 * @version 24.02.2022
 */
public class Main {
    static final int WORKER_ARRAY_SIZE = 5;

    public static void main(String[] args) {

        Worker worker1 = new Worker("npc1", "officer1", "npc1@mail.ru", "+79163211223", 95000, 55);
        Worker worker2 = new Worker("npc2", "officer2", "npc2@mail.ru", "+79163211224", 96000, 25);
        Worker worker3 = new Worker("npc3", "officer3", "npc3@mail.ru", "+79163211225", 94000, 50);
        Worker worker4 = new Worker("npc4", "officer4", "npc4@mail.ru", "+79163211226", 95000, 22);
        Worker worker5 = new Worker("npc5", "officer5", "npc5@mail.ru", "+79163211227", 90000, 30);

        worker1.printInfo();
        worker2.printInfo();
        worker3.printInfo();
        worker4.printInfo();
        worker5.printInfo();
        System.out.println();

        Worker[] wokrArray = new Worker[WORKER_ARRAY_SIZE];
        wokrArray[0] = new Worker("npc1", "officer1", "npc1@mail.ru", "+79163211223", 95000, 55);
        wokrArray[1] = new Worker("npc2", "officer2", "npc2@mail.ru", "+79163211224", 96000, 25);
        wokrArray[2] = new Worker("npc3", "officer3", "npc3@mail.ru", "+79163211225", 94000, 50);
        wokrArray[3] = new Worker("npc4", "officer4", "npc4@mail.ru", "+79163211226", 95000, 22);
        wokrArray[4] = new Worker("npc5", "officer5", "npc5@mail.ru", "+79163211227", 90000, 30);
        for (Worker worker : wokrArray) {
            if (worker.getAge() >= 40) {
                worker.printInfo();
            }
        }

    }
}


