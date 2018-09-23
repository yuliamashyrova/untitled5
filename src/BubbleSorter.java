import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] arr0 = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(arr0));
        System.out.println("arr1:" + Arrays.toString(arr0));
        System.arraycopy(arr0, 1, arr0, 3, 3);
        System.out.println("arr0:" + Arrays.toString(arr0));
    }
}

 /*       int[] arr0 = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("arr0:" + Arrays.toString(arr0));
        System.out.println("arr1:" + Arrays.toString(arr1));
        System.arraycopy(arr0, 1, arr1, 2, 3);
        System.out.println("arr0:" + Arrays.toString(arr1));
    }
}
        /*      int[] arr = {10, 20, 30, 40};
        int pos = Arrays.binarySearch(arr, 25);
        System.out.println(pos);
    }
}
       /* int twoD[][] = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.println(twoD[i][j] + "");
            System.out.println();

        }
    }
}
    /*   System.out.println(new StringBuffer("qwerty").reverse());
        new Random()
        .ints('a','z')
        .limit(10)
        .mapToObj(s->(char)s+"")
                .collect(Collectors.joining());

    }
    }
     /*   int a[] = {1, 2, 3, 4, 5, 6};
        int a1[] = {3, 6, 3, 4, 5, 6};
    }

        public static void sort ( int[] data){
            for (int barrier = data.length - 1; barrier >= 0; barrier--) {
                for (int index = 0; index < barrier; index++) {
                    if (data[index] > data[index + 1]) {
                        int tmp = data[index];
                        data[index] = data[index + 1];
                        data[index + 1] = tmp;
                    }
                }
            }
        }*/


