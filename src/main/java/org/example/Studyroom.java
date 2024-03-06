package org.example;

import java.util.Arrays;

public class Studyroom {
    public String[] A;
    public String[] B;
    public String[] C;

    public Studyroom(int n){
        //스터디룸 예약 배열 생성
        A = new String[n];
        B = new String[n];
        C = new String[n];

        Arrays.fill(A,"X");
        Arrays.fill(B,"X");
        Arrays.fill(C,"X");
        //스터디룸 예약 상태 초기화
    }
}
