package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class InquiryServiceImpl implements InquiryService{
    Map<String, String> inquiryList = new LinkedHashMap<>();

    @Override
    public void writeInquiry() {
        Scanner sc = new Scanner(System.in);
        String id;
        String content;

        System.out.println("\n----- 문의 남기기 -----");
        System.out.print("문의 아이디: ");
        id = sc.nextLine();
        System.out.print("문의 내용: ");
        content = sc.nextLine();
        System.out.println();

        inquiryList.put(id, content);

        System.out.println("문의가 저장되었습니다!");
    }

    @Override
    public void viewInquiryList() {

        System.out.println("\n----- 문의 리스트 보기 -----");

        for (Map.Entry<String, String> entry : inquiryList.entrySet()) {
            System.out.println();
            System.out.println("문의 아이디: " + entry.getKey());
            System.out.println("문의 내용: " + entry.getValue());
        }

    }
}
