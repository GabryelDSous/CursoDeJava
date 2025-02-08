package praticalexercice;
public class PraticalExercice {
    public static void main(String[] args) {
        People[] p = new People[2];
        Books[] b = new Books[3];
        
        p[0] = new People("Samuel", 20, 'M');
        p[1] = new People("Munick", 15, 'F');
        
        b[0] = new Books("Learning Java", "José da Silva", 300, p[1]);
        b[1] = new Books("OOP for the Beginners", "Pedro Paulo", 500, p[0]);
        b[2] = new Books("Advanced Java", "Maria Candido", 800, p[0]);
        
        b[1].open();
        //b[1].open();
        //b[1].nextPage();
        b[1].flipped(500);
        b[1].nextPage();
        //b[1].backPage();
        //b[1].backPage();
        //System.out.println(b[0].details());
        System.out.println(b[1].details());
        //System.out.println(b[2].details());
    }
    
}
