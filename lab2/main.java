import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //task_1();
        //task_2();
        //task_3();
        //task_4();
        //task_5();
        //task_6();
        //task_7();
        task_8();
    }

    public static void task_1()
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = str.length();
        int start = 0, maxLength = 0;
        int[] visited = new int[256]; // Массив для хранения индексов символов

        Arrays.fill(visited, -1);

        int i;
        for (i = 0; i < n; i++)
        {
            char currentChar = str.charAt(i);

            if (visited[currentChar] != -1)
            {
                start = Math.max(start, visited[currentChar] + 1);
            }

            visited[currentChar] = i;
            maxLength = Math.max(maxLength, i - start + 1);
        }

        System.out.println(str.substring(start, start + maxLength));
    }

    public static void task_2()
    {
        Scanner scan = new Scanner(System.in);

        //первый массив
        System.out.println("НВведите длину ");
        int a = scan.nextInt();
        int[] first = new int[a];
        System.out.println("Введите числа");
        int j = 0;
        for (int i=0;i<a;i++)
        {
            j = scan.nextInt();
            first[i] = j;
        }

        //второй массив
        System.out.println("Введите длину ");
        int b = scan.nextInt();
        int[] second = new int[b];
        System.out.println("Введите числа");
        int q = 0;
        for (int i=0;i<b;i++)
        {
            q = scan.nextInt();
            second[i] = q;
        }

        //сортировка
        int c = a+b;
        int a_f = 0;
        int a_s = 0;
        int[] final_array = new int[c];
        for (int i = 0; i<c;i++)
        {
            if (a_f <= (a-1) && a_s <= (b-1))
            {
                if (first[a_f] <= second[a_s])
                {
                    final_array[i] = first[a_f];
                    a_f += 1;
                } else
                {
                    final_array[i] = second[a_s];
                    a_s += 1;
                }
            } else if (a_f>(a-1))
            {
                final_array[i] = second[a_s];
                a_s += 1;
            } else if (a_s>(b-1))
            {
                final_array[i] = first[a_f];
                a_f += 1;
            }
        }
        System.out.println(Arrays.toString(final_array));
    }

    public static void task_3()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Напишите длину массива");
        int a = scan.nextInt();
        int[] array = new int[a];
        System.out.println("Введите числа");
        int j = 0;
        for (int i=0;i<a;i++)
        {
            j = scan.nextInt();
            array[i] = j;
        }

        int maxsum = array[0];
        int currentsum = array[0];
        for (int i=0;i<array.length;i++)
        {
            currentsum = Math.max(array[i], currentsum + array[i]);
            maxsum = Math.max(maxsum, currentsum);
        }
        System.out.println(maxsum);
    }

    public static void task_4()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int m = scan.nextInt();
        System.out.println("Введите количество столбцов");
        int n = scan.nextInt();
        //создание двух двумерных массивов
        int[][] array = new int[m][n];
        int[][] rotate_array = new int[n][m];

        //ввод двумерного массива
        System.out.println("Введите числа");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                array[i][j] = scan.nextInt();
            }
        }

        //Поворот на 90 градусов
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                rotate_array[n-j-1][i] = array[i][j];
            }
        }

        //вывод финального массива
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(rotate_array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task_5()
    {
        Scanner scan = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        System.out.println("Введите длину");
        int a = scan.nextInt();
        int[] array = new int[a];
        System.out.println("Введите числа");
        for (int i=0;i<a;i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите число");
        int target = scan.nextInt();
        int count =0;

        for (int i=0;i<(a-1);i++)
        {
            for (int j=i;j<a;j++)
            {
                if (array[i] + array[j] == target)
                {
                    System.out.printf("Пара чисел",array[i], array[j]);
                    count ++;
                    break;
                }
            }
        }
        if (count == 0)
        {
            System.out.println("null");
        }
    }

    public static void task_6()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int m = scan.nextInt();
        System.out.println("Введите количество столбцов");
        int n = scan.nextInt();
        //создание двух двумерных массивов
        int[][] array = new int[m][n];

        //ввод двумерного массива
        System.out.println("Вводите числа");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void task_7()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int m = scan.nextInt();
        System.out.println("Введите количество столбцов");
        int n = scan.nextInt();
        //создание двух двумерных массивов
        int[][] array = new int[m][n];

        //ввод двумерного массива
        System.out.println("Вводите числа");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        for (int i=0;i<m;i++)
        {
            int max_number = array[i][0];
            for (int j=1;j<n;j++)
            {
                if (max_number < array[i][j])
                {
                    max_number = array[i][j];
                }
            }
            System.out.println(max_number);
        }
    }
    public static void task_8()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int m = scan.nextInt();
        System.out.println("Введите количество столбцов");
        int n = scan.nextInt();
        //создание двух двумерных массивов
        int[][] array = new int[m][n];
        int[][] rotate_array = new int[n][m];

        //ввод двумерного массива
        System.out.println("Вводите числа ");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                array[i][j] = scan.nextInt();
            }
        }

        //Поворот на 90 градусов
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                rotate_array[j][n-i-1] = array[i][j];
            }
        }

        //вывод финального массива
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(rotate_array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
