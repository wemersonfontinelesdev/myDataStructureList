package ifma.lista02;

import java.util.Arrays;

public class Lista02 {
    private static final int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    //Questão 1
    public static void q01() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //Questão 2
    public static void q02() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //Questão 3
    public static void q03() {
        System.out.print("[ ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + (i < matriz.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }

    //Questão 4
    public static void q04() {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Soma: " + soma);
    }

    //Questão 5
    public static void q05() {
        System.out.print("[ ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length - 1 - i; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + (i == matriz.length - 1 && j == matriz[i].length - 1 ? " " : ", "));
            }
        }
        System.out.println("]");
    }

    //Questão 6
    public static void q06() {
        int soma = 0, count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length - 1 - i; j < matriz[i].length; j++) {
                soma += matriz[i][j];
                count++;
            }
        }
        System.out.println("Media: " + (double) soma / count);
    }

    // Questão 7
    public static void q07() {
        System.out.print("[ ");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + (i == matriz.length - 1 && j == matriz[i].length - 1 ? " " : ", "));
            }
        }
        System.out.println("]");
    }

    //Questão 8
    public static void q08() {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        System.out.println("Maior valor: " + max);
    }

    //Questão 9
    public static void q09() {
        System.out.print("[ ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + (i == matriz.length - 1 && j == matriz.length - 1 - i ? " " : ", "));
            }
        }
        System.out.println("]");
    }

    // Questão 10
    public static void q10() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= matriz.length - 1 - i; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                }
            }
        }
        System.out.println("Menor valor: " + min);
    }

    //Questão 11
    public static void q11() {
        System.out.print("[ ");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j <= matriz.length - 2 - i; j++) {
                System.out.print(matriz[i][j] + (i == matriz.length - 2 && j == matriz.length - 2 - i ? " " : ", "));
            }
        }
        System.out.println("]");
    }

    //Questão 12
    public static void q12() {
        int produto = 1;
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j <= matriz.length - 2 - i; j++) {
                produto *= matriz[i][j];
            }
        }
        System.out.println("Produto: " + produto);
    }

    // Questão 13
    public static void q13() {
        int[][] b = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    b[i][j] = matriz[i][j] * matriz[i][j];
                } else {
                    b[i][j] = matriz[i][j] * matriz[i][j] * matriz[i][j];
                }
            }
        }
        System.out.println("Matriz B: " + Arrays.deepToString(b));
    }

    //Questão 14
    public static void q14() {
        int[][] rotated90 = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                rotated90[j][matriz.length - 1 - i] = matriz[i][j];
            }
        }
        System.out.println("Rotacionada 90°: " + Arrays.deepToString(rotated90));
    }

    //Questão 15
    public static void q15() {
        int[][] rotated180 = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                rotated180[matriz.length - 1 - i][matriz[0].length - 1 - j] = matriz[i][j];
            }
        }
        System.out.println("Rotacionada 180°: " + Arrays.deepToString(rotated180));
    }

    //Questão 16
    public static void q16() {
        int[][] rotated270 = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                rotated270[matriz[0].length - 1 - j][i] = matriz[i][j];
            }
        }
        System.out.println("Rotacionada 270°: " + Arrays.deepToString(rotated270));
    }
}

