import java.util.*;

class MySolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine() ;   //ввод стринговой переменной

        String [] num = line.split(" ") ;//заводим эту переменную в стринговый массив через сплит

        System.out.print(num[0]+ " ");   //выводим первое число из массива с пробелом

        for (int i = 1; i < num.length-2; i+=2) {    //заводим цикл от 1 и до -2 длинны массива и шагом +2

            System.out.print(num[i+1]+" "+num[i]+" ");//в цикле - выводим позицию массива +1 пробел и позицию массива по счету + пробел

        }

        if (num.length%2==0) {    //если длинна массива четная - выводим позицию массива -1

            System.out.print(num[num.length-1]);

        }

        else {    //если не четная выводим позицию массива -2 + пробел и позицию массива -1

            System.out.print(num[num.length-2] + " " + num[num.length-1]);

        }

    }

}