public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String nameAndSurname,int salary,int workHours,int hireYear){
        this.name = nameAndSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    int tax(){
        if (this.salary>1000){
            double total = (this.salary * 3.0) / 100;
            return (int)total;

        }else {
            return 0;
        }
    }
    int bonus(){
        if (this.workHours>=40){
            return (this.workHours -40) * 30;

        }else {
            return 0;
        }
    }

    int raiseSalary(){
        if (2021 -this.hireYear<10){
            double total = (this.salary * 5.0) / 100;
            return (int) total;

        } else if (2021 - this.hireYear>9 && 2021 - this.hireYear <20) {
            double total = (this.salary * 10.0) / 100;
            return (int) total;

        } else {
            double total = (this.salary * 15.0) / 100;
            return (int) total;
        }
    }

    void printInfo(){
        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary + " TL");
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı :" + this.hireYear);
        System.out.println("Vergi :" + this.tax());
        System.out.println("Bonus :" + this.bonus());
        System.out.println("Maaş Artışı :" + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + ((this.bonus() - this.tax()) + this.salary));
        System.out.println("Toplam maaş :" + (this.salary + this.raiseSalary()));
    }
}
