package tasks.defangingAnIPAddress;
/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".



Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */

public class DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        String[] stringArr = address.split("\\.");

        for (int i = 0 ; i <= stringArr.length - 1 ; i++ ) {
            if (i == stringArr.length -1 ){
                result.append(stringArr[i]);
            }
            else {
                result.append(stringArr[i] + "[.]");
            }

        }

        return result.toString();
    }

    public String defangIPaddrV2(String address) {

        return address == null ? null : address.replaceAll("\\." , "[.]");
        }



    }