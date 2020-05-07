package com.bitwise.operator;

public class BitwiseOperator {

    public static void main(String[] args) {
        BitwiseOperator project = new BitwiseOperator();
        Integer userRole = 6;
        System.out.println("User Role :" + userRole);
        System.out.println("Converted Binary String :" + Integer.toBinaryString(userRole));
        // Mathematical way!
        System.out.println("Check BitwiseOperators :" + project.binaryToInteger(Integer.toBinaryString(userRole)));
        // Bitwise Operator way!
        project.userRoles(userRole);
    }

    public int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for (int i = numbers.length - 1; i >= 0; i--)
            if (numbers[i] == '1') {
                Double bit = Math.pow(2, (numbers.length - i - 1));
                Integer value = bit.intValue();
                System.out.println("Current Number :" + bit);
                if (UserRoles.valueOf(value) != null) {
                    if (value == UserRoles.READ.getValue())
                        System.out.println("User Role :" + UserRoles.valueOf(value).toString());
                    else if (value == UserRoles.WRITE.getValue())
                        System.out.println("User Role :" + UserRoles.valueOf(value).toString());
                }
                result += bit;
            }
        return result;
    }

    public void userRoles(Integer userRole) {
        if (((userRole & UserRoles.READ.getValue()) == UserRoles.READ.getValue())
                && ((userRole & UserRoles.WRITE.getValue()) == UserRoles.WRITE.getValue()))
            System.out.println("User Role READ/WRITE");
    }

}
