
package exemploswitch;

import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {//días de la semana 
    System.out.println("*****MENÚ*******\n1-> Luns\n2->Martes\n3->Mércores\n"
            + "4-> Xoves\n5-> Venres\n6-> Sábado\n7-> Domingo\nELIXE UNHA OPCIÓN:");
    
    Scanner sc= new Scanner (System.in);
    int op= sc.nextInt();
    
    switch (op){
        case 1: System.out.println("Luns");
                break;
        case 2: System.out.println("Martes");
                break;
        case 3: System.out.println("Mércores");
                break;
        case 4: System.out.println("Xoves");
                break;
        case 5: System.out.println("Venres");
                break;
        case 6: System.out.println("Sábado");
                break;
        case 7: System.out.println("Domingo");
                break;
        default: System.out.println("Opción non válida");
    }
    }
    
    
}
