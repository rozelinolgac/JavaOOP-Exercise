package MaasHesaplayici;

public class Employee {
    String name;
    Double salary;
    double workHours;
    int hireYear;
    double tax=0;
    double bonus=0;
    double raise=0;
    Employee(String name,Double salary,Double workHours,int hireYear) {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void tax(){  // Vergi hesaplayan fonksiyon
        if (this.salary<1000) {
            tax=0;
        }
        if (this.salary>=1000) {
            tax=salary*0.03;
        }


    }

    void bonus(){
        if (this.workHours>40) {
            this.bonus=(this.workHours-40)*30;

        }


    }

    void raiseSalary(){
        int years = 2021-this.hireYear;
        if((years) <10) {
            raise=this.salary*0.05;
        }
        if (years>9 && years<20) {
            raise=this.salary*0.1;
        }
        if (years>20) {
            raise = this.salary*0.15;
        }



    }

    void totalSalary(){
        tax();
        bonus();
        raiseSalary();
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        System.out.println("Vergi : " + tax);
        System.out.println("Bonus : " + bonus);
        System.out.println("Maaş artışı : " + raise);
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş : " + (salary+bonus-tax));
        System.out.println("Toplam Maaş : " + (salary+bonus+raise-tax));

    }


}

