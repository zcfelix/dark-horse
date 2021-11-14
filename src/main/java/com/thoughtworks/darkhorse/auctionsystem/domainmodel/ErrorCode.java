package com.thoughtworks.darkhorse.auctionsystem.domainmodel;

/**
 * 统一的错误码管理
 */
public enum ErrorCode {
    PAY_FAILED,
    TOTAL_AMOUNT_OVER_LIMIT,
    TOTAL_AMOUNT_NOT_ENOUGH,
    QUANTITY_OVER_LIMIT,
    RED_PACKET_NOT_EXIST,
    RED_PACKET_NO_LEFT,
    GRAB_RED_PACKET_FAILED
}
