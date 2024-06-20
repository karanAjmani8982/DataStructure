package com.dataStructure.Lists.ArrayLists;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        // the reason we wrote list rather than ArrayList on left side is
        // if we want to use different type of list, it's easy to change the specific implementation of list which we are using.

        // default capacity is 10 in Arraylist
        // When we create a new ArrayList with nothing in it, then ArrayList will have made an array of 10 elements behind the scenes.
        // NTC what is default capacity in linkedList?
        employeeList.add(new Employee("Karandeep","Ajmani",27));
        employeeList.add(new Employee("Jasmeet","Ajmani",30));
        employeeList.add(new Employee("Amarjhyot","Ajmani",28));
        employeeList.add(new Employee("Jaspreet","Ajmani",25));

        //we use Arraylist instead of Array because
        // ArrayList has bunch of methods that let us work with list of items.
        // the code to this is written for us, we don't need to directly work on array.
        // And arrayList uses list interface so in future we can change the implementation also
        // without disturbing much of the code.
        employeeList.forEach(employee -> log.info(String.valueOf(employee)));
        log.info(String.valueOf(employeeList.get(1)));      // this is being done in constant time
                                                            // Array is backing the ArrayList.
        log.info(String.valueOf(employeeList.isEmpty()));
        employeeList.set(1,new Employee("Aman", "Ajmani", 30)); // As long as we are providing index
        // time complexity will be Constant Time.
        employeeList.forEach(employee -> log.info(String.valueOf(employee)));
        log.info(String.valueOf(employeeList.size()));

        employeeList.add(3,new Employee("Simran","Ajmani",23)); // linear time operation
        // linear time operation, as in shifting worst case will be n
        employeeList.forEach(employee -> log.info(String.valueOf(employee)));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee:employeeArray){
            log.info("toArray : {}",String.valueOf(employee));
        }

        log.info(String.valueOf(employeeList.contains(new Employee("Karandeep","Ajmani",27))));
        // the reason we got false is because we have not implemented equals method in the Employee class.
        // NTC why we need hashcode method with equals method.
        log.info(String.valueOf(employeeList.contains(new Employee("Karandeep","Ajmani",28))));

        log.info(String.valueOf(employeeList.indexOf(new Employee("Karandeep","Ajmani",27))));
        log.info(String.valueOf(employeeList.indexOf(new Employee("Karandeep","Ajmani",28))));

        employeeList.remove(0);
        employeeList.forEach(employee -> log.info(String.valueOf(employee)));

    }
}
