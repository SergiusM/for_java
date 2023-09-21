import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
    }
    public static void task_1() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while (n != 1) {
            if (n % 2 != 0) {
                n = n * 3 + 1;
                count += 1;
            } else {
                n = n / 2;
                count += 1;
            }
        }
        System.out.println(count);
    }
    public static void task_2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод n: ");
        int number = scan.nextInt();
        int[] Array = new int[number];
        int ans = 0;

        System.out.println("Ввод чисел: ");
        for (int i = 0; i < number; i++) {
            int a = scan.nextInt();
            if (i%2!=0){
                ans -= a;
            } else {
                ans += a;
            }
        }
        System.out.println(ans);
    }
    public static void task_3() {
        Scanner scan = new Scanner(System.in);
        int x_0=0 ,y_0=0,flag = 0, c=0,c_f=0,k=0;
        String s = "";
        System.out.println("Ввод координат клада: ");
        int x_clad = scan.nextInt();
        int y_clad = scan.nextInt();
        System.out.println("Ввод направления, количества шагов: ");

        while (true) {
            s = scan.next();
            if (s.equals("стоп")) {
                break;
            }
            k = scan.nextInt();
            scan.nextLine();
            if (s.equals("север")) {
                y_0 += k;
                c += 1;
            } else if (s.equals("юг")) {
                y_0 -= k;
                c += 1;
            } else if (s.equals("запад")) {
                x_0 -= k;
                c += 1;
            } else if (s.equals("восток")) {
                x_0 += k;
                c += 1;
            }

            if (x_0 == x_clad && y_0 == y_clad) {
                flag += 1;
                if (flag == 1) {
                    c_f = c;
                }
            }
        }
        System.out.println(c_f);
    }
    public static void task_4() {
        Scanner scan = new Scanner(System.in);
        int roads = 0,tun = 0, height_tun = 0,min_height = 10000,flag = -1,count = 0,max_height = 0;

        System.out.println("Ввод колмчества дорог: ");
        roads = scan.nextInt();
        int[] arr;
        arr = new int[roads];

        for (int i = 0; i < roads; i++) {
            System.out.println("Ввод количества тунеллей: ");
            tun = scan.nextInt();
            min_height = 10000;
            flag += 1;
            System.out.println("Ввод высоты туннелей: ");
            for (int j = 0; j < tun; j++) {
                height_tun = scan.nextInt();
                min_height = Math.min(height_tun, min_height);
            }
            arr[flag] = min_height;
        }

        for (int i = 0; i < roads; i ++) {
            if (max_height < arr[i]) {
                max_height = arr[i];
                count = i+1;
            }
        }
        System.out.println(count);
        System.out.println(max_height);
    }

    public static void task_5() {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int x_100 = (int) x/100;
        int x_10 = (int) x/10;
        x_10 = x_10%10;
        int x_1 = (int) x%10;

        int sum = x_1 + x_10 + x_100;
        int pr = x_1 * x_10 * x_100;
        if (sum%2==0 && pr%2==0) {
            System.out.println("Является");
        } else {
            System.out.println(" Не является");
        }
    }
} 
