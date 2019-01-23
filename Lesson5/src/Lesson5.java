public class Lesson5 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.Worker();
        System.out.println();

        Worker[] workArr = new Worker[5];
        workArr[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        workArr[1] = new Worker("Petrov Petr", "Engineer", "pertov@mai.box.com", "894563247", 35000, 32);
        workArr[2] = new Worker("Sidorov Vasilyi", "Master", "sidorov@mailbox.com", "894163846", 25000, 41);
        workArr[3] = new Worker("Pupkin Vasyli", "Master", "pupkin@mailbox.com", "891547538", 20000, 45);
        workArr[4] = new Worker("Petrov Ivan", "Master", "petrovivan@mailbox.com", "897635327", 23000, 35);

        for (int i = 0; i < workArr.length; i++) {
            if(workArr[i].age > 40){
               System.out.println(workArr[i].fio + " " + workArr[i].post + " " + workArr[i].e_mail + " " + workArr[i].phone + " " + workArr[i].salary + " "+ workArr[i].age);

            }

        }
    }
}
