public class Worker {
    String fio;
    String post;
    String e_mail;
    String phone;
    double salary;
    int age;

    public Worker(){
        fio = "Petrov Petr";
        post = "Engineer";
        e_mail = "Petrov@mail";
        phone = "63-42-57";
        salary = 20000;
        age = 20;
    }

    public Worker(String fio, String post, String e_mail, String phone, double salary, int age){
        this.fio = fio;
        this.post = post;
        this.e_mail = e_mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void Worker(){
        System.out.println(fio + " " + post + " " + e_mail + " " + phone + " " + salary + " " + age);
    }
}
