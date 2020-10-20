package com.module.parser.logconfig;

import java.util.Base64;
import java.util.UUID;

/**
 * 生成唯一ID
 */
public class UUIDUtil {
    public static String generate(){
        UUID uuid = UUID.randomUUID();
        return compressedUUID(uuid);
    }

    protected static String compressedUUID(UUID uuid){
        byte[] byUUID = new byte[16];
        long least = uuid.getLeastSignificantBits();
        long most = uuid.getMostSignificantBits();
        long2bytes(most, byUUID, 0);
        long2bytes(least, byUUID, 8);
        return Base64.getEncoder().encodeToString(byUUID);
    }

    protected static void long2bytes(long value, byte[] bytes, int offset){
        for(int i = 7; i > -1; i--){
            bytes[offset++] = (byte) ((value >> 8 * i)& 0xFF);
        }
    }
}
