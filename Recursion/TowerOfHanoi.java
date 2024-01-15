import java.util.Scanner;

public class TowerOfHanoi {
    
    /*
     * Write a program to input the number of discs and print all the moves that is required
     * to solve the tower of Hanoi problem i.e take all discs from Tower A(src) and place in Tower C(dest) .
     * NOTE : Only one disc can be moved at a time
     *      : Longer disc can't be placed on smaller disc
     * 
     * Example n = 3
     * O/P = A -> C , A -> B , C -> B , A -> C , B -> A , B -> C , A -> C
    */

    /*
     * Approach : We can break our solution into three smaller sub-solutions(as we have three tower to play with)
     * First, two discs are placed from Tower A to Tower B, therefore A-> source(src); B-> Destination(dest); C-> Auxiliary(aux)
     * in second step, biggest disc is placed from Tower A to Tower C, therefore A-> source(src); C-> Destination(dest); B-> Auxiliary(aux)
     * and at last we took both the discs from Tower B to Tower C, and hence we have B-> source(src); C-> Destination(dest); A-> Auxiliary(aux)
     * 
     * We can write our method signature as ==> towerOfHenoi(n,src,aux,dest)
     *                        for(n-1) disc ==> towerOfHenoi(n-1,src,dest,aux)
     *                           for 1 disc ==> towerOfHenoi(1,src,aux,dest)
     *                        for(n-1) disc ==> towerOfHenoi(n-1,aux,src,dest)
    */

    static void towerOfHenoi(int n, char src, char aux, char dest){

        if(n == 1){
            System.out.println(src + "-->" + dest);
            return;
        }

        towerOfHenoi(n-1,src,dest,aux);
        towerOfHenoi(1,src,aux,dest);
        towerOfHenoi(n-1,aux,src,dest);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of discs: ");
		int n = sc.nextInt();

        System.out.println("Moves required to solve the game is : ");
        towerOfHenoi(n, 'A', 'B', 'C');

        sc.close();
    }


}
