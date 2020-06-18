package com.costaroot;

public class Main {

    public static void main(String[] args) {

        byte varByte = 10;
        byte varByte2 = -3;
        byte resultByteOperation;

        System.out.println("Basic operations with BYTE variables var1 = " + varByte + " var2= " + varByte2);
        resultByteOperation = (byte) (varByte + varByte2);
        System.out.println("Addition var1 + var2 = " + resultByteOperation);
        resultByteOperation = (byte) (varByte - varByte2);
        System.out.println("Subtraction var1 - var2 = " + resultByteOperation);
        resultByteOperation = (byte) (varByte * varByte2);
        System.out.println("Multiplication  var1 * var2 = " + resultByteOperation);
        resultByteOperation = (byte) (varByte / varByte2);
        System.out.println("Division var1 / var2 = " + resultByteOperation+"\n");

        short varShort = 1000;
        short varShort2 = 25;
        short resultShortOperation;

        System.out.println("Basic operations with SHORT variables var1 = " + varShort + " var2= " + varShort2);
        resultShortOperation = (short) (varShort + varShort2);
        System.out.println("Addition var1 + var2 = " + resultShortOperation);
        resultShortOperation = (short) (varShort - varShort2);
        System.out.println("Subtraction var1 - var2 = " + resultShortOperation);
        resultShortOperation = (short) (varShort * varShort2);
        System.out.println("Multiplication  var1 * var2 = " + resultShortOperation);
        resultShortOperation = (short) (varShort / varShort2);
        System.out.println("Division var1 / var2 = " + resultShortOperation+"\n");

        int varInt = 65000;
        int varInt2 = -64500;
        int resultIntOperation;

        System.out.println("Basic operations with INT variables var1 = " + varInt + " var2= " + varInt2);
        resultIntOperation = varInt + varInt2;
        System.out.println("Addition var1 + var2 = " + resultIntOperation);
        resultIntOperation = varInt - varInt2;
        System.out.println("Subtraction var1 - var2 = " + resultIntOperation);
        resultIntOperation = varInt * varInt2;
        System.out.println("Multiplication  var1 * var2 = " + resultIntOperation);
        resultIntOperation = varInt / varInt2;
        System.out.println("Division var1 / var2 = " + resultIntOperation+"\n");

        float varFloat = 10.5f;
        float varFloat2 = 10.1f;
        float resultFloatOperation;

        System.out.println("Basic operations with FLOAT variables var1 = " + varFloat + " var2= " + varInt2);
        resultFloatOperation = varFloat + varFloat2;
        System.out.println("Addition var1 + var2 = " + resultFloatOperation);
        resultFloatOperation = varFloat - varFloat2;
        System.out.println("Subtraction var1 - var2 = " + resultFloatOperation);
        resultFloatOperation = varFloat * varFloat2;
        System.out.println("Multiplication  var1 * var2 = " + resultFloatOperation);
        resultFloatOperation = varFloat / varFloat2;
        System.out.println("Division var1 / var2 = " + resultFloatOperation+"\n");

        double varDouble = 125.25;
        double varDouble2 = -125.25;
        double resultDoubleOperation;

        System.out.println("Basic operations with DOUBLE variables var1 = " + varDouble + " var2= " + varDouble2);
        resultDoubleOperation = varDouble + varDouble2;
        System.out.println("Addition var1 + var2 = " + resultDoubleOperation);
        resultDoubleOperation = varDouble - varDouble2;
        System.out.println("Subtraction var1 - var2 = " + resultDoubleOperation);
        resultDoubleOperation = varDouble * varDouble2;
        System.out.println("Multiplication  var1 * var2 = " + resultDoubleOperation);
        resultDoubleOperation = varDouble / varDouble2;
        System.out.println("Division var1 / var2 = " + resultDoubleOperation+"\n");

        long varLong = 525000;
        long varLong2 = -225000;
        long resultLongOperation;

        System.out.println("Basic operations with LONG variables var1 = " + varLong + " var2= " + varLong2);
        resultLongOperation = varLong + varLong2;
        System.out.println("Addition var1 + var2 = " + resultLongOperation);
        resultLongOperation = varLong - varLong2;
        System.out.println("Subtraction var1 - var2 = " + resultLongOperation);
        resultLongOperation = varLong * varLong2;
        System.out.println("Multiplication  var1 * var2 = " + resultLongOperation);
        resultLongOperation = varLong / varLong2;
        System.out.println("Division var1 / var2 = " + resultLongOperation);
    }
}
