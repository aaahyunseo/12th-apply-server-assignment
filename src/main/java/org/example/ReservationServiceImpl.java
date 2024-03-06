package org.example;

import java.util.Scanner;

public class ReservationServiceImpl implements ReservationService{
    Studyroom studyroom = new Studyroom(13);
    //스터디룸 A,B,C 예약 배열 생성

    @Override
    public void reservation() {
        Scanner sc = new Scanner(System.in);

        String room;
        int startTime;
        int endTime;

        System.out.println("\n----- 스터디룸 예약 -----");

        System.out.print("예약할 스터디룸: ");
        room = sc.nextLine();
        System.out.print("사용 시작 시간: ");
        startTime = sc.nextInt();
        System.out.print("사용 종료 시간: ");
        endTime = sc.nextInt();
        System.out.println();

        if(room.equals("A")){
            if(timeCheck(room,startTime,endTime)){
                for(int t = startTime-10; t<=endTime-10; t++){
                    studyroom.A[t] = "O";
                }
                System.out.println("예약이 완료되었습니다!");
            }else{
                System.out.println("예약에 실패하였습니다.");
            }
        }
        else if(room.equals("B")){
            if(timeCheck(room,startTime,endTime)){
                for(int t = startTime-10; t<=endTime-10; t++){
                    studyroom.B[t] = "O";
                }
                System.out.println("예약이 완료되었습니다!");
            }else{
                System.out.println("예약에 실패하였습니다.");
            }
        }
        else if(room.equals("C")){
            if(timeCheck(room,startTime,endTime)){
                for(int t = startTime-10; t<=endTime-10; t++){
                    studyroom.C[t] = "O";
                }
                System.out.println("예약이 완료되었습니다!");
            }else{
                System.out.println("예약에 실패하였습니다.");
            }
        }
        else{
            System.out.println("스터디룸"+ room +"는 존재하지 않습니다.\n예약에 실패하였습니다.");
        }

    }

    @Override
    public void viewReservation() {
        System.out.println("\n----- 예약 현황 -----");
        System.out.println("| A | B | C |");

        for(int i=0;i<3;i++){   //오전
            System.out.println("오전 "+String.format("%02d", i+10)+"시"+"| "+
                    studyroom.A[i]+" | "+studyroom.B[i]+" | "+studyroom.C[i]+" |");
        }
        for(int i=3;i<studyroom.A.length;i++){  //오후
            System.out.println("오후 "+String.format("%02d", i-2)+"시"+"| "+
                    studyroom.A[i]+" | "+studyroom.B[i]+" | "+studyroom.C[i]+" |");
        }
    }

    public boolean timeCheck(String room, int startTime, int endTime){
        //예약 시간이 사용 시간(10~22) 외 or 이미 예약된 시간일 경우 => 예약 실패

        if(startTime>=10 && endTime<=22){

            if(room.equals("A")){
                for(int i=startTime-10;i<=endTime-10;i++){
                    if(studyroom.A[i]=="O"){
                        System.out.println("스터디룸 A는 해당 시간에 이미 예약되어 있습니다.");
                        return false;
                    }
                }
            }
            if(room.equals("B")){
                for(int i=startTime-10;i<=endTime-10;i++){
                    if(studyroom.B[i]=="O"){
                        System.out.println("스터디룸 B는 해당 시간에 이미 예약되어 있습니다.");
                        return false;
                    }
                }
            }
            if(room.equals("C")){
                for(int i=startTime-10;i<=endTime-10;i++){
                    if(studyroom.C[i]=="O"){
                        System.out.println("스터디룸 C는 해당 시간에 이미 예약되어 있습니다.");
                        return false;
                    }
                }
            }
            return true;

        }else{
            System.out.println("예약 가능 시간을 벗어났습니다.");
            return false;
        }
    }
}
