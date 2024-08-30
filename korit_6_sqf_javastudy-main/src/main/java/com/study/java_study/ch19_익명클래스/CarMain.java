package com.study.java_study.ch19_익명클래스;
// 추상 클래스 -> 1회용
public class CarMain {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("k8", "화이트");
        System.out.println(kiaCar);

        KiaCar kiaCar1 = new KiaCar("k8", "블랙") {
            @Override
            public void createCar() {
                super.createCar();
            }

            @Override
            public void showCar() {
                super.showCar();
            }
        };

        AbstractCar abstractCar = new AbstractCar("내가 만든 자동차", "블랙") {
            @Override
            public void createCar() {
                System.out.println("한번 만들어봄");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보...");
            }
        }; // 입력 클래스를 입력시 @Override 를 해줘야 한다
    }
}
// 익명클래스 쓰는 이유는 인터페이스를 이용해 01회용 잠시 오버라이드해서 쓰고 버리는것
// 클래스 a d c 중 c 에서만 쓸때 익명 클래스를 사용한다
// 익명클래스는 이름이 없어서 생성자를 불러낼수 없다