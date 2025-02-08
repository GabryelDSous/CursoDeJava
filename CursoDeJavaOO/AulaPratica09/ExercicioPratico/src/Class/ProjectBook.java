package Class;
public class ProjectBook {
    public static void main(String[] args){
        People[] p = new People[2];
        Books[] b = new Books[3];
        
        p[0] = new People("Pedro", 22, "M");
        p[1] = new People("Maria", 25, "F");
        
        b[0] = new Books("Learning Java", "José da Silva", 300, p[0]);
        b[1] = new Books("OOP for the Beginners", "Pedro Paulo", 500, p[0]);
        b[2] = new Books("Advanced Java", "Maria Candido", 800, p[0]);
        
        b[0].open();
        b[0].flipped(100);
        b[0].nextPage();
        System.out.println(b[0].detail());
        
        System.out.println(b[1].detail());
    }
}
