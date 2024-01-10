import java.util.Arrays;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        Student arr[] = { new Student(1, "Julie"), new Student(2, "Robert"),
                new Student(3, "Adam"), new Student(4, "Jene") };
        System.out.print("Array: [ ");

        Spliterator<Student> spliterator = Arrays.spliterator(arr);
        spliterator.forEachRemaining(i -> System.out.print(i + " "));
        System.out.print("]\n\n");


// 2
        Student arr2[] = { new Student(1, "Julie"), new Student(2, "Robert"),
                new Student(3, "Adam"), new Student(4, "Jene") };
        System.out.print("Array: [ ");

        Spliterator<Student> spliterator2 = Arrays.spliterator(arr2, 0, arr2.length);
        spliterator2.forEachRemaining(i -> System.out.print(i + " "));
        System.out.print("]\n\n");


// 3
        Student arr3[] = { new Student(1, "Julie"), new Student(2, "Robert"),
                new Student(3, "Adam"), new Student(4, "Jene") };
        System.out.print("Array: [ ");

        Spliterator<Student> spliterator3 = Arrays.spliterator(arr3, 0, 3);
        spliterator3.forEachRemaining(i -> System.out.print(i + " "));
        System.out.print("]");
    }
}