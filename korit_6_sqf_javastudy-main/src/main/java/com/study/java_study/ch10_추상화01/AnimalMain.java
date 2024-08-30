package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈"); // 업캐스팅 x
        Animal tiger = new Tiger("옹이", 5, 100); // 업캐스팅 o

        System.out.println(dog);
        System.out.println(tiger);

        dog.move();
        tiger.move();
        ((Tiger) tiger).hunt(); // 다운캐스팅
        dog.bark();

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("옹이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }
        System.out.println();

        for(Animal animal : animals) {
            if(animal instanceof Tiger) {
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if(animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }
        System.out.println();

        for(Animal animal : animals) {
            if(animal.getClass() == Tiger.class) {
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if(animal.getClass() == Dog.class) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }

    }
}
// 업캐스팅 (공통된 정보name, age, 등을 조회할때 사용)
// Animal animal = new Tiger();

// Animal[] animals = new Animal[3];
// animal[0] = new Animal();
// animal[1] = new Tiger();
// animal[2] = new Dog();

// 다운캐스팅 (업캐스팅 된 메소드만 다운캐스팅 할수 있다)
//Animal animal = new Tiger();
//Tiger tiger = (Tiger)animal;