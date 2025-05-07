package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjectsTest {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;

        // instantiate the Cat class as an object: Felix
        Cat felix = new Cat("Felix", "Tuna", 4); // this is the constructor for the Cat class

        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());

        // instantiate the Cat class as an object: Spot
        Cat spot = new Cat("Spot", "Fish", 3); // this is the constructor for the Cat class
        System.out.println("Spot's age is " + spot.getAge());
    }

    @Test
    public void creating_a_dog(){
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Bone", fido.getFavoriteToy());
        Assert.assertEquals(5, fido.getAge());
    }

}
