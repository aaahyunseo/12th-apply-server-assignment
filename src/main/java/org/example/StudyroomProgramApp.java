package org.example;

import java.util.Scanner;

public class StudyroomProgramApp {      //메인 프로그램 실행 class
    public static void main(String[] args){
        ReservationService reservationService = new ReservationServiceImpl();
        InquiryService inquiryService = new InquiryServiceImpl();

        Scanner sc = new Scanner(System.in);
        int selec;

        System.out.println("스터디룸 예약 프로그램입니다.");

        while(true){
            option();
            System.out.print("작업을 선택하세요: ");
            selec = sc.nextInt();

            if(selec == 5) {
                System.out.println("\n프로그램을 종료합니다...");
                break;
            }

            switch (selec){
                case 1 :
                    reservationService.reservation();
                    break;
                case 2:
                    reservationService.viewReservation();
                    break;
                case 3:
                    inquiryService.writeInquiry();
                    break;
                case 4:
                    inquiryService.viewInquiryList();
                    break;
                default:
                    System.out.println("\n작업을 다시 선택해주세요.");
                    break;
            }
        }
    }

    static void option(){
        System.out.println("\n----- 작업 -----\n");
        System.out.println(
                "1. 스터디룸 예약\n" +
                        "2. 예약 현황 조회\n" +
                        "3. 문의 남기기\n" +
                        "4. 문의 리스트 보기\n" +
                        "5. 프로그램 종료\n");
    }
}
