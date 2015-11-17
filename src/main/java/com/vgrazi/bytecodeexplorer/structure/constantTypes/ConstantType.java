package com.vgrazi.bytecodeexplorer.structure.constantTypes;

import com.vgrazi.bytecodeexplorer.structure.ClassFileSection;

import java.util.List;

/**
 * Created by vgrazi on 11/15/15.
 */
public abstract class ConstantType implements ClassFileSection, Cloneable{


    private static List<ConstantType> constants;

    public boolean contains(int byteIndex) {
        return byteIndex >= getStartByteIndex() && byteIndex < getStartByteIndex() + length();
    }

    public abstract int length();

    public abstract int getStartByteIndex();

    public abstract byte getTag();

    public abstract void setData(byte[] bytes, int index);

    public abstract int elementCount();

    public static  void setConstants(List<ConstantType> constants) {
        ConstantType.constants = constants;
    }

    public static List<ConstantType> getConstants() {
        return constants;
    }


    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
