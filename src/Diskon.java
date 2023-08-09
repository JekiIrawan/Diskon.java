
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maharasthra Rafli ZI
 */
public class Diskon {
    public static void main(String[] args) {
        double book, pencil, eraser, ruler;
        book=2500;
        pencil=1000;
        eraser=1500;
        ruler=1000;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input book quantity:");
        double bookTotal= input.nextDouble();
        double total=bookTotal*book;
        
        System.out.println("Input pencil quantity:");
        double pencilTotal=input.nextDouble();
        total += pencilTotal*pencil;
        
        System.out.println("Input eraser quantity:");
        double eraserTotal=input.nextDouble();
        total+= eraserTotal*eraser;
        
        System.out.println("Input ruler quantity:");
        double rulerTotal=input.nextDouble();
        total+= rulerTotal*ruler;
        
        System.out.println("Insert payment:");
        double pay=input.nextDouble();
        double discount=0.05*total;
        double change=pay-(total-discount);
        System.out.println("Total discount: "+discount);
        System.out.println("Total change: "+change);
        
        
    }
    
}
