public class Employee {
    String name;
    int id;
    String doljnost;

    public Employee(String name, int id, String doljnost) {
        this.name = name;
        this.id = id;
        this.doljnost = doljnost;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", doljnost='" + doljnost + '\'' +
                '}';
    }
}
class Worker extends Employee{
    int za_chas;
    int col_chas;


    public Worker(String name, int id, String doljnost, int za_chas, int col_chas) {
        super(name, id, doljnost);
        this.za_chas = za_chas;
        this.col_chas = col_chas;
    }
    int zp(){
        return za_chas * col_chas;
    }
}

class Manager extends Employee{
    int fiksirovannaya_zp;
    int premiya;

    public Manager(String name, int id, String doljnost, int fiksirovannaya_zp, int premiya) {
        super(name, id, doljnost);
        this.fiksirovannaya_zp = fiksirovannaya_zp;
        this.premiya = premiya;
    }

    int zp(){
        return fiksirovannaya_zp * premiya;
    }
}

class Main1{
    public static void main(String[] args) {
        Manager manager = new Manager("Aisha", 885, "zam", 84445, 6500);
        System.out.println(manager.name + " polychaet "+manager.zp());
        Worker worker = new Worker("Assiys", 452, "worker", 50000, 8);
        System.out.println(worker.name+" polychaet "+worker.zp());
    }
}