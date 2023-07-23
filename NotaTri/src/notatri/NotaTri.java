package notatri;

import java.util.Locale;
import java.util.Scanner;

public class NotaTri {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalcNota cn = new CalcNota();
        
        System.out.println("Name: ");
        cn.nome = sc.nextLine();
        
        System.out.println("Notas do 1º ao 3º Trimestre: ");
        cn.nota1 = sc.nextDouble();
        cn.nota2 = sc.nextDouble();
        cn.nota3 = sc.nextDouble();
        
        System.out.println("Final Grade = "+ cn.soma());
        
        if(cn.soma()> 60.0){
                       System.out.println("PASS"); 
        }
        else{

            System.out.println("FAILED");
            System.out.println("Missing "+cn.media()+" Points");
        }
        
        

    }
    
}
