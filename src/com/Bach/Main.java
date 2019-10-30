package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students = {"Bach", "Linh", "Mai", "Tuan", "Hau"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên một học sinh: ");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("vị trí của học sinh trong danh sách " + input_name + " là: " + (i +1));
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Không tìm thấy " + input_name + " trong danh sách.");
        }
    }
}
