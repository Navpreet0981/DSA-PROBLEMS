package JAVA;
import java.lang.annotation.*;


//MARKER ANNOTATION :- 
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

@MyMarker
class Marker {
    public static void myMethod() {
        System.out.println("Executing the myMethod()");
    }
}

public class annotations {
    public static void main(String[] args) {
        if (Marker.class.isAnnotationPresent(MyMarker.class)) {
            System.out.println("Marker Annotation is Present!!");

        } else {
            System.out.println("Marker Annotation Is Not Present!!");
        }
    }

}
