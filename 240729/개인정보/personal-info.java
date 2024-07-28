import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            students[i] = new Student(name, height, weight);
        }

        Arrays.sort(students, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) { // 이름 기준 오름차순 정렬합니다.
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");
        for (int i = 0; i < n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.printf("%.1f\n", students[i].weight);
        }

        System.out.println();

        Arrays.sort(students, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) { // 키 기준 내림차순 정렬합니다.
                return b.height - a.height;
            }
        });

        System.out.println("height");
        for (int i = 0; i < n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.printf("%.1f\n", students[i].weight);
        }
    }
}