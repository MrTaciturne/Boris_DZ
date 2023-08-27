public class BorisHomeWork3 {

    public static void main(String[] args) {


//        СР medium

        int[] complit = new int[100];
        int number = 1, i = 0;

        while (i <= 99) {
            if (number % 13 == 0 || number % 17 == 0) {
                complit[i] = number;
                i++;
            }
            number++;
        }

        for (i = 0; i <= 99; i++) {
            System.out.print("Ячейка " + i + " = " + complit[i] + " || ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

//        ДЗ 1

        int[] cicl = {11, 22, 33, 44, 55, 66, 77, 99};
        int shron = cicl[cicl.length - 1];
        i = cicl.length - 1;

        while (i > 0) {
            cicl[i] = cicl[i - 1];
            i--;
        }
        cicl[0] = shron;
        for (i = 0; i < cicl.length; i++) {
            System.out.print(cicl[i] + " || ");
        }
        System.out.println("\n");

//        ДЗ 2

        int perScet = 0, secScet = 1;
        int[] massiv = {1, 2, 1, 3, 4, 5, 2, 6, 5};
        while (perScet < massiv.length) {
            while (secScet < massiv.length) {
                if (massiv[perScet] == massiv[secScet] && massiv[secScet] != 0) {
                    massiv[secScet] = 0;
                }
                secScet++;
            }
            System.out.print(massiv[perScet] + " ");
            perScet++;
            secScet = perScet + 1;
        }
        System.out.println();

//        ДЗ 3

        int[] mass1 = {1, 3, 5};
        int[] mass2 = {2, 4, 6, 7, 8, 9};
        int[] mass3 = new int[mass1.length + mass2.length];

        perScet = 0;
        secScet = 0;
        i = 0;

        while (i < mass3.length) {
            if (i % 2 == 0 && i < mass1.length * 2) {
                mass3[i] = mass1[perScet];
                perScet++;
            } else if (i % 2 != 0 && i < mass2.length * 2){
                mass3[i] = mass2[secScet];
                secScet++;
            } else if (perScet > secScet) {
                mass3[i] = mass1[perScet];
                perScet++;
            } else {
                mass3[i] = mass2[secScet];
                secScet++;
            }
            System.out.print(mass3[i] + " ");
            i++;
        }
    }
}



