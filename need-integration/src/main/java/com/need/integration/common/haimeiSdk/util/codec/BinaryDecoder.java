// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BinaryDecoder.java

package com.need.integration.common.haimeiSdk.util.codec;


// Referenced classes of package com.jd.open.api.sdk.internal.util.codec:
//            Decoder, DecoderException

public interface BinaryDecoder
        extends Decoder {

    public abstract byte[] decode(byte abyte0[])
            throws DecoderException;
}
