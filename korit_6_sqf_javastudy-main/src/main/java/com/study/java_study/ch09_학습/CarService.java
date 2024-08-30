//package com.study.java_study.ch09_학습;
//
//import java.util.Scanner;
//
//public class CarService {
//    private Scanner scanner;
//    private CarRepository carRepository;
//
//    public CarSeryice() {
//        scanner = new Scanner(System.in);
//        carRepository = new CarRepository();
//    }
//    private String selectMenu() {
//        String menus = "1234q";
//        String selectedMenu = null;
//
//        while (true) {
//            System.out.print("메뉴 선택: ");
//            selectedMenu = scanner.nextLine();
//            if (menus.contains(selectedMenu)) {
//                break;
//            }
//            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
//        }
//        return selectedMenu;
//    }
//    public boolean run() {
//        boolean isRun = true;
//
//        System.out.println("[주차 관리 프로그램]");
//        System.out.println("1. 차량 등록");
//        System.out.println("2. 차량 검색");
//        System.out.println("3. 차량 수정");
//        System.out.println("4. 차량 삭제");
//        System.out.println("q. 프로그램 종료");
//
//        String selectedMenu = selectMenu();
//
//        switch (selectedMenu) {
//            case "q":
//                isRun = false;
//                break;
//            case "1":
//                registerBook();
//                break;
//            case "2":
//                search();
//                break;
//            case "3":
//                break;
//            case "4":
//                break;
//            default:
//                System.out.println("입력 오류");
//        }
//        System.out.println();
//        return isRun;
//}
