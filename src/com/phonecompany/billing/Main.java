package com.phonecompany.billing;

import com.phonecompany.billing.entity.Call;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] input = ("420774577453,13-01-2020 18:10:15,13-01-2020 18:12:57" +
                "\n420774577453,13-01-2020 18:10:15,13-01-2020 18:12:57" +
                "\n420774577545,13-01-2020 18:10:15,13-01-2020 18:12:57").split("\n");

        Map<String, List<Call>> mapCalls = new HashMap<String, List<Call>>();

        Call theCall;
        List<Call> callList;
        for(int i = 0; i < input.length; i++) {
            theCall = new Call(input[i]);

            callList = mapCalls.get(theCall.getPhoneNumber());
            if(callList == null) {
                callList = new ArrayList<>();
            }
            callList.add(theCall);
            mapCalls.put(theCall.getPhoneNumber(), callList);
        }

        for(String key : mapCalls.keySet()) {
            System.out.println(key);
            System.out.println(mapCalls.get(key));
        }


        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy H:m:s", Locale.ENGLISH);

        /*String phoneNumber = input[0];
        LocalDateTime callStart = LocalDateTime.parse(input[1], formatter);
        LocalDateTime callEnd = LocalDateTime.parse(input[2], formatter);

        System.out.println(input[0]);
        System.out.println(input[1]);*/

        //Call theCall = new Call(input[0], input[1], input[2]);
        /*theCall = new Call("420774577453,13-01-2020 18:10:15,13-01-2020 18:12:57");

        System.out.println(theCall);

        Duration diff = Duration.between(theCall.getStart(), theCall.getEnd());
        long diffDays = diff.toSeconds();
        System.out.println(diffDays/60f);

        System.out.println(Math.ceil(2.3f));*/



    }
}
