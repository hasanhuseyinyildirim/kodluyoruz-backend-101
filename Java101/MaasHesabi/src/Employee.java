public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    
    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    public double tax(){
        if(this.salary < 1000){
           return 0;
        }else{
            return (this.salary*0.03);
        }
    }

    double bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }
        double raiseSalary(){
        if ((2021-this.hireYear)<10){
            return (this.salary*0.05);
        }else if((2021-this.hireYear)>9 && (2021-this.hireYear)<20){
            return (this.salary*0.10);
            
        }else if((2021-this.hireYear)>19){
            return (this.salary*0.15);
        }
        return 0;
    }
    public String toString(){
        System.out.println("Adı-Soyadı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " +(this.salary+bonus()-tax()));
        System.out.println("Toplam Maaş : " +(this.salary+bonus()-tax()+raiseSalary()));
        
    return "0";
    }
    
}

