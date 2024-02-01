package day23;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Step1 {
    public static void main(String[] args) {
        //1. 배열타입 : 고정길이
            //객체{객체, 객체, 객체}
        String[] strArray=new String[3];    //String 타입 데이터 3개를 저장/참조하는 배열타입
        strArray[0]="유재석";
        //strArray[1]=100;        //X 타입이 다르므로 오류
        strArray[1]="강호동";
        strArray[2]="신동엽";
        //strArray[3]="서장훈";//ArrayIndexOutOfBoundsException

        System.out.println("배열상태 : "+ Arrays.toString(strArray)); //Object클래스 toString()메소드 객체의 주소값 반환

            //Arrays.toString(배열타입변수) : 해당 배열 상태 호출

        //2. 클래스타입 : 컬렉션프레임워크 (수집관련 라임브러리 제공)
            //1. ArrayList : 가변길이가 가능하도로 만든 객체
        ArrayList<String> strList=new ArrayList<>();
        //클래스명<제네릭타입> 변수명=new 클래스명<>();
        strList.add("유재석");
        //strList.add(100);
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("서장훈");

        System.out.println("리스트 상태 : "+strList);
        System.out.println("리스트 요소 호출 :"+strList.get(2));
        System.out.println("리스트 길이 : "+ strList.size());
        strList.remove(1);  //1번 인덱스 삭제
        System.out.println("리스트 상태 : "+strList);

        //3. 가변길이 배열 객체 만들기
        //SimpleList{객체, 객체, 객체}
        SimpleList<String> simpleList=new SimpleList();
        simpleList.add("유재석");
        simpleList.add("강호동");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        System.out.println(simpleList);
        System.out.println(simpleList.get(1));
        System.out.println("리스트 상태 : "+simpleList);
        System.out.println("리스트 요소 호출 :"+simpleList.get(2));
        System.out.println("리스트 길이 : "+ simpleList.size());
        simpleList.remove(1);
        System.out.println("리스트 상태 : "+simpleList);


        SimpleList<Integer> intList=new SimpleList<>();
        intList.add(100);

        HashMap<String , String > hashMap=new HashMap<>();
        hashMap.put("취미","야구");
        hashMap.put("특기","축구");
        System.out.println(hashMap);
        System.out.println(hashMap.get("취미"));

        SimpleMap<String , Integer> simpleMap=new SimpleMap<>();
        simpleMap.put("취미",1);
        System.out.println(simpleMap);
        System.out.println(simpleMap.get("취미"));
        simpleMap.put("특기",2);
        System.out.println(simpleMap);
        System.out.println(simpleMap.get("취미"));
        //remove
        //simpleMap.remove(0);
        //System.out.println(simpleMap);
        //size
        System.out.println(simpleMap.size());
        //중복검사
        simpleMap.put("취미",1);
        System.out.println(simpleMap);

    }

}
