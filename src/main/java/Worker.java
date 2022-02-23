/**
 * java1. HomeWorkFive
 *
 * @author ZakharovVladimir
 * @version 24.02.2022
 */
class Worker {
    private String name;
    private String post;
    private String mail;
    private String phone;
    private int money;
    private int age;


    public Worker(String name, String post, String mail, String phone, int money, int age) {
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.phone = phone;
        this.money = money;
        this.age = age;

    }
    public int getAge(){
        return age;
    }


    void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("ФИО: " + name + "; Должность: " + post + "; email: " + mail + "; Телефон: " + phone + "; Зарплата: " + money + "; Возраст: " + age);

    }
}
