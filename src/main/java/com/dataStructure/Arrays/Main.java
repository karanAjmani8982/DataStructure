package com.dataStructure.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("Array Main function Starts");
        int[] intArray = new int[7];

        for(int i=0;i< intArray.length;i++){
            intArray[i] = i;
            log.info("Value of i:" + intArray[i]);
        }

    }
}
