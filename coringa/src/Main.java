import parte2.Circle;
import parte2.Rectangle;
import parte2.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void parte1(){
        List<Object> obj = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        //apesar de integer ser uma subclasse de object, não é permitido um list obj receber um list integer
        //pois se fosse possivel eu perderia a consistencia dos tipos de dados que ha dentro da minha list

        // obj = integers;

        List<?> obj1 = new ArrayList<>();
        List<Integer> integers1 = new ArrayList<>();

        // mas se usar o tipo generico coringa ? isso se torna possivel
        obj1 = integers1;

        List<String> stringsList = Arrays.asList("a", "b", "c", "d");
        List<Integer> integerList = Arrays.asList(1,2,3,4);

        //graças ao coringa consigo usar um mesmo metodo para tipo de listas diferentes
        printList(stringsList);
        printList(integerList);
    }

    public static void printList(List<?> list){ //se fosse um object no lugar do ? não ia pegar

        for (Object object : list){
            System.out.print(object + " ");
        }
    }

    public static void parte2(){
        List<Shape> myShape = new ArrayList<>();
        myShape.add(new Rectangle(2, 3));
        myShape.add(new Circle(2));

        //o método pega pq ele recebe um list shape
        System.out.println(totalArea(myShape));

        //mas e se eu passar alguem que herda o tipo shape?

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(3));
        myShape.add(new Circle(4));

        //System.out.println(totalArea(myCircle)); não funcionaria
        // o método é restrito apenas para List Shape, tem que mudar para tipo coringa
    }

    //public static double totalArea(List<?> list)
    //mudei para o tipo coringa mas deu erro na linha 65 pois os dados que forem passado, não necessariamente
    //seriam do tipo shape, logo é necessario informar que o tipo coringa extends o tipo shape
    //para aceitar o tipo shape e qualquer um que extenda ele
    public static double totalArea(List<? extends Shape> list){
        double total = 0;

        for (Shape shape : list){
            total += shape.area();
        }

        return total;
    }

    public static void parte3(){
        List<Object> myObjs = new ArrayList<>();

        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(2.32, 3.1415, 7.77);

        copy(myInts, myObjs);
        copy(myDoubles, myObjs);

        for (Object object: myObjs){
            System.out.print(object + " ");
        }

    }

    public static void copy(List<? extends Number> numberList, List<? super Number> objectList){
        for (Number value : numberList){
            objectList.add(value);
        }
    }

    public static void main(String[] args) {
        //parte1();
        //parte2();
        parte3();
    }


}