package com.phonecompany.billing.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CallingList {

    Map<String, List<Call>> calls;

    // === Constructor ===
    CallingList(String rawInput) {
        String[] input = rawInput.split("\n");

        calls = new HashMap<String, List<Call>>();
        Call theCall;
        List<Call> callList;

        for(int i = 0; i < input.length; i++) {
            theCall = new Call(input[i]);

            callList = calls.get(theCall.getPhoneNumber());
            if(callList == null) {
                callList = new ArrayList<>();
            }
            callList.add(theCall);
            calls.put(theCall.getPhoneNumber(), callList);
        }
    }

    public String[] getMostFrequentNumbers() {

        return null;
    }
}
