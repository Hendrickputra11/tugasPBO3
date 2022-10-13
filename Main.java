import java.until.scanner;

public class main{
    public static void main(string[]args){
        int pilih;
        scanner inputan= new scanner (system.in);

        system.out.println("ini adalah program java");
        system.out.println("masukan pilihan anda: ");
        system.out.println("1. perulangan for");
        system.out.println("2. perulangan while ");
        system.out.println("3. perulangan do-while");
        system.out.println("4. array 1 dimensi ");
        system.out.println("5. array multidimensi");

        pilih= inputan.nextInt();
        if (pilih==1){
            system.out.println("anda memilih perulangan for");
            for (int a=1; a<=10; a++){
                system.out.printl(a);
            }
        }else if (pilih==2){
            system.out.println("anda memilih perulangan while");
            int a=1;
            while (a<=10){
                system.out.println(a);
                a++;
            }
        }else if (pilih==3){
            system.out.println("anda memilih perulangan do-while");
            int a=11;
            do{
                system.out.println(a);
                a++;
            }while(a<=10);
            system.out.println(a);
        }else if(pilih==4){
            system.out.println("anda memilih array dimensi 1");
            int A[]= {1,2,3,4};
            system.out.println(A[1]);
            system.out.println(A[2]);
            system.out.println(A[3]);
            system.out.println(A[4]);

        }else if(pilih==5){
            system.out.println("anda memilih multidimensi");
            int[][] myNumbers= {{1,2,3,4}, {5,6,7}};
            int x= myNumbers[1][2];
            system.out.println(x);
        }
    }


}