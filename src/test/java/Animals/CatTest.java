package Animals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;


class CatTest {
    @Test
    public void checkCatSound() {
        //GIVEN
        Cat cat = new Cat("Cat", "testCat", "black", 4, 1, "Scottish", "female");
        String expectedSound = "I say meow";
        //WHEN
        String actualSound = cat.makeSound();
        //THEN
        Assertions.assertEquals(expectedSound, actualSound,
                String.format("Expected '%s', but was '%s'", expectedSound, actualSound));
    }
    @Test
    public void checkCatType() {
        //GIVEN
        Cat cat = new Cat("Cat", "testCat", "black", 4, 1, "Scottish", "female");
        String expectedSimpleType = "black";
        //WHEN
        String actualSimpleType = cat.color;
        //THEN
        Assertions.assertEquals(expectedSimpleType, actualSimpleType);

    }

    @Test
    public void checkCatClass() {
        //GIVEN
        Cat cat = new Cat("Cat", "testCat", "black", 4, 1, "Scottish", "female");
        String expectedNameOfCat = "Animals.Animal";
        //WHEN
        String actualNameOfCat = cat.getClass().getSuperclass().getName();
        //THEN
        Assertions.assertEquals(expectedNameOfCat, actualNameOfCat);
    }


    @Test
    public void checkCatClassMethod() {
        //GIVEN
        Cat cat = new Cat("Cat", "testCat", "black", 4, 1, "Scottish", "female");
        String expectedMethod = "I say meow";
        try {
            Method method = Cat.class.getDeclaredMethod("makeSound", null);
            method.setAccessible(true);
        //WHEN
        String actualMethod = method.invoke(cat).toString();
        //THEN
            Assertions.assertEquals(expectedMethod, actualMethod);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    @Test
    public void checkCatClassField() {
        //GIVEN
        Cat cat = new Cat("Cat", "testCat", "black", 4, 1, "Scottish", "female");
        String expectedField = "Scottish";
        try {
            Field field = Cat.class.getDeclaredField("breed");
            field.setAccessible(true);
        //WHEN
            String actualField = field.get(cat).toString();
        //THEN
        Assertions.assertEquals(expectedField,actualField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}